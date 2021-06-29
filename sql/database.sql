create database spanopoulouVicky;
use spanopoulouVicky;

-- -----------------------------------------------------
-- Table `trainers`
-- -----------------------------------------------------

CREATE TABLE trainers (
  id INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(45) NOT NULL,
  last_name VARCHAR(45) NOT NULL,
  subject VARCHAR(45) NOT NULL,
  PRIMARY KEY (id));


insert into trainers (first_name, last_name, subject) values ('Laney', 'Laytham', 'Object Oriented Programming');
insert into trainers (first_name, last_name, subject) values ('Agnese', 'Beese', 'FrontEnd');
insert into trainers (first_name, last_name, subject) values ('Robin', 'Shama', 'Databases');
insert into trainers (first_name, last_name, subject) values ('Clevey', 'Thurston', 'Databases');
insert into trainers (first_name, last_name, subject) values ('Morgen', 'Frankes', 'Object Oriented Programming');
insert into trainers (first_name, last_name, subject) values ('Branden', 'Albasiny', 'Object Oriented Programming');
insert into trainers (first_name, last_name, subject) values ('Bertie', 'Geraudy', 'FrontEnd');
insert into trainers (first_name, last_name, subject) values ('Francoise', 'Paolini', 'Object Oriented Programming');
insert into trainers (first_name, last_name, subject) values ('Tony', 'Hargitt', 'FrontEnd');
insert into trainers (first_name, last_name, subject) values ('Arturo', 'Espinho', 'Databases');


