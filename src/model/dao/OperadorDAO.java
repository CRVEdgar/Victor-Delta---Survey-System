/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import entidades.Operador;
import java.util.List;

/**
 *
 * @author Edgar
 */
public interface OperadorDAO {
    void insert(Operador obj);
    void update(Operador obj);
    /*void updateSenha(Operador obj);*/
    void deleteByNIP(int codigo);
    List<Operador> selectAll();
}
