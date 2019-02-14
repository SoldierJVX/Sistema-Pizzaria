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
public class Cliente extends Pessoa implements Serializable{

    private String telefone;
    private String endereco;

    public Cliente(String telefone, String endereco, String nome) {
        super(nome);
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

}
