-- Write your query below
select c.customer_id,c.customer_name from customers c where EXISTS
(select 1 from orders o where o.customer_id=c.customer_id and o.product_name='A') and
EXISTS (select 1 from orders o where o.customer_id=c.customer_id and o.product_name='B') and 
NOT EXISTS (select 1 from orders o where o.customer_id=c.customer_id and o.product_name='C')
order by c.customer_name;