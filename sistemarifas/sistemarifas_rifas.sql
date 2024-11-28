-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sistemarifas
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `rifas`
--

DROP TABLE IF EXISTS `rifas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rifas` (
  `id_rifa` int NOT NULL AUTO_INCREMENT,
  `nombre_rifa` varchar(100) NOT NULL,
  `descripcion` text,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `costo_ticket` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id_rifa`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rifas`
--

LOCK TABLES `rifas` WRITE;
/*!40000 ALTER TABLE `rifas` DISABLE KEYS */;
INSERT INTO `rifas` VALUES (1,'Rifa Navidad','Rifa especial de navidad con premios increíbles','2024-12-01','2024-12-25',5.00),(2,'Rifa Verano','Disfruta el verano con nuestra rifa de viajes','2024-06-01','2024-06-30',10.00),(3,'Rifa Electrónica','Gana los últimos gadgets del mercado','2024-03-01','2024-03-31',15.00),(4,'Rifa Autos','Participa para ganar un auto nuevo','2024-01-01','2024-01-31',50.00),(5,'Rifa Hogar','Premios perfectos para tu hogar','2024-04-01','2024-04-30',7.00),(6,'Rifa Salud','Cuida tu salud con premios deportivos','2024-05-01','2024-05-31',12.00),(7,'Rifa Gourmet','Gana experiencias culinarias','2024-07-01','2024-07-31',8.00),(8,'Rifa Tecnología','Productos tecnológicos de última generación','2024-08-01','2024-08-31',20.00),(9,'Rifa Vuelta al Cole','Prepárate para el regreso a clases','2024-09-01','2024-09-30',6.00),(10,'Rifa Fin de Año','Cierra el año con premios exclusivos','2024-11-01','2024-11-30',25.00);
/*!40000 ALTER TABLE `rifas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-28  8:07:34
