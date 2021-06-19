/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import entidades.Vistoria;
import java.util.List;

/**
 *
 * @author Edgar
 */
public interface VistoriaDAO {
    void insert(Vistoria obj);
    void alterarVistoria(Vistoria obj);
    void alterarSatusParaVistoriaAgendada(Vistoria obj);
    void alterarSatusParaVistoriaRealizada(Vistoria obj);
    void updateStatus(String obj);
    void deleteByCodigo(String codigo);
    List<Vistoria> selectAll();
}
