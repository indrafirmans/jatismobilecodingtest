CREATE TABLE IF NOT exists orders (
    order_id SERIAL PRIMARY KEY,
    customer_id Integer,
    employee_id Integer,
    order_date DATE,
    purchase_order_number Varchar(30),
    ship_date DATE,
    shipping_method_id Integer,
    freight_charge Integer,
    taxes Integer,
    payment_received CHAR(1),
    comment Varchar(150) 
);
CREATE SEQUENCE IF NOT EXISTS orders_order_id_seq;
SELECT SETVAL(
        'orders_order_id_seq',
        (
            SELECT max(order_id)
            FROM orders
        )
    );
ALTER TABLE orders
ALTER COLUMN order_id
SET DEFAULT nextval('orders_order_id_seq'::regclass);
ALTER SEQUENCE orders_order_id_seq OWNED BY orders.order_id;