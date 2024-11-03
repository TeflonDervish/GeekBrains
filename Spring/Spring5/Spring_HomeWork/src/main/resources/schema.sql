create table task (
    id int AUTO_INCREMENT not null primary key,
    description varchar(50) not null,
    status varchar(30),
    createDate timestamp default current_timestamp
);