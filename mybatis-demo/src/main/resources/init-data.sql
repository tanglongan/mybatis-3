drop table user if exists;

create table user
(
    id          int,
    create_time varchar(20),
    name        varchar(20),
    password    varchar(36),
    phone       varchar(20),
    nick_name   varchar(20),
    primary key (id)
);

insert into user(id, create_time, name, password, phone, nick_name) values (1, '2010-10-23 10:20:30', 'User1', 'test', '18200001234', 'User1');
insert into user(id, create_time, name, password, phone, nick_name) values (2, '2010-10-24 10:20:30', 'User2', 'test', '18200005678', 'User2');
insert into user(id, create_time, name, password, phone, nick_name) values (3, '2010-10-24 10:20:30', 'User2', 'test', '18200005678', 'User2');
insert into user(id, create_time, name, password, phone, nick_name) values (4, '2010-10-24 10:20:30', 'User2', 'test', '18200005678', 'User2');
insert into user(id, create_time, name, password, phone, nick_name) values (5, '2010-10-24 10:20:30', 'User2', 'test', '18200005678', 'User2');

