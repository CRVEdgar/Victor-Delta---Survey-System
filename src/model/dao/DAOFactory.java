/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import db.DB;
import model.dao.implement.VistoriaDAOJDBC;

/**
 *
 * @author Edgar
 */
public class DAOFactory {
    public static VistoriaDAO createVistoriaDAO(){
        return new VistoriaDAOJDBC(DB.getConnection());
    }
}
