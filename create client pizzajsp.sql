
CREATE TABLE client (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    number_phone BIGINT,
    email VARCHAR(255),
    address VARCHAR(255)
);