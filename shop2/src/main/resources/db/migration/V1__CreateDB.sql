drop table if exists bucket_products;
drop table if exists bucket_seq;
drop table if exists buckets;
drop table if exists categories;
drop table if exists category_seq;
drop table if exists order_details_seq;
drop table if exists order_seq;
drop table if exists orders;
drop table if exists orders_details;
drop table if exists product_seq;
drop table if exists products;
drop table if exists products_categories;
drop table if exists user_seq;
drop table if exists users;

create table bucket_products
(
    bucket_id  bigint not null,
    product_id bigint not null
) engine = InnoDB;
create table bucket_seq
(
    next_val bigint
) engine = InnoDB;
insert into bucket_seq
values (1);
create table buckets
(
    id      bigint not null,
    user_id bigint,
    primary key (id)
) engine = InnoDB;
create table categories
(
    id    bigint not null,
    title varchar(255),
    primary key (id)
) engine = InnoDB;
create table category_seq
(
    next_val bigint
) engine = InnoDB;
insert into category_seq
values (1);
create table order_details_seq
(
    next_val bigint
) engine = InnoDB;
insert into order_details_seq
values (1);
create table order_seq
(
    next_val bigint
) engine = InnoDB;
insert into order_seq
values (1);
create table orders
(
    id      bigint not null,
    address varchar(255),
    changed datetime(6),
    created datetime(6),
    status  varchar(255),
    sum     decimal(19, 2),
    user_id bigint,
    primary key (id)
) engine = InnoDB;
create table orders_details
(
    id         bigint not null,
    amount     decimal(19, 2),
    price      decimal(19, 2),
    order_id   bigint,
    product_id bigint,
    primary key (id)
) engine = InnoDB;
create table product_seq
(
    next_val bigint
) engine = InnoDB;
insert into product_seq
values (1);
create table products
(
    id    bigint not null,
    price double precision,
    title varchar(255),
    primary key (id)
) engine = InnoDB;
create table products_categories
(
    product_id  bigint not null,
    category_id bigint not null
) engine = InnoDB;
create table user_seq
(
    next_val bigint
) engine = InnoDB;
insert into user_seq
values (1);
create table users
(
    id        bigint not null,
    archive   bit    not null,
    email     varchar(255),
    name      varchar(255),
    password  varchar(255),
    role      varchar(255),
    bucket_id bigint,
    primary key (id)
) engine = InnoDB;
alter table bucket_products
    add constraint FKd3uv4vwg7eybaqclvc2sn4i5k foreign key (product_id) references products (id);
alter table bucket_products
    add constraint FKt11v7b7hocd7iprbkn3v0cui5 foreign key (bucket_id) references buckets (id);
alter table buckets
    add constraint FKnl0ltaj67xhydcrfbq8401nvj foreign key (user_id) references users (id);
alter table orders
    add constraint FK32ql8ubntj5uh44ph9659tiih foreign key (user_id) references users (id);
alter table orders_details
    add constraint FK5o977kj2vptwo70fu7w7so9fe foreign key (order_id) references orders (id);
alter table orders_details
    add constraint FKs0r9x49croribb4j6tah648gt foreign key (product_id) references products (id);
alter table products_categories
    add constraint FKqt6m2o5dly3luqcm00f5t4h2p foreign key (category_id) references categories (id);
alter table products_categories
    add constraint FKtj1vdea8qwerbjqie4xldl1el foreign key (product_id) references products (id);
alter table users
    add constraint FK8l2qc4c6gihjdyoch727guci foreign key (bucket_id) references buckets (id);