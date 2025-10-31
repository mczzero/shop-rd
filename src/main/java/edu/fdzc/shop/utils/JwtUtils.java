package edu.fdzc.shop.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtils {

    private static String secret = "CnYTeFUZcQZ0$wWAY_6wY";

    public  static String generateToken(String userId) {
        Map<String, Object> claims = new HashMap();
        claims.put("userId", userId);
        String token = Jwts.builder()
                .setClaims(claims)
                .setExpiration(Date.from(ZonedDateTime.now().plusHours(24).toInstant()))
                .signWith(SignatureAlgorithm.ES512, secret)
                .compact();
        return token;
    }

    public static Claims getClaims(String token){
        try {
            return Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        }catch (Exception e){
            return null;
        }
    }

    public static String getUserId(String token){
        Claims claims = getClaims(token);
        return (claims == null) ? null : String.valueOf(claims.get("userId"));
    }
}
