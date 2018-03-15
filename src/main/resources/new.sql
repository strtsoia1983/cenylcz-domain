create table transaction (
	transaction_key INT NOT NULL AUTO_INCREMENT,
	amount double(8, 2) NOT NULL,
	transaction_date DATE NOT NULL,
	purchased_method ENUM('credit card', 'cash', 'check', 'transfer') NOT NULL,
	category ENUM('gas', 'grocery', 'dining', 'travel', 'utility', 'medicare','clothes', 'appliances', 'cosmetic') NOT NULL,
	merchant VARCHAR(50) NOT NULL,
	saving double(8, 2) DEFAULT 0,
	PRIMARY KEY(transaction_key)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;