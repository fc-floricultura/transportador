create table if not exists fornecedor.produto
(
    id        bigserial primary key,
    descricao varchar(255),
    estado    varchar(255),
    nome      varchar(255),
    preco     numeric(19, 2)
);


INSERT INTO fornecedor.produto(nome, descricao, estado, preco) VALUES('girassol', 'girassol', 'df', 10.50);
INSERT INTO fornecedor.produto(nome, descricao, estado, preco) VALUES('orquídia', 'orquídia', 'df', 12.30);
INSERT INTO fornecedor.produto(nome, descricao, estado, preco) VALUES('rosas', 'rosas', 'df', 20);
