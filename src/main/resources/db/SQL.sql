CREATE TABLE orders(
    id int NOT NULL,
    user_id int NOT NULL,
    status varchar(50) NOT NULL,
    created_at varchar(50) NOT NULL
);

CREATE TABLE order_items(
    order_id int NOT NULL,
    product_id int NOT NULL,
    quantity int NOT NULL
);

CREATE TABLE products(
    id int NOT NULL,
    name varchar(50) NOT NULL,
    price int NOT NULL,
    status varchar(50) NOT NULL,
    created_at datetime NOT NULL
);