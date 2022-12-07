CREATE TABLE IF NOT exists customers (
    customer_id SERIAL PRIMARY KEY,
    company_name Varchar(50),
    first_name Varchar(30),
    last_name Varchar(50),
    billing_address Varchar(255),
    city Varchar(50),
    state_or_province Varchar(20),
    zip_code Varchar(20),
    email Varchar(75),
    company_website Varchar(200),
    phone_number Varchar(30),
    fax_number Varchar(30),
    ship_address Varchar(255),
    ship_city Varchar(50),
    ship_state_or_province Varchar(50),
    ship_zip_code Varchar(20),
    ship_phone_number Varchar(30)
);
CREATE SEQUENCE IF NOT EXISTS customers_customer_id_seq;
SELECT SETVAL(
        'customers_customer_id_seq',
        (
            SELECT max(customer_id)
            FROM customers
        )
    );
ALTER TABLE customers
ALTER COLUMN customer_id
SET DEFAULT nextval('customers_customer_id_seq'::regclass);
ALTER SEQUENCE customers_customer_id_seq OWNED BY customers.customer_id;