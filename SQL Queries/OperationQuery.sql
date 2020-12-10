

--select * from products left join dealer on products.productID = dealer.productID

--insert into customer values (53,'Nitin',(select productId from products where productID=215),(select dealerID from dealer where dealerID = 1563))

--select * from customer

insert into orderDetails (productID, CustomerID, DealerID)
select productId, customerId, dealerID
from customer


select * from orderDetails