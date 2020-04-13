/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BD.BdPermissoes;
import Classes.Permissao;
import static View.TelaLogin.cont;
import static View.TelaLogin.id;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author Gabriel-Note
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        BdPermissoes dao = new BdPermissoes();

        Permissao p = dao.perread(id);

       user.setVisible(false);

       edittabela.setVisible(false);
        this.setLocationRelativeTo(null);

        if (cont.equals("admin")) {

         edittabela.setVisible(true);

        }
        if (cont.equals("SuperAdmin")) {
           user.setVisible(true);
            edittabela.setVisible(true);

            URL url = this.getClass().getResource("/Imagens/melc.jpg");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
            this.setIconImage(imagemTitulo);
            this.setTitle("APLICATIVO DE CONTROLADORIA");
            this.setResizable(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Vistable = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        Sair = new javax.swing.JButton();
        user = new javax.swing.JButton();
        edittabela = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(575, 455));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Vistable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Vistable.setText("visualizar tabela");
        Vistable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VistableActionPerformed(evt);
            }
        });
        jPanel1.add(Vistable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 220, 60));

        Usuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Usuario.setText("Menu");
        Usuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                UsuarioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 35, 109, 54));

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jPanel1.add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 110, 30));

        user.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        user.setText("Usuarios");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 220, 60));

        edittabela.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        edittabela.setText("Editar Tabela");
        edittabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittabelaActionPerformed(evt);
            }
        });
        jPanel1.add(edittabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 220, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 590, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 650, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_UsuarioAncestorAdded

    }//GEN-LAST:event_UsuarioAncestorAdded

    private void VistableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistableActionPerformed
        Planilhaviz tl = new Planilhaviz();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VistableActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void edittabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittabelaActionPerformed
 Planilha tl = new Planilha();
        tl.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_edittabelaActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
           paineladm tl = new paineladm();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton Vistable;
    private javax.swing.JButton edittabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}
