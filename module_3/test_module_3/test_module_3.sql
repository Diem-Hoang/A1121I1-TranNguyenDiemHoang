drop database test_module_3;
create database if not exists test_module_3;
use test_module_3;

create table student_type(
   id_student_type int primary key,
   `name` varchar(255)
);
create table student(
   id int primary key auto_increment,
   `name` varchar(255),
   birthday varchar(255),
   email varchar(255),
   id_student_type int,
   foreign key (id_student_type) references student_type(id_student_type)
);
create table if not exists `user`(
username varchar(255) primary key ,
`password` varchar(255)
);

create table if not exists sach(
ma_sach int primary key auto_increment,
ten_sach varchar(255),
tac_gia varchar(255),
mo_ta varchar(255),
so_luong int

);
create table if not exists hoc_sinh(
ma_hoc_sinh int primary key auto_increment,
ho_ten varchar(255),
lop varchar(255)

);
drop table the_muon_sach;
create table if not exists the_muon_sach(
ma_muon_sach int primary key auto_increment,
ma_sach int,
ma_hoc_sinh int,
trang_thai bit,
ngay_muon varchar(255),
ngay_tra varchar(255),
 foreign key (ma_sach) references sach(ma_sach),
  foreign key (ma_hoc_sinh) references hoc_sinh(ma_hoc_sinh)

);
select * from sach;
INSERT INTO `test_module_3`.`student` (`id`, `name`, `birthday`, `email`, `id_student_type`) VALUES ('5', 'Nguyễn Thị Lệ Quyên ', '1998-09-07', 'quyen@gmail.com', '1');

select ma_muon_sach, ten_sach, tac_gia, ho_ten, lop, ngay_muon, ngay_tra  from the_muon_sach t
inner join hoc_sinh h on t.ma_hoc_sinh = h.ma_hoc_sinh
inner join sach s on s.ma_sach = t.ma_sach;


create table category(
category_id int primary key auto_increment,
category_name varchar(255)
);
create table product(
   id int primary key auto_increment,
   product_name varchar(255),
   price int,
   so_luong int, 
   color  varchar(255),
   mo_ta  varchar(255),
   category_id int,
   foreign key (category_id) references category(category_id)
);