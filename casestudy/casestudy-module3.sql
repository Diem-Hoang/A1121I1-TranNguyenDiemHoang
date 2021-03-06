create database if not exists casestudy_module3;
use casestudy_module3;

-- create table position (
--    position_id int auto_increment primary key,
--    position_name varchar(45)
--    );
-- create table education_degree (
--    education_degree_id int auto_increment primary key,
--    education_degree_name varchar(45)
--    );
-- create table division (
--    division_id int auto_increment primary key,
--    division_name varchar(45)
--    );
-- create table employee (
--    employee_id int auto_increment primary key,
--    employee_name varchar(45),
--    employee_birthday date,
--    employee_id_card varchar(45),
--    employee_salary double,
--    employee_phone varchar(45),
--    employee_email varchar(45),
--    employee_address varchar(45),
--    position_id int,
--    education_degree_id int,
--    division_id int,
--    username varchar(255)
--    );
-- create table `user` (
--    username varchar(255) primary key,
--    `password` varchar(255)
--    );
-- create table customer (
--    customer_id int primary key,
--    customer_type_id int,
--    customer_name varchar(45),
--    customer_birthday date,
--    customer_gender bit(1),
--    customer_id_card varchar(45),
--    customer_phone varchar(45),
--    customer_email varchar(45),
--    customer_address varchar(45)
--    );
-- create 

create table `position`(
	position_id int primary key auto_increment,
    position_name varchar(45)
);
create table division(
	division_id int primary key auto_increment,
    division_name varchar(45)
);
create table education_degree(
	education_degree_id int primary key auto_increment,
    education_degree_name varchar(45)
);
create table `role`(
	role_id int primary key auto_increment,
    role_name varchar(255)
);
create table `user`(
    username varchar(255) primary key,
    `password` varchar(255)
    );
create table user_role(
     role_id int,
     username varchar(255),
     foreign key(role_id) references `role`(role_id),
     foreign key(username) references `user`(username)
     );
INSERT INTO customer(customer_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email,
customer_address,customer_type_id) VALUES('2', 'Nguyen Van Sy', '2021-12-12', b'0', '123123123', '+84-373216810', 'sypro123@gmail.com', 'Da Nang', '1');

drop table furama.employee;
create table employee(
	employee_id int primary key auto_increment,
    employee_name varchar(45) not null,
	employee_birthday date not null,
	employee_id_card varchar(45) not null,
	employee_salary double not null,
	employee_phone varchar(45) not null,
	employee_email varchar(45),
	employee_address varchar(45),
    position_id int not null,
    education_degree_id int not null,
    division_id int not null,
	username varchar(255),
    foreign key(division_id) references division(division_id),
    foreign key(education_degree_id) references education_degree(education_degree_id),
    foreign key(position_id) references `position`(position_id),
    foreign key(username) references `user`(username)
);
create table customer_type(
	customer_type_id int primary key auto_increment,
    customer_type_name varchar(45)
);
create table customer(
	customer_id int primary key auto_increment,
    customer_name varchar(45) not null,
    customer_birthday date not null,
    customer_gender bit(1) not null,
    customer_id_card varchar(45) not null,
    customer_phone varchar(45) not null,
    customer_email varchar(45),
    customer_address varchar(45),
    customer_type_id int not null,
    foreign key(customer_type_id) references customer_type(customer_type_id)
);
create table service_type(
	service_type_id int primary key auto_increment,
    service_type_name varchar(45)
);
create table rent_type(
	rent_type_id int primary key auto_increment,
    rent_type_name varchar(45),
    rent_type_cost double
);
create table service(
	service_id int primary key auto_increment,
    service_name varchar(45) not null,
    service_area int,
    service_cost double not null,
    service_max_people int,
    standard_room varchar(45),
    description_other_convenience varchar(45),
    pool_area double,
    number_of_floors int,
    rent_type_id int not null,
    service_type_id int not null,
    foreign key(rent_type_id) references rent_type(rent_type_id),
    foreign key(service_type_id) references service_type(service_type_id)
);
create table contract(
	contract_id int primary key auto_increment,
    contract_start_date date not null,
    contract_end_date date not null,
    contract_deposit double not null,
    contract_total_money double not null,
    employee_id int not null,
    customer_id int not null,
    service_id int not null,
    foreign key(employee_id) references employee(employee_id),
    foreign key(customer_id) references customer(customer_id),
    foreign key(service_id) references service(service_id)
);
create table attach_service(
	attach_service_id int primary key auto_increment,
    attach_service_name varchar(45) not null,
    attach_service_cost double not null,
    attach_service_unit int not null,
    attach_service_status varchar(45)
);
create table contract_detail(
	contract_detail_id int primary key auto_increment,
    quantity int not null,
    contract_id int not null,
    attach_service_id int ,
    foreign key(contract_id) references contract(contract_id),
    foreign key(attach_service_id) references attach_service(attach_service_id)
);
	
