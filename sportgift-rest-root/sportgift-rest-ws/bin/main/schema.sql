DROP TABLE IF EXISTS country;
CREATE TABLE `country`
(
    `id`   int(11)      NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `id_country_unique` (`id`),
    UNIQUE KEY `name_UNIQUE` (`name`)
);

DROP TABLE IF EXISTS city;
CREATE TABLE `city`
(
    `id`         int(11)      NOT NULL AUTO_INCREMENT,
    `name`       varchar(255) NOT NULL,
    `country_id` int(11)      NOT NULL,
    PRIMARY KEY (`id`, `country_id`),
    FOREIGN KEY (country_id) REFERENCES country (ID),
    UNIQUE KEY `id_city_unique` (`id`, `country_id`),
    UNIQUE KEY `name_country_UNIQUE` (`name`, `country_id`)
);

DROP TABLE IF EXISTS competitor;
CREATE TABLE `competitor`
(
    `id`         int(11)      NOT NULL AUTO_INCREMENT,
    `name`       varchar(255) NOT NULL,
    `city_id`    int(11)      NOT NULL,
    `username`   varchar(255) NOT NULL,
    `password`   varchar(255) NOT NULL,
    `avatar`     varchar(255) NOT NULL,
    `weight`     float(2) NOT NULL,
    `height`     float(2) NOT NULL,
    `gender`     char(1) NOT NULL,
    `date_birth` DATETIME NOT NULL,
    `address`    varchar(255),
    `facebook`    varchar(255),
    `instagram`    varchar(255),
    `twitter`    varchar(255),
    `registration` DATETIME NOT NULL,
    `status` BINARY NOT NULL,

    PRIMARY KEY (`id`),
    FOREIGN KEY (city_id) REFERENCES city (ID),
    UNIQUE KEY `id_competitor_unique` (`id`),
    UNIQUE KEY `username_competitor_unique` (`username`)
);

