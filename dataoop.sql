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
CREATE DATABASE IF NOT EXISTS `oop` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `oop`;

-- Dumping structure for table oop.datachicken
CREATE TABLE IF NOT EXISTS `datachicken` (
  `firstname` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telephone` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pointmember` int(11) DEFAULT NULL,
  `friedchicken` int(11) DEFAULT NULL,
  `cheesechicken` int(11) DEFAULT NULL,
  `spicychicken` int(11) DEFAULT NULL,
  `nuggets` int(11) DEFAULT NULL,
  `frenchfries` int(11) DEFAULT NULL,
  `berger` int(11) DEFAULT NULL,
  `coke` int(11) DEFAULT NULL,
  `pepsi` int(11) DEFAULT NULL,
  `drink` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Dumping data for table oop.datachicken: ~4 rows (approximately)
DELETE FROM `datachicken`;
/*!40000 ALTER TABLE `datachicken` DISABLE KEYS */;
INSERT INTO `datachicken` (`firstname`, `telephone`, `email`, `pointmember`, `friedchicken`, `cheesechicken`, `spicychicken`, `nuggets`, `frenchfries`, `berger`, `coke`, `pepsi`, `drink`, `total`) VALUES
	('pop', '0987654332', 'poppy@gmail.com', 12, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	('poppypang', '0987654324', 'popy@hotmail.com', 12, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	('pop', '0987654332', 'poppy@gmail.com', 20, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	('fdggfdgsdf', '0987654323', 'frdhgfhf@gmail.com', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(NULL, NULL, NULL, 270, 1, 2, 1, 1, 1, 1, 1, 1, 1, 594),
	(NULL, NULL, NULL, NULL, 1, 1, 1, 1, 1, 1, 1, 1, 1, 494);
/*!40000 ALTER TABLE `datachicken` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
