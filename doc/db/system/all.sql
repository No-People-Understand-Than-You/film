use film;
drop table if exists `chapter`;
create table `chapter`
(
    `id` char(8) not null comment 'ID',
    `course_id` char(8) comment '课程ID',
    `name` varchar(50) comment '名称',
    primary key (`id`)
)engine=innodb default charset = utf8mb4 comment ='大章';

insert into film.chapter values('00000000','00000000','测试1');
insert into film.chapter values('00000001','00000000','测试2');

update film.chapter
set course_id = '00000000'
where id='00000001';
select * from film.chapter