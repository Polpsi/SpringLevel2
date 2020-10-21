insert into users (id, archive, email, name, password, role, bucket_id)
values (1, false, 'mail@mail.ru', 'admin', '$2a$04$LlPwn0loQmd5uVZ5cBguUen3Z9GYNrHZTv8LrZeVyEo0odPQ06sG.', 'ADMIN', null),
(2, false, 'mail2@mail.ru', 'user2', '$2a$04$Cw8xF872KqlxDzjDwx2veOxRKS7Onn9tDUEM1Iw66RZXt1aXfoPpS', 'CLIENT', null),
(3, false, 'mail3@mail.ru', 'user3', '$2a$04$foBPukEP7P/O.eUo2J9gcecCOkbL2cW9bY3FEhVz9/VYve/ge/cOe', 'CLIENT', null);

insert into categories (id, title)
values (1,'Food'),(2,'Drink'),(3,'Toys');

insert into products (id, title, price)
values (1, 'Beer', 80), (2, 'Milk', 60), (3, 'Train', 280), (4, 'Apple', 79), (5, 'Spaghetti', 60);

insert into products_categories (product_id,category_id)
values (1,2),(2,2),(3,3),(4,1),(5,1);

SET SQL_SAFE_UPDATES=0;
UPDATE product_seq SET next_val=6 WHERE next_val=1;
UPDATE category_seq SET next_val=4 WHERE next_val=1;
UPDATE user_seq SET next_val=4 WHERE next_val=1;
SET SQL_SAFE_UPDATES=1;