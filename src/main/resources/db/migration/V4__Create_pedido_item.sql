create table if not exists fornecedor.pedido_item
(
    id        bigserial primary key,
    quantidade integer,
    produto_id bigint constraint fk8eyfr31j751fjws2y012awmpg references produto,
    pedido_id  bigint constraint fkeyouxfvoi291lpo5168e6wpej references pedido
);
