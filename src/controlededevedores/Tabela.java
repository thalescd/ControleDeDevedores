package controlededevedores;

import javax.swing.JTable;

public class Tabela extends JTable {

    public Tabela() {
        super();
        this.getTableHeader().setReorderingAllowed(false);
        this.putClientProperty("terminateEditOnFocusLost", true);
    }

}
