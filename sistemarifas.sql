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
-- Table structure for table `credenciales`
--

DROP TABLE IF EXISTS `credenciales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `credenciales` (
  `id_credencial` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `rol` enum('admin','cliente') DEFAULT 'cliente',
  PRIMARY KEY (`id_credencial`),
  UNIQUE KEY `username` (`username`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `credenciales_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credenciales`
--

LOCK TABLES `credenciales` WRITE;
/*!40000 ALTER TABLE `credenciales` DISABLE KEYS */;
INSERT INTO `credenciales` VALUES (1,1,'juan123','password123','admin'),(2,2,'ana456','password456','cliente'),(3,3,'carlos789','password789','cliente'),(4,4,'maria101','password101','cliente');
/*!40000 ALTER TABLE `credenciales` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `tickets`
--

DROP TABLE IF EXISTS `tickets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tickets` (
  `id_ticket` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `id_rifa` int NOT NULL,
  `numero_ticket` int NOT NULL,
  PRIMARY KEY (`id_ticket`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_rifa` (`id_rifa`),
  CONSTRAINT `tickets_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE,
  CONSTRAINT `tickets_ibfk_2` FOREIGN KEY (`id_rifa`) REFERENCES `rifas` (`id_rifa`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tickets`
--

LOCK TABLES `tickets` WRITE;
/*!40000 ALTER TABLE `tickets` DISABLE KEYS */;
INSERT INTO `tickets` VALUES (1,1,1,1001),(2,2,1,1002),(3,3,2,2001),(4,4,2,2002),(5,5,3,3001),(6,6,3,3002),(7,7,4,4001),(8,8,4,4002),(9,9,5,5001),(10,10,5,5002);
/*!40000 ALTER TABLE `tickets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `apellido` varchar(50) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `correo` (`correo`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Juan','juan.perez@example.com','555-1234','Pérez','Av. Principal 123'),(2,'Ana ','ana.gomez@example.com','555-5678','Gómez','Calle Secundaria 456'),(3,'Carlos ','carlos.lopez@example.com','555-8765','Martínez','Carrera Central 789'),(4,'María ','maria.torres@example.com','555-4321','López','Calle 5ta. 890'),(5,'Pedro ','pedro.sanchez@example.com','555-1111','Hernández','Avenida 10'),(6,'Laura ','laura.diaz@example.com','555-2222','Fernández','Calle Reforma 112'),(7,'Jorge ','jorge.ramos@example.com','555-3333','Ramírez','Calle del Sol 245'),(8,'Carmen ','carmen.ruiz@example.com','555-4444','Sánchez','Calle San Juan 654'),(9,'Luis ','luis.fernandez@example.com','555-5555','García','Avenida del Norte 876'),(10,'Elena ','elena.morales@example.com','555-6666','Rodríguez','Calle de los Pinos 321'),(18,'Juan','Juan@GMAIL.COM','3212312323','Pedraza','La Maria'),(29,'Juan','jua@gmail.com','32044448498','Pedraza','La MARIA 30');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-28  8:07:54
