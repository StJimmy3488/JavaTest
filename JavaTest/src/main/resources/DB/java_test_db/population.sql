Insert into contract_type(contract_price, contract_type)
VALUES (120.00, 'gas');
Insert into contract_type(contract_price, contract_type)
VALUES (92.50, 'electricity');
Insert into contract_type(contract_price, contract_type)
VALUES (180.50, 'gas and electricity');

Insert into contract(contract_start_date, id)
VALUES ('2018-05-11', 2);
Insert into contract(contract_start_date, id)
VALUES ('2017-05-11', 1);
Insert into contract(contract_start_date, id)
VALUES ('2017-10-21', 1);
Insert into contract(contract_start_date, id)
VALUES ('2020-02-03', 3);

Insert into user_type(user_type)
    VALUE ('private');
Insert into user_type(user_type)
    VALUE ('business');

Insert into user(user_dob, user_name, user_surname, user_type_id)
VALUES ('1993-12-03', 'Igors', 'Renko', 1);
Insert into user(user_name, user_type_id)
VALUES ('Sia Altab', 2);
Insert into user(user_dob, user_name, user_surname, user_type_id)
VALUES ('1988-07-13', 'Bob', 'Dylan', 1);
Insert into user(user_dob, user_name, user_surname, user_type_id)
VALUES ('1988-07-13', 'John', 'Coltrane', 1);

INSERT INTO user_contract (user_id, contract_id)
SELECT user.user_id, contract.contract_id FROM user INNER JOIN contract
ON user.user_id = 2 = contract.contract_id=1;

