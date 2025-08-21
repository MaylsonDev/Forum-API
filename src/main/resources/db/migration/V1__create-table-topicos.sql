create table topicos(
    id bigint not null auto_increment,
    titulo varchar(400) not null,
    mensagem varchar(500) not null,
    autor varchar(200) not null,
    curso varchar(700)not null,
    primary key(id)

);