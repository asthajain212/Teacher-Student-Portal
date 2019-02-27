-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 07, 2018 at 02:48 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `portal`
--

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `courses` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cse3100`
--

CREATE TABLE `cse3100` (
  `Id` varchar(50) NOT NULL,
  `Attendance` int(11) NOT NULL,
  `Online` int(11) NOT NULL,
  `Offline` int(11) NOT NULL,
  `Mid` int(11) NOT NULL,
  `Project` int(11) NOT NULL,
  `Grade` varchar(10) NOT NULL,
  `Gpa` double(3,2) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cse3100`
--

INSERT INTO `cse3100` (`Id`, `Attendance`, `Online`, `Offline`, `Mid`, `Project`, `Grade`, `Gpa`, `Total`) VALUES
('15-02-04-019', 8, 14, 15, 13, 25, 'A', 3.75, 75),
('15-02-04-006', 8, 13, 16, 17, 27, 'A+', 4.00, 81);

-- --------------------------------------------------------

--
-- Table structure for table `cse3101`
--

CREATE TABLE `cse3101` (
  `Id` varchar(50) NOT NULL,
  `Quiz` int(11) NOT NULL,
  `Attendance` int(11) NOT NULL,
  `Final` int(11) NOT NULL,
  `Grade` varchar(10) NOT NULL,
  `Gpa` double(3,2) NOT NULL,
  `Total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cse3101`
--

INSERT INTO `cse3101` (`Id`, `Quiz`, `Attendance`, `Final`, `Grade`, `Gpa`, `Total`) VALUES
('13-02-04-109', 12, 6, 37, 'B-', 2.75, 55),
('15-02-04-006', 15, 9, 54, 'A', 3.75, 78),
('15-02-04-019', 17, 10, 47, 'A-', 3.50, 74);

-- --------------------------------------------------------

--
-- Table structure for table `cse3103`
--

CREATE TABLE `cse3103` (
  `Id` varchar(50) NOT NULL,
  `Quiz` int(11) NOT NULL,
  `Attendance` int(11) NOT NULL,
  `Final` int(11) NOT NULL,
  `Grade` varchar(10) NOT NULL,
  `Gpa` double(3,2) NOT NULL,
  `Total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cse3103`
--

INSERT INTO `cse3103` (`Id`, `Quiz`, `Attendance`, `Final`, `Grade`, `Gpa`, `Total`) VALUES
('15-02-04-006', 12, 9, 54, 'A', 3.75, 75);

-- --------------------------------------------------------

--
-- Table structure for table `cse3104`
--

CREATE TABLE `cse3104` (
  `Id` varchar(50) NOT NULL,
  `Attendance` int(11) NOT NULL,
  `Online` int(11) NOT NULL,
  `Offline` int(11) NOT NULL,
  `Mid` int(11) NOT NULL,
  `Project` int(11) NOT NULL,
  `Grade` varchar(10) NOT NULL,
  `Gpa` double(3,2) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cse3104`
--

INSERT INTO `cse3104` (`Id`, `Attendance`, `Online`, `Offline`, `Mid`, `Project`, `Grade`, `Gpa`, `Total`) VALUES
('15-02-04-006', 10, 20, 20, 20, 30, 'A+', 4.00, 100);

-- --------------------------------------------------------

--
-- Table structure for table `cse3107`
--

CREATE TABLE `cse3107` (
  `Id` varchar(50) NOT NULL,
  `Quiz` int(11) NOT NULL,
  `Attendance` int(11) NOT NULL,
  `Final` int(11) NOT NULL,
  `Grade` varchar(10) NOT NULL,
  `Gpa` double(3,2) DEFAULT NULL,
  `Total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cse3107`
--

INSERT INTO `cse3107` (`Id`, `Quiz`, `Attendance`, `Final`, `Grade`, `Gpa`, `Total`) VALUES
('15-02-04-022', 12, 9, 60, 'A+', 4.00, 81);

-- --------------------------------------------------------

--
-- Table structure for table `cse3108`
--

CREATE TABLE `cse3108` (
  `Id` varchar(50) NOT NULL,
  `Attendance` int(11) NOT NULL,
  `Online` int(11) NOT NULL,
  `Offline` int(11) NOT NULL,
  `Mid` int(11) NOT NULL,
  `Project` int(11) NOT NULL,
  `Grade` varchar(10) NOT NULL,
  `Gpa` double(3,2) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cse3108`
--

INSERT INTO `cse3108` (`Id`, `Attendance`, `Online`, `Offline`, `Mid`, `Project`, `Grade`, `Gpa`, `Total`) VALUES
('15-02-04-019', 8, 15, 13, 19, 24, 'A', 3.75, 79);

-- --------------------------------------------------------

--
-- Table structure for table `cse3109`
--

CREATE TABLE `cse3109` (
  `Id` varchar(50) NOT NULL,
  `Quiz` int(11) NOT NULL,
  `Attendance` int(11) NOT NULL,
  `Final` int(11) NOT NULL,
  `Grade` varchar(10) NOT NULL,
  `Gpa` double(3,2) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cse3109`
--

INSERT INTO `cse3109` (`Id`, `Quiz`, `Attendance`, `Final`, `Grade`, `Gpa`, `Total`) VALUES
('15-02-04-028', 16, 10, 56, 'A+', 4.00, 82);

-- --------------------------------------------------------

--
-- Table structure for table `cse3110`
--

CREATE TABLE `cse3110` (
  `Id` varchar(50) NOT NULL,
  `Attendance` int(11) NOT NULL,
  `Online` int(11) NOT NULL,
  `Offline` int(11) NOT NULL,
  `Mid` int(11) NOT NULL,
  `Project` int(11) NOT NULL,
  `Grade` varchar(10) NOT NULL,
  `Gpa` double(3,2) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cse3110`
--

INSERT INTO `cse3110` (`Id`, `Attendance`, `Online`, `Offline`, `Mid`, `Project`, `Grade`, `Gpa`, `Total`) VALUES
('15-02-04-036', 8, 14, 9, 12, 18, 'B', 3.00, 61);

-- --------------------------------------------------------

--
-- Table structure for table `hum3115`
--

CREATE TABLE `hum3115` (
  `Id` varchar(50) NOT NULL,
  `Quiz` int(11) NOT NULL,
  `Attendance` int(11) NOT NULL,
  `Final` int(11) NOT NULL,
  `Grade` varchar(10) NOT NULL,
  `Gpa` double(3,2) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hum3115`
--

INSERT INTO `hum3115` (`Id`, `Quiz`, `Attendance`, `Final`, `Grade`, `Gpa`, `Total`) VALUES
('13-02-04-109', 5, 5, 42, 'C+', 2.50, 52);

-- --------------------------------------------------------

--
-- Table structure for table `markcse3100`
--

CREATE TABLE `markcse3100` (
  `Id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `dateofBirth` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `courses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `markcse3100`
--

INSERT INTO `markcse3100` (`Id`, `name`, `password`, `dateofBirth`, `email`, `phone`, `courses`) VALUES
('15-02-04-019', 'Md.Ashraful Islam', '0987654321', '1997-10-20', 'asraful@gmail.com', 1955667188, 'CSE3100');

-- --------------------------------------------------------

--
-- Table structure for table `markcse3101`
--

CREATE TABLE `markcse3101` (
  `Id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `dateofBirth` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `courses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `markcse3101`
--

INSERT INTO `markcse3101` (`Id`, `name`, `password`, `dateofBirth`, `email`, `phone`, `courses`) VALUES
('15-02-04-006', 'Mehedi Hasan', '1234567890', '1976-06-06', 'ashik@gmail.com', 1955667188, 'CSE3101'),
('15-02-04-019', 'Md.Ashraful Islam', '0987654321', '1997-10-20', 'asraful@gmail.com', 1955667188, 'CSE3101'),
('13-02-04-109', 'Nowsin Saba', '234567890', '1974-01-01', 'saba@gmail.com', 1815006837, 'CSE3101'),
('14-02-04-079', 'Imrul Kayes', '1234567890', '1972-03-01', 'imrul@gmail.com', 1955667188, 'CSE3101');

-- --------------------------------------------------------

--
-- Table structure for table `markcse3103`
--

CREATE TABLE `markcse3103` (
  `Id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `dateofBirth` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `courses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `markcse3103`
--

INSERT INTO `markcse3103` (`Id`, `name`, `password`, `dateofBirth`, `email`, `phone`, `courses`) VALUES
('15-02-04-006', 'Mehedi Hasan', '1234567890', '1976-06-06', 'ashik@gmail.com', '01955667188', 'CSE3103');

-- --------------------------------------------------------

--
-- Table structure for table `markcse3104`
--

CREATE TABLE `markcse3104` (
  `Id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `dateofBirth` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `courses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `markcse3104`
--

INSERT INTO `markcse3104` (`Id`, `name`, `password`, `dateofBirth`, `email`, `phone`, `courses`) VALUES
('15-02-04-006', 'Mehedi Hasan', '1234567890', '1976-06-06', 'ashik@gmail.com', 1955667188, 'CSE3104');

-- --------------------------------------------------------

--
-- Table structure for table `markcse3107`
--

CREATE TABLE `markcse3107` (
  `Id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `dateofBirth` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `courses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `markcse3107`
--

INSERT INTO `markcse3107` (`Id`, `name`, `password`, `dateofBirth`, `email`, `phone`, `courses`) VALUES
('15-02-04-022', 'Asadullahil Galib', '1234567890', '1971-03-26', 'galib@gmail.com', 1754327819, 'CSE3107');

-- --------------------------------------------------------

--
-- Table structure for table `markcse3108`
--

CREATE TABLE `markcse3108` (
  `Id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `dateofBirth` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `courses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `markcse3108`
--

INSERT INTO `markcse3108` (`Id`, `name`, `password`, `dateofBirth`, `email`, `phone`, `courses`) VALUES
('15-02-04-019', 'Md.Ashraful Islam', '0987654321', '1997-10-20', 'asraful@gmail.com', 1955667188, 'CSE3108');

-- --------------------------------------------------------

--
-- Table structure for table `markcse3109`
--

CREATE TABLE `markcse3109` (
  `Id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `dateofBirth` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `courses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `markcse3109`
--

INSERT INTO `markcse3109` (`Id`, `name`, `password`, `dateofBirth`, `email`, `phone`, `courses`) VALUES
('15-02-04-028', 'Sifat Rabbi', '1234567890', '1974-05-07', 'sifat@gmail.com', 1865728910, 'CSE3109');

-- --------------------------------------------------------

--
-- Table structure for table `markcse3110`
--

CREATE TABLE `markcse3110` (
  `Id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `dateofBirth` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `courses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `markcse3110`
--

INSERT INTO `markcse3110` (`Id`, `name`, `password`, `dateofBirth`, `email`, `phone`, `courses`) VALUES
('15-02-04-036', 'Faisal', '1234567890', '1976-04-05', 'faisal@gmail.com', 1786527819, 'CSE3110');

-- --------------------------------------------------------

--
-- Table structure for table `markhum3115`
--

CREATE TABLE `markhum3115` (
  `Id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `dateofBirth` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `courses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `markhum3115`
--

INSERT INTO `markhum3115` (`Id`, `name`, `password`, `dateofBirth`, `email`, `phone`, `courses`) VALUES
('13-02-04-109', 'Nowsin Saba', '234567890', '1974-01-01', 'saba@gmail.com', 1815006837, 'HUM3115');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `ID` varchar(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `dateofBirth` date NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `courseName` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `name`, `password`, `dateofBirth`, `email`, `phone`, `courseName`) VALUES
('15-02-04-006', 'Mehedi Hasan', '1234567890', '1976-06-06', 'ashik@gmail.com', '01955667188', 'CSE3101'),
('15-02-04-006', 'Mehedi Hasan', '1234567890', '1976-06-06', 'ashik@gmail.com', '01955667188', 'CSE3103'),
('15-02-04-006', 'Mehedi Hasan', '1234567890', '1976-06-06', 'ashik@gmail.com', '01955667188', 'CSE3104'),
('15-02-04-019', 'Md.Ashraful Islam', '0987654321', '1997-10-20', 'asraful@gmail.com', '01955667188', 'CSE3101'),
('15-02-04-019', 'Md.Ashraful Islam', '0987654321', '1997-10-20', 'asraful@gmail.com', '01955667188', 'CSE3100'),
('15-02-04-019', 'Md.Ashraful Islam', '0987654321', '1997-10-20', 'asraful@gmail.com', '01955667188', 'CSE3108'),
('13-02-04-109', 'Nowsin Saba', '234567890', '1974-01-01', 'saba@gmail.com', '01815006837', 'HUM3115'),
('13-02-04-109', 'Nowsin Saba', '234567890', '1974-01-01', 'saba@gmail.com', '01815006837', 'CSE3101'),
('15-02-04-022', 'Asadullahil Galib', '1234567890', '1971-03-26', 'galib@gmail.com', '01754327819', 'CSE3107'),
('15-02-04-028', 'Sifat Rabbi', '1234567890', '1974-05-07', 'sifat@gmail.com', '01865728910', 'CSE3109'),
('15-02-04-036', 'Faisal', '1234567890', '1976-04-05', 'faisal@gmail.com', '01786527819', 'CSE3110'),
('14-02-04-079', 'Imrul Kayes', '1234567890', '1972-03-01', 'imrul@gmail.com', '01955667188', 'CSE3101');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `dateofBirth` date NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `courseName` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`ID`, `name`, `password`, `dateofBirth`, `email`, `phone`, `courseName`) VALUES
(1, 'Ashraful Islam', '1234567890', '1976-06-07', 'asraful@gmail.com', '01955667188', 'CSE3101'),
(2, 'Ashraful Islam', '1234567890', '1976-06-07', 'asraful@gmail.com', '01955667188', 'CSE3103'),
(3, 'Ashraful Islam', '1234567890', '1976-06-07', 'asraful@gmail.com', '01955667188', 'CSE3104'),
(4, 'Ashik', '0987654321', '1983-12-21', 'ashik@gmail.com', '01765342871', 'HUM3115'),
(5, 'Ashik', '0987654321', '1983-12-21', 'ashik@gmail.com', '01765342871', 'CSE3110'),
(6, 'Hasibul', '0987654321', '1995-11-04', 'hasibul@gmail.com', '01927645314', 'HUM3115'),
(7, 'Hasibul', '0987654321', '1995-11-04', 'hasibul@gmail.com', '01927645314', 'CSE3101'),
(8, 'Hasibul', '0987654321', '1995-11-04', 'hasibul@gmail.com', '01927645314', 'CSE3107'),
(9, 'Hasibul', '0987654321', '1995-11-04', 'hasibul@gmail.com', '01927645314', 'CSE3109'),
(10, 'Hasibul', '0987654321', '1995-11-04', 'hasibul@gmail.com', '01927645314', 'CSE3104'),
(11, 'Hasibul', '0987654321', '1995-11-04', 'hasibul@gmail.com', '01927645314', 'CSE3108'),
(12, 'Hasibul', '0987654321', '1995-11-04', 'hasibul@gmail.com', '01927645314', 'CSE3110'),
(13, 'Abu saleh', '1234567890', '1974-05-04', 'sujon@gmail.com', '01955667188', 'CSE3100'),
(14, 'aminul islam', '1234567890', '1971-05-07', 'aminul@gmail.com', '01941544031', 'HUM3115'),
(15, 'sakib al hasan', '1234567890', '1976-11-22', 'sakib@gmail.com', '01864004185', 'HUM3115'),
(16, 'Mushfiqur rahim', '1234567890', '1972-12-01', 'mushfiq@gmail.com', '01955667188', 'HUM3115'),
(17, 'Mahmudullah', '1234567890', '1976-08-13', 'mahmud@gmail.com', '01732362609', 'HUM3115'),
(18, 'miraz', '1234567890', '1998-05-06', 'miraz@gmail.com', '01955667188', 'HUM3115');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
