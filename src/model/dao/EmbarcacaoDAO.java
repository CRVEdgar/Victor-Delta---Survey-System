/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import entidades.Embarcacao;
import java.util.List;

/**
 *
 * @author Edgar
 */
public interface EmbarcacaoDAO {
    void insert(Embarcacao obj);
    void update(Embarcacao obj);
    void deleteByCodigo(String codigo);
    List<Embarcacao> selectAll();
}
