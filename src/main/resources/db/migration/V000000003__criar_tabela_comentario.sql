create table comentario (
	id integer not null auto_increment,
    ordem_servico_id integer not null,
    descricao varchar(255) not null,
    data_criacao date not null,

    primary key(id)
);

alter table comentario add constraint fk_ordem_servico_1
foreign key (ordem_servico_id) references ordem_servico (id);