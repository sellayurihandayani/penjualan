-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 03, 2023 at 03:08 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan`
--

-- --------------------------------------------------------

--
-- Table structure for table `DTBrg`
--

CREATE TABLE `DTBrg` (
  `kode_barang` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `pembelian` int(10) NOT NULL,
  `penjualan` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `DTBrg`
--

INSERT INTO `DTBrg` (`kode_barang`, `nama_barang`, `jenis`, `jumlah`, `pembelian`, `penjualan`) VALUES
('1', 'Telur', 'Kg', 2, 25000, 27000),
('2', 'Beras', 'Liter', 2, 18000, 20000);

-- --------------------------------------------------------

--
-- Table structure for table `DTPJL`
--

CREATE TABLE `DTPJL` (
  `kode_nota` varchar(50) NOT NULL,
  `kode_barang` varchar(50) NOT NULL,
  `tanggal` varchar(50) NOT NULL,
  `total_bayar` int(10) NOT NULL,
  `bayar` int(10) NOT NULL,
  `jumlah_beli` int(10) NOT NULL,
  `potongan` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `DTPJL`
--

INSERT INTO `DTPJL` (`kode_nota`, `kode_barang`, `tanggal`, `total_bayar`, `bayar`, `jumlah_beli`, `potongan`) VALUES
('02012023', '2', '02012023', 10000, 10000, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `dtsplr`
--

CREATE TABLE `dtsplr` (
  `kode_supplier` varchar(50) NOT NULL,
  `nama_supplier` varchar(50) NOT NULL,
  `telp` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tanggal_pengiriman_barang` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dtsplr`
--

INSERT INTO `dtsplr` (`kode_supplier`, `nama_supplier`, `telp`, `alamat`, `tanggal_pengiriman_barang`) VALUES
('S-01', 'Sella', '081213766965', 'Bekasi', 'Jan 2, 2023'),
('S-02', 'Sella Yuri Handayani', '081213766967', 'Jakarta', 'Jan 3, 2023');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('sella', 'sella123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `DTBrg`
--
ALTER TABLE `DTBrg`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `dtsplr`
--
ALTER TABLE `dtsplr`
  ADD PRIMARY KEY (`kode_supplier`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
