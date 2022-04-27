create database `sale_management`;
use `sale_management`;

create table `customer`(
c_id int primary key,
c_name varchar(45),
c_age int
);

create table `order`(
o_id int primary key,
c_id int,
o_date date,
o_totalprice double,
foreign key(c_id) references customer(c_id)
);

create table `product`(
p_id int primary key,
p_name varchar(45),
p_price double
);

create table `orderdetail`(
o_id int,
p_id int,
odQTY int,
primary key(o_id, p_id),
foreign key(o_id) references `order`(o_id),
foreign key(p_id) references `product`(p_id)
);

-- hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select o_id, o_date, o_totalprice from `order`;

-- hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c_name, p_name from customer
inner join `order` on customer.c_id = `order`.c_id
inner join orderdetail on `order`.o_id = orderdetail.o_id
inner join product on orderdetail.p_id = product.p_id;

-- hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select c_name from customer
left join `order` on customer.c_id = `order`.c_id
where `order`.c_id is null;

-- hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn
-- giá bán của từng loại được tính = odQTY*pPrice)
select  `order`.o_id, o_date, sum(odQTY*p_price) as total_bill from `order`
inner join orderdetail on `order`.o_id = orderdetail.o_id
inner join product on orderdetail.p_id = product.p_id
group by o_id;
