DROP TABLE IF EXISTS country;
CREATE TABLE `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
);

DROP TABLE IF EXISTS city;
CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `country_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`country_id`),
  FOREIGN KEY (country_id) REFERENCES country(ID),
  UNIQUE KEY `id_country_UNIQUE` (`id`, `country_id`),
  UNIQUE KEY `name_country_UNIQUE` (`name`, `country_id`)
);

