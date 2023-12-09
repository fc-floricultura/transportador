create schema if not exists fornecedor;

create table if not exists fornecedor.info(
    id    bigserial primary key,
    nome  varchar(100) not null,
    estado varchar(100) not null,
    endereco varchar(100) not null
);

INSERT INTO fornecedor.info(nome, estado, endereco) VALUES('Casa pai', 'RJ', 'rua tomas de aquino');
