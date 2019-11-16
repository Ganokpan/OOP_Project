-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.6-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for oop
DROP DATABASE IF EXISTS `oop`;
CREATE DATABASE IF NOT EXISTS `oop` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `oop`;

-- Dumping structure for table oop.register
DROP TABLE IF EXISTS `register`;
CREATE TABLE IF NOT EXISTS `register` (
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `password` tinytext COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `comfirmpassword` tinytext COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `firstname` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telephone` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Dumping data for table oop.register: ~3 rows (approximately)
DELETE FROM `register`;
/*!40000 ALTER TABLE `register` DISABLE KEYS */;
INSERT INTO `register` (`username`, `password`, `comfirmpassword`, `firstname`, `telephone`) VALUES
	('retrt', '0000', '0000', 'gfdgff', '0989098789'),
	('ewrewr', 'ewreewr', 'ewreewr', 'uiuyit', '0987657890'),
	('dscdszv', 'oooo', 'oooo', 'gfhgfdh', 'dhghgdh');
/*!40000 ALTER TABLE `register` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
