create database Invoices ;
use Invoices;


create table Customers (
CustomerId integer PRIMARY KEY IDENTITY(1,1),
customername VARCHAR(100),
customerphoneNumber VARCHAR(50),
customerPaymentMethod VARCHAR(20),
);
create table Hearder(
headerId integer PRIMARY KEY IDENTITY(1,1),
shopContactNumber int,
shopFaxNumber int,
shopEmail VARCHAR(100),
shopWebsite VARCHAR(100));

create table shop(
shopId integer PRIMARY KEY IDENTITY(1,1),
headerId int references Hearder(headerId),
shopName VARCHAR(100),
shopLocation VARCHAR(100)
);

create table Invoice (
InvoiceId integer PRIMARY KEY IDENTITY(1,1),
CustomerId int references Customers(CustomerId),
shopId int references shop(shopId),
invoiceDate VARCHAR (30),
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



select * from Invoice;
select * from Items;
select * from shop;
select * from Customers;
 drop table Invoice;
 drop table Items;
 drop table shop;
  drop table Customers;


 create table Customers (
CustomerId integer PRIMARY KEY IDENTITY(1,1),
customername VARCHAR(100) DEFAULT 'Ahmed',
customerphoneNumber VARCHAR(50) DEFAULT '99879909',
customerPaymentMethod VARCHAR(20) DEFAULT 'Card',
);
create table Hearder(
headerId integer PRIMARY KEY IDENTITY(1,1),
shopContactNumber int DEFAULT 99778787,
shopFaxNumber int DEFAULT 98098000,
shopEmail VARCHAR(100) DEFAULT 'SheStore@gmail.com',
shopWebsite VARCHAR(100)DEFAULT 'www.SheStore.com');

create table shop(
shopId integer PRIMARY KEY IDENTITY(1,1),
headerId int references Hearder(headerId),
shopName VARCHAR(100)DEFAULT'SheStore',
shopLocation VARCHAR(100)DEFAULT'SheStore'
);

create table Invoice (
InvoiceId integer PRIMARY KEY IDENTITY(1,1),
CustomerId int references Customers(CustomerId),
shopId int references shop(shopId),
invoiceDate VARCHAR (30) DEFAULT'02-02-2023',
numberOfItems int DEFAULT 1,
totalAmount int DEFAULT 20, 
paidAmount int DEFAULT 20,
balance int DEFAULT 0,
shopContactNumber int DEFAULT 99778787 ,
shopFaxNumber int DEFAULT 98098000,
shopEmail VARCHAR(100) DEFAULT 'SheStore@gmail.com',
shopWebsite VARCHAR(100) DEFAULT 'www.SheStore.com');


create table Items(
itemId integer PRIMARY KEY IDENTITY(1,1),
InvoiceId int references Invoice(InvoiceId),
itemName VARCHAR(50) DEFAULT 'MK_Bags',
unitPrice int DEFAULT 190,
quantity int DEFAULT 5,
quantityAmount int DEFAULT 1900);



Select h.shopContactNumber,h.shopFaxNumber,h.shopEmail,h.shopWebsite From Header h inner join  shop s on h.headerId = s.headerId where s.shopId =