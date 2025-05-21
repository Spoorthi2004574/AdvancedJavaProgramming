CREATE DATABASE IF NOT EXISTS Employee;
USE Employee;
CREATE TABLE IF NOT EXISTS Emp (
    Emp_NO INT PRIMARY KEY,
    Emp_Name VARCHAR(100) NOT NULL,
    Basicsalary INT
);
INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES
(101, 'Raju', 90000),
(102, 'Ravi', 10000),
(103, 'Spoorthi', 20000),
(104, 'Sweekrithi', 100),
(105, 'Rajesh', 30000);
(106, 'Ganesh', 19990);