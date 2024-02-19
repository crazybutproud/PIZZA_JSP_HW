CREATE TABLE order_constructor (
    id SERIAL PRIMARY KEY,
    client_id INT REFERENCES client(id),
    pizza_id INT REFERENCES order_pizza_constructor(id),
    order_date DATE
);