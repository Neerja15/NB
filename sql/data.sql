 
create database assignment;

use assignment;

create table branch_master( branch_id varchar(6) PRIMARY KEY ,branch_name varchar(30) , branch_city varchar(30));
 CREATE TABLE customer_master(customer_number varchar(6) PRIMARY KEY , firstname varchar(30) , middlename varchar(30) , lastname varchar(30) , customer_city varchar(15), customer_contact_no varchar(10) , occupation varchar(20) , customer_date_of_birth date);
 CREATE TABLE account_master(account_number varchar(6) PRIMARY KEY,customer_number varchar(6), FOREIGN KEY(customer_number) REFERENCES customer_master(customer_number) , branch_id varchar(6),FOREIGN KEY(branch_id) REFERENCES branch_master(branch_id) , opening_balance int(7),account_opening_date DATE, account_type varchar(10), account_status varchar(10));