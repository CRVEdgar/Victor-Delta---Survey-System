/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implement;

import entidades.Operador;
import java.sql.Connection;
import java.util.List;
import model.dao.OperadorDAO;

/**
 *
 * @author Edgar
 */
public class OperadorDAOJDBC implements OperadorDAO{
    private Connection conn;
    public OperadorDAOJDBC(Connection conn){
        this.conn = conn;
    }
    @Override
    public void insert(Operador obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Operador obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByNIP(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Operador> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
