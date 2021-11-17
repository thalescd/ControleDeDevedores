package controlededevedores;

import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PrincipalVis extends javax.swing.JFrame {

    private final DefaultTableModel modelCliente;
    private final DefaultTableModel modelVenda;

    public PrincipalVis() {
        initComponents();
        modelCliente = (DefaultTableModel) tbClientes.getModel();
        modelVenda = (DefaultTableModel) tbVenda.getModel();
        editarTabelas();
        editarTextField();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gCodCliente = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbClientes = new Tabela();
        btnDelCliente = new javax.swing.JButton();
        btnAddCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCodigoCliente = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        radCpf = new javax.swing.JRadioButton();
        radCnpj = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtObsCliente = new javax.swing.JTextField();
        txtBuscaCliente = new javax.swing.JTextField();
        txtEditarCliente = new javax.swing.JButton();
        cmbFiltroCliente = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbVenda = new Tabela();
        btnDelVenda = new javax.swing.JButton();
        btnAddVenda = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtCodigoVenda = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtObsVenda = new javax.swing.JTextField();
        chkPago = new javax.swing.JCheckBox();
        txtDia = new javax.swing.JSpinner();
        txtMes = new javax.swing.JSpinner();
        txtAno = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtBuscaVenda = new javax.swing.JTextField();
        txtEditarVenda = new javax.swing.JButton();
        cmbFiltroVenda = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Vendas");

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF/CNPJ", "Telefone", "Endereço", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.setRowHeight(20);
        jScrollPane3.setViewportView(tbClientes);

        btnDelCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/del.png"))); // NOI18N
        btnDelCliente.setText("Apagar");
        btnDelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelClienteActionPerformed(evt);
            }
        });

        btnAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnAddCliente.setText("Adicionar");
        btnAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Telefone");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Endereço");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Observação");

        gCodCliente.add(radCpf);
        radCpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radCpf.setSelected(true);
        radCpf.setText("CPF");

        gCodCliente.add(radCnpj);
        radCnpj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radCnpj.setText("CNPJ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tipo*");

        txtBuscaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaClienteKeyReleased(evt);
            }
        });

        txtEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        txtEditarCliente.setText("Editar");
        txtEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarClienteActionPerformed(evt);
            }
        });

        cmbFiltroCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não filtrar", "Filtrar p/ CPF", "Filtrar p/ CNPJ" }));
        cmbFiltroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscaCliente)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(radCpf)
                                        .addGap(18, 18, 18)
                                        .addComponent(radCnpj)
                                        .addGap(0, 113, Short.MAX_VALUE))
                                    .addComponent(txtCodigoCliente))
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEditarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbFiltroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtObsCliente)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(radCpf)
                    .addComponent(radCnpj)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbFiltroCliente)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelCliente)
                        .addComponent(btnAddCliente)
                        .addComponent(txtEditarCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", jPanel1);

        tbVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Código", "Data", "Preço", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVenda.setRowHeight(20);
        jScrollPane5.setViewportView(tbVenda);

        btnDelVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/del.png"))); // NOI18N
        btnDelVenda.setText("Apagar");
        btnDelVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelVendaActionPerformed(evt);
            }
        });

        btnAddVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnAddVenda.setText("Adicionar");
        btnAddVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVendaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cliente*");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Data de venda");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Preço de venda");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Observação");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Código de venda*");

        chkPago.setText("Pago");

        txtDia.setModel(new javax.swing.SpinnerNumberModel(Calendar.getInstance().get(Calendar.DAY_OF_MONTH), 1, 31, 1));

        txtMes.setModel(new javax.swing.SpinnerNumberModel(Calendar.getInstance().get(Calendar.MONTH) + 1, 1, 12, 1));

        txtAno.setModel(new javax.swing.SpinnerNumberModel(Calendar.getInstance().get(Calendar.YEAR), 2000, Calendar.getInstance().get(Calendar.YEAR), 1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("dd-mm-aaaa");

        txtBuscaVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaVendaKeyReleased(evt);
            }
        });

        txtEditarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        txtEditarVenda.setText("Editar");
        txtEditarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarVendaActionPerformed(evt);
            }
        });

        cmbFiltroVenda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não filtrar", "Filtrar p/ pagos", "Filtrar p/ não-pagos" }));
        cmbFiltroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtCodigoVenda))
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(10, 426, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscaVenda)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkPago))
                            .addComponent(txtObsVenda)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAddVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEditarVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbFiltroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelVenda))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPago)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObsVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelVenda)
                    .addComponent(btnAddVenda)
                    .addComponent(txtEditarVenda)
                    .addComponent(cmbFiltroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vendas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed
        StringBuilder erro = new StringBuilder();
        Cliente c = new Cliente();
        try {
            if (!c.setNome(txtNome.getText())) {
                erro.append("O campo 'Nome' é obrigatório.\n");
            }
            if (!c.setCodigo(txtCodigoCliente.getText())) {
                erro.append("O campo 'Tipo' é obrigatório.\n");
            }
            c.setTelefone(txtTelefone.getText());
            c.setEndereco(txtEndereco.getText());
            c.setObservacao(txtObsCliente.getText());
            c.setCpf(radCpf.isSelected());
            if (erro.length() > 0) {
                throw new Exception();
            } else {
                if (Util.getClienteCod(c.getCodigo()) != null) {
                    if (!overwriteCliente()) {
                        return;
                    } else {
                        Principal.listaClientes.remove(Util.getClienteCod(c.getCodigo()));
                    }
                }
            }
            Principal.listaClientes.add(c);
            Principal.manager.salvarClientes();
            atualizarClientes();
            esvaziarCamposCliente();
        } catch (Exception ex) {
            Util.ErrorPanel(erro.toString());
        }
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void btnDelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelClienteActionPerformed
        if (tbClientes.getSelectedRows().length != 0) {
            StringBuilder nomes = new StringBuilder();
            for (int i : tbClientes.getSelectedRows()) {
                nomes.append(tbClientes.getValueAt(i, 0)).append("\n");
            }
            int reply = JOptionPane.showConfirmDialog(null, "Tem certeza que quer apagar:\n" + nomes.toString(),
                    "Cuidado", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                for (int i = tbClientes.getSelectedRows().length - 1; i >= 0; i--) {
                    Principal.listaClientes.remove(Util.getClienteCod(tbClientes.
                            getValueAt(tbClientes.getSelectedRows()[i], 1).toString()));
                }
                Principal.manager.salvarClientes();
                atualizarClientes();
            }
        } else {
            Util.ErrorPanel("Selecione o cliente que deseja apagar.");
        }
    }//GEN-LAST:event_btnDelClienteActionPerformed

    private void btnDelVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelVendaActionPerformed
        if (tbVenda.getSelectedRows().length != 0) {
            StringBuilder nomes = new StringBuilder();
            for (int i = 0; i < tbVenda.getSelectedRows().length; i++) {
                nomes.append(Principal.listaVendas.get(i).getCliente()).append("\n");
            }
            int reply = JOptionPane.showConfirmDialog(null, "Tem certeza que quer apagar?", "Cuidado", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                for (int i = tbVenda.getSelectedRows().length - 1; i >= 0; i--) {
                    Principal.listaVendas.remove(Util.getVendaCod((int) tbVenda.
                            getValueAt(tbVenda.getSelectedRows()[i], 1)));
                }
                Principal.manager.salvarVendas();
                atualizarVendas();
            }
        } else {
            Util.ErrorPanel("Selecione a venda que deseja apagar.");
        }
    }//GEN-LAST:event_btnDelVendaActionPerformed

    private void btnAddVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVendaActionPerformed
        StringBuilder erro = new StringBuilder();
        Venda v = new Venda();
        try {
            if (!v.setCliente(txtCliente.getText())) {
                erro.append("O campo 'Cliente' é obrigatório.\n");
            }
            if (!v.setCodigoVenda(txtCodigoVenda.getText())) {
                erro.append("O campo 'Código de venda' inválido.\n");
            }
            if (!v.setData(txtDia.getValue(), txtMes.getValue(), txtAno.getValue())) {
                erro.append("Data inválida.\n");
            }
            if (!v.setPreco(txtPreco.getText())) {
                erro.append("O campo 'Preço' inválido.\n");
            }
            v.setObservacao(txtObsVenda.getText());
            v.setPago(chkPago.isSelected());
            if (erro.length() > 0) {
                throw new Exception();
            } else {
                if (Util.getClienteNome(v.getCliente()) == null) {
                    goToCliente();
                    return;
                } else if (Util.getVendaCod(v.getCodigoVenda()) != null) {
                    if (!overwriteVenda()) {
                        return;
                    } else {
                        Principal.listaVendas.remove(Util.getVendaCod(v.getCodigoVenda()));
                    }
                }
            }
            Principal.listaVendas.add(v);
            Principal.manager.salvarVendas();
            atualizarVendas();
            esvaziarCamposVenda();
        } catch (Exception ex) {
            Util.ErrorPanel(erro.toString());
        }
    }//GEN-LAST:event_btnAddVendaActionPerformed

    private void txtBuscaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaClienteKeyReleased
        filtrarTabelaCliente(txtBuscaCliente.getText().toLowerCase());
    }//GEN-LAST:event_txtBuscaClienteKeyReleased

    private void txtBuscaVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaVendaKeyReleased
        filtrarTabelaVenda(txtBuscaVenda.getText().toLowerCase());
    }//GEN-LAST:event_txtBuscaVendaKeyReleased

    private void txtEditarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarVendaActionPerformed
        if (tbVenda.getSelectedRow() != -1) {
            Venda v = Principal.listaVendas.
                    get(Principal.listaVendas.
                            indexOf(Util.getVendaCod((int) tbVenda.
                                            getValueAt(tbVenda.getSelectedRow(), 1))));
            txtCliente.setText(v.getCliente());
            txtCodigoVenda.setText(v.getCodigoVenda() + "");
            txtDia.setValue(v.getData(0));
            txtMes.setValue(v.getData(1));
            txtAno.setValue(v.getData(2));
            txtPreco.setText(v.getPreco() + "");
            txtObsVenda.setText(v.getObservacao());
            chkPago.setSelected(v.isPago());
        } else {
            Util.ErrorPanel("Selecione o cliente que deseja editar.");
        }
    }//GEN-LAST:event_txtEditarVendaActionPerformed

    private void txtEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarClienteActionPerformed
        if (tbClientes.getSelectedRow() != -1) {
            Cliente c = Principal.listaClientes.
                    get(Principal.listaClientes.
                            indexOf(Util.getClienteCod(tbClientes.
                                            getValueAt(tbClientes.getSelectedRow(), 1).toString())));
            txtNome.setText(c.getNome());
            txtCodigoCliente.setText(c.getCodigo());
            txtTelefone.setText(c.getTelefone());
            txtEndereco.setText(c.getEndereco());
            txtObsCliente.setText(c.getObservacao());
        } else {
            Util.ErrorPanel("Selecione o cliente que deseja editar.");
        }
    }//GEN-LAST:event_txtEditarClienteActionPerformed

    private void cmbFiltroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltroClienteActionPerformed
        atualizarClientes();
    }//GEN-LAST:event_cmbFiltroClienteActionPerformed

    private void cmbFiltroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltroVendaActionPerformed
        atualizarVendas();
    }//GEN-LAST:event_cmbFiltroVendaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCliente;
    private javax.swing.JButton btnAddVenda;
    private javax.swing.JButton btnDelCliente;
    private javax.swing.JButton btnDelVenda;
    private javax.swing.JCheckBox chkPago;
    private javax.swing.JComboBox cmbFiltroCliente;
    private javax.swing.JComboBox cmbFiltroVenda;
    private javax.swing.ButtonGroup gCodCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton radCnpj;
    private javax.swing.JRadioButton radCpf;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbVenda;
    private javax.swing.JSpinner txtAno;
    private javax.swing.JTextField txtBuscaCliente;
    private javax.swing.JTextField txtBuscaVenda;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCodigoVenda;
    private javax.swing.JSpinner txtDia;
    private javax.swing.JButton txtEditarCliente;
    private javax.swing.JButton txtEditarVenda;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JSpinner txtMes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObsCliente;
    private javax.swing.JTextField txtObsVenda;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void editarTabelas() {
        atualizarClientes();
        atualizarVendas();
    }

    private void atualizarClientes() {
        Principal.manager.getListaCliente();
        modelCliente.setRowCount(0);
        for (Cliente c : Principal.listaClientes) {
            switch (cmbFiltroCliente.getSelectedIndex()) {
                case 1:
                    if (!c.isCpf()) {
                        continue;
                    }
                    break;
                case 2:
                    if (c.isCpf()) {
                        continue;
                    }
                    break;
            }
            modelCliente.addRow(new Object[]{
                c.getNome(),
                c.getCodigo(),
                c.getTelefone(),
                c.getEndereco(),
                c.getObservacao()
            });
        }
    }

    private void atualizarVendas() {
        Principal.manager.getListaVenda();
        modelVenda.setRowCount(0);
        for (Venda v : Principal.listaVendas) {
            switch (cmbFiltroVenda.getSelectedIndex()) {
                case 1:
                    if (!v.isPago()) {
                        continue;
                    }
                    break;
                case 2:
                    if (v.isPago()) {
                        continue;
                    }
                    break;
            }
            modelVenda.addRow(new Object[]{
                v.getCliente(),
                v.getCodigoVenda(),
                v.getData(),
                String.format("%.2f", v.getPreco()),
                v.getObservacao(),
            });
        }
    }

    private void goToCliente() {
        int reply = JOptionPane.showConfirmDialog(null, "Cliente " + txtCliente.getText()
                + " não encontrado.\nDeseja cadastrá-lo?", "Cuidado", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            jTabbedPane1.setSelectedIndex(0);
            txtNome.setText(txtCliente.getText());
        }
    }

    private void esvaziarCamposCliente() {
        txtNome.setText("");
        txtCodigoCliente.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
        txtObsCliente.setText("");
        txtNome.requestFocus();
    }

    private void esvaziarCamposVenda() {
        txtCliente.setText("");
        txtCodigoVenda.setText("");
        txtDia.setValue(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        txtMes.setValue(Calendar.getInstance().get(Calendar.MONTH) + 1);
        txtAno.setValue(Calendar.getInstance().get(Calendar.YEAR));
        txtPreco.setText("");
        chkPago.setSelected(false);
        txtObsVenda.setText("");
        txtCliente.requestFocus();
    }

    private boolean overwriteCliente() {
        int reply = JOptionPane.showConfirmDialog(null, "Cliente com código " + txtCodigoCliente.getText()
                + " já existe.\nDeseja sobrescreve-lo?", "Cuidado", JOptionPane.YES_NO_OPTION);
        return reply == JOptionPane.YES_OPTION;
    }

    private void filtrarTabelaCliente(String str) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelCliente);
        tbClientes.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + str));
    }

    private boolean overwriteVenda() {
        int reply = JOptionPane.showConfirmDialog(null, "Venda com código " + txtCodigoVenda.getText()
                + " já existe.\nDeseja sobrescreve-la?", "Cuidado", JOptionPane.YES_NO_OPTION);
        return reply == JOptionPane.YES_OPTION;
    }

    private void editarTextField() {
        TextPrompt tpBuscaCliente = new TextPrompt("Busca", txtBuscaCliente);
        tpBuscaCliente.setShow(TextPrompt.Show.FOCUS_LOST);
        tpBuscaCliente.setIcon(new ImageIcon(getClass().getResource("/img/lupa.png")));

        TextPrompt tpBuscaVenda = new TextPrompt("Busca", txtBuscaVenda);
        tpBuscaVenda.setShow(TextPrompt.Show.FOCUS_LOST);
        tpBuscaVenda.setIcon(new ImageIcon(getClass().getResource("/img/lupa.png")));
    }

    private void filtrarTabelaVenda(String str) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelVenda);
        tbVenda.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + str));
    }
}
