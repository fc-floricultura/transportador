create schema if not exists transportador;

create table if not exists transportador.entrega(
    id    bigserial primary key,
    pedidoId    bigserial not null,
    dataParaBusca timestamp not null,
    previsaoParaEntrega timestamp not null,
    enderecoOrigem  varchar(100) not null,
    enderecoOrigem  varchar(100) not null
);
