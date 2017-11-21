/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : yshu

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-21 14:41:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `yshu_task`
-- ----------------------------
DROP TABLE IF EXISTS `yshu_task`;
CREATE TABLE `yshu_task` (
  `user_id` int(11) NOT NULL,
  `content` text,
  `send_time` int(11) DEFAULT NULL,
  `send_phone` int(11) DEFAULT NULL,
  `state` int(2) DEFAULT NULL,
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
  `user_id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '主键',
  `psw` varchar(11) DEFAULT NULL,
  `last_login` datetime DEFAULT NULL,
  `login_type` int(2) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yshu_user
-- ----------------------------
