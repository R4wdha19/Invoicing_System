create database Invoices ;
use Invoices;
create table Invoice (
customername VARCHAR(500),
phoneNumber VARCHAR(500),
 invoiceDate date,
 numberOfItems int,
 totalAmount int, 
paidAmount int,
balance int);

create table Items(
itemId integer PRIMARY KEY IDENTITY(1,1),
itemName VARCHAR(600),
unitPrice int,
quantity int,
quantityAmount int);


create table shop(
shopId integer PRIMARY KEY IDENTITY(1,1),
shopName VARCHAR(100),
shopLocation VARCHAR(100),
shopContactNumber int,
shopFaxNumber int,
shopEmail VARCHAR(100),
shopWebsite VARCHAR(100));


select * from Invoice;
select * from Items;
select * from shop;