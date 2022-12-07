CREATE TABLE IF NOT exists employees (
    employee_id SERIAL PRIMARY KEY,
    first_name Varchar(50),
    last_name Varchar(50),
    title Varchar(50),
    work_phone Varchar(30)
);
CREATE SEQUENCE IF NOT EXISTS employees_employee_id_seq;
SELECT SETVAL(
        'employees_employee_id_seq',
        (
            SELECT max(employee_id)
            FROM employees
        )
    );
ALTER TABLE employees
ALTER COLUMN employee_id
SET DEFAULT nextval('employees_employee_id_seq'::regclass);
ALTER SEQUENCE employees_employee_id_seq OWNED BY employees.employee_id;