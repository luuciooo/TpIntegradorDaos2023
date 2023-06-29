-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: daos2023
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Dumping data for table `ciudad`
--

LOCK TABLES `ciudad` WRITE;
/*!40000 ALTER TABLE `ciudad` DISABLE KEYS */;
/*!40000 ALTER TABLE `ciudad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (123456789,'Doe','Calle Principal 123','johndoe@example.com','1990-01-01 00:00:00.000000','2025-01-01 00:00:00.000000','John',987654321),(135792468,'Williams','Plaza Mayor 567','sarahwilliams@example.com','1992-11-09 00:00:00.000000','2026-01-01 00:00:00.000000','Sarah',456789123),(246813579,'Johnson','Calle Secundaria 789','markjohnson@example.com','1978-05-12 00:00:00.000000','2023-01-01 00:00:00.000000','Mark',987654321),(468135792,'Anderson','Calle Secundaria 234','lisaanderson@example.com','1987-03-09 00:00:00.000000','2025-01-01 00:00:00.000000','Lisa',321654987),(579246813,'Brown','Avenida Principal 789','mikebrown@example.com','1980-07-07 00:00:00.000000','2024-01-01 00:00:00.000000','Mike',789123456),(987654321,'Smith','Avenida Central 456','janesmith@example.com','1985-02-03 00:00:00.000000','2024-01-01 00:00:00.000000','Jane',123456789);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `persona_notas`
--

LOCK TABLES `persona_notas` WRITE;
/*!40000 ALTER TABLE `persona_notas` DISABLE KEYS */;
/*!40000 ALTER TABLE `persona_notas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `vuelo`
--

LOCK TABLES `vuelo` WRITE;
/*!40000 ALTER TABLE `vuelo` DISABLE KEYS */;
INSERT INTO `vuelo` VALUES (1,'Nueva York',NULL,'2023-06-29 00:00:00.000000','10:00',10,5,'Córdoba','Internacional'),(2,'Bariloche',NULL,'2023-06-30 00:00:00.000000','11:30',8,4,'Córdoba','Nacional'),(3,'Londres',NULL,'2023-07-01 00:00:00.000000','14:15',12,6,'Buenos Aires','Internacional'),(4,'Rosario',NULL,'2023-07-02 00:00:00.000000','09:45',6,3,'Buenos Aires','Nacional'),(5,'Miami',NULL,'2023-07-03 00:00:00.000000','16:20',14,7,'Córdoba','Internacional'),(6,'Tucumán',NULL,'2023-07-04 00:00:00.000000','12:00',10,5,'Buenos Aires','Nacional'),(7,'Buenos Aires',NULL,'2023-07-05 00:00:00.000000','08:30',8,4,'París','Internacional'),(8,'Mendoza',NULL,'2023-07-06 00:00:00.000000','15:45',12,6,'Buenos Aires','Nacional'),(9,'Sao Paulo',NULL,'2023-07-07 00:00:00.000000','11:10',10,5,'Buenos Aires','Internacional'),(10,'Buenos Aires',NULL,'2023-07-08 00:00:00.000000','13:20',8,4,'Bariloche','Nacional');
/*!40000 ALTER TABLE `vuelo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-29 18:30:51
