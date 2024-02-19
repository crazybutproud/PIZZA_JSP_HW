CREATE TABLE order_classic (
    id SERIAL PRIMARY KEY,
    client_id INT REFERENCES client(id),
    pizza_id INT REFERENCES order_pizza_classic(id),
    order_date DATE
);