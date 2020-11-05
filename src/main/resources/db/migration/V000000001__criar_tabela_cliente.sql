create table cliente (
	id integer not null auto_increment,
    nome varchar(60) not null,
    data_nascimento date not null,

    primary key (id)
);