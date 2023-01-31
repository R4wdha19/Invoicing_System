create database Invoices ;
use Invoices;


create table Invoice (
InvoiceId integer PRIMARY KEY IDENTITY(1,1),
CustomerId int references Customers(CustomerId),
invoiceDate date,
numberOfItems int,
totalAmount int, 
paidAmount int,
balance int,
shopContactNumber int,
shopFaxNumber int,
shopEmail VARCHAR(100),
shopWebsite VARCHAR(100));

create table Items(
itemId integer PRIMARY KEY IDENTITY(1,1),
InvoiceId int references Invoice(InvoiceId),
itemName VARCHAR(50),
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



create table Customers (
CustomerId integer PRIMARY KEY IDENTITY(1,1),
customername VARCHAR(100),
customerphoneNumber VARCHAR(50),
customerPaymentMethod VARCHAR(20),
);




select * from Invoice;
select * from Items;
select * from shop;
select * from Customers;
drop table Invoice;
drop table Items;
drop table shop;

