-- a. List of customers located in Irvine city.
select * from customers where city = 'Irvine';

--b. List of customers whose order is handled by an employee named Adam Barr.
select
    concat(customers.first_name, ' ', customers.last_name) name
from
    orders
    left join customers on orders.customer_id = customers.customer_id
    left join employees on orders.employee_id = employees.employee_id
 where employees.first_name = 'Adam' AND employees.last_name = 'Barr';

--c. List of products which are ordered by "Contonso, Ltd" Company.
select
    product.*
from
    orders
    left join customers on orders.customer_id = customers.customer_id
    left join order_details on orders.order_id = order_details.order_id
    left join product on order_details.product_id = product.product_id
 where customers.first_name like 'Contonso, Ltd%';

--d. List of transactions (orders) which has "UPS Ground" as shipping method.
select
    orders.*
from
    orders
    left join shipping_method on orders.shipping_method_id = shipping_method.shipping_method_id
 where shipping_method.shipping_method = 'UPS Ground'

--e. List of total cost (including tax and freight charge) for every order sorted by shipdate.