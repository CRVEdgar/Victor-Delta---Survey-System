/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implement;

import db.DB;
import db.DbException;
import entidades.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import model.dao.ClienteDAO;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Edgar
 */
public class ClienteDAOJDBC implements ClienteDAO {
    private Connection conn;
    public ClienteDAOJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Cliente obj) {
        PreparedStatement st = null;
        String comando = "INSERT INTO Tbl_Cliente"
                + " (nome, apelido, celular1, celular2)"
                + " VALUES"
                + " (?,?,?,?)";
        
        try{
            st = conn.prepareStatement(comando, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getName());
            st.setString(2, obj.getApelido());
            st.setString(3, obj.getCelular1());
            st.setString(4, obj.getCelular2());
            
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
    public void update(Cliente obj) {
        PreparedStatement st = null;
        String comando =   "UPDATE Tbl_Cliente"
                         + " SET nome = ?, apelido = ?, celular1 = ?, celular2 = ?"
                         + " WHERE id = ?";
        try{
            st = conn.prepareStatement(comando);
            st.setString(1, obj.getName());
            st.setString(2, obj.getApelido());
            st.setString(3, obj.getCelular1());
            st.setString(3, obj.getCelular2());
            
            st.executeUpdate();  
        }catch(SQLException e){
            throw new DbException(e.getMessage());         
        }finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteByCodigo(int codigo) {
        PreparedStatement st = null;
        String comando = "DELETE FROM Tbl_Cliente"
                         + " WHERE codigo = ?";
        
        try{
            st = conn.prepareStatement(comando);
            
            st.setInt(1, codigo);
            
            int linhasAfetadas = st.executeUpdate();
            if(linhasAfetadas == 0){
                throw new DbException("ERRO! CODIGO NAO ENCONTRADO NO BANCO!");
            }
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public List<Cliente> selectAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        
        String comando = "SELECT *"
                        + " FROM Tbl_Cliente"
                        + " ORDER BY id";
        
        try{
            st = conn.prepareStatement(comando);
            
            rs = st.executeQuery();
            
            List<Cliente> lista = new ArrayList<>();
            
            while(rs.next()){
                Cliente cli = new Cliente();
                    cli.setId(rs.getInt("id"));
                    cli.setName(rs.getString("nome"));
                    cli.setApelido(rs.getString("apelido"));
                    cli.setCelular1(rs.getString("celular1"));
                    cli.setCelular1(rs.getString("celular1"));
                    
                    lista.add(cli);
            }
            return lista;
            
        }catch(SQLException e){
            throw new DbException(e.getMessage());         
        }finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
}
