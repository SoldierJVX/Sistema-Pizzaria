/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author SoldierJVX
 */
public class Pedido implements Serializable{

    private int numPedido;
    private double total;
    private ArrayList<Produto> listaProdutos;
    private Cliente quemSolicitou;
    private Funcionario quemFez;

    public Pedido(int numPedido, double total, ArrayList<Produto> listaProdutos, Funcionario quemFez, Cliente quemSolicitou) {
        this.numPedido = numPedido;
        this.total = total;
        this.listaProdutos = listaProdutos;
        this.quemFez = quemFez;
        this.quemSolicitou = quemSolicitou;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getQuemSolicitou() {
        return quemSolicitou;
    }

    public Funcionario getQuemFez() {
        return quemFez;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

}
