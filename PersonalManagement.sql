-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 12-05-2016 a las 14:46:49
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `PersonalManagement`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Contrato`
--

CREATE TABLE IF NOT EXISTS `Contrato` (
  `ContratadoDNI` varchar(9) NOT NULL,
  `DepartamentoID` int(11) NOT NULL,
  `IdContrato` int(11) NOT NULL,
  `Convenio` varchar(11) NOT NULL,
  `Duracion` int(11) NOT NULL,
  `Tipo` varchar(11) NOT NULL,
  `CategoriaProfesional` varchar(11) NOT NULL,
  `Remuneracion` float NOT NULL,
  `Vacaciones` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `Contrato`
--

INSERT INTO `Contrato` (`ContratadoDNI`, `DepartamentoID`, `IdContrato`, `Convenio`, `Duracion`, `Tipo`, `CategoriaProfesional`, `Remuneracion`, `Vacaciones`) VALUES
('00010001N', 2, 23, 'conevenido', 254, 'Temporal', 'A', 2000, 23);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Departamento`
--

CREATE TABLE IF NOT EXISTS `Departamento` (
  `IdDepartamento` int(11) NOT NULL,
  `NombreDep` varchar(50) NOT NULL,
  `NombreFacultad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `Departamento`
--

INSERT INTO `Departamento` (`IdDepartamento`, `NombreDep`, `NombreFacultad`) VALUES
(2, 'aplicada', 'Biologia'),
(58, 'Inteligencia Artificial', 'Informática'),
(4, 'PAS', 'Biologia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Facultad`
--

CREATE TABLE IF NOT EXISTS `Facultad` (
  `Nombre` varchar(50) NOT NULL,
  `Direccion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `Facultad`
--

INSERT INTO `Facultad` (`Nombre`, `Direccion`) VALUES
('Biologia', 'direciooon'),
('Derecho', 'sdfasdsf2'),
('Informática', 'asdfsadgasfas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuario`
--

CREATE TABLE IF NOT EXISTS `Usuario` (
  `Nombre` varchar(50) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `DNI` varchar(9) NOT NULL,
  `Mail` varchar(50) NOT NULL,
  `Baja` tinyint(1) NOT NULL,
  `Vacaciones` tinyint(1) NOT NULL,
  `FechNac` date DEFAULT NULL,
  `FechCreac` date DEFAULT NULL,
  `Admin` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `Usuario`
--

INSERT INTO `Usuario` (`Nombre`, `Apellidos`, `Password`, `DNI`, `Mail`, `Baja`, `Vacaciones`, `FechNac`, `FechCreac`, `Admin`) VALUES
('Puto', 'Amo', 'password', '03943684N', 'mail@suda.es', 0, 0, '1990-12-09', '2016-05-10', 1),
('Antonio', 'Caparrini', '5f4dcc3b5aa765d61d8327deb882cf99', '10001000N', 'asdf@asdf.com', 0, 0, '2016-05-17', '2016-05-27', 1),
('Ivan', 'Bancas', 'password', '53624284Z', 'asdas@sfds.com', 0, 0, '2016-05-03', '2016-05-25', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Contrato`
--
ALTER TABLE `Contrato`
 ADD PRIMARY KEY (`IdContrato`);

--
-- Indices de la tabla `Departamento`
--
ALTER TABLE `Departamento`
 ADD PRIMARY KEY (`IdDepartamento`), ADD UNIQUE KEY `Nombre` (`NombreDep`,`NombreFacultad`), ADD UNIQUE KEY `Nombre_2` (`NombreDep`,`NombreFacultad`);

--
-- Indices de la tabla `Facultad`
--
ALTER TABLE `Facultad`
 ADD PRIMARY KEY (`Nombre`);

--
-- Indices de la tabla `Usuario`
--
ALTER TABLE `Usuario`
 ADD PRIMARY KEY (`DNI`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
