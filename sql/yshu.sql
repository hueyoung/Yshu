/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : yshu

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-23 15:34:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `yshu_task`
-- ----------------------------
DROP TABLE IF EXISTS `yshu_task`;
CREATE TABLE `yshu_task` (
  `user_id` varchar(20) NOT NULL,
  `content` text,
  `send_time` bigint(20) DEFAULT NULL,
  `send_phone` varchar(15) DEFAULT NULL,
  `state` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yshu_task
-- ----------------------------

-- ----------------------------
-- Table structure for `yshu_user`
-- ----------------------------
DROP TABLE IF EXISTS `yshu_user`;
CREATE TABLE `yshu_user` (
  `user_id` varchar(20) NOT NULL COMMENT '主键',
  `psw` varchar(16) DEFAULT NULL,
  `last_login` bigint(20) DEFAULT NULL,
  `login_type` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yshu_user
-- ----------------------------

