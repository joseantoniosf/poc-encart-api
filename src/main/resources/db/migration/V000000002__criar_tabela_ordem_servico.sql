
create table ordem_servico (
	id integer not null auto_increment,
    descricao varchar(60) not null,
    preco decimal not null,
    data_abertura date not null,
    data_finalizacao date not null,
    status varchar(60) not null,

    primary key (id)
);
