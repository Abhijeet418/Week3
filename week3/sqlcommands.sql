create database jeetsql;
use jeetsql;

create table Faculty(
	f_id int primary key,
    f_name text,
    pass text,
    email text,
    mobile text
);

create table Course(
	c_id int primary key,
    f_id int,
    c_name text,
    duration int
);

insert into Faculty values (101,"Tridib Paul", "1234", "paultridib@gmail.com", 8447322461);
insert into Faculty values (121,"Abhijeet Chatterjee", "5678", "pyabhijeet@gmail.com", 8398062828);

insert into Course values (300, 101, "Java", 30);
insert into Course values (500, 101, "React", 15);
insert into Course values (800, 101, "Dot Net", 30);
insert into Course values (600, 121, "JavaScript", 20);
insert into Course values (700, 121, "Python", 10);	

select * from Faculty f, Course c where f.f_id = c.f_id and f.f_id = 101;
