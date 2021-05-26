/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import entidades.Cliente;
import java.util.List;

/**
 *
 * @author Edgar
 */
public interface ClienteDAO {
    void insert(Cliente obj);
    void update(Cliente obj);
    void deleteByCodigo(int codigo);
    List<Cliente> selectAll();
}
