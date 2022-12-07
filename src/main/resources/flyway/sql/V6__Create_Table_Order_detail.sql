CREATE TABLE IF NOT exists order_details (
    order_detail_id SERIAL PRIMARY KEY,
    order_id Integer,
    product_id Integer,
    quantity CHAR(1),
    unit_price Integer,
    discount Integer
);
CREATE SEQUENCE IF NOT EXISTS order_details_order_detail_id_seq;
SELECT SETVAL(
        'order_details_order_detail_id_seq',
        (
            SELECT max(order_detail_id)
            FROM order_details
        )
    );
ALTER TABLE order_details
ALTER COLUMN order_detail_id
SET DEFAULT nextval('order_details_order_detail_id_seq'::regclass);
ALTER SEQUENCE order_details_order_detail_id_seq OWNED BY order_details.order_detail_id;