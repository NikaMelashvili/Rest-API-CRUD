create database university;

use university;

create table students(
	id int auto_increment not null primary key,
    first_name varchar(50),
    last_name varchar(50),
    email varchar(50)
);

create table lecturer(
	id int auto_increment not null primary key,
    first_name varchar(50),
    last_name varchar(50),
    age int
);

create table subjects(
	id int primary key auto_increment not null,
    subject_name varchar(50),
    lecturer_id int,
    foreign key(lecturer_id) references lecturer(id)
);

create table student_subject(
    student_id int,
    subject_id int,
    foreign key(student_id) references students(id), 
    foreign key(subject_id) references subjects(id),
    primary key (student_id, subject_id)
);
