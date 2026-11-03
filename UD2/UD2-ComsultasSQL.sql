-- USE northwind;

-- SELECT orderid, productid, unitprice, quantity, discount,
		-- unitprice * quantity * (1 - discount) AS 'Total'
-- FROM orderdetails

-- ------------------------------------------------------------------------------- --

-- ALTER TABLE orderdetails
-- ADD COLUMN total DECIMAL(10,2)
-- GENERATED ALWAYS AS (unitprice * quantity * (1 - discount)) STORED;

-- ------------------------------------------------------------------------------- --

-- Ej 1

-- SELECT productName , unitPrice
-- FROM products
-- WHERE unitPrice = (SELECT MAX(unitPrice) FROM products);

-- ------------------------------------------------------------------------------- --

-- Ej 2

-- SELECT * FROM customers
-- WHERE country = 'Germany' || country = 'Austria' || country = 'Italy'

-- ------------------------------------------------------------------------------- --

-- Ej 3

-- SELECT country, COUNT(*) AS numero_clientes
-- FROM customers
-- GROUP BY country;

-- ------------------------------------------------------------------------------- --

-- Ej 4

-- SELECT customerId, orderDate
-- FROM orders
-- WHERE orderDate = (SELECT MAX(orderDate) FROM orders);

