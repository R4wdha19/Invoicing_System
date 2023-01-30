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