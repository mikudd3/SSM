CREATE
DATABASE IF NOT EXISTS `MyBatisDemo`;

USE
`MyBatisDemo`;

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course`
(
    `courseNo`   int(10) NOT NULL,
    `courseName` varchar(50) NOT NULL,
    PRIMARY KEY (`courseNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `course`
values (1001, 'Java基础');
insert into `course`
values (1002, 'python');
insert into `course`
values (1003, 'Web前端');
insert into `course`
values (1004, 'C++');
insert into `course`
values (1005, 'C语言');
insert into `course`
values (1006, 'Oracle');


DROP TABLE IF EXISTS `student`;

CREATE TABLE `student`
(
    `stuNo`   int(10) NOT NULL,
    `stuName` varchar(50) NOT NULL,
    `stuAge`  tinyint,
    `graName` varchar(50) NOT NULL,
    PRIMARY KEY (`stuNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `student`
values (31, '张三', 23, '就业班');
insert into `student`
values (32, '李四', 24, '初级');
insert into `student`
values (33, '颜群', 28, '就业班');
insert into `student`
values (34, '王五', 25, '初级');
insert into `student`
values (35, '赵六', 26, '中级');
insert into `student`
values (36, '孙琪', 27, '中级');

DROP TABLE IF EXISTS `studentCourse`;

CREATE TABLE `studentCourse`
(
    `stuNo`    int(10) NOT NULL,
    `courseNo` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `studentCourse`
values (31, 1001);
insert into `studentCourse`
values (31, 1002);
insert into `studentCourse`
values (32, 1001);
insert into `studentCourse`
values (32, 1003);
insert into `studentCourse`
values (33, 1004);
insert into `studentCourse`
values (33, 1003);
insert into `studentCourse`
values (34, 1005);
insert into `studentCourse`
values (34, 1004);
insert into `studentCourse`
values (35, 1006);
insert into `studentCourse`
values (35, 1002);
insert into `studentCourse`
values (36, 1006);
insert into `studentCourse`
values (36, 1005);