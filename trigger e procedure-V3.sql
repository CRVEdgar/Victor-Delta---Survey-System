USE DB_VictorDelta;

DELIMITER //
CREATE PROCEDURE PrcdConcatCod(tipo VARCHAR(10), codTipoVist int, codVist int)
	BEGIN
		UPDATE Tbl_Vistoria
            SET codigoVistoria = concat(concat(concat( concat(year(curdate()), tipo) ,codTipoVist), '-'), codVist)
            WHERE idSequencial = codVist;
	END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE PrcdAltCodVistoria(codigoVist int, tipo varchar(40))
	BEGIN

        DECLARE SeqAtual_TblTipoVisto int;
        -- SET SeqAtual_TblTipoVisto = (SELECT seqArq FROM tbl_seqtipovisto);

		CASE
		WHEN tipo = 'Arqueação' THEN
			SET SeqAtual_TblTipoVisto = (SELECT seqArq FROM tbl_seqtipovisto);
			CALL PrcdConcatCod('ARQ', SeqAtual_TblTipoVisto, codigoVist);
            
            UPDATE tbl_seqtipovisto
			SET seqArq = seqArq +1 WHERE id=1;
            
		WHEN tipo = 'CTS' THEN
			SET SeqAtual_TblTipoVisto = (SELECT seqCts FROM tbl_seqtipovisto);
			CALL PrcdConcatCod('CTS', SeqAtual_TblTipoVisto, codigoVist); 
            
            UPDATE tbl_seqtipovisto
			SET seqCts = seqCts+1 WHERE id=1;
            
		WHEN tipo = 'PMC - Pass/Carga' THEN
			SET SeqAtual_TblTipoVisto = (SELECT seqPmc FROM tbl_seqtipovisto);
			CALL PrcdConcatCod('PMC', SeqAtual_TblTipoVisto, codigoVist); 
            
            UPDATE tbl_seqtipovisto
			SET seqPmc = seqPmc+1 WHERE id=1;
            
		WHEN tipo = 'Vistoria Inicial' THEN
			SET SeqAtual_TblTipoVisto = (SELECT seqVi FROM tbl_seqtipovisto);
			CALL PrcdConcatCod('VI', SeqAtual_TblTipoVisto, codigoVist);
            
            UPDATE tbl_seqtipovisto
			SET seqVi = seqVi+1 WHERE id=1;
            
		WHEN tipo = 'Vistoria de Constatação' THEN
			SET SeqAtual_TblTipoVisto = (SELECT seqVc FROM tbl_seqtipovisto);
			CALL PrcdConcatCod('VC', SeqAtual_TblTipoVisto, codigoVist);
            
            UPDATE tbl_seqtipovisto
			SET seqVc = seqVc+1 WHERE id=1;
            
		WHEN tipo = 'Retirada de Exigência' THEN
			SET SeqAtual_TblTipoVisto = (SELECT seqRe FROM tbl_seqtipovisto);
			CALL PrcdConcatCod('RE', SeqAtual_TblTipoVisto, codigoVist); 
            
            UPDATE tbl_seqtipovisto
			SET seqRe = seqRe+1 WHERE id=1;
            
		ELSE
			SET SeqAtual_TblTipoVisto = (SELECT seqOut FROM tbl_seqtipovisto);
			CALL PrcdConcatCod('OUT', SeqAtual_TblTipoVisto, codigoVist); 
            
            UPDATE tbl_seqtipovisto
			SET seqOut = seqOut+1
			WHERE id=1;
            
		END CASE;
	END //
DELIMITER ;



DELIMITER //
CREATE TRIGGER trg_AddCliente AFTER INSERT ON Tbl_Cliente
FOR EACH ROW 
		BEGIN
			
            -- DECLARE maiorId_TblCli int;
            DECLARE maiorId_TblVist int;
            DECLARE tipoVistoriaRCB varchar(40);
            
            -- SET maiorId_TblCli = (SELECT MAX(id) FROM Tbl_Cliente);
			SET maiorId_TblVist = (SELECT MAX(idSequencial) FROM Tbl_Vistoria);
            SET tipoVistoriaRCB = (SELECT tipoVistoria FROM tbl_vistoria WHERE idSequencial = maiorId_TblVist);
            
			UPDATE Tbl_Vistoria 
            SET idSolicitante = new.id
            WHERE idSequencial = maiorId_TblVist;
            
            CALL PrcdAltCodVistoria(maiorId_TblVist, tipoVistoriaRCB);
		END //
DELIMITER ;



DELIMITER //
CREATE TRIGGER trg_AddEmb AFTER INSERT ON Tbl_Embarcacao
FOR EACH ROW 
		BEGIN
        
			DECLARE maiorId_TblVist int;
			SET maiorId_TblVist = (SELECT MAX(idSequencial) FROM Tbl_Vistoria);
            
			UPDATE Tbl_Vistoria
            SET idEmbarcacao = new.idEmb
            WHERE idSequencial = maiorId_TblVist;
		END //
DELIMITER ;