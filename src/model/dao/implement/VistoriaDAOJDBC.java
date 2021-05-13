/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implement;

import java.sql.Connection;
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
    
    
}
