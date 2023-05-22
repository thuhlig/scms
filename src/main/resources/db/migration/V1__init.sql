create table users
(
    id       bigserial primary key,
    username varchar(20) not null unique,
    password varchar(100) not null
);

create table customer
(
    id            bigserial primary key,
    first_name    varchar(50),
    last_name     varchar(100) not null,
    mobil         varchar(100),
    address       varchar(500),
    email         varchar(100) not null,
    internal_code varchar(10)
);
