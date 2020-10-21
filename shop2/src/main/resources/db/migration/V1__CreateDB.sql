create table bucket_products
    (bucket_id bigint not null,
    product_id bigint not null)
        engine=InnoDB;

create table bucket_seq
    (next_val bigint)
        engine=InnoDB;

insert into bucket_seq
    values ( 1 );

create table buckets
    (id bigint not null,
    user_id bigint,
    primary key (id))
        engine=InnoDB;

create table categories
    (id bigint not null,
    title varchar(255),
    primary key (id))
        engine=InnoDB;

create table category_seq
    (next_val bigint)
        engine=InnoDB;

insert into category_seq
    values ( 1 );

create table order_details_seq
    (next_val bigint)
        engine=InnoDB;

insert into order_details_seq
    values ( 1 );

create table order_seq
    (next_val bigint)
        engine=InnoDB;

insert into order_seq
    values ( 1 );

create table orders
    (id bigint not null,
    address varchar(255),
    changed datetime(6),
    created datetime(6),
    status varchar(255),
    sum decimal(19,2),
    user_id bigint,
    primary key (id))
        engine=InnoDB;

create table orders_details
    (id bigint not null,
    amount decimal(19,2),
    price decimal(19,2),
    order_id bigint,
    product_id bigint,
    primary key (id))
        engine=InnoDB;

create table product_seq
    (next_val bigint)
        engine=InnoDB;

insert into product_seq
    values ( 1 );

create table products
    (id bigint not null,
     price double precision,
     title varchar(255),
     primary key (id))
        engine=InnoDB;

create table products_categories
    (product_id bigint not null,
    category_id bigint not null)
        engine=InnoDB;

create table user_seq
    (next_val bigint)
        engine=InnoDB;

insert into user_seq
    values ( 1 );

create table users
    (id bigint not null,
    archive bit not null,
    email varchar(255),
    name varchar(255),
    password varchar(255),
    role varchar(255),
    bucket_id bigint,
    primary key (id))
        engine=InnoDB;

alter table bucket_products
    add constraint bucket_products_fk_product foreign key
        (product_id) references products (id);

alter table bucket_products
    add constraint bucket_products_fk_bucket foreign key
        (bucket_id) references buckets (id);

alter table buckets
    add constraint buckets_fk_user foreign key
        (user_id) references users (id);

alter table orders
    add constraint orders_fk_user foreign key
        (user_id) references users (id);

alter table orders_details
    add constraint orders_details_fk_order foreign key
        (order_id) references orders (id);

alter table orders_details
    add constraint orders_details_fk_product foreign key
        (product_id) references products (id);

alter table products_categories
    add constraint products_categories_fk_category foreign key
        (category_id) references categories (id);

alter table products_categories
    add constraint products_categories_fk_product foreign key
        (product_id) references products (id);

alter table users
    add constraint users_fk_bucket foreign key
        (bucket_id) references buckets (id);