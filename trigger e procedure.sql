USE DB_VictorDelta;

DELIMITER //
CREATE PROCEDURE PrcdEmbarcacao(codigo INT)
	BEGIN
		INSERT INTO Tbl_Vistoria(idEmbarcacao)
        VALUES (codigo);
	END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER trg_AddEmb AFTER INSERT ON Tbl_Embarcacao
FOR EACH ROW 
		BEGIN
			INSERT INTO Tbl_Vistoria(idEmbarcacao)
			VALUES (new.idEmb);
		END //
DELIMITER ;


# =============================TBL CLIENTE==============================================



DELIMITER //
CREATE TRIGGER trg_AddCliente AFTER INSERT ON Tbl_Cliente
FOR EACH ROW 
		BEGIN
			INSERT INTO Tbl_Vistoria(idSolicitante)
			VALUES (new.id);
		END //
DELIMITER ;


# ============================ TBL VISTORIA ===============================================
DELIMITER //
CREATE PROCEDURE PrcdAltCodVistoria(codigo TEXT, tipo varchar(40))
	BEGIN
		CASE
		WHEN tipo = 'Arqueação' THEN
			UPDATE Tbl_Vistoria
			SET codigoVistoria = CONCAT(year(curdate()), 'ARQ')
            WHERE idSequencial = codigo;
		WHEN tipo = 'CTS' THEN
			UPDATE Tbl_Vistoria
			SET codigoVistoria = CONCAT(year(curdate()), 'CTS')
            WHERE idSequencial = codigo;
		WHEN tipo = 'PMC - Pass/Carga' THEN
			UPDATE Tbl_Vistoria
			SET codigoVistoria = CONCAT(year(curdate()), 'PMC')
            WHERE idSequencial = codigo;
		WHEN tipo = 'Vistoria Inicial' THEN
			UPDATE Tbl_Vistoria
			SET codigoVistoria = CONCAT(year(curdate()), 'VI')
            WHERE idSequencial = codigo;
		WHEN tipo = 'Vistoria de Constatação' THEN
			UPDATE Tbl_Vistoria
			SET codigoVistoria = CONCAT(year(curdate()), 'VC')
            WHERE idSequencial = codigo;
		WHEN tipo = 'Retirada de Exigência' THEN
			UPDATE Tbl_Vistoria
			SET codigoVistoria = CONCAT(year(curdate()), 'RE')
            WHERE idSequencial = codigo;
		ELSE
			UPDATE Tbl_Vistoria
			SET codigoVistoria = CONCAT(year(curdate()), 'OUT')
            WHERE idSequencial = codigo;
		END CASE;
	END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER trg_AltCod AFTER UPDATE ON Tbl_Vistoria
FOR EACH ROW 
		BEGIN
			CALL PrcdAltCodVistoria(new.idSequencial, new.tipoVistoria);
		END //
DELIMITER ;
