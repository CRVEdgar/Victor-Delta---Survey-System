/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Edgar
 */
public class Vistoria {
    private Integer id;
    private String codigoVistoria;
    private String tipoVistoria;
    private String enderecoVistoria;
    private String atracadouto;
    private Date dataSolicitacao;
    private Date dataVistoria;
    private String horaVistoria; /*não está sendo usado*/
    private Date dataAgendamento;
    private String localAgendado;
    private String horaAgendada;
    private String StatusVistoria;
    private String vistoriadorChef;
    private String vistoriadorAux;
    
    private Embarcacao embarcacao;
    private Operador operador;
    private Cliente cliente;

    public Vistoria(Integer id, String codigoVistoria, String tipoVistoria, String enderecoVistoria, String atracadouto, Date dataSolicitacao, Date dataVistoria, String horaVistoria, Date dataAgendamento,String localAgendado, String horaAgendada, String StatusVistoria, String vistoriadorChef, String vistoriadorAux, Embarcacao embarcacao, Operador operador, Cliente cliente) {
        this.id = id;
        this.codigoVistoria = codigoVistoria;
        this.tipoVistoria = tipoVistoria;
        this.enderecoVistoria = enderecoVistoria;
        this.atracadouto = atracadouto;
        this.dataSolicitacao = dataSolicitacao;
        this.dataVistoria = dataVistoria;
        this.horaVistoria = horaVistoria;
        this.dataAgendamento = dataAgendamento;
        this.horaAgendada = horaAgendada;
        this.localAgendado = localAgendado;
        this.StatusVistoria = StatusVistoria;
        this.vistoriadorChef = vistoriadorChef;
        this.vistoriadorAux = vistoriadorAux;
        this.embarcacao = embarcacao;
        this.operador = operador;
        this.cliente = cliente;
    }
    

    public Vistoria() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoVistoria() {
        return codigoVistoria;
    }

    public void setCodigoVistoria(String codigoVistoria) {
        this.codigoVistoria = codigoVistoria;
    }

    public String getTipoVistoria() {
        return tipoVistoria;
    }

    public void setTipoVistoria(String tipoVistoria) {
        this.tipoVistoria = tipoVistoria;
    }

    public String getEnderecoVistoria() {
        return enderecoVistoria;
    }

    public void setEnderecoVistoria(String enderecoVistoria) {
        this.enderecoVistoria = enderecoVistoria;
    }

    public String getAtracadouto() {
        return atracadouto;
    }

    public void setAtracadouto(String atracadouto) {
        this.atracadouto = atracadouto;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Date getDataVistoria() {
        return dataVistoria;
    }

    public void setDataVistoria(Date dataVistoria) {
        this.dataVistoria = dataVistoria;
    }

    public String getHoraVistoria() {
        return horaVistoria;
    }

    public void setHoraVistoria(String horaVistoria) {
        this.horaVistoria = horaVistoria;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getHoraAgendada() {
        return horaAgendada;
    }

    public void setHoraAgendada(String horaAgendada) {
        this.horaAgendada = horaAgendada;
    }

    public String getLocalAgendado() {
        return localAgendado;
    }

    public void setLocalAgendado(String localAgendado) {
        this.localAgendado = localAgendado;
    }
    

    public String getStatusVistoria() {
        return StatusVistoria;
    }

    public void setStatusVistoria(String StatusVistoria) {
        this.StatusVistoria = StatusVistoria;
    }

    public String getVistoriadorChef() {
        return vistoriadorChef;
    }

    public void setVistoriadorChef(String vistoriadorChef) {
        this.vistoriadorChef = vistoriadorChef;
    }

    public String getVistoriadorAux() {
        return vistoriadorAux;
    }

    public void setVistoriadorAux(String vistoriadorAux) {
        this.vistoriadorAux = vistoriadorAux;
    }

    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }

    public void setEmbarcacao(Embarcacao embarcacao) {
        this.embarcacao = embarcacao;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.codigoVistoria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vistoria other = (Vistoria) obj;
        if (!Objects.equals(this.codigoVistoria, other.codigoVistoria)) {
            return false;
        }
        return true;
    }
    
    
}
