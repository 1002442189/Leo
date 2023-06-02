DROP TABLE IF EXISTS user;
create table user
(
    id BIGINT(20) not null comment '主键ID',
    name varchar(30) null default null comment '姓名',
    age int(11) null default null comment '年龄',
    primary key (id)

)