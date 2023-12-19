create schema if not exists transportador;

create table if not exists transportador.entrega(
    id    bigserial primary key,
    pedido_id             BIGINT,
    data_para_busca       date,
    previsao_para_entrega date,
    endereco_origem       VARCHAR(255),
    endereco_destino      VARCHAR(255)
);
