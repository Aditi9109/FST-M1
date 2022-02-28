select max(purchase_amount),customer_id from orders group by customer_id order by customer_id;
select max(purchase_amount),salesman_id from orders where order_date='17-AUG-12' group by salesman_id;

select max(purchase_amount) as max_amt,order_no,order_date from orders group by order_no,order_date
having max(purchase_amount) in (2030, 3450, 5760, 6000);