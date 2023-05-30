/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50639
 Source Host           : localhost
 Source Database       : students

 Target Server Type    : MySQL
 Target Server Version : 50639
 File Encoding         : utf-8

 Date: 08/23/2021 16:15:28 PM
*/

SET NAMES utf8;
SET
FOREIGN_KEY_CHECKS = 0;

CREATE
DATABASE IF NOT EXISTS `MyBatisDemo`;

USE
`MyBatisDemo`;

-- ----------------------------
--  Table structure for `card`
-- ----------------------------
DROP TABLE IF EXISTS `card`;
CREATE TABLE `card`
(
    `cardId`   varchar(20) NOT NULL COMMENT '学生证编号',
    `sName`    varchar(20) DEFAULT NULL COMMENT '学生姓名',
    `cardInfo` varchar(20) DEFAULT NULL COMMENT '学生描述信息',
    `sId`      int(10) DEFAULT NULL COMMENT '学号',
    PRIMARY KEY (`cardId`),
    KEY        `cardId_sId` (`sId`),
    CONSTRAINT `cardId_sId` FOREIGN KEY (`sId`) REFERENCES `student` (`sId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学生证';

-- ----------------------------
--  Records of `card`
-- ----------------------------
BEGIN;
INSERT INTO `card`
VALUES ('1001', '令狐冲', '北京大学', '1'),
       ('1002', '岳林山', '北京大学', '2'),
       ('1003', '李四', '清华大学', '3'),
       ('1004', '张三', '清华大学', '4'),
       ('1005', '郭靖', '复旦大学', '5'),
       ('1006', '黄蓉', '复旦大学', '6'),
       ('1007', '武松', '交通大学', '7'),
       ('1008', '西门庆', '交通大学', '8');
COMMIT;

-- ----------------------------
--  Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`
(
    `cId`         int(10) NOT NULL COMMENT '课程编号',
    `tId`         int(10) NOT NULL COMMENT '教师编号',
    `cName`       varchar(20) DEFAULT NULL COMMENT '课程名称',
    `creditPoint` int(10) DEFAULT NULL COMMENT '学分',
    PRIMARY KEY (`cId`),
    KEY           `course_teacher` (`tId`),
    CONSTRAINT `course_teacher` FOREIGN KEY (`tId`) REFERENCES `teacher` (`tId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课程表';

-- ----------------------------
--  Records of `course`
-- ----------------------------
BEGIN;
INSERT INTO `course`
VALUES ('1', '1', 'Java程序设计', '5'),
       ('2', '1', 'C语言', '5'),
       ('3', '2', '高等数学（一）', '8'),
       ('4', '2', '高等数学（二）', '8'),
       ('5', '3', '大学物理', '6'),
       ('6', '4', '化学原理', '8');
COMMIT;

-- ----------------------------
--  Table structure for `score`
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`
(
    `sId`   int(10) NOT NULL COMMENT '学生编号',
    `cId`   int(10) NOT NULL COMMENT '课程编号',
    `score` decimal(5, 2) DEFAULT NULL COMMENT '成绩',
    PRIMARY KEY (`sId`, `cId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='成绩表';

-- ----------------------------
--  Records of `score`
-- ----------------------------
BEGIN;
INSERT INTO `score`
VALUES ('1', '1', '99.00'),
       ('1', '2', '90.00'),
       ('2', '1', '100.00'),
       ('2', '2', '89.00'),
       ('3', '6', '88.00'),
       ('4', '6', '60.00'),
       ('5', '5', '70.00'),
       ('6', '5', '80.00'),
       ('7', '3', '100.00'),
       ('7', '4', '99.00'),
       ('8', '3', '90.00'),
       ('8', '4', '78.00');
COMMIT;

-- ----------------------------
--  Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`
(
    `sId`         int(10) NOT NULL COMMENT '学号',
    `sName`       varchar(20) DEFAULT NULL COMMENT '学生姓名',
    `sClass`      int(10) DEFAULT NULL COMMENT '班级',
    `sMajor`      varchar(20) DEFAULT NULL COMMENT '专业',
    `sBirthday`   datetime    DEFAULT NULL COMMENT '出生日期',
    `sSex`        char(20)    DEFAULT NULL COMMENT '性别',
    `creditPoint` int(11) DEFAULT NULL COMMENT '学分',
    PRIMARY KEY (`sId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学生表';

-- ----------------------------
--  Records of `student`
-- ----------------------------
BEGIN;
INSERT INTO `student`
VALUES ('1', '令狐冲', '1001', '计算机', '2021-08-23 15:04:31', '男', '20'),
       ('2', '岳林山', '1001', '计算机', '2021-07-23 15:04:31', '女', '18'),
       ('3', '李四', '1002', '化学', '2021-06-23 15:04:31', '女', '18'),
       ('4', '张三', '1002', '化学', '2021-06-23 15:04:31', '男', '18'),
       ('5', '郭靖', '1003', '物理', '2021-09-23 15:04:31', '男', '23'),
       ('6', '黄蓉', '1003', '物理', '2021-09-23 15:04:31', '女', '23'),
       ('7', '武松', '1004', '数学', '2021-10-23 15:04:31', '男', '20'),
       ('8', '西门庆', '1004', '数学', '2021-06-23 15:04:31', '男', '16');
COMMIT;

-- ----------------------------
--  Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`
(
    `tId`     int(10) NOT NULL COMMENT '教师编号',
    `tName`   varchar(20) DEFAULT NULL COMMENT '教师姓名',
    `tSchool` varchar(20) DEFAULT NULL COMMENT '学院',
    PRIMARY KEY (`tId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='教师表';

-- ----------------------------
--  Records of `teacher`
-- ----------------------------
BEGIN;
INSERT INTO `teacher`
VALUES ('1', '黄药师', '电子工程系'),
       ('2', '乔峰', '化学系'),
       ('3', '老顽童', '数学系'),
       ('4', '小蓝', '物理系');
COMMIT;

SET
FOREIGN_KEY_CHECKS = 1;
