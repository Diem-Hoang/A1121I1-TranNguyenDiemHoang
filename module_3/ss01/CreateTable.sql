use createdb;
create table `createdb`.`student`(
   `id` int not null,
   `name` varchar(255) null,
   `age` int null,
   `country` varchar(255) null,
   primary key(`id`));
   
insert into student(id, name, age, country) values (1, "hoang", 21, "vietnam"), (2, "phuong", 23, "vietnam"), (3, "tram", 25, "vietnam");
select * from `createdb`.`student`;