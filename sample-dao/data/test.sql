/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-07-07 08:40:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for opinion
-- ----------------------------
DROP TABLE IF EXISTS `opinion`;
CREATE TABLE `opinion` (
  `SerialNumber` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `ProposalOfSerialNumber` int(11) DEFAULT NULL COMMENT '提案编号',
  `UserOfSerialNumber` int(11) DEFAULT NULL COMMENT '用户编号',
  `UserOfName` varchar(16) DEFAULT NULL COMMENT '用户姓名',
  `Content` text COMMENT '内容',
  `Position` char(1) DEFAULT NULL COMMENT '立场(1:附议、2:反对)',
  PRIMARY KEY (`SerialNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='提案意见信息表';

-- ----------------------------
-- Table structure for proposal_norm
-- ----------------------------
DROP TABLE IF EXISTS `proposal_norm`;
CREATE TABLE `proposal_norm` (
  `SerialNumber` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `EssayName` varchar(32) DEFAULT NULL COMMENT '提案名称',
  `NormName` varchar(32) DEFAULT NULL COMMENT '规范名称',
  `Content` text COMMENT '内容',
  `SerialNumberOfWriter` int(11) DEFAULT NULL COMMENT '作者编号',
  `NameOfWriter` varchar(16) DEFAULT NULL COMMENT '作者姓名',
  `TimeOfUpdate` datetime DEFAULT NULL COMMENT '更新时间',
  `Type` char(1) DEFAULT NULL COMMENT '类型(1:提案、2:规范)',
  `Status` char(1) DEFAULT NULL COMMENT '状态(1:已通过、2:征集中、3:未通过)',
  PRIMARY KEY (`SerialNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='提案规范信息表';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `SerialNumber` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `Name` varchar(16) DEFAULT NULL COMMENT '姓名',
  `Sex` char(1) DEFAULT NULL COMMENT '性别',
  `BirthDate` varchar(10) DEFAULT NULL COMMENT '出生日期',
  `TelNumber` varchar(16) DEFAULT NULL COMMENT '电话号码',
  `IndustryBranch` varchar(32) DEFAULT NULL COMMENT '行业分会',
  `SpecialCommittee` varchar(32) DEFAULT NULL COMMENT '专委会',
  `SpecialIdentity` varchar(32) DEFAULT NULL COMMENT '研究会',
  `NameOfRecommending` varchar(16) DEFAULT NULL COMMENT '推荐人',
  `TypeOfRecommending` char(1) DEFAULT NULL COMMENT '类型(1:入会申请、2:入会推荐)',
  `Content` text COMMENT '内容',
  `Mail` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `Address` varchar(64) DEFAULT NULL COMMENT '地址',
  `NameOfWechat` varchar(32) DEFAULT NULL COMMENT '微信',
  `Status` char(1) DEFAULT NULL COMMENT '状态(1:正常、2:待审核、3:拒绝)',
  `Account` varchar(32) DEFAULT NULL COMMENT '账户名',
  `Password` varchar(64) DEFAULT NULL COMMENT '密码',
  `Type` char(1) DEFAULT NULL COMMENT '类型(1:管理人员、2:写作人员、3:非会员)',
  `Company` varchar(64) DEFAULT NULL COMMENT '单位',
  `Title` varchar(64) DEFAULT NULL COMMENT '职称',
  `Job` varchar(64) DEFAULT NULL COMMENT '职位',
  PRIMARY KEY (`SerialNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户信息表';
