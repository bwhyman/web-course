/**
  用于JDBC学习的初始化数据表
 */
create table if not exists `user`
(
    id int auto_increment primary key ,
    name varchar(20) not null ,
    insert_time datetime not null default current_timestamp
)
