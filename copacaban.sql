mysql -u root -p
USE copacabana;
CREATE DATABASE copacabana;
SHOW TABLES;
drop table user;
CREATE TABLE IF NOT EXISTS user (
  id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  identity_card varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  type_code varchar(255) NOT NULL,
  user_name varchar(255) NOT NULL,
  email varchar(255) DEFAULT NULL,
  phone varchar(255) DEFAULT NULL,
  work_position_code varchar(255) DEFAULT NULL,
  work_function_code varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from user;
INSERT INTO user (id, name, identity_card,password,type_code,user_name,email,phone,work_position_code,work_function_code) VALUES (NULL, 'Admin', '11100984', '12345', 'ADMIN', 'admin', NULL, NULL, NULL, NULL );