CREATE USER spring WITH PASSWORD 'pass123';
GRANT ALL PRIVILEGES ON DATABASE postgres TO spring;

create table anc_anuncio (
  anc_id bigint generated always as identity,
  anc_titulo varchar(50) not null,
  anc_valor float,
  anc_data_cadastro date not null,
  anc_data_limite date,
  anc_descricao varchar(200),
  primary key(anc_id)
);

insert into anc_anuncio (anc_titulo, anc_data_cadastro, anc_valor)
  values ('Omeleteira', current_date, 149.99),
         ('Avião', current_date, null);

grant update, delete, insert, select on all tables in schema public to spring;
