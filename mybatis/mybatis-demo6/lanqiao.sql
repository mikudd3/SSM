/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50639
 Source Host           : localhost
 Source Database       : staffSystem

 Target Server Type    : MySQL
 Target Server Version : 50639
 File Encoding         : utf-8

 Date: 08/19/2021 15:27:21 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;


CREATE DATABASE IF NOT EXISTS `MyBatisDemo`;

USE `MyBatisDemo`;

-- ----------------------------
--  Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `dNo` char(8) NOT NULL COMMENT '部门编号',
  `dName` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `mgrNo` char(8) DEFAULT NULL COMMENT '负责人编号',
  PRIMARY KEY (`dNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='部门表';

-- ----------------------------
--  Records of `department`
-- ----------------------------
BEGIN;
INSERT INTO `department` VALUES ('0001', '技术部', '20100101'), ('0002', '教研部', '20100201'), ('0003', '市场部', '20100301'), ('0004', '财务部', '20100401');
COMMIT;

-- ----------------------------
--  Table structure for `emp_pro_r`
-- ----------------------------
DROP TABLE IF EXISTS `emp_pro_r`;
CREATE TABLE `emp_pro_r` (
  `epNo` char(8) NOT NULL COMMENT '员工和项目关系',
  `eNo` char(8) DEFAULT NULL COMMENT '员工编号',
  `pNo` char(8) DEFAULT NULL COMMENT '项目编号',
  PRIMARY KEY (`epNo`),
  KEY `epNo_eNo` (`eNo`),
  KEY `epNo_pNo` (`pNo`),
  CONSTRAINT `epNo_eNo` FOREIGN KEY (`eNo`) REFERENCES `employee` (`eNo`),
  CONSTRAINT `epNo_pNo` FOREIGN KEY (`pNo`) REFERENCES `project` (`pNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='员工和项目关系表';

-- ----------------------------
--  Records of `emp_pro_r`
-- ----------------------------
BEGIN;
INSERT INTO `emp_pro_r` VALUES ('1', '20100101', '1901'), ('10', '20100301', '1903'), ('11', '20100302', '1902'), ('12', '20100303', '1902'), ('2', '20100101', '1902'), ('3', '20100102', '1903'), ('4', '20100103', '1903'), ('5', '20100201', '1901'), ('6', '20100201', '1902'), ('7', '20100202', '1901'), ('8', '20100203', '1904'), ('9', '20100301', '1904');
COMMIT;

-- ----------------------------
--  Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `eNo` char(8) NOT NULL COMMENT '员工编号',
  `dNo` char(8) DEFAULT NULL COMMENT '部门编号',
  `jNo` char(8) DEFAULT NULL COMMENT '职位编号',
  `eName` varchar(50) DEFAULT NULL COMMENT '员工姓名',
  `cardId` char(18) DEFAULT NULL COMMENT '生份证号',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `phone` char(13) DEFAULT NULL COMMENT '手机号',
  `email` varchar(1000) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`eNo`),
  KEY `eNo_dNo` (`dNo`),
  KEY `eNo_jNo` (`jNo`),
  CONSTRAINT `eNo_dNo` FOREIGN KEY (`dNo`) REFERENCES `department` (`dNo`),
  CONSTRAINT `eNo_jNo` FOREIGN KEY (`jNo`) REFERENCES `job` (`jNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='员工表';

-- ----------------------------
--  Records of `employee`
-- ----------------------------
BEGIN;
INSERT INTO `employee` VALUES ('20100101', '0001', '1001', '令狐冲', '321456987989674563', '男', '16678890788', '0101@126.com'), ('20100102', '0001', '1002', '林平之', '321456987989674773', '男', '16678567788', '0102@126.com'), ('20100103', '0001', '1002', '张三', '331456987989674773', '女', '16678569788', '0103@126.com'), ('20100201', '0002', '1003', '郭靖', '431456987989674773', '男', '16578569788', '0201@126.com'), ('20100202', '0002', '1004', '杨过', '431456987909674773', '男', '15578569788', '0202@126.com'), ('20100203', '0002', '1004', '十三娘', '531456987909674773', '女', '15578569789', '0203@126.com'), ('20100301', '0003', '1005', '乔峰', '531456987909674772', '男', '15578569781', '0301@126.com'), ('20100302', '0003', '1006', '段誉', '531456987919674773', '男', '15578569782', '0302@126.com'), ('20100303', '0003', '1006', '段语嫣', '531456989919674773', '女', '15578569783', '0303@126.com'), ('20100401', '0004', '1007', '蓝桥', '531456989998884773', '男', '15578569784', '0401@126.com'), ('20100402', '0004', '1008', '小蓝', '531456989998884775', '女', '15578569786', '0402@126.com'), ('20100403', '0004', '1008', '张小贵', '531456989998884776', '男', '15578569787', '0403@126.com');
COMMIT;

-- ----------------------------
--  Table structure for `job`
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `jNo` char(8) NOT NULL COMMENT '职位编号',
  `dNo` char(8) DEFAULT NULL COMMENT '部门编号',
  `job` varchar(50) DEFAULT NULL COMMENT '职位名称',
  PRIMARY KEY (`jNo`),
  KEY `jNo_cNo` (`dNo`),
  CONSTRAINT `jNo_cNo` FOREIGN KEY (`dNo`) REFERENCES `department` (`dNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='职位表';

-- ----------------------------
--  Records of `job`
-- ----------------------------
BEGIN;
INSERT INTO `job` VALUES ('1001', '0001', '技术经理'), ('1002', '0001', '后端开发'), ('1003', '0002', '教研经理'), ('1004', '0002', 'Java教研'), ('1005', '0003', '市场经理'), ('1006', '0003', '市场分析'), ('1007', '0004', '财务经理'), ('1008', '0004', '会计');
COMMIT;

-- ----------------------------
--  Table structure for `project`
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `pNo` char(8) NOT NULL COMMENT '项目编号',
  `pName` varchar(50) DEFAULT NULL,
  `startTime` datetime DEFAULT NULL COMMENT '开启时间',
  `endTime` datetime DEFAULT NULL COMMENT '结束时间',
  PRIMARY KEY (`pNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='项目表';

-- ----------------------------
--  Records of `project`
-- ----------------------------
BEGIN;
INSERT INTO `project` VALUES ('1901', '蓝桥杯', '2019-08-20 15:11:54', '2019-12-19 15:12:28'), ('1902', '学生管理系统', '2020-03-19 15:13:07', '2020-08-19 15:13:17'), ('1903', '员工管理系统', '2021-03-19 15:13:54', '2021-08-19 15:14:08'), ('1904', 'erp管理系统', '2021-04-19 15:14:34', '2021-08-19 15:14:43');
COMMIT;

-- ----------------------------
--  Table structure for `salary`
-- ----------------------------
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `bNo` char(8) NOT NULL COMMENT '出纳编号',
  `eNo` char(8) DEFAULT NULL COMMENT '员工编号',
  `basePay` float DEFAULT NULL COMMENT '基本工资',
  `insurancePay` float DEFAULT NULL COMMENT '五险一金',
  `meritPay` float DEFAULT NULL COMMENT '绩效奖金',
  `subsidyPay` float DEFAULT NULL COMMENT '补贴',
  `overtimePay` float DEFAULT NULL COMMENT '加班费',
  PRIMARY KEY (`bNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='工资表';

-- ----------------------------
--  Records of `salary`
-- ----------------------------
BEGIN;
INSERT INTO `salary` VALUES ('20210001', '20100101', '20000', '2000', '1000', '500', '1000'), ('20210002', '20100102', '15000', '1500', '800', '300', '500'), ('20210003', '20100103', '12000', '1000', '600', '300', '500'), ('20210004', '20100201', '25000', '3000', '2000', '1000', '1000'), ('20210005', '20100202', '20000', '2000', '1500', '500', '500'), ('20210006', '20100203', '18000', '1000', '1000', '300', '500'), ('20210007', '20100301', '15000', '4000', '2000', '1500', '2000'), ('20210008', '20100302', '6000', '2000', '1500', '1000', '2000'), ('20210009', '20100303', '8000', '1000', '1500', '1000', '2000'), ('20210010', '20100401', '20000', '1000', '1000', '500', '600'), ('20210011', '20100402', '10000', '500', '800', '500', '600'), ('20210012', '20100403', '12000', '500', '500', '500', '600');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
