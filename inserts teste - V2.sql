USE DB_VictorDelta;

INSERT INTO tbl_operador
(nip, nome, perfil, senha)
VALUES (14013631, 'Edgar TESTE 2 ', 'Prontificador', 'senhafacil');
-- --------
insert into tbl_seqtipovisto 
(seqArq, seqCts, seqPmc, seqVi, seqVc , seqRe , seqOut)
VALUES (1,1,1,1,1,1,1);



-- ################### INSERT 1 #############################

INSERT INTO tbl_vistoria
(tipoVistoria, enderecoVistoria, atracadouro, dataSolicitacao, statusVistoria, nipProtocolador)
VALUES ('Arqueação', 'Rua A','porto trapiche','2021-06-13','Solicitada', 14013631);
  
INSERT INTO tbl_embarcacao
(nome, tipoEmb)
VALUES('BALSANARA', 'CANOA');

insert into tbl_cliente
(nome, apelido, celular1, celular2)
VALUES ('Edgar', 'CRV', '(98)98208-5049', '(98)98755-2256');

-- ################## INSERT 2 ##############################

INSERT INTO tbl_vistoria
(tipoVistoria, enderecoVistoria, atracadouro, dataSolicitacao, statusVistoria, nipProtocolador)
VALUES ('CTS', 'Rua Bela Vista', 'porto vovo', '2021-05-12', 'Solicitada', 14013631 );

INSERT INTO tbl_embarcacao
(nome, tipoEmb)
VALUES('BALSANARA', 'CANOA');

insert into tbl_cliente
(nome, apelido, celular1, celular2)
VALUES ('Lucio', 'lu', '(98)98888-2525', '(98)99999-2323');



-- ############# INSERT 3 ##################

INSERT INTO tbl_vistoria
(tipoVistoria, enderecoVistoria, atracadouro, dataSolicitacao, statusVistoria, nipProtocolador)
VALUES ('Vistoria Inicial', 'Trav Jose Sarney', 'Porto Manoel Backman', '2021-04-27', 'Solicitada', 14013631);

INSERT INTO tbl_embarcacao
(nome, tipoEmb)
VALUES('LUPI', 'CANOA');

insert into tbl_cliente
(nome, apelido, celular1, celular2)
VALUES ('Fernando', 'Fernandinho', '(98)97777-2626', '(98)95156-2125');

-- -------------------------------------------------
UPDATE tbl_operador
SET nip = 15161718
WHERE nip = 14013631;