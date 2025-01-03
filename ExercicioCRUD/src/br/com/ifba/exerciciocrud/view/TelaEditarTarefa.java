package br.com.ifba.exerciciocrud.view;

import br.com.ifba.exerciciocrud.model.Tarefa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Bastos
 */
public class TelaEditarTarefa extends javax.swing.JFrame {

    // Atributo que receberá a tarefa do banco de dados a ser editada.
    private Tarefa tarefa;

    /**
     * Creates new form TelaEditarTarefa
     */
    // Construtor modificado
    public TelaEditarTarefa(Tarefa trf) {
        initComponents();

        // Guardando os dados da tarefa que será modificada.
        this.tarefa = trf;

        // Exibindo dados antigos na tela de edição.
        txtNovoNome.setText(tarefa.getNome());
        spnNovaQuantidade.setValue(tarefa.getQuantidade());
        txtNovaDescricao.setText(tarefa.getDescricao());
        txtNovoFornecedor.setText(tarefa.getFornecedor());

        // Mostrando tela
        this.setVisible(true);
    }

    public TelaEditarTarefa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sprLinha = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnConfirmar = new javax.swing.JButton();
        lblNomeInfo = new javax.swing.JLabel();
        txtNovoNome = new javax.swing.JTextField();
        lblQuantidadeInfo = new javax.swing.JLabel();
        spnNovaQuantidade = new javax.swing.JSpinner();
        lblDescricao = new javax.swing.JLabel();
        txtNovaDescricao = new javax.swing.JTextField();
        txtFornecedorInfo = new javax.swing.JLabel();
        txtNovoFornecedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sprLinha.setBackground(new java.awt.Color(0, 0, 0));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setText("EDITAR TAREFA");

        btnConfirmar.setBackground(new java.awt.Color(0, 0, 51));
        btnConfirmar.setForeground(new java.awt.Color(204, 204, 204));
        btnConfirmar.setText("OK");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblNomeInfo.setForeground(new java.awt.Color(204, 204, 204));
        lblNomeInfo.setText("Novo nome:");

        lblQuantidadeInfo.setForeground(new java.awt.Color(204, 204, 204));
        lblQuantidadeInfo.setText("Nova quantidade:");

        spnNovaQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lblDescricao.setForeground(new java.awt.Color(204, 204, 204));
        lblDescricao.setText("Nova descrição:");

        txtFornecedorInfo.setForeground(new java.awt.Color(204, 204, 204));
        txtFornecedorInfo.setText("Novo fornecedor:");

        javax.swing.GroupLayout sprLinhaLayout = new javax.swing.GroupLayout(sprLinha);
        sprLinha.setLayout(sprLinhaLayout);
        sprLinhaLayout.setHorizontalGroup(
            sprLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sprLinhaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(130, 130, 130))
            .addGroup(sprLinhaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(sprLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(sprLinhaLayout.createSequentialGroup()
                        .addComponent(txtFornecedorInfo)
                        .addGap(18, 18, 18)
                        .addComponent(txtNovoFornecedor))
                    .addGroup(sprLinhaLayout.createSequentialGroup()
                        .addComponent(lblDescricao)
                        .addGap(18, 18, 18)
                        .addComponent(txtNovaDescricao))
                    .addGroup(sprLinhaLayout.createSequentialGroup()
                        .addComponent(lblQuantidadeInfo)
                        .addGap(18, 18, 18)
                        .addComponent(spnNovaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sprLinhaLayout.createSequentialGroup()
                        .addComponent(lblNomeInfo)
                        .addGap(18, 18, 18)
                        .addComponent(txtNovoNome))
                    .addComponent(lblTitulo)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        sprLinhaLayout.setVerticalGroup(
            sprLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sprLinhaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(sprLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeInfo)
                    .addComponent(txtNovoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sprLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeInfo)
                    .addComponent(spnNovaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sprLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtNovaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sprLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFornecedorInfo)
                    .addComponent(txtNovoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        // Somente confirma o processo se o usuário selecionar sim.
        if (JOptionPane.showConfirmDialog(rootPane, "Os dados serão modificados."
                + "\nDeseja continuar?") == 0) {

            // Instanciando fábrica
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");

            // Instanciando gerenciador
            EntityManager manager = factory.createEntityManager();

            // Instanciando novo objeto tarefa
            Tarefa novaTarefa = new Tarefa();

            // Escrevendo atributos
            novaTarefa.setId(tarefa.getId());
            novaTarefa.setNome(txtNovoNome.getText());
            novaTarefa.setQuantidade((Integer) spnNovaQuantidade.getValue());
            novaTarefa.setDescricao(txtNovaDescricao.getText());
            novaTarefa.setFornecedor(txtNovoFornecedor.getText());

            // Gravando no banco de dados
            manager.getTransaction().begin();
            manager.merge(novaTarefa);
            manager.getTransaction().commit();

            manager.close();
            factory.close();
            
            // Mensagem de sucesso.
            JOptionPane.showMessageDialog(rootPane, "Dados alterados com sucesso!");

        } else {
            
            // Se o usuário não confirmar o processo, exibe mensagem de cancelamento.
            JOptionPane.showMessageDialog(rootPane, "Edição cancelada." +
                    "\nOs dados não foram alterados.");
            
        }

        // Oculta a tela atual e exibe a tela principal novamente.
        this.setVisible(false);
        new TelaTarefas().setVisible(true);

    }//GEN-LAST:event_btnConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEditarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarTarefa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNomeInfo;
    private javax.swing.JLabel lblQuantidadeInfo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSpinner spnNovaQuantidade;
    private javax.swing.JPanel sprLinha;
    private javax.swing.JLabel txtFornecedorInfo;
    private javax.swing.JTextField txtNovaDescricao;
    private javax.swing.JTextField txtNovoFornecedor;
    private javax.swing.JTextField txtNovoNome;
    // End of variables declaration//GEN-END:variables
}
