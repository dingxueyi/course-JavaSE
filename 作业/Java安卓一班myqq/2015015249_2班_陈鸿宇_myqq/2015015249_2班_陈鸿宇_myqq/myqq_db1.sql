﻿# SQL Manager 2007 Lite for MySQL 4.4.2.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : myqq_db


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `myqq_db`
    CHARACTER SET 'utf8'
    COLLATE 'utf8_general_ci';

USE `myqq_db`;

#
# Structure for the `message` table : 
#

CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(200) DEFAULT NULL,
  `sender` int(11) DEFAULT NULL,
  `receiver` int(11) DEFAULT NULL,
  `sendTime` datetime DEFAULT NULL,
  `receiveTime` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL COMMENT '1--发送中，2--已读，3--撤销',
  `type` int(11) DEFAULT NULL COMMENT '1--聊天消息，2--系统提示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;

#
# Structure for the `users` table : 
#

CREATE TABLE `users` (
  `qqnum` int(11) NOT NULL AUTO_INCREMENT,
  `nickName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `registTime` datetime DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `introduce` varchar(200) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`qqnum`)
) ENGINE=InnoDB AUTO_INCREMENT=12312 DEFAULT CHARSET=utf8;

#
# Data for the `message` table  (LIMIT 0,500)
#

INSERT INTO `message` (`id`, `content`, `sender`, `receiver`, `sendTime`, `receiveTime`, `state`, `type`) VALUES 
  (1,'123',123,456,'2017-06-13 16:50:43',NULL,1,NULL),
  (2,'12306',123,147,'2017-06-13 16:55:32',NULL,1,NULL),
  (3,'123456',123,258,'2017-06-13 16:56:19',NULL,1,NULL),
  (4,'123',123,258,'2017-06-13 16:57:09',NULL,1,NULL),
  (5,'12356',123,258,'2017-06-13 17:08:37',NULL,1,NULL),
  (6,'25543',123,258,'2017-06-13 17:08:41',NULL,1,NULL),
  (7,'',123,258,'2017-06-13 17:08:42',NULL,1,NULL),
  (8,'2452',123,258,'2017-06-13 17:08:43',NULL,1,NULL),
  (9,'',123,369,'2017-06-13 17:08:44',NULL,1,NULL),
  (10,'2452',123,369,'2017-06-13 17:08:47',NULL,1,NULL),
  (11,'2452',123,258,'2017-06-13 17:08:49',NULL,1,NULL),
  (12,'58727',123,258,'2017-06-13 17:09:57',NULL,1,NULL),
  (13,'5252',123,258,'2017-06-13 17:09:58',NULL,1,NULL),
  (14,'2326',123,258,'2017-06-13 17:10:58',NULL,1,NULL),
  (15,'',123,258,'2017-06-13 17:10:58',NULL,1,NULL),
  (16,'',123,258,'2017-06-13 17:10:59',NULL,1,NULL),
  (17,'26',123,258,'2017-06-13 17:11:03',NULL,1,NULL),
  (18,'23',123,456,'2017-06-13 17:13:45',NULL,1,NULL),
  (19,'23',123,456,'2017-06-13 17:13:46',NULL,1,NULL),
  (20,'23',123,456,'2017-06-13 17:13:47',NULL,1,NULL),
  (21,'23',123,456,'2017-06-13 17:13:48',NULL,1,NULL),
  (22,'222222222222222222',123,456,'2017-06-13 17:19:17',NULL,1,NULL),
  (23,'2222222222222',123,456,'2017-06-13 17:19:26',NULL,1,NULL),
  (24,'12222222',123,456,'2017-06-13 17:21:33',NULL,1,NULL),
  (25,'25555555',123,456,'2017-06-13 17:21:38',NULL,1,NULL),
  (26,'22225568886552225',123,456,'2017-06-13 17:21:40',NULL,1,NULL),
  (27,'25555555',123,456,'2017-06-13 17:21:43',NULL,1,NULL),
  (28,'1213156\n',123,456,'2017-06-13 17:23:31',NULL,1,NULL),
  (29,'2651\n',123,456,'2017-06-13 17:23:35',NULL,1,NULL),
  (30,'54345\n',123,456,'2017-06-13 17:23:38',NULL,1,NULL),
  (31,'45345345345\n',123,456,'2017-06-13 17:23:41',NULL,1,NULL),
  (32,'354345\n',123,456,'2017-06-13 17:23:43',NULL,1,NULL),
  (33,'3453453\n',123,456,'2017-06-13 17:23:44',NULL,1,NULL),
  (34,'345345\n',123,456,'2017-06-13 17:23:46',NULL,1,NULL),
  (35,'张三123456\n',123,456,'2017-06-13 17:26:19',NULL,1,NULL),
  (36,'1435\n',123,369,'2017-06-13 17:26:50',NULL,1,NULL),
  (37,'42\n',123,369,'2017-06-13 17:26:53',NULL,1,NULL),
  (38,'25254\n',123,369,'2017-06-13 17:26:54',NULL,1,NULL),
  (39,'52452\n',123,369,'2017-06-13 17:26:56',NULL,1,NULL),
  (40,'54254\n',123,369,'2017-06-13 17:26:57',NULL,1,NULL),
  (41,'张三:1236\n',123,456,'2017-06-13 17:28:02',NULL,1,NULL),
  (42,'张三:156\n',123,456,'2017-06-13 17:28:05',NULL,1,NULL),
  (43,'张三:442\n',123,456,'2017-06-13 17:28:09',NULL,1,NULL),
  (44,'张三:2425\n',123,456,'2017-06-13 17:28:11',NULL,1,NULL),
  (45,'张三:24\n',123,258,'2017-06-13 17:28:36',NULL,1,NULL),
  (46,'张三:2\n',123,456,'2017-06-13 17:50:24',NULL,1,NULL),
  (47,'张三:52\n',123,456,'2017-06-13 17:50:25',NULL,1,NULL),
  (48,'张三:23263\n',123,456,'2017-06-13 18:00:46',NULL,1,NULL),
  (49,'张三:你好\n',123,456,'2017-06-13 18:00:58',NULL,1,NULL),
  (50,'李四:23\n',456,123,'2017-06-13 18:56:27',NULL,1,NULL),
  (51,'张三:\n',123,789,'2017-06-13 21:46:36',NULL,1,NULL),
  (52,'张三:你好\n',123,789,'2017-06-13 21:46:42',NULL,1,NULL),
  (53,'张三:我是谁\n',123,789,'2017-06-13 21:46:51',NULL,1,NULL);
COMMIT;

#
# Data for the `users` table  (LIMIT 0,500)
#

INSERT INTO `users` (`qqnum`, `nickName`, `password`, `registTime`, `gender`, `introduce`, `ip`) VALUES 
  (123,'张三','123456','2017-06-06 16:34:00','男','happy','192.168.135.1'),
  (456,'李四','123456','2017-06-06 16:35:00','男','happy','192.168.135.1'),
  (789,'王五','123456','2017-06-06 16:36:00','男','sad',NULL),
  (147,'赵六','123456','2017-06-06 16:37:00','男','happy',NULL),
  (258,'田七','123456','2017-06-06 16:38:00','男','sad',NULL),
  (369,'詹姆斯','123456','2017-06-06 16:39:00','男','happy',NULL);
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;