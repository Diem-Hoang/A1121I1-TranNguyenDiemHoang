create database `student_managementDB`;

create table `student_managementDB`.`class`(
     `id` int not null,
     `name` varchar(255) null,
     primary key(`id`));
     
insert into class(id, name) values (01, "hoang"), (02, "tram"), (03, "ngoc");
update class set name = "linh" where id=2;
delete from class where id=3;
select * from `student_managementDB`.`class`;

create table `student_managementDB`.`teacher`(
     `id` int not null auto_increment,
     `name` varchar(255) null,
     `age` int null,
     `country` varchar(255) null,
     primary key(`id`));
     
insert into teacher(name, age, country) values ("huyen", 34, "vietnam"), ("linh", 44, "vietnam"), ("chanh", 45, "vietnam");
alter table teacher add gender int;
-- update chi co the where id muon where toi name age thi dung lenh SET SQL _SAFE_UPDATE=0;
-- tat quyen = 0, set ve 1 roi mo ve =1
SET SQL_SAFE_UPDATES=0;
update teacher set gender = 1; 
SET SQL_SAFE_UPDATES=1;

select * from `student_managementDB`.`teacher`;
