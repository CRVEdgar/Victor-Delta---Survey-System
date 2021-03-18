CREATE DATABASE DB_VictorDelta;

USE DB_VictorDelta;

CREATE TABLE Tbl_Operador(
nip int,
nome VARCHAR(60),
perfil VARCHAR(15),
senha varchar(50), -- senha padrao devera ser gerada no java
PRIMARY KEY(nip)
);

CREATE TABLE Tbl_Cliente(
id INT auto_increment,
nome varchar(60),
apelido varchar(50),
celular1 varchar(30),
celular2 varchar(30),
PRIMARY KEY(id)
);

CREATE TABLE Tbl_Embarcacao(
idEmb int auto_increment,
nome varchar(50),
tipoEmb varchar(40),
PRIMARY KEY(idEmb)
);


CREATE TABLE Tbl_Vistoria(
codigo VARCHAR(40), -- DEVERA SER PREENCHIDA COM UMA TRIGGER/PROCEDURE/FUNCTION
tipoVistoria varchar(40),
enderecoVistoria varchar(70),
atracadouro varchar(50),
dataSolicitacao date,
dataVistoria date,
horaVistoria TIME,
dataAgendamento date,
statusVistoria varchar(20),
idEmbarcacao int,
nipProtocolador int,
idSolicitante INT,

primary key(codigo),
constraint fk_VistXEmb foreign key (idEmbarcacao) references Tbl_Embarcacao (idEmb),
constraint fk_VistXProto foreign key (nipProtocolador) references Tbl_Operador (nip),
constraint fk_VistXCli foreign key (idSolicitante) references Tbl_Cliente (id)
);





