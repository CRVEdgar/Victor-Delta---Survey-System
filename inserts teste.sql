
INSERT INTO tbl_operador
(nip, nome, perfil, senha)
VALUES (14013631, 'Edgar TESTE 2 ', 'Prontificador', 'senhafacil');

UPDATE tbl_operador
SET senha = concat(senha,'-001')
WHERE nip = 14010331;

UPDATE tbl_operador
SET senha = concat( concat(year(curdate()), 'ARQ') ,'001') 
WHERE nip = 14013631;


INSERT INTO tbl_embarcacao
(nome, tipoEmb)
VALUES('BALSANARA', 'CANOA');

UPDATE tbl_vistoria
SET statusVistoria = 'SOLICITADA-1-SOLICITADA-2-SOLICITADA-3-SOLICITADA-4-SOLICITADA-5-SOLICITADA-6-SOLICITADA-7-SOLICITADA-8-SOLICITADA-9'
WHERE idEmbarcacao = 6;

insert into tbl_cliente
(nome, apelido, celular1, celular2)
VALUES ('Edgar', 'CRV', '(98)98208-5049', '(98)98755-2256');

SELECT tbl_vistoria.codigoVistoria, tbl_embarcacao.* FROM tbl_vistoria 
INNER JOIN tbl_embarcacao
ON tbl_vistoria.idEmbarcacao = tbl_embarcacao.idEmb
WHERE codigoVistoria = 'vistCod';
 


        
        