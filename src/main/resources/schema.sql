create table product (
    sku varchar(16) primary key,
    brand varchar(50) not null,
    price varchar(50) not null,
    color varchar(50) not null,
    size varchar(5) not null,
    category int not null,
    seller int not null
);

create table sellers (
    id int primary key auto_increment,
    seller_name varchar(100) not null
);

create table product_categories (
    id int primary key auto_increment,
    product_name varchar(50) not null unique
);

create table sku_availablity (
    sku varchar(16) unique,
    available_nos int
);

alter table product add foreign key (category) references product_categories(id);
alter table product add foreign key (seller) references sellers(id);
alter table sku_availablity add foreign key (sku) references product(sku);

insert into sellers(seller_name) values ('ABC Retailers');
insert into sellers(seller_name) values ('DEF Retailers');
insert into sellers(seller_name) values ('GHI Retailers');
insert into sellers(seller_name) values ('JKL Retailers');
insert into sellers(seller_name) values ('MNO Retailers');

insert into product_categories(product_name) values ('Full Sleeves Shirt');
insert into product_categories(product_name) values ('Half Sleeves Shirt');
insert into product_categories(product_name) values ('Casual Trousers');
insert into product_categories(product_name) values ('Formal Trousers');
insert into product_categories(product_name) values ('Socks');
insert into product_categories(product_name) values ('Shoes');