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
    public void update(Vistoria obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void updateStatus(String obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
