CREATE TABLE `user` (
                        `id` varchar(36) NOT NULL DEFAULT '' COMMENT '用户ID',
                        `user_name` varchar(30) DEFAULT NULL COMMENT '用户名称',
                        `password` varchar(100) DEFAULT NULL COMMENT '用户密码',
                        `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                        `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                        PRIMARY KEY (`id`)
);

CREATE TABLE `address` (
                           `id` varchar(36) NOT NULL DEFAULT '' COMMENT '地址ID',
                           `user_id` varchar(36) DEFAULT NULL COMMENT '用户ID',
                           `receiver_name` varchar(30) DEFAULT NULL COMMENT '收货人姓名',
                           `receiver_phone` varchar(20) DEFAULT NULL COMMENT '收货人手机号',
                           `detail` varchar(255) DEFAULT NULL COMMENT '详情地址',
                           `is_default` int DEFAULT NULL COMMENT '是否为默认地址',
                           `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                           `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                           PRIMARY KEY (`id`)
);

CREATE TABLE `cart` (
                        `id` varchar(36) NOT NULL DEFAULT '' COMMENT '购物项ID',
                        `user_id` varchar(36) DEFAULT NULL COMMENT '用户ID',
                        `product_id` varchar(36) DEFAULT NULL COMMENT '商品ID',
                        `quantity` bigint DEFAULT NULL COMMENT '数量',
                        `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                        `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                        PRIMARY KEY (`id`)
);

CREATE TABLE `order` (
                         `id` varchar(36) NOT NULL DEFAULT '' COMMENT '订单ID',
                         `user_id` varchar(36) DEFAULT NULL COMMENT '用户ID',
                         `address_id` varchar(36) DEFAULT NULL COMMENT '地址ID',
                         `status` int DEFAULT NULL COMMENT '订单状态',
                         `total_price` decimal(10,2) DEFAULT NULL COMMENT '订单总价',
                         `payment_status` int DEFAULT NULL COMMENT '支付状态',
                         `payment_time` datetime DEFAULT NULL COMMENT '支付时间',
                         `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                         `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                         PRIMARY KEY (`id`)
);

CREATE TABLE `order_item` (
                              `id` varchar(36) NOT NULL DEFAULT '' COMMENT '订单详情ID',
                              `order_id` varchar(36) DEFAULT NULL COMMENT '订单ID',
                              `product_id` varchar(36) DEFAULT NULL COMMENT '商品ID',
                              `quantity` bigint DEFAULT NULL COMMENT '数量',
                              `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                              `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                              PRIMARY KEY (`id`)
);


CREATE TABLE `product` (
                           `id` varchar(36) NOT NULL DEFAULT '' COMMENT '商品ID',
                           `category_id` varchar(36) DEFAULT NULL COMMENT '分类ID',
                           `product_name` varchar(100) DEFAULT NULL COMMENT '商品名称',
                           `description` text COMMENT '商品描述',
                           `detail` text COMMENT '商品详情',
                           `price` decimal(10,2) DEFAULT NULL COMMENT '商品价格',
                           `stock_count` bigint DEFAULT NULL COMMENT '库存数量',
                           `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                           `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                           PRIMARY KEY (`id`)
);

CREATE TABLE `category` (
                            `id` varchar(36) NOT NULL DEFAULT '' COMMENT '分类ID',
                            `category_name` varchar(30) DEFAULT NULL COMMENT '分类名称',
                            `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                            PRIMARY KEY (`id`)
);

CREATE TABLE `review` (
                          `id` varchar(36) NOT NULL DEFAULT '' COMMENT '评论ID',
                          `product_id` varchar(36) DEFAULT NULL COMMENT '商品ID',
                          `user_id` varchar(36) DEFAULT NULL COMMENT '用户ID',
                          `content` text COMMENT '评论内容',
                          `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                          `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                          PRIMARY KEY (`id`)
);