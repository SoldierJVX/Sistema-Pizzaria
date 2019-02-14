/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SoldierJVX
 */
public class Persistencia {

    public static ArrayList<Funcionario> carregaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {

        verificarPasta();

        File arquivo = new File("./dados/dadosfuncionarios.dat");

        if (!arquivo.exists()) {

            return null;

        }

        try {
            ObjectInputStream buf = new ObjectInputStream(new FileInputStream(arquivo));

            listaFuncionarios = (ArrayList<Funcionario>) buf.readObject();

            buf.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro no carregamento dos dados. Tente novamente!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "asdasdErro no carregamento dos dados. Tente novamente!");
        }
        
        return listaFuncionarios;

    }

    public static ArrayList<Cliente> carregaClientes(ArrayList<Cliente> listaClientes) {

        verificarPasta();

        File arquivo = new File("./dados/dadosclientes.dat");

        if (!arquivo.exists()) {

            return null;

        }

        try {
            ObjectInputStream buf = new ObjectInputStream(new FileInputStream(arquivo));

            listaClientes = (ArrayList<Cliente>) buf.readObject();

            buf.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro no carregamento dos dados. Tente novamente!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no carregamento dos dados. Tente novamente!");
        }
        
        return listaClientes;
        
    }

    public static ArrayList<Produto> carregaProdutos(ArrayList<Produto> listaProdutos) {

        verificarPasta();

        File arquivo = new File("./dados/dadosprodutos.dat");

        if (!arquivo.exists()) {

            return null;

        }

        try {
            ObjectInputStream buf = new ObjectInputStream(new FileInputStream(arquivo));

            listaProdutos = (ArrayList<Produto>) buf.readObject();

            buf.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro no carregamento dos dados. Tente novamente!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no carregamento dos dados. Tente novamente!");
        }
        
        return listaProdutos;
        
    }

    public static ArrayList<Pedido> carregaPedidos(ArrayList<Pedido> listaPedidos) {

        verificarPasta();

        File arquivo = new File("./dados/dadospedidos.dat");
        
        if (!arquivo.exists()) {

            return null;

        }

        try {
            ObjectInputStream buf = new ObjectInputStream(new FileInputStream(arquivo));

            listaPedidos = (ArrayList<Pedido>) buf.readObject();

            buf.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro no carregamento dos dados. Tente novamente!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no carregamento dos dados. Tente novamente!");
        }
        
        return listaPedidos;
        
    }

    public static void salvarClientes(ArrayList<Cliente> listaClientes) {

        if (listaClientes.size() == 0) {

            return;

        }

        verificarPasta();

        File arquivo = new File("./dados/dadosclientes.dat");

        try {
            ObjectOutputStream buf = new ObjectOutputStream(new FileOutputStream(arquivo));

            buf.writeObject(listaClientes);

            buf.close();
        } catch (IOException ex) {
            System.err.println("Erro");
        }

    }

    public static void salvarFuncionarios(ArrayList<Funcionario> listaFuncionarios) {

        if (listaFuncionarios.size() == 0) {

            return;

        }

        verificarPasta();

        File arquivo = new File("./dados/dadosfuncionarios.dat");

        try {
            ObjectOutputStream buf = new ObjectOutputStream(new FileOutputStream(arquivo));

            buf.writeObject(listaFuncionarios);

            buf.close();
        } catch (IOException ex) {
            System.err.println("Erro");
        }

    }

    public static void salvarProdutos(ArrayList<Produto> listaProdutos) {

        if (listaProdutos.size() == 0) {
            return;
        }

        verificarPasta();

        File arquivo = new File("./dados/dadosprodutos.dat");

        try {
            ObjectOutputStream buf = new ObjectOutputStream(new FileOutputStream(arquivo));

            buf.writeObject(listaProdutos);

            buf.close();
        } catch (IOException ex) {
            System.err.println("Erro");
        }

    }

    public static void salvarPedidos(ArrayList<Pedido> listaPedidos) {
        
        if (listaPedidos.size() == 0) {
            return;
        }

        verificarPasta();

        File arquivo = new File("./dados/dadospedidos.dat");

        try {
            ObjectOutputStream buf = new ObjectOutputStream(new FileOutputStream(arquivo));

            buf.writeObject(listaPedidos);

            buf.close();
        } catch (IOException ex) {
            System.err.println("Erro");
        }

    }

    private static void verificarPasta() {
        File pasta = new File("./dados");

        if (!pasta.exists()) {

            pasta.mkdir();

        }
    }

}
