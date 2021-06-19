/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implement;

import db.DB;
import db.DbException;
import entidades.Vistoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.dao.VistoriaDAO;
/**
 *
 * @author Edgar
 */
public class VistoriaDAOJDBC implements VistoriaDAO {
    private Connection conn;
    public VistoriaDAOJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Vistoria obj) {
        PreparedStatement st = null;
        String comando = "INSERT INTO Tbl_vistoria"
                + " (tipoVistoria, enderecoVistoria, atracadouro, dataSolicitacao, statusVistoria, nipProtocolador)"
                + " VALUES"
                + " (?,?,?,?,?,?)";
        try{
            st = conn.prepareStatement(comando, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getTipoVistoria());
            st.setString(2, obj.getEnderecoVistoria());
            st.setString(3, obj.getAtracadouto());
            st.setDate(4, new java.sql.Date(obj.getDataSolicitacao().getTime()) ); /*TESTAR A INSERÇÃO DE DATA- POSSIVEL ERRO AQUI*/
            st.setString(5, obj.getStatusVistoria());
            st.setInt(6, obj.getOperador().getNip());
            
            int linhasAfetadas = st.executeUpdate();
            
            if(linhasAfetadas>0){
                ResultSet rs = st.getGeneratedKeys();
                if(rs.next()){
                    int cod = rs.getInt(1);
                    obj.setId(cod);
                }
                DB.closeResultSet(rs);
            }else{
                throw new DbException("ERRO NA INSERCAO, nehuma linha afetada");
                //JOptionPane.showMessageDialog(null, "ERRO", "Erro ao salvar no Banco de Dados", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(SQLException e){
            throw new DbException(e.getMessage());         
        }finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public void alterarVistoria(Vistoria obj) { /*view -> AlterarVistoria*/
        PreparedStatement st = null;
                            /* ESTUDAR A POSSIBILIDADE DE COLOCAR UMA PROCEDURE PRA REALIZAR O COMMIT/ROLLBACK*/
        String comando =   "UPDATE Tbl_Vistoria"
                         + " SET tipoVistoria = ?, enderecoVistoria = ?, atracadouro = ?"
                         + " WHERE idSequencial = ?;"
                         + " UPDATE tbl_Cliente"
                         + " SET nome= ?, apelido= ?, celular1= ?, celular2= ?"
                         + " WHERE id = ?;"
                         + " UPDATE Tbl_Embarcacao"
                         + " SET nome= ?, tipo= ?"
                         + " WHERE idEmb = ?;" ;
        try{
            st = conn.prepareStatement(comando);
            st.setString(1, obj.getTipoVistoria());
            st.setString(2, obj.getEnderecoVistoria());
            st.setString(3, obj.getAtracadouto());
            st.setInt(4, obj.getId());
            st.setString(5, obj.getCliente().getName());
            st.setString(6, obj.getCliente().getApelido());
            st.setString(7, obj.getCliente().getCelular1());
            st.setString(8, obj.getCliente().getCelular2());
            st.setInt(9, obj.getCliente().getId());
            st.setString(10, obj.getEmbarcacao().getNome());
            st.setString(11, obj.getEmbarcacao().getTipoEmb());
            st.setInt(12, obj.getEmbarcacao().getId());
            
            st.executeUpdate();  
        }catch(SQLException e){
            throw new DbException(e.getMessage());         
        }finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public List<Vistoria> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarSatusParaVistoriaAgendada(Vistoria obj) {
        PreparedStatement st = null;
                            /* ESTUDAR A POSSIBILIDADE DE COLOCAR UMA PROCEDURE PRA REALIZAR O COMMIT/ROLLBACK*/
        String comando =   "UPDATE Tbl_Vistoria"
                         + " SET dataAgendada = ?, horaAgendada = ?, localAgendado = ?, statusVistoria = ?"
                         + " WHERE idSequencial = ?;";
        try{
            st = conn.prepareStatement(comando);
            st.setDate(1, new java.sql.Date(obj.getDataAgendamento().getTime()));
            st.setString(2, obj.getHoraAgendada());
            st.setString(3, obj.getLocalAgendado());
            st.setString(4, "Agendada");
            st.setInt(5, obj.getId());
           
            st.executeUpdate();  
        }catch(SQLException e){
            throw new DbException(e.getMessage());         
        }finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public void alterarSatusParaVistoriaRealizada(Vistoria obj) {
        PreparedStatement st = null;
                            /* ESTUDAR A POSSIBILIDADE DE COLOCAR UMA PROCEDURE PRA REALIZAR O COMMIT/ROLLBACK*/
        String comando =   "UPDATE Tbl_Vistoria"
                         + " SET dataRealizacaoVistoria = ?, vistoriadorChef = ?, vistoriadorAux = ?, statusVistoria = ?"
                         + " WHERE idSequencial = ?;";
        try{
            st = conn.prepareStatement(comando);
            st.setDate(1, new java.sql.Date(obj.getDataAgendamento().getTime()));
            st.setString(2, obj.getVistoriadorChef());
            st.setString(3, obj.getVistoriadorAux());
            st.setString(4, "realizada");
            st.setInt(5, obj.getId());
           
            st.executeUpdate();  
        }catch(SQLException e){
            throw new DbException(e.getMessage());         
        }finally{
            DB.closeStatement(st);
        }
    }
    
    
}