DROP TABLE contract_detail;
create table account1(
   user_id int primary key auto_increment,
   username varchar(50),
   pass  varchar(50),
   role_id int,
   foreign key(role_id) references role(role_id)
);
INSERT INTO customer_type(customer_type.customer_type_id, customer_type.customer_type_name) values(1, "Silver");
INSERT INTO customer_type(customer_type.customer_type_id, customer_type.customer_type_name) values(2, "Gold");
INSERT INTO customer_type(customer_type.customer_type_id, customer_type.customer_type_name) values(3, "Diamond");
-- T???o trigger khi ch??ng ta th??m m???i nh??n vi??n th?? nh??n vi??n ???? s??? nh???n ???????c m???t t??i kho???n
DELIMITER $$
CREATE TRIGGER create_employee_account
AFTER INSERT ON employee FOR EACH ROW
BEGIN
CALL create_employee(new.employee_email, "123",1);
END $$
DELIMITER ;
-- T???o procedure
DELIMITER $$
CREATE PROCEDURE create_employee(in username1 int, in pass1 varchar(50), in role_id1 int)
BEGIN
	INSERT INTO account1(username,pass,role_id) VALUES(username1,pass1,role_id1);
END $$
DELIMITER ;
-- Th??m d??? li???u cho position
INSERT INTO `position`(position_id, position_name) VALUES (1, "Manager");
INSERT INTO `position`(position_id, position_name) VALUES (2, "Director");
INSERT INTO `position`(position_id, position_name) VALUES (3, "Chairman");
-- Th??m d??? li???u cho education degree
INSERT INTO education_degree(education_degree_id, education_degree_name) VALUES (1, "High School");
INSERT INTO education_degree(education_degree_id, education_degree_name) VALUES (2, "College");
INSERT INTO education_degree(education_degree_id, education_degree_name) VALUES (3, "University");
-- Th??m d??? li???u cho division
INSERT INTO division(division_id, division_name) VALUES(1, "accounting");
INSERT INTO division(division_id, division_name) VALUES(2, "technology");
INSERT INTO division(division_id, division_name) VALUES(3, "marketing");
-- Th??m d??? li???u v??o b???ng rent_type
INSERT INTO rent_type(rent_type_id, rent_type_name, rent_type_cost) VALUES(1, "Week", 7000000);
INSERT INTO rent_type(rent_type_id, rent_type_name, rent_type_cost) VALUES(2, "Month", 25000000);
INSERT INTO rent_type(rent_type_id, rent_type_name, rent_type_cost) VALUES(3, "Year", 250000000);
-- Th??m d??? li???u v??o b???ng service_type
INSERT INTO service_type(service_type_id, service_type_name) VALUES(1, "VIP");
INSERT INTO service_type(service_type_id, service_type_name) VALUES(2, "NORMAL");
-- Th??m d??? li???u v??o b???ng service
INSERT INTO service VALUE (1, "VILLA", 1000, 10000000, 5, "Superior", "Tho??ng m??t, d??? ch???u", 100, 3, 1, 1);
-- Th??m d??? li???u v??o b???ng attach_service
INSERT INTO attach_service VALUE (1, "Karaoke", 500000, 1, "Yes");
INSERT INTO attach_service VALUE (2, "Massage", 700000, 2, "Yes");
INSERT INTO attach_service VALUE (3, "Food", 500000, 1, "Yes");
INSERT INTO attach_service VALUE (4, "Baverage", 300000, 1, "Yes");