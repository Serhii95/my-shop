CREATE TABLE orders
(

    id          INT PRIMARY KEY AUTO_INCREMENT,
    user_id     INT          NOT NULL,
    status      VARCHAR(255) NOT NULL UNIQUE,
    total_price INT          NOT NULL,
    CONSTRAINT order_user_FK FOREIGN KEY (user_id) REFERENCES users (id)
);

CREATE TABLE products
(

    id             INT PRIMARY KEY AUTO_INCREMENT,
    title          VARCHAR(255) NOT NULL,
    price          DOUBLE       NOT NULL,
    available      BOOLEAN,
    amount         INT          NOT NULL,
    discount       INT,
    description    VARCHAR(255) NOT NULL,
    characteristic VARCHAR(255) NOT NULL,
    category_id    INT          NOT NULL,
    CONSTRAINT product_category_FK FOREIGN KEY (category_id) REFERENCES categories (id)
);

CREATE TABLE orders_products
(
    order_id   INT NOT NULL,
    product_id INT NOT NULL,
    CONSTRAINT orders_products_order FOREIGN KEY (order_id) REFERENCES orders (id),
    CONSTRAINT orders_products_product FOREIGN KEY (product_id) REFERENCES products (id)
)
