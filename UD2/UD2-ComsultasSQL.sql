USE northwind;

SELECT orderid, productid, unitprice, quantity, discount,
		unitprice * quantity * (1 - discount) AS 'Total'
FROM orderdetails;

-- ------------------------------------------------------------------------------- --

ALTER TABLE orderdetails
ADD COLUMN total DECIMAL(10,2)
GENERATED ALWAYS AS (unitprice * quantity * (1 - discount)) STORED;

-- ------------------------------------------------------------------------------- --

-- Ej 1

SELECT productName , unitPrice
FROM products
WHERE unitPrice = (SELECT MAX(unitPrice) FROM products);

-- ------------------------------------------------------------------------------- --

-- Ej 2

SELECT *
FROM customers
WHERE country = 'Germany' || country = 'Austria' || country = 'Italy';

-- ------------------------------------------------------------------------------- --

-- Ej 3

SELECT country, COUNT(*) AS numero_clientes
FROM customers
GROUP BY country;

-- ------------------------------------------------------------------------------- --

-- Ej 4

SELECT customerId, orderDate
FROM orders
WHERE orderDate = (SELECT MAX(orderDate) FROM orders);

-- ------------------------------------------------------------------------------- --

-- Ej 5

SELECT companyName
FROM suppliers INNER JOIN products ON suppliers.SupplierID = products.SupplierID
WHERE unitPrice = (SELECT MAX(unitPrice) FROM products);

-- ------------------------------------------------------------------------------- --

-- Ej 6

SELECT COUNT(orderID)
FROM orders
WHERE ShipName = 'Romero y tomillo';

-- ------------------------------------------------------------------------------- --

-- Ej 7

SELECT orderID
FROM orders
WHERE ShipName = 'Romero y tomillo'
ORDER BY orderID desc LIMIT 1;

-- ------------------------------------------------------------------------------- --

-- Ej 8

SELECT DISTINCT employeeID
FROM orders
WHERE shipName = 'Romero y tomillo';

-- ------------------------------------------------------------------------------- --

-- Ej 9

SELECT lastName, firstName
FROM employees INNER JOIN orders ON employees.employeeID = orders.employeeID
WHERE shipName = 'Romero y tomillo'
ORDER BY orderID desc LIMIT 1;

-- ------------------------------------------------------------------------------- --

-- Ej 10

SELECT DISTINCT(contactName)
FROM customers INNER JOIN orders ON customers.customerID = orders.customerID
			   INNER JOIN shippers ON orders.shipVia = shippers.shipperID
WHERE shippers.companyName = 'United Package';

-- ------------------------------------------------------------------------------- --

-- Ej 11

SELECT contactName, orderDate, ShippedDate
FROM customers INNER JOIN orders ON customers.customerID = orders.customerID
			   INNER JOIN shippers ON orders.shipVia = shippers.shipperID
WHERE shippers.companyName = 'United Package';

-- ------------------------------------------------------------------------------- --

UPDATE orders SET shippedDate = null
WHERE shippedDate = 0;

-- ------------------------------------------------------------------------------- --

-- Ej 12

SELECT COUNT(orderID)
FROM orders
WHERE ShippedDate = null;

-- ------------------------------------------------------------------------------- --

-- Ej 13

SELECT orderID
FROM orders INNER JOIN customers ON orders.customerID = customers.customerID
WHERE companyName = 'Lino-Delicateses' AND shippedDate is null;

-- ------------------------------------------------------------------------------- --

-- Ej 14

SELECT productName
FROM products INNER JOIN suppliers ON products.supplierID = suppliers.supplierID
			  INNER JOIN orders ON suppliers.address = orders.shipAddress
              INNER JOIN customers ON orders.customerID = customers.customerID
WHERE customers.companyName = 'Bólido Comidas preparadas';

-- ------------------------------------------------------------------------------- --

-- Ej 15

SELECT ProductName, products.quantityPerUnit
FROM products INNER JOIN orderdetails ON products.productID = orderdetails.productID
              INNER JOIN orders ON orderdetails.orderID = orders.orderID
			  INNER JOIN customers ON orders.customerID = customers.customerID
 WHERE customers.companyName = 'B?lido Comidas preparadas';

-- ------------------------------------------------------------------------------- --

-- Ej 16

SELECT DISTINCT categoryID
FROM products INNER JOIN orderdetails ON products.productID = orderdetails.productID
              INNER JOIN orders ON orderdetails.orderID = orders.orderID
WHERE orders.shipName = 'Antonio Moreno Taquer�a';

-- ------------------------------------------------------------------------------- --

-- Ej 17

SELECT COUNT(categoryID)
FROM products INNER JOIN orderdetails ON products.productID = orderdetails.productID
              INNER JOIN orders ON orderdetails.orderID = orders.orderID
WHERE orders.shipName = 'Antonio Moreno Taquer�a'
GROUP BY categoryID;

-- ------------------------------------------------------------------------------- --

-- Ej 18

SELECT categoryName, count(*) as 'nº productos'
FROM categories c JOIN products p ON c.categoryID = p.categoryID
GROUP BY categoryName
HAVING COUNT(*) > 10;

-- ------------------------------------------------------------------------------- --

-- Ej 19

SELECT COUNT(orderID)
FROM orders
GROUP BY shipCity;

-- ------------------------------------------------------------------------------- --

-- Ej 20

SELECT COUNT(orderID), ShippedDate
FROM orders
GROUP BY shippedDate;
