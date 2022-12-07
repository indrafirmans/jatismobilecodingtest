CREATE TABLE IF NOT exists products (
    product_id SERIAL PRIMARY KEY,
    product_name Integer,
    unit_price Integer,
    in_stock CHAR(1)
);
CREATE SEQUENCE IF NOT EXISTS products_product_id_seq;
SELECT SETVAL(
        'products_product_id_seq',
        (
            SELECT max(product_id)
            FROM products
        )
    );
ALTER TABLE products
ALTER COLUMN product_id
SET DEFAULT nextval('products_product_id_seq'::regclass);
ALTER SEQUENCE products_product_id_seq OWNED BY products.product_id;