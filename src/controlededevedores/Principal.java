/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlededevedores;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.KeyboardFocusManager;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Thales Castro
 */
public class Principal {

    static ArrayList<Cliente> listaClientes;
    static ArrayList<Venda> listaVendas;
    static final Manager manager = new Manager();

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
            KeyboardFocusManager.getCurrentKeyboardFocusManager()
                    .addPropertyChangeListener("permanentFocusOwner", (final PropertyChangeEvent e) -> {
                        if (e.getNewValue() instanceof JTextField) {
                            SwingUtilities.invokeLater(() -> {
                                JTextField textField = (JTextField) e.getNewValue();
                                textField.selectAll();
                            });
                        }
                    });
        } catch (Exception ex) {
            System.out.println("error lookandfeel");
        }

        listaClientes = new ArrayList<>();
        manager.getListaCliente();
        listaVendas = new ArrayList<>();
        manager.getListaVenda();
        
        new PrincipalVis().setVisible(true);
    }

}
