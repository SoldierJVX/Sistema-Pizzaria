/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

import java.io.Serializable;
import javax.swing.Icon;

/**
 *
 * @author SoldierJVX
 */
public class Produto implements Serializable{

    private int codProduto;
    private String nome;
    private String descricao;
    private double preco;
    private Icon imagem;

    public Produto(int codProduto, String nome, String descricao, double preco, Icon imagem) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public Icon getImagem() {
        return imagem;
    }

}
