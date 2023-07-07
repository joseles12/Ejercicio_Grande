/*CREACION DE TABLAS */

Drop TABLE if EXISTS 'pedidos';

CREATE TABLE `pedidos`(
  `idPedido` int(5) NOT NULL ,
  `nombre` varchar(55) NOT NULL,
  `precioTotal` int(3) NOT NULL,
  `direccion_envio` varchar(50) NOT NULL,
  PRIMARY KEY (`idPedido`) ) ;

/*INSERTAR DATOS*/

INSERT INTO `clientes` (`clienteId`,`nombre`,`apellido`,`dni`,`fechaCarnet`,`telefono`) VALUES 
 (1, 'Beatriz','Alonso','22222222J','1995-10-15',666545757),
 (2, 'Julia','Herrera','11111111H','1999-08-01',637451678),
 (3, 'Alberto','López','70215788F','1992-06-05',643290777),
 (4, 'Raquel','Ortiz','03411919Y','2000-11-20',673555666),
 (5, 'Carlos','González','50753246E','1993-03-03',649511558);
 
 INSERT INTO `pedidos` (`idPedido` , `precioTotal` , `nombre`, `direccion_envio` ) VALUES
  (1, 100,'Alonso','Calle tal'),
  (2, 200,'Herrera','Calle tal');
  
 /*CREAR TABLAS DE COCHES Y SEGUROS CON SUS INSERT*/
 
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
 
 ------------------------------------------------ 
 
 /*MOSTRAR DATOS*/
 
 SELECT * from pedidos , seguros, coches, clientes;
 
 /*MOSTRAR DATOS SIN REPETIR CON DISTINCT*/
 
 SELECT DISTINCT marca from coches;
 SELECT marca from coches;
 
 /*MOSTRAR MAS DE UN DATO CON SELECT*/
 
 SELECT nombre, apellido from clientes;
 
 /*USO DE WHERE PARA FILTRAR*/
 
 SELECT modelo from coches where marca = 'Audi';
 
 SELECT modelo, marca from coches where precioDia > 30 ;
 
 /*SACAR EL MAXIMO VALOR DE UN CAMPO CON MAX*/
 
 SELECT max(precioDia) from coches;
 
 /*SACAR LA MEDIO DE UN VALOR DE UN CAMPO CON AVG*/
 
 SELECT avg(precioDia) from coches;
 
 ----------------------------------------
 
 /*MODIFICAR TABLAS*/
 
 /*AÑADIR COLUMNAS CON ALTER TABLE ADD*/
 
 ALTER TABLE pedidos (
 add COLUMN clienteId INT(5),
 add COLUMN idPedido INT(5),
 
 );
 
 ------------------------------------------------------------------------ 

 Drop TABLE if EXISTS 'alquileres';
 
 create table alquileres (
 alquilerId int(5) not null ,
 clienteId int (5) not null,
 cocheId int (4) not null,
 seguroId int(3) not null,
 Primary key (alquilerId) 
 
);
 
insert into alquileres (alquilerId, clienteId, cocheId, seguroId) values (1,4,2,1);
insert into alquileres (alquilerId, clienteId, cocheId, seguroId) values (2,2,3,1);
insert into alquileres (alquilerId, clienteId, cocheId, seguroId) values (3,1,5,2);
insert into alquileres (alquilerId, clienteId, cocheId, seguroId) values (4,3,1,1);
insert into alquileres (alquilerId, clienteId, cocheId, seguroId) values (5,5,4,2);
 
SELECT * from alquileres;
 

-----------------------------------------

/*NOMBRE DEL CLIENTE CON IDENTIFICADOR ALQUILER 1*/

SELECT nombre from clientes , alquileres where  alquilerId = 1  and  alquileres.clienteId = clientes.clienteId ;

select clienteID from alquileres where alquilerId = 1;
select nombre from clientes where clienteId = 4;


/*MARCA Y MODELO DEL COCHE CON ALQUILER 4*/

SELECT marca, modelo from coches , alquileres where alquilerId = 4 and coches.cocheId = alquileres.cocheId ;


/*COCHE QUE HA ALQUILADO ALBERTO*/

SELECT nombre, marca, modelo
from coches, alquileres, clientes 
where 
clientes.nombre = "Alberto" 
and alquileres.clienteId = clientes.clienteId
and alquileres.cocheId = coches.cocheId;
 
/*NOMBRES DECLIENTES QUE HAN ALQUILADO UN AUDI*/

SELECT nombre, apellido , marca
from coches, clientes, alquileres
where 
coches.marca = "Audi"
and alquileres.clienteId = clientes.clienteid
and alquileres.cocheId = coches.cocheId;

/*CONCATENAR SELECT con IN */

select * from seguros
where precio in (select max(precio) from seguros );

select alquilerId from alquileres where clienteId in (
SELECT clienteId from clientes where nombre = "Beatriz");


/*NOMBRE DEL CLIENTE CON EL AQUILER DEL COCHE MAS CARO*/

select nombre, apellido, marca, modelo, precioDia as precio
from clientes, coches, alquileres
where
precioDia IN( select max(precioDia) from coches )
and clientes.clienteId = alquileres.clienteId
and coches.cocheId = alquileres.cocheId ;

/*DATOS DE LA PERSONA CON EL SEGURO MAS BARATO*/ 

/*DATOS DEL ALQUILER MAS BARATO*/

select nombre, apellido, marca , modelo , tipoSeguro as Tipo_de_Seguro , cobertura, precio
from clientes, coches, alquileres , seguros
where
precio IN( select min(precio) from seguros )
and clientes.clienteId = alquileres.clienteId
and coches.cocheId = alquileres.cocheId 
and seguros.seguroId = alquileres.seguroId;

