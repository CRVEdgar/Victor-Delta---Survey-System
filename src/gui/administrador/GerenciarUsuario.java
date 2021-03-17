/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.administrador;

/**
 *
 * @author Edgar
 */
public class GerenciarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form GerenciarUsuario
     */
    public GerenciarUsuario() {
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

        DesktopPaneGerenciarUsuario = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemCadastrarUsuario = new javax.swing.JMenuItem();
        MenuItemApagarUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItemAtualizarUsuario = new javax.swing.JMenuItem();
        MenuItemGerarNovaSenha = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        javax.swing.GroupLayout DesktopPaneGerenciarUsuarioLayout = new javax.swing.GroupLayout(DesktopPaneGerenciarUsuario);
        DesktopPaneGerenciarUsuario.setLayout(DesktopPaneGerenciarUsuarioLayout);
        DesktopPaneGerenciarUsuarioLayout.setHorizontalGroup(
            DesktopPaneGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
        );
        DesktopPaneGerenciarUsuarioLayout.setVerticalGroup(
            DesktopPaneGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        MenuItemCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-usuário-masculino-32.png"))); // NOI18N
        MenuItemCadastrarUsuario.setText("Cadastrar Novo Usuário");
        MenuItemCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCadastrarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemCadastrarUsuario);

        MenuItemApagarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remover-usuário-masculino-32.png"))); // NOI18N
        MenuItemApagarUsuario.setText("Apagar Usuário");
        MenuItemApagarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemApagarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemApagarUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Atualizacao");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        MenuItemAtualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-alterar-usuário-masculino-32.png"))); // NOI18N
        MenuItemAtualizarUsuario.setText("Formulário de Atualização");
        MenuItemAtualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAtualizarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemAtualizarUsuario);

        MenuItemGerarNovaSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-grand-master-key-20.png"))); // NOI18N
        MenuItemGerarNovaSenha.setText("Gerar Nova Senha para Operador");
        MenuItemGerarNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGerarNovaSenhaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemGerarNovaSenha);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPaneGerenciarUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPaneGerenciarUsuario)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastrarUsuarioActionPerformed
        CadastrarUsuario tela = new CadastrarUsuario();
        
        GerenciarUsuario.DesktopPaneGerenciarUsuario.add(tela);
        
        tela.setVisible(true);
    }//GEN-LAST:event_MenuItemCadastrarUsuarioActionPerformed

    private void MenuItemApagarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemApagarUsuarioActionPerformed
        ApagarUsuario tela = new ApagarUsuario();
        
        GerenciarUsuario.DesktopPaneGerenciarUsuario.add(tela);
        
        tela.setVisible(true);
    }//GEN-LAST:event_MenuItemApagarUsuarioActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void MenuItemAtualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAtualizarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemAtualizarUsuarioActionPerformed

    private void MenuItemGerarNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGerarNovaSenhaActionPerformed
        GerarNovaSenha tela = new GerarNovaSenha();
        
        GerenciarUsuario.DesktopPaneGerenciarUsuario.add(tela);
        
        tela.setVisible(true);
    }//GEN-LAST:event_MenuItemGerarNovaSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane DesktopPaneGerenciarUsuario;
    private javax.swing.JMenuItem MenuItemApagarUsuario;
    private javax.swing.JMenuItem MenuItemAtualizarUsuario;
    private javax.swing.JMenuItem MenuItemCadastrarUsuario;
    private javax.swing.JMenuItem MenuItemGerarNovaSenha;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
