CREATE DATABASE db_RefuseClass;

USE `db_RefuseClass`;

DROP TABLE IF EXISTS `classification`;

CREATE TABLE `classification` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `category` varchar(100) DEFAULT NULL,
  `advise` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

insert  into `classification`(`id`,`name`,`category`,`advise`) values (1,'废纸','可回收','投放前应尽量叠放整齐，避免揉团'),(2,'塑料','可回收','投放前应尽量叠放整齐'),(3,'玻璃','可回收','投放前应尽量小心轻放，以免破损。'),(4,'暖瓶','可回收','投放前应尽量小心轻放，以免破损。'),(5,'金属','可回收','投放前尽量叠放集中，妥善处理尖锐部分，避免对他人造成伤害。'),(6,'布料','可回收','投放前应尽量叠放整齐'),(7,'书包','可回收','投放前应尽量叠放整齐'),(8,'鞋','可回收','投放前应尽量叠放整齐'),(9,'剩菜剩饭','不可回收.厨余垃圾','厨余垃圾应做到袋装、密闭投放；投放后应注意盖好垃圾桶上盖，以免垃圾污染周围环境，蚊蝇滋生。'),(10,'骨头','不可回收.厨余垃圾','厨余垃圾应做到袋装、密闭投放；投放后应注意盖好垃圾桶上盖，以免垃圾污染周围环境，蚊蝇滋生。'),(11,'菜根菜叶','不可回收.厨余垃圾','厨余垃圾应做到袋装、密闭投放；投放后应注意盖好垃圾桶上盖，以免垃圾污染周围环境，蚊蝇滋生。'),(12,'果皮','不可回收.厨余垃圾','厨余垃圾应做到袋装、密闭投放；投放后应注意盖好垃圾桶上盖，以免垃圾污染周围环境，蚊蝇滋生。'),(13,'果壳瓜皮','不可回收.厨余垃圾','厨余垃圾应做到袋装、密闭投放；投放后应注意盖好垃圾桶上盖，以免垃圾污染周围环境，蚊蝇滋生。'),(14,'废弃食用油','不可回收.厨余垃圾','厨余垃圾应做到袋装、密闭投放；投放后应注意盖好垃圾桶上盖，以免垃圾污染周围环境，蚊蝇滋生。'),(15,'残枝落叶','不可回收.厨余垃圾','厨余垃圾应做到袋装、密闭投放；投放后应注意盖好垃圾桶上盖，以免垃圾污染周围环境，蚊蝇滋生。'),(16,'砖瓦陶瓷','不可回收.其它垃圾','投放前应尽量叠放整齐'),(17,'渣土','不可回收.其它垃圾','投放前应尽量堆放整齐，洒多些水，避免尘土飞扬'),(18,'卫生间废纸','不可回收.其它垃圾','投放后应注意盖好垃圾桶上盖，以免垃圾污染周围环境，蚊蝇滋生。'),(19,'纸巾','不可回收.其它垃圾','投放后应注意盖好垃圾桶上盖，以免垃圾污染周围环境，蚊蝇滋生。'),(20,'尘土','不可回收.其它垃圾','投放前应尽量堆放整齐，洒多些水，避免尘土飞扬'),(21,'食品袋（盒）','不可回收.其它垃圾','投放前应尽量叠放整齐，避免揉团'),(22,'大棒骨','不可回收.其它垃圾','厨余垃圾应做到袋装、密闭投放；投放后应注意盖好垃圾桶上盖，以免垃圾污染周围环境，蚊蝇滋生。'),(23,'有害的重金属','不可回收.有毒有害','投放到指定的区域，用硬纸盒等包装好，避免对环境造成污染。'),(24,'有毒的物质','不可回收.有毒有害','投放到指定的区域，用硬纸盒等包装好，避免对环境造成污染。'),(25,'电池','不可回收.有毒有害','投放到指定的区域，用硬纸盒等包装好，避免对环境造成污染。'),(26,'荧光灯管','不可回收.有毒有害','投放前应尽量小心轻放，以免破损。'),(27,'灯泡','不可回收.有毒有害','投放前应尽量用硬盒类包装好；小心轻放，以免破损。'),(28,'水银温度计','不可回收.有毒有害','投放前应尽量小心轻放，以免破损。'),(29,'油漆桶','不可回收.有毒有害','投放到指定的区域，用盖子等密封处理，避免对环境造成污染。'),(30,'过期药品','不可回收.有毒有害','投放到指定的区域，密封处理，避免对环境造成污染。'),(31,'过期化妆品','不可回收.有毒有害','投放到指定的区域，密封处理，避免对环境造成污染。');

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `portrait` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `publish`;

CREATE TABLE `publish` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `publishtext` varchar(300) DEFAULT NULL,
  `img` varchar(200) DEFAULT NULL,
  `infoId` int(11) DEFAULT NULL,
   PRIMARY KEY (`id`),
   KEY `FK_basic` (`infoId`),
   CONSTRAINT `FK_basic` FOREIGN KEY (`infoId`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `givelike`;

CREATE TABLE `givelike` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` int(200) DEFAULT NULL,
  `publishId` int(11) DEFAULT NULL,
   PRIMARY KEY (`id`),
   KEY `FK_publish` (`publishId`),
   CONSTRAINT `FK_publish` FOREIGN KEY (`publishId`) REFERENCES `publish` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(300) DEFAULT NULL,
  `infoId` int(11) DEFAULT NULL,
  `publishId` int(11) DEFAULT NULL,
   PRIMARY KEY (`id`),
   KEY `FK_comment` (`infoId`),
   KEY `FK_publishId` (`publishId`),
   CONSTRAINT `FK_comment` FOREIGN KEY (`infoId`) REFERENCES `user` (`id`),
   CONSTRAINT `FK_publishId` FOREIGN KEY (`publishId`) REFERENCES `publish` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;