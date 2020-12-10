


create table products (
	productID int not null PRIMARY KEY, --IDENTITY(1,1)
	productName varchar(45),
	productCategory varchar(45)
)

select * from products

insert into products (productID, productName, productCategory) 
values (215,'T-Shirts', 'Clothing & Accessories')
insert into products (productID, productName, productCategory)
values (326,'Mobiles', 'Electronics')  
insert into products (productID, productName, productCategory) 
values (156,'3 Mistakes of my Life', 'Books')  
insert into products (productID, productName, productCategory)
values (286,'Shorts', 'Clothing & Accessories')  
insert into products (productID, productName, productCategory) 
values (195,'To Kill a MockingBird', 'Books')  
insert into products (productID, productName, productCategory) 
values (322,'Laptop', 'Electronics')  
insert into products (productID, productName, productCategory) 
values (266,'Casual Shirts', 'Clothing & Accessories')  
insert into products (productID, productName, productCategory)
values (263,'Jackets and Coats', 'Clothing & Accessories') 
insert into products (productID, productName, productCategory) 
values (145,'Dark Matter', 'Books') 
insert into products (productID, productName, productCategory) 
values (354,'HeadPhones', 'Electronics')


