CREATE DATABASE IF NOT EXISTS test;

USE test;

CREATE TABLE IF NOT EXISTS coffee (
    id INT PRIMARY KEY,
    coffee_name VARCHAR(100),
    price int
);

INSERT INTO coffee VALUES (1, 'Febary', 120);
INSERT INTO coffee VALUES (2, 'Royal', 140);
INSERT INTO coffee VALUES (3, 'Diamond', 180);
INSERT INTO coffee VALUES (3, 'Cappuccino', 700);