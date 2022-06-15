-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-06-2022 a las 01:30:43
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dsiii`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boss`
--

CREATE TABLE `boss` (
  `id` int(11) NOT NULL,
  `name` varchar(30) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `image_url` varchar(500) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `health` int(10) DEFAULT NULL,
  `description` varchar(200) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `lore` varchar(200) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `parryable` tinyint(1) DEFAULT NULL,
  `optional` tinyint(1) DEFAULT NULL,
  `location_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `boss`
--

INSERT INTO `boss` (`id`, `name`, `image_url`, `health`, `description`, `lore`, `parryable`, `optional`, `location_id`) VALUES
(1, 'Iudex Gundyr', 'https://drive.google.com/uc?export=view&id=1bq9bZsTXjximjeYlD2kv7JlJZLJxDLVE', 1037, 'Iudex Gundyr is a Boss in Dark Souls 3. He is the first boss that players will encounter. This Dark Souls 3 Iudex Gundyr Guide features locations, strategies and videos on how to defeat Iudex Gundyr e', 'Gundyr, corrupted by the abyss, spends eternity testing unkindled to see if they are worthy to Link the Flame. He was once an unkindled himself but arose too late to fulfill his duty, never meeting hi', 1, 0, 1),
(2, 'Dancer of the Boreal Valley', 'https://drive.google.com/uc?export=view&id=19Uc_eoEENHn365UmWDXhdPw_fhuUBTMT', 5111, 'Dancer of the Boreal Valley is a Boss in Dark Souls 3. This Dark Souls 3 Dancer of the Boreal Valley Guide features locations, strategies and videos on how to defeat Dancer of the Boreal Valley easily', 'She was one of the daughters of the royal family of Irithyll, but was ordered by Pontiff Sulyvahn to become a dancer first, and then legioneer, which is equal to exile. He also gifted her dual blades,', 0, 0, 2),
(3, 'Vordt of the Boreal Valley', 'https://drive.google.com/uc?export=view&id=1GhzZPIf2M1FFW9nd4YU7JGZ6hdzD3m40', 1328, 'Vordt of the Boreal Valley is a Boss in Dark Souls 3. He is the second boss that players will encounter. This Dark Souls 3 Vordt of the Boreal Valley Guide features locations, strategies and videos on', 'It is written that Boreal Knights devolve to beast-like forms due to the effects of Pontiff Sulyvahn\'s rings (in his case, the Left Eye) - it seems that Vordt is further along in this process than the', 0, 0, 2),
(4, 'Curse-Rotted Greatwood', 'https://drive.google.com/uc?export=view&id=1FKleNHZDsM1VJ5Krybvoxr3xucB-goM6', 5405, 'Curse-Rotted Greatwood is a Boss in Dark Souls 3. This Dark Souls 3 Curse-Rotted Greatwood Guide features locations, strategies and videos on how to defeat Curse-Rotted Greatwood easily, as well as ti', 'According to the Soul of the Rotted Greatwood, it used to be a spirit tree until it was used as a vessel for unwanted curses by the inhabitants of the Undead Settlement. This lead to its transformatio', 0, 1, 3),
(5, 'Crystal Sage', 'https://drive.google.com/uc?export=view&id=13OTVV3Xah9qj0_yqhXe0Ase3dIEv-krp', 2723, 'Crystal Sage is a Boss in Dark Souls 3. This Dark Souls 3 Crystal Sage Guide features locations, strategies and videos on how to defeat Crystal Sage easily, as well as tips, weaknesses, trivia and lor', 'Crystal Sage is a Boss in Dark Souls 3. This Dark Souls 3 Crystal Sage Guide features locations, strategies and videos on how to defeat Crystal Sage easily, as well as tips, weaknesses, trivia and lor', 1, 0, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `game`
--

CREATE TABLE `game` (
  `id` int(11) NOT NULL PRIMARY KEY,
  `name` varchar(50) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `description` varchar(200) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `dev` varchar(10) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `composer` varchar(50) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `release_date` date DEFAULT NULL,
  `metacritic` int(2) DEFAULT NULL,
  `goty` tinyint(1) DEFAULT NULL,
  `sql_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `game`
--

INSERT INTO `game` (`id`, `name`, `description`, `dev`, `composer`, `release_date`, `metacritic`, `goty`, `sql_date`) VALUES
(1, 'Dark Souls III', 'Dark Souls III is an action role-playing game played in a third-person perspective, similar to previous games in the series. According to lead director and series creator Hidetaka Miyazaki, the game\'s', 'FromSoftwa', 'Yuka Kitamura', '2016-03-24', 89, 1, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `location`
--

CREATE TABLE `location` (
  `id` int(11) NOT NULL,
  `name` varchar(30) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `image_url` varchar(500) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `description` varchar(200) COLLATE utf8mb4_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `location`
--

INSERT INTO `location` (`id`, `name`, `image_url`, `description`) VALUES
(1, 'Cemetery of Ash', 'https://drive.google.com/uc?export=view&id=1NESFvZTn3vRVCWLhqQ0WKLY8IUAxnc0E', 'Cemetery of Ash is a Location in Dark Souls 3. This location serves as a starting area for new players to the game. This is where players will find themselves at the start of the game, revived as an \''),
(2, 'High Wall of Lothric', 'https://drive.google.com/uc?export=view&id=1EGTC-k27wxhId-12nUGkevBTOS2UeEnm', 'High Wall of Lothric is a Location in Dark Souls 3. After exiting the Cemetery of Ash and once out of the Firelink Shrine, the player arrives at the higher ramparts of Lothric\'s walls. Plagued by the '),
(3, 'Undead Settlement', 'https://drive.google.com/uc?export=view&id=1ruXRrjDuIrqBOFL5fFKVMRGQP5ragP6R', 'Undead Settlement is a Location in Dark Souls 3. After receiving the Small Lothric Banner from Emma, the player approaches a cliff and is grabbed and transported by flying gargoyles to the base of the'),
(4, 'Road of Sacrifices', 'https://drive.google.com/uc?export=view&id=1CCzu-xjkipnceKD4KPNx9Y-Qrruu3i_S', 'Road of Sacrifices is a Location in Dark Souls 3. It is a wooded area, marked by crumbling ruins and a murky swamp inhabited by crustaceans of varying size. Damp and fetid, as rotted as it is alive, t');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `boss`
--
ALTER TABLE `boss`
  ADD PRIMARY KEY (`id`),
  ADD KEY `location_id` (`location_id`);

--
-- Indices de la tabla `game`
--
ALTER TABLE `game`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `boss`
--
ALTER TABLE `boss`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `game`
--
ALTER TABLE `game`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `location`
--
ALTER TABLE `location`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `boss`
--
ALTER TABLE `boss`
  ADD CONSTRAINT `boss_ibfk_1` FOREIGN KEY (`location_id`) REFERENCES `location` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
