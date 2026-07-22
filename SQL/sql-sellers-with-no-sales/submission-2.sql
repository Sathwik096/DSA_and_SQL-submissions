-- Write your query below
select distinct seller.seller_name from seller 
full join orders on seller.seller_id=orders.seller_id
where seller.seller_id not in (
    select seller_id from orders where sale_date>='2020-01-01'
    and sale_date<='2020-12-31'
)
order by seller.seller_name ;