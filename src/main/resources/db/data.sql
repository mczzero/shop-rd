-- 初始化用户数据
insert into `user`(id, user_name, password) values ('b8de4ffd-e9ca-411f-aa10-d35177574f15','zhangsan','123456');

-- 初始化商品分类数据
insert into `category`(id, category_name) values ('4eff4ab6-fa0e-40b6-9200-8786e0008b39', '水果');
insert into `category`(id, category_name) values ('baa6a5e8-c139-4e52-bf7a-2b8a6be823d5', '坚果');

-- 初始化商品数据
insert into `product`(id, category_id, product_name, description, detail, price, stock_count)
values ('58cd889c-3aaf-4ce6-bc5d-4fc8df33a3f0', '4eff4ab6-fa0e-40b6-9200-8786e0008b39', '苹果', '红富士苹果', '山东产,10个 净重2.6kg以上', 49.50, 200);

insert into `product`(id, category_id, product_name, description, detail, price, stock_count)
values ('479190e8-db41-449d-9880-4323ac6a4a57', '4eff4ab6-fa0e-40b6-9200-8786e0008b39', '橘子', '超甜橘子', '精选特级大果5kg礼盒装 单果约150-300g 新鲜水果', 59.90, 300);

insert into `product`(id, category_id, product_name, description, detail, price, stock_count)
values ('6d8a622b-2b67-4784-a384-48bfdd71f41a', 'baa6a5e8-c139-4e52-bf7a-2b8a6be823d5', '夏威夷果', '奶油味夏威夷果', '坚果炒货每日坚果干果零食200g/袋', 128.50, 125);

insert into `product`(id, category_id, product_name, description, detail, price, stock_count)
values ('f3285323-7414-4f27-89f1-d24aad9beac9', 'baa6a5e8-c139-4e52-bf7a-2b8a6be823d5', '开心果', '年货开心果', '休闲零食特产原色无漂白开心果500g/罐', 79.00, 100);
