package jogolutadores;

/**
 *
 * @author Lucas Bastos
 */
public class JogoLutadores extends javax.swing.JFrame {

    // Instanciando vetor de lutador e objeto de luta.
    Lutador l[] = new Lutador[6];
    Luta fight = new Luta();
    
    /**
     * Creates new form JogoLutadores
     */
    public JogoLutadores() {
        // Instanciando os lutadores.
        l[0] = new Lutador("João", "Brasil", 30, 1.80f, 90.0f, 9, 1, 2);
        l[1] = new Lutador("Peter", "EUA", 29, 1.78f, 87.0f, 8, 0, 4);
        l[2] = new Lutador("Sasuke", "Japão", 32, 1.82f, 82.0f, 9, 0, 3);
        l[3] = new Lutador("Diego", "Espanha", 25, 1.75f, 80.0f, 7, 1, 5);
        l[4] = new Lutador("Fibonacci", "Itália", 35, 1.79f,  89.0f, 10, 2, 0);
        l[5] = new Lutador("Rashford", "Inglaterra", 31, 1.90f, 92.0f, 10, 1, 1);
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
        cbbDesafiado = new javax.swing.JComboBox<>();
        cbbDesafiante = new javax.swing.JComboBox<>();
        lblDesafiadoInfo = new javax.swing.JLabel();
        lblDesafianteInfo = new javax.swing.JLabel();
        btnLutar = new javax.swing.JButton();
        lblUltimoVencedor = new javax.swing.JLabel();
        btnStatusDesafiado = new javax.swing.JButton();
        btnStatusDesafiante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitulo.setText("FIGHT SIMULATOR");

        cbbDesafiado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "João", "Peter", "Sasuke", "Diego", "Fibonacci", "Rashford" }));

        cbbDesafiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "João", "Peter", "Sasuke", "Diego", "Fibonacci", "Rashford" }));

        lblDesafiadoInfo.setText("Selecione o desafiado:");

        lblDesafianteInfo.setText("Selecione o desafiante:");

        btnLutar.setBackground(new java.awt.Color(153, 0, 0));
        btnLutar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLutar.setForeground(new java.awt.Color(204, 255, 255));
        btnLutar.setText("Lutar!");
        btnLutar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLutar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLutarActionPerformed(evt);
            }
        });

        lblUltimoVencedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUltimoVencedor.setText("Último vencedor: - - -");

        btnStatusDesafiado.setText("Ver status");
        btnStatusDesafiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusDesafiadoActionPerformed(evt);
            }
        });

        btnStatusDesafiante.setText("Ver status");
        btnStatusDesafiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusDesafianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblDesafiadoInfo)
                        .addGap(83, 83, 83)
                        .addComponent(lblDesafianteInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnLutar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblUltimoVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbDesafiado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStatusDesafiado))
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbbDesafiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStatusDesafiante))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitulo)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDesafiadoInfo)
                    .addComponent(lblDesafianteInfo))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbDesafiado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbDesafiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStatusDesafiado)
                    .addComponent(btnStatusDesafiante))
                .addGap(25, 25, 25)
                .addComponent(btnLutar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUltimoVencedor)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLutarActionPerformed
        // Pegando o índice da ComboBox para acessar o vetor de lutadores.
        Lutador l1 = l[cbbDesafiado.getSelectedIndex()];
        Lutador l2 = l[cbbDesafiante.getSelectedIndex()];
        
        // Chamando método marcar luta para os lutadores selecionados.
        fight.marcarLuta(l1, l2);
        
        // Chamando método lutar.
        fight.lutar();
        
        // Exibindo o último vencedor no label.
        if(fight.isAprovada()) {
            lblUltimoVencedor.setText("Último vencedor: " + fight.getNomeVencedor());
        }
    }//GEN-LAST:event_btnLutarActionPerformed

    private void btnStatusDesafiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusDesafiadoActionPerformed
        // Pegando índice selecionado na ComboBox para exibir status do desafiado.
        Lutador lut = l[cbbDesafiado.getSelectedIndex()];
        lut.status();
    }//GEN-LAST:event_btnStatusDesafiadoActionPerformed

    private void btnStatusDesafianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusDesafianteActionPerformed
        // Pegando índice selecionado na ComboBox para exibir status do desafiante.
        Lutador lut = l[cbbDesafiante.getSelectedIndex()];
        lut.status();
    }//GEN-LAST:event_btnStatusDesafianteActionPerformed

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
            java.util.logging.Logger.getLogger(JogoLutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoLutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoLutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoLutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoLutadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLutar;
    private javax.swing.JButton btnStatusDesafiado;
    private javax.swing.JButton btnStatusDesafiante;
    private javax.swing.JComboBox<String> cbbDesafiado;
    private javax.swing.JComboBox<String> cbbDesafiante;
    private javax.swing.JLabel lblDesafiadoInfo;
    private javax.swing.JLabel lblDesafianteInfo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUltimoVencedor;
    // End of variables declaration//GEN-END:variables
}
