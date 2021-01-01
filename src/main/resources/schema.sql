CREATE	DATABASE	IF	NOT	EXISTS	`employee_db`;

CREATE	TABLE	IF	NOT	EXISTS	`employee`	(
    `id`	bigint(20)	NOT	NULL	AUTO_INCREMENT,
    `first_name`	varchar(45)	DEFAULT	NULL,
    `last_name`	varchar(45)	DEFAULT	NULL,
    `email`	varchar(45)	DEFAULT	NULL,
    `phone`	varchar(45)	DEFAULT	NULL,
    PRIMARY	KEY	(`id`)
    )	ENGINE=InnoDB	AUTO_INCREMENT=3	DEFAULT	CHARSET=latin1;