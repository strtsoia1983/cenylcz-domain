CREATE DATABASE client;
CREATE DATABASE business;
create table `business`.`transaction` (
	`transaction_key` INT NOT NULL AUTO_INCREMENT,
	`amount` DOUBLE(8, 2) NOT NULL,
	`transaction_date` DATE NOT NULL,
	`purchased_method` ENUM('CREDIT_CARD', 'CASH', 'CHECK', 'TRANSFER') NOT NULL,
	`category` ENUM('GAS', 'GROCERY', 'DINING', 'TRAVEL', 'UTILITY', 'MEDICARE','CLOTHES', 'APPLIANCES', 'COSMETIC') NOT NULL,
	`merchant` VARCHAR(50) NOT NULL,
	`saving` DOUBLE(8, 2) DEFAULT 0,
	PRIMARY KEY(`transaction_key`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

create table `business`.`ticket` (
	`ticket_key` INT NOT NULL AUTO_INCREMENT,
	`units` INT NOT NULL,
	`instrument` ENUM('EUR_USD', 'NZD_CHF', 'CAD_CHF', 'AUD_CHF') NOT NULL,
	`open_price` DOUBLE(8, 2) NOT NULL,
	`close_price` DOUBLE(8, 2) DEFAULT NULL,
	`open_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`close_time` TIMESTAMP NULL,
	`profit` DOUBLE(8, 2) DEFAULT 0.0,
	`ticket_status` ENUM('OPEN', 'CLOSE') NOT NULL,
	PRIMARY KEY(`ticket_key`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

create table `client`.`user` (
	`user_key` INT NOT NULL AUTO_INCREMENT,
	`first_name` VARCHAR(25),
	`last_name` VARCHAR(25),
	`boa` TIMESTAMP NOT NULL,
	PRIMARY KEY(`user_key`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;