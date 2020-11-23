CREATE DATABASE IF NOT EXISTS `spring_demo`;

USE `spring_demo`;

DROP TABLE IF EXISTS `clients`;

CREATE TABLE `clients` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
# set AUTO_INCREMENT starting value in a InnoBD table to zero.
# latin1 is the default character set that will be used.

LOCK TABLES `clients` WRITE;

INSERT INTO `clients` VALUES (4,'Theo','Pendle'),(5,'Bruce','Wayne');

select * from clients;

insert into clients(first_name, last_name) values ('dat','nguyen');

UNLOCK TABLES;

select connection_id();