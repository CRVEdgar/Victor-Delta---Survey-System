/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author Edgar
 */
public class Embarcacao {
    private Integer id;
    private String nome;
    private String tipoEmb;

    public Embarcacao() {
    }

    public Embarcacao(Integer id, String nome, String tipoEmb) {
        this.id = id;
        this.nome = nome;
        this.tipoEmb = tipoEmb;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoEmb() {
        return tipoEmb;
    }

    public void setTipoEmb(String tipoEmb) {
        this.tipoEmb = tipoEmb;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
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
        final Embarcacao other = (Embarcacao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
