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
public class Operador {
    private Integer nip;
    private String nome;
    private String perfil;
    private String senha;
    private String situacao;

    public Operador() {
    }

    public Operador(Integer nip, String nome, String perfil, String senha, String situacao) {
        this.nip = nip;
        this.nome = nome;
        this.perfil = perfil;
        this.senha = senha;
        this.situacao = situacao;
    }

    public Integer getNip() {
        return nip;
    }

    public void setNip(Integer nip) {
        this.nip = nip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nip);
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
        final Operador other = (Operador) obj;
        if (!Objects.equals(this.nip, other.nip)) {
            return false;
        }
        return true;
    }
    
    
    
}
