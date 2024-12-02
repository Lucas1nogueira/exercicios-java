package br.com.ifba.exerciciocrud.tarefa.view;

import br.com.ifba.exerciciocrud.infrastructure.view.*;
import br.com.ifba.exerciciocrud.tarefa.model.Tarefa;
import br.com.ifba.exerciciocrud.infrastructure.service.FacadeInstance;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author curso
 */
public class TelaCriarTarefa extends javax.swing.JFrame {

    /**
     * Creates new form TelaCriarTarefa
     */
    public TelaCriarTarefa() {
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

        lblTitulo = new javax.swing.JLabel();
        sprLinha = new javax.swing.JSeparator();
        lblQuantidadeInfo = new javax.swing.JLabel();
        lblDescricaoInfo = new javax.swing.JLabel();
        lblNomeInfo = new javax.swing.JLabel();
        lblFornecedorInfo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JTextField();
        spnQuantidade = new javax.swing.JSpinner();
        pnlPainel = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setText("CRIAR NOVA TAREFA");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 23, -1, -1));
        getContentPane().add(sprLinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 51, 287, 10));

        lblQuantidadeInfo.setForeground(new java.awt.Color(204, 204, 204));
        lblQuantidadeInfo.setText("Quantidade:");
        getContentPane().add(lblQuantidadeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 127, -1, -1));

        lblDescricaoInfo.setForeground(new java.awt.Color(204, 204, 204));
        lblDescricaoInfo.setText("Descrição:");
        getContentPane().add(lblDescricaoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 167, -1, -1));

        lblNomeInfo.setForeground(new java.awt.Color(204, 204, 204));
        lblNomeInfo.setText("Nome:");
        getContentPane().add(lblNomeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 87, -1, -1));

        lblFornecedorInfo.setForeground(new java.awt.Color(204, 204, 204));
        lblFornecedorInfo.setText("Fornecedor:");
        getContentPane().add(lblFornecedorInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 207, -1, -1));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 84, 200, -1));
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 164, 200, -1));
        getContentPane().add(txtFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 204, 200, -1));

        spnQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(spnQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 124, 80, -1));

        pnlPainel.setBackground(new java.awt.Color(0, 0, 0));

        btnConfirmar.setBackground(new java.awt.Color(0, 0, 51));
        btnConfirmar.setForeground(new java.awt.Color(204, 204, 204));
        btnConfirmar.setText("OK");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPainelLayout = new javax.swing.GroupLayout(pnlPainel);
        pnlPainel.setLayout(pnlPainelLayout);
        pnlPainelLayout.setHorizontalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainelLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(129, 129, 129))
        );
        pnlPainelLayout.setVerticalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainelLayout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(21, 21, 21))
        );

        getContentPane().add(pnlPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        // Instanciando novo objeto tarefa
        Tarefa tar = new Tarefa();
        tar.setNome(txtNome.getText());
        tar.setQuantidade((Integer) spnQuantidade.getValue());
        tar.setDescricao(txtDescricao.getText());
        tar.setFornecedor(txtFornecedor.getText());
        
        // Pesquisando por nome de tarefa no banco de dados
        List<Tarefa> resultado = FacadeInstance.getInstance().buscarTarefa(tar.getNome());
        
        // Verifica se já existe tarefa de mesmo nome (lista não vazia)
        if (!resultado.isEmpty() && !tar.getNome().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Já existe um item de mesmo nome."
                    + "\nPor favor, selecione outro nome.");

        } else {

            // Insere nova tarefa no banco de dados
            FacadeInstance.getInstance().inserirTarefa(tar);
            
            // Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(rootPane, "Item gravado com sucesso!");

        }

        // Oculta a tela de cadastro e exibe a tela principal novamente
        this.setVisible(false);
        new Homescreen().setVisible(true);

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
            java.util.logging.Logger.getLogger(TelaCriarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarTarefa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel lblDescricaoInfo;
    private javax.swing.JLabel lblFornecedorInfo;
    private javax.swing.JLabel lblNomeInfo;
    private javax.swing.JLabel lblQuantidadeInfo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPainel;
    private javax.swing.JSpinner spnQuantidade;
    private javax.swing.JSeparator sprLinha;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
