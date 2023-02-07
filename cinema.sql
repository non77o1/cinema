CREATE DATABASE  IF NOT EXISTS `cinema` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cinema`;
-- MySQL dump 10.13  Distrib 8.0.30, for macos12 (x86_64)
--
-- Host: localhost    Database: cinema
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `username` varchar(45) NOT NULL,
  `password` varchar(4) NOT NULL,
  `person_id` int NOT NULL,
  `rule` varchar(1) NOT NULL,
  PRIMARY KEY (`username`,`password`),
  KEY `person_id` (`person_id`),
  CONSTRAINT `account_ibfk_1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES ('ah55','5509',16,'e'),('ali55','5509',7,'e'),('Atheer1423','Aa44',19,'c'),('hn11','1109',1,'c'),('jr33','3309',17,'c'),('omar88','8809',8,'e'),('ya22','2209',15,'c');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `card`
--

DROP TABLE IF EXISTS `card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `card` (
  `holder_name` varchar(45) DEFAULT NULL,
  `ccv` varchar(3) NOT NULL,
  `card_number` varchar(18) NOT NULL,
  `Payment_id` int NOT NULL,
  `Order_Total_price` double DEFAULT NULL,
  `num_items` int DEFAULT NULL,
  PRIMARY KEY (`Payment_id`),
  CONSTRAINT `card_ibfk_1` FOREIGN KEY (`Payment_id`) REFERENCES `payment_methods` (`Payment_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `card`
--

