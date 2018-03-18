create table transaction (
	transaction_key INT NOT NULL AUTO_INCREMENT,
	amount double(8, 2) NOT NULL,
	transaction_date DATE NOT NULL,
	purchased_method ENUM('CREDIT_CARD', 'CASH', 'CHECK', 'TRANSFER') NOT NULL,
	category ENUM('GAS', 'GROCERY', 'DINING', 'TRAVEL', 'UTILITY', 'MEDICARE','CLOTHES', 'APPLIANCES', 'COSMETIC') NOT NULL,
	merchant VARCHAR(50) NOT NULL,
	saving double(8, 2) DEFAULT 0,
	PRIMARY KEY(transaction_key)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;