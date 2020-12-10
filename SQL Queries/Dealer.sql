

create table dealer (
	dealerID int Primary key,
	dealerName varchar(45),
	productID int , --foreign key references products(productID)
	deliveryTime int,
	noOfOrders int,
	dealerRating int
)


--drop table dealer
select * from dealer

insert into dealer (dealerID, dealerName, productID, deliveryTime, noOfOrders, dealerRating)
values (1563, 'US Polo', 215, 2, 2, 5)
insert into dealer (dealerID, dealerName, productID, deliveryTime, noOfOrders, dealerRating)
values (1493, 'Louis Phillipe', 215, 1, 1, 3)
insert into dealer (dealerID, dealerName, productID, deliveryTime, noOfOrders, dealerRating)
values (1365, 'Gucci', 266, 2, 3, 4)
insert into dealer (dealerID, dealerName, productID, deliveryTime, noOfOrders, dealerRating)
values (1663, 'Indian Terrian', 286, 2, 3, 5)
insert into dealer (dealerID, dealerName, productID, deliveryTime, noOfOrders, dealerRating)
values (2648, 'Third Eye', 156, 2, 3, 4)
insert into dealer (dealerID, dealerName, productID, deliveryTime, noOfOrders, dealerRating)
values (6356, 'Macmillian', 195, 2, 3, 4)
insert into dealer (dealerID, dealerName, productID, deliveryTime, noOfOrders, dealerRating)
values (5556, 'Paper Back', 195, 3, 5, 2)
insert into dealer (dealerID, dealerName, productID, deliveryTime, noOfOrders, dealerRating)
values (3596, 'Hand Cover', 145, 1, 1, 3)

insert into dealer (dealerID, dealerName, productID, deliveryTime, noOfOrders, dealerRating)
values (7554, 'One Plus', 326, 1, 1, 4)
insert into dealer (dealerID, dealerName, productID, deliveryTime, noOfOrders, dealerRating)
values (8456, 'HP', 326, 1, 1, 4)