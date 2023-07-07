-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.61-community
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

--
-- Create schema rentingsdb2
--
CREATE DATABASE IF NOT EXISTS rentingsdb2;
USE rentingsdb2;

--
-- Definition of table `clientes`
--
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `clienteId` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(55) NOT NULL,
  `apellido` varchar(120) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `fechaCarnet` date,
  `telefono` int(10),
  PRIMARY KEY (`clienteId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clientes`
--
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` (`clienteId`,`nombre`,`apellido`,`dni`,`fechaCarnet`,`telefono`) VALUES 
 (1, 'Beatriz','Alonso','22222222J','1995-10-15',666545757),
 (2, 'Julia','Herrera','11111111H','1999-08-01',637451678),
 (3, 'Alberto','López','70215788F','1992-06-05',643290777),
 (4, 'Raquel','Ortiz','03411919Y','2000-11-20',673555666),
 (5, 'Carlos','González','50753246E','1993-03-03',649511558);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

--
-- Definition of table `coches`
--
DROP TABLE IF EXISTS `coches`;
CREATE TABLE `coches` (
  `cocheId` int(4) unsigned NOT NULL AUTO_INCREMENT,
  `marca` varchar(55) NOT NULL,
  `modelo` varchar(120) NOT NULL,
  `matricula` varchar(7) NOT NULL,
  `precioDia` int(6) NOT NULL,
  PRIMARY KEY (`cocheId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coches`
--
/*!40000 ALTER TABLE `coches` DISABLE KEYS */;
INSERT INTO `coches` (`cocheId`,`marca`,`modelo`,`matricula`,`precioDia`) VALUES 
 (1, 'Audi','A3','8828JLM',35),
 (2, 'Opel','Corsa','6033GVB',20),
 (3, 'Toyota','Avensis','9350FFA',25),
 (4, 'Audi', 'A1','1422GSR',30),
 (5, 'BMW', 'Serie 1', '7819HCU',40),
 (6,'Hyundai','i30','0392JJS',20);
/*!40000 ALTER TABLE `coches` ENABLE KEYS */;

--
-- Definition of table `seguros`
--
DROP TABLE IF EXISTS `seguros`;
CREATE TABLE `seguros` (
  `seguroId` int(3) unsigned NOT NULL AUTO_INCREMENT,
  `tipoSeguro` varchar(55) NOT NULL,
  `cobertura` varchar(120) NOT NULL,
  `precio` int(6) NOT NULL,
  PRIMARY KEY (`seguroId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seguros`
--
/*!40000 ALTER TABLE `seguros` DISABLE KEYS */;
INSERT INTO `seguros` (`seguroId`,`tipoSeguro`,`cobertura`,`precio`) VALUES 
 (1,'Básico', 'Terceros', 20),
 (2, 'Premium','Todo riesgo',50);
/*!40000 ALTER TABLE `seguros` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
