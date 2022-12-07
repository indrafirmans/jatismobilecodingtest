CREATE TABLE IF NOT exists shipping_methods (
    shipping_method_id SERIAL PRIMARY KEY,
    shipping_method Varchar(20)
);
CREATE SEQUENCE IF NOT EXISTS shipping_methods_shipping_method_id_seq;
SELECT SETVAL(
        'shipping_methods_shipping_method_id_seq',
        (
            SELECT max(shipping_method_id)
            FROM shipping_methods
        )
    );
ALTER TABLE shipping_methods
ALTER COLUMN shipping_method_id
SET DEFAULT nextval('shipping_methods_shipping_method_id_seq'::regclass);
ALTER SEQUENCE shipping_methods_shipping_method_id_seq OWNED BY shipping_methods.shipping_method_id;