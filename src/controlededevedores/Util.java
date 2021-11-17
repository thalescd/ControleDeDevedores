package controlededevedores;

import javax.swing.JOptionPane;

public final class Util {

    public static void ErrorPanel(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public static Cliente getClienteNome(String nome){
        for(Cliente c: Principal.listaClientes){
            if(c.getNome().equalsIgnoreCase(nome)){
                return c;
            }
        }
        return null;
    }
    
    public static Cliente getClienteCod(String cod){
        for(Cliente c: Principal.listaClientes){
            if(c.getCodigo().equalsIgnoreCase(cod)){
                return c;
            }
        }
        return null;
    }
    
    public static Venda getVendaCod(int cod){
        for(Venda v: Principal.listaVendas){
            if(v.getCodigoVenda() == cod){
                return v;
            }
        }
        return null;
    }
    
}
