package controlededevedores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Manager {

    private BufferedReader reader;
    private Writer output;
    private final String arquivoCliente = "Clientes.csv";
    private final String arquivoVenda = "Vendas.csv";

    public void salvarClientes() {
        try {
            iniciarClientes();
            output = new BufferedWriter(new FileWriter(arquivoCliente, true));
            for (Cliente c : Principal.listaClientes) {
                output.append(c.getClinte());
            }
            output.close();
        } catch (IOException ex) {
            Util.ErrorPanel("Erro ao cadastrar cliente");
        }
    }

    public void iniciarClientes() {
        try {
            new FileOutputStream(arquivoCliente, false).close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean getListaCliente() {
        Principal.listaClientes.clear();
        try {
            String line;
            reader = new BufferedReader(new FileReader(arquivoCliente));
            while ((line = reader.readLine()) != null) {
                if (line.length() > 0) {
                    Principal.listaClientes.add(new Cliente(line));
                }
            }
            reader.close();
            return true;
        } catch (FileNotFoundException ex) {
            iniciarClientes();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    //=============================================================================================================
    
    public void salvarVendas() {
        try {
            iniciarVendas();
            output = new BufferedWriter(new FileWriter(arquivoVenda, true));
            for (Venda v : Principal.listaVendas) {
                output.append(v.getVenda());
            }
            output.close();
        } catch (IOException ex) {
            Util.ErrorPanel("Erro ao cadastrar cliente");
        }
    }

    public void iniciarVendas() {
        try {
            new FileOutputStream(arquivoVenda, false).close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean getListaVenda() {
        Principal.listaVendas.clear();
        try {
            String line;
            reader = new BufferedReader(new FileReader(arquivoVenda));
            while ((line = reader.readLine()) != null) {
                if (line.length() > 0) {
                    Principal.listaVendas.add(new Venda(line));
                }
            }
            reader.close();
            return true;
        } catch (FileNotFoundException ex) {
            iniciarVendas();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
