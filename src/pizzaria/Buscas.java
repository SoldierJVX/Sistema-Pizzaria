/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author SoldierJVX
 */
public class Buscas {

    public static Cliente buscaCliente(ArrayList<Cliente> listaClientes, JTextField txtTelefone) {

        int i;

        for (i = 0; i < listaClientes.size() && !listaClientes.get(i).getTelefone().equals(txtTelefone.getText()); i++)
            ;

        if (i < listaClientes.size()) {

            return listaClientes.get(i);

        }

        return null;

    }

    public static Cliente buscaCliente(ArrayList<Cliente> listaClientes, String telCliente) {

        int i;

        for (i = 0; i < listaClientes.size() && !listaClientes.get(i).getTelefone().equals(telCliente); i++)
            ;

        if (i < listaClientes.size()) {

            return listaClientes.get(i);

        }

        return null;

    }

    public static Pedido buscaPedido(ArrayList<Pedido> listaPedidos, int numPedido) {
        
        int i;
        
        for (i = 0; i < listaPedidos.size() && listaPedidos.get(i).getNumPedido() != numPedido; i++)
            ;
        
        if (i < listaPedidos.size()) {
            
            return listaPedidos.get(i);
            
        }
        
        return null;
        
    }

}
