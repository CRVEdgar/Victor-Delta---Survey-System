/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implement;

import entidades.Embarcacao;
import java.sql.Connection;
import java.util.List;
import model.dao.EmbarcacaoDAO;

/**
 *
 * @author Edgar
 */
public class EmbarcacaoDAOJDBC implements EmbarcacaoDAO{
    private Connection conn;
    public EmbarcacaoDAOJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Embarcacao obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Embarcacao obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Embarcacao> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
