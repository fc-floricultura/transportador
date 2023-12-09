create table if not exists fornecedor.pedido
(
    id        bigserial primary key,
    status           varchar(255),
    tempo_de_preparo integer
);
