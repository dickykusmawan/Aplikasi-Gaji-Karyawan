-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.38-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for pbopraktek
CREATE DATABASE IF NOT EXISTS `pbopraktek` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `pbopraktek`;

-- Dumping structure for table pbopraktek.tb_datagaji
CREATE TABLE IF NOT EXISTS `tb_datagaji` (
  `id_karyawan` varchar(50) DEFAULT NULL,
  `no_transaksi` varchar(50) DEFAULT NULL,
  `tanggal_transaksi` varchar(50) DEFAULT NULL,
  `jumlah_hadir` varchar(50) DEFAULT NULL,
  `jumlah_tidakhadir` varchar(50) DEFAULT NULL,
  `total_gajikotor` varchar(50) DEFAULT NULL,
  `total_gajibersih` varchar(50) DEFAULT NULL,
  KEY `FK_tb_datagaji_tb_karyawan` (`id_karyawan`),
  CONSTRAINT `FK_tb_datagaji_tb_karyawan` FOREIGN KEY (`id_karyawan`) REFERENCES `tb_karyawan` (`id_karyawan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table pbopraktek.tb_datagaji: ~0 rows (approximately)
/*!40000 ALTER TABLE `tb_datagaji` DISABLE KEYS */;
INSERT INTO `tb_datagaji` (`id_karyawan`, `no_transaksi`, `tanggal_transaksi`, `jumlah_hadir`, `jumlah_tidakhadir`, `total_gajikotor`, `total_gajibersih`) VALUES
	('104', 'tr01', '17-07-2019 17:25:17', '30', '0', '6200000', '6020000');
/*!40000 ALTER TABLE `tb_datagaji` ENABLE KEYS */;

-- Dumping structure for table pbopraktek.tb_karyawan
CREATE TABLE IF NOT EXISTS `tb_karyawan` (
  `id_karyawan` varchar(50) NOT NULL,
  `nama_karyawan` varchar(50) DEFAULT NULL,
  `jabatan` varchar(50) DEFAULT NULL,
  `departement` varchar(50) DEFAULT NULL,
  `no_telp` varchar(50) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  `masa_kerja` varchar(50) DEFAULT NULL,
  `rate_gaji` int(15) DEFAULT NULL,
  PRIMARY KEY (`id_karyawan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table pbopraktek.tb_karyawan: ~5 rows (approximately)
/*!40000 ALTER TABLE `tb_karyawan` DISABLE KEYS */;
INSERT INTO `tb_karyawan` (`id_karyawan`, `nama_karyawan`, `jabatan`, `departement`, `no_telp`, `alamat`, `masa_kerja`, `rate_gaji`) VALUES
	('103', 'Agus Spd', 'Middle associate', 'Finance', '081293849384', 'Jawa Barat', '4', 7500000),
	('104', 'Dikwaw Kusmawan', 'Junior associate', 'Anti Hack', '088293843445', 'Jakarta Selatan', '5', 6000000),
	('105', 'Sarip Udin', 'Senior associate', 'Manager', '088234633445', 'Bogor', '1', 8000000),
	('106', 'Ahmad Maulana', 'Junior associate', 'Anti Hack', '088287793445', 'Bogor', '3', 5000000),
	('107', 'Bambang Pamungkas', 'Junior associate', 'IT', '087878738374', 'Bekasi', '3', 4800000),
	('108', 'Wahyudi', 'Middle associate', 'Finance', '085554856768', 'Bekasi', '3', 6500000);
/*!40000 ALTER TABLE `tb_karyawan` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
