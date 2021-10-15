CREATE  DATABASE java_test_db;
USE java_test_db;
CREATE TABLE `User` (
                        `user_id` int PRIMARY KEY AUTO_INCREMENT,
                        `user_name` varchar(40),
                        `user_surname` varchar(40),
                        `user_dob` date,
                        `user_type_id` int
);

CREATE TABLE `User_type` (
                             `ID` int PRIMARY KEY AUTO_INCREMENT,
                             `user_type` varchar(40)
);

CREATE TABLE `User_contract` (
                                 `ID` int PRIMARY KEY AUTO_INCREMENT,
                                 `contract_id` int,
                                 `user_id` int
);

CREATE TABLE `Contract` (
                            `ID` int PRIMARY KEY AUTO_INCREMENT,
                            `contract_type_id` int,
                            `contract_start_date` datetime
);

CREATE TABLE `Contract_type` (
                                 `ID` int PRIMARY KEY AUTO_INCREMENT,
                                 `contract_type` varchar(40),
                                 `contract_price` float
);

ALTER TABLE `User_contract` ADD FOREIGN KEY (`user_id`) REFERENCES `User` (`user_id`);

ALTER TABLE `User_contract` ADD FOREIGN KEY (`contract_id`) REFERENCES `Contract` (`ID`);

ALTER TABLE `User` ADD FOREIGN KEY (`user_type_id`) REFERENCES `User_type` (`ID`);

ALTER TABLE `Contract` ADD FOREIGN KEY (`contract_type_id`) REFERENCES `Contract_type` (`ID`);
