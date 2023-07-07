
CREATE TABLE `clientes`(
  `clienteId` int(5) NOT NULL ,
  `nombre` varchar(55) NOT NULL,
  `apellido` varchar(120) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `fechaCarnet` date,
  `telefono` int(10),
  PRIMARY KEY (`clienteId`)
) ;

INSERT INTO `clientes` (`clienteId`,`nombre`,`apellido`,`dni`,`fechaCarnet`,`telefono`) VALUES 
 (1, 'Beatriz','Alonso','22222222J','1995-10-15',666545757),
 (2, 'Julia','Herrera','11111111H','1999-08-01',637451678),
 (3, 'Alberto','López','70215788F','1992-06-05',643290777),
 (4, 'Raquel','Ortiz','03411919Y','2000-11-20',673555666),
 (5, 'Carlos','González','50753246E','1993-03-03',649511558);

CREATE TABLE `coches` (
  `cocheId` int(4)  NOT NULL,
  `marca` varchar(55) NOT NULL,
  `modelo` varchar(120) NOT NULL,
  `matricula` varchar(7) NOT NULL,
  `precioDia` int(6) NOT NULL,
  PRIMARY KEY (`cocheId`)
);

INSERT INTO `coches` (`cocheId`,`marca`,`modelo`,`matricula`,`precioDia`) VALUES 
 (1, 'Audi','A3','8828JLM',35),
 (2, 'Opel','Corsa','6033GVB',20),
 (3, 'Toyota','Avensis','9350FFA',25),
 (4, 'Audi', 'A1','1422GSR',30),
 (5, 'BMW', 'Serie 1', '7819HCU',40),
 (6,'Hyundai','i30','0392JJS',20);
 
 
CREATE TABLE `seguros` (
  `seguroId` int(3) NOT NULL ,
  `tipoSeguro` varchar(55) NOT NULL,
  `cobertura` varchar(120) NOT NULL,
  `precio` int(6) NOT NULL,
  PRIMARY KEY (`seguroId`)
);

INSERT INTO `seguros` (`seguroId`,`tipoSeguro`,`cobertura`,`precio`) VALUES 
 (1,'Básico', 'Terceros', 20),
 (2, 'Premium','Todo riesgo',50);

 