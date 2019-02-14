/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

import java.io.Serializable;

/**
 *
 * @author SoldierJVX
 */
public class Funcionario extends Pessoa implements Serializable{

    private String usuario;
    private String senha;

    public Funcionario(String usuario, String senha, String nome) {
        super(nome);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

}
