-- Bước 1
create database if not exists demo;
use demo;

-- Bước 2
create table products(
id int primary key auto_increment,
product_code int,
product_name varchar(45),
product_price int,
product_amount int,
product_description varchar(45),
product_status int
);

insert into products(product_code, product_name, product_price, product_amount, product_description, product_status)
values (123, "Milk", 7000, 55000,'abc', 1), 
       (134, 'Egg', 4000, 32000, 'ghfk', 0), 
       (345, 'Meat', 32000, 150000, 'shuds', 0),
       (236, 'Vegetable', 3000, 9000, 'fresh', 1);

-- Bước 3
-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
create unique index index_product_code on products(product_code);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create index index_composite on products(product_name, product_code);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
explain select * from products;

-- Bước 4
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products
create view product_view as
select product_code, product_name, product_price, product_status
from products;

-- Tiến hành sửa đổi view