LOCK TABLES `card` WRITE;
/*!40000 ALTER TABLE `card` DISABLE KEYS */;
INSERT INTO `card` VALUES ('jory','333','3333333333333333',7,234,2),('yasser','222','2222222222222222',10,80,0),('jory','333','3333333333333333',12,227,3),('hneen','333','3333333333333333',13,404,3),('hneen','666','6666666666666666',14,122,2);
/*!40000 ALTER TABLE `card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `order_id` int NOT NULL,
  `item_id` int NOT NULL,
  `num_item` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`order_id`,`item_id`),
  KEY `itemid_idx` (`item_id`),
  CONSTRAINT `itemid` FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `orderid` FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (5,12,1,26),(7,14,1,43),(7,17,1,27),(12,14,1,43),(12,15,2,6),(13,14,2,86),(13,17,1,27),(14,13,1,15),(14,17,1,27);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cash`
--

DROP TABLE IF EXISTS `cash`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cash` (
  `Payment_id` int NOT NULL,
  `Order_Total_price` double DEFAULT NULL,
  `currency` varchar(4) DEFAULT NULL,
  `num_items` int DEFAULT NULL,
  PRIMARY KEY (`Payment_id`),
  CONSTRAINT `cash_ibfk_1` FOREIGN KEY (`Payment_id`) REFERENCES `payment_methods` (`Payment_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cash`
--

LOCK TABLES `cash` WRITE;
/*!40000 ALTER TABLE `cash` DISABLE KEYS */;
INSERT INTO `cash` VALUES (5,91,'SAR',1),(6,80,'SAR',0),(8,109,'SAR',0);
/*!40000 ALTER TABLE `cash` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `coustomer_id` int NOT NULL AUTO_INCREMENT,
  `coustomer_name` varchar(45) NOT NULL,
  `coustomer_Phone` varchar(10) NOT NULL,
  PRIMARY KEY (`coustomer_id`),
  CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`coustomer_id`) REFERENCES `person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'hneen','0508843287'),(15,'yasser','0505643278'),(17,'jory','0563738333'),(18,'Atheer','0554967888'),(19,'Atheer','0554967888');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `Employee_id` int NOT NULL AUTO_INCREMENT,
  `Employee_name` varchar(45) NOT NULL,
  `Employee_phone` varchar(45) NOT NULL,
  `salary` double DEFAULT NULL,
  `payment_date` date DEFAULT NULL,
  PRIMARY KEY (`Employee_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`Employee_id`) REFERENCES `person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `check_salary` CHECK ((`salary` <= 10000))
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (7,'ali','0538723092',1100,'2022-05-20'),(8,'omar','0598747365',1200,'2022-05-20'),(16,'ahmid','0504573532',2300,'2022-08-20');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `items` (
  `item_id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (1),(2),(3),(5),(6),(7),(8),(9),(10),(11),(12),(13),(14),(15),(16),(17),(18);
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie` (
  `movie_id` int NOT NULL,
  `movie_name` varchar(45) NOT NULL,
  `movie_price` double NOT NULL,
  `doration` varchar(45) NOT NULL,
  `Language` varchar(45) NOT NULL,
  `age` varchar(45) NOT NULL,
  PRIMARY KEY (`movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'plane',88,'2:00:00','English','15+'),(2,'Independence',78,'2:30:00','English','17+'),(3,'Etneen lie Egar',60,'1:30:00','Arabic','16+'),(4,'Operation Fortue',79,'1:40:00','English','18+'),(5,'Megan',89,'2:50:00','English','18+'),(6,'offeting',66,'1:40:00','English','15+'),(7,'Queens Gamblt',99,'2:00:00','English','18+'),(8,'Avatar',50,'59:00','English','11+'),(9,'Story Toy',70,'1:30:00','English','8+'),(10,'Monsters',50,'2:00:00','English','8+'),(11,'The goonies',50,'1:49:00','English','8+');
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_time`
--

DROP TABLE IF EXISTS `movie_time`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_time` (
  `movie_id` int NOT NULL,
  `time` varchar(45) NOT NULL,
  PRIMARY KEY (`movie_id`,`time`),
  CONSTRAINT `movie_id` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`movie_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_time`
--

LOCK TABLES `movie_time` WRITE;
/*!40000 ALTER TABLE `movie_time` DISABLE KEYS */;
INSERT INTO `movie_time` VALUES (1,'3 PM'),(1,'4 PM'),(1,'9 PM'),(2,'11 PM'),(2,'12 AM'),(2,'2 PM'),(3,'11 PM'),(3,'3 PM'),(3,'8 PM'),(4,'10 PM'),(4,'11 PM'),(4,'9 PM'),(5,'12 AM'),(5,'3 PM'),(5,'9 PM'),(6,'10 PM'),(6,'3 PM'),(6,'6 PM'),(7,'1 AM'),(7,'2 AM'),(7,'9 PM'),(8,'3 PM'),(8,'4 PM'),(8,'6 PM'),(9,'2 PM'),(9,'5 PM'),(9,'7 PM'),(10,'1 PM'),(10,'12 PM'),(10,'5 PM'),(11,'2 PM'),(11,'4 PM'),(11,'7 PM');
/*!40000 ALTER TABLE `movie_time` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `order_id` int NOT NULL,
  PRIMARY KEY (`order_id`),
  UNIQUE KEY `order_id_UNIQUE` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (5),(6),(7),(8),(10),(12),(13),(14);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_record`
--

DROP TABLE IF EXISTS `order_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_record` (
  `order_id` int NOT NULL,
  `custemer_id` int NOT NULL,
  `pay_id` int NOT NULL,
  `order_date` date DEFAULT NULL,
  `movie_id` varchar(45) NOT NULL,
  PRIMARY KEY (`order_id`,`custemer_id`,`pay_id`,`movie_id`),
  KEY `coustemerid_c_idx` (`custemer_id`),
  KEY `payid_idx` (`pay_id`),
  CONSTRAINT `coustemerid_c` FOREIGN KEY (`custemer_id`) REFERENCES `customer` (`coustomer_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `orderid_c` FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `payid` FOREIGN KEY (`pay_id`) REFERENCES `payment_methods` (`Payment_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_record`
--

LOCK TABLES `order_record` WRITE;
/*!40000 ALTER TABLE `order_record` DISABLE KEYS */;
INSERT INTO `order_record` VALUES (5,1,5,'2023-02-06','10'),(6,1,6,'2023-02-07','8'),(7,17,7,'2023-02-07','4'),(8,1,8,'2023-02-07','4'),(10,15,10,'2023-02-07','11'),(12,17,12,'2023-02-07','7'),(13,1,13,'2023-02-07','8'),(14,15,14,'2023-02-07','8');
/*!40000 ALTER TABLE `order_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_methods`
--

DROP TABLE IF EXISTS `payment_methods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment_methods` (
  `Payment_id` int NOT NULL AUTO_INCREMENT,
  `Order_id` int NOT NULL,
  PRIMARY KEY (`Payment_id`,`Order_id`),
  KEY `order_id_idx` (`Order_id`),
  CONSTRAINT `order_id1` FOREIGN KEY (`Order_id`) REFERENCES `order` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_methods`
--

LOCK TABLES `payment_methods` WRITE;
/*!40000 ALTER TABLE `payment_methods` DISABLE KEYS */;
INSERT INTO `payment_methods` VALUES (5,5),(6,6),(7,7),(8,8),(10,10),(12,12),(13,13),(14,14);
/*!40000 ALTER TABLE `payment_methods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1),(7),(8),(15),(16),(17),(18),(19);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seat`
--

DROP TABLE IF EXISTS `seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seat` (
  `seat` varchar(45) NOT NULL,
  `movie_id` int NOT NULL,
  `orderId` int NOT NULL,
  `time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`movie_id`,`orderId`,`seat`),
  KEY `orderID_idx` (`orderId`),
  CONSTRAINT `id` FOREIGN KEY (`orderId`) REFERENCES `order` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `movie` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`movie_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat`
--

LOCK TABLES `seat` WRITE;
/*!40000 ALTER TABLE `seat` DISABLE KEYS */;
INSERT INTO `seat` VALUES ('A4',4,7,'11 PM'),('B5',4,7,'11 PM'),('C3',4,7,'11 PM'),('B3',4,8,'11 PM'),('B4',4,8,'11 PM'),('B2',7,12,'2 AM'),('B3',7,12,'2 AM'),('A4',8,6,'3 PM'),('B3',8,6,'3 PM'),('C4',8,13,'3 PM'),('D4',8,13,'3 PM'),('A5',8,14,'3 PM'),('B5',8,14,'3 PM'),('C3',10,5,'12 PM'),('C4',10,5,'12 PM'),('D4',10,5,'12 PM'),('A3',11,10,'2 PM'),('A4',11,10,'2 PM'),('B4',11,10,'2 PM');
/*!40000 ALTER TABLE `seat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `snack`
--

DROP TABLE IF EXISTS `snack`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `snack` (
  `snack_id` int NOT NULL,
  `snack_name` varchar(45) NOT NULL,
  `snack_price` double NOT NULL,
  PRIMARY KEY (`snack_id`),
  CONSTRAINT `snack_id` FOREIGN KEY (`snack_id`) REFERENCES `items` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `snack`
--

LOCK TABLES `snack` WRITE;
/*!40000 ALTER TABLE `snack` DISABLE KEYS */;
INSERT INTO `snack` VALUES (12,'Popcorn',26),(13,'Soft drink',15),(14,'Nachos',43),(15,'Water',3),(17,'Slash',27),(18,'orangejuice',15);
/*!40000 ALTER TABLE `snack` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-07 21:09:41
