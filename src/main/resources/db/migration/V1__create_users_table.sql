CREATE TABLE users
(
    id           INT PRIMARY KEY AUTO_INCREMENT,
    first_name   VARCHAR(255)        NOT NULL,
    middle_name  VARCHAR(255),
    surname      VARCHAR(255)        NOT NULL,
    email        VARCHAR(255) UNIQUE NOT NULL,
    username     VARCHAR(255) UNIQUE NOT NULL,
    phone_number VARCHAR(255) UNIQUE NOT NULL,
    password     VARCHAR(255)        NOT NULL,
    age          INT
)