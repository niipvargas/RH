package rhescola.Visualização;

import Modelo.Coordenador;
import Modelo.Funcionario;
import Modelo.Professor;
import javax.swing.JOptionPane;
import rhescola.RH;
import static rhescola.RH.ListaPessoas;

public class CadastroFunc extends javax.swing.JFrame {

    public CadastroFunc() {
        initComponents();
        camposelecionavel.setVisible(false);
        textosel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipofunc = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomefunc = new javax.swing.JTextField();
        cpffunc = new javax.swing.JTextField();
        endfunc = new javax.swing.JTextField();
        botaoCad = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        salfunc = new javax.swing.JTextField();
        prof = new javax.swing.JRadioButton();
        coor = new javax.swing.JRadioButton();
        textosel = new javax.swing.JTextField();
        camposelecionavel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO FUNCIONÁRIO");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("CADASTRO DE FUNCIONÁRIO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NOME COMPLETO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ENDEREÇO:");

        nomefunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cpffunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cpffunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpffuncActionPerformed(evt);
            }
        });

        endfunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        botaoCad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoCad.setText("CADASTRAR");
        botaoCad.setEnabled(false);
        botaoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("SALÁRIO:");

        salfunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tipofunc.add(prof);
        prof.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prof.setText("PROFESSOR");
        prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profActionPerformed(evt);
            }
        });

        tipofunc.add(coor);
        coor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coor.setText("COORDENADOR");
        coor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coorActionPerformed(evt);
            }
        });

        textosel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        camposelecionavel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        camposelecionavel.setText("DEPATARMENTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(prof)
                        .addGap(18, 18, 18)
                        .addComponent(coor))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(botaoCad)))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(camposelecionavel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textosel)
                            .addComponent(salfunc)
                            .addComponent(endfunc)
                            .addComponent(nomefunc)
                            .addComponent(cpffunc))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomefunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpffunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(salfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prof)
                    .addComponent(coor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camposelecionavel)
                    .addComponent(textosel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoCad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cpffuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpffuncActionPerformed
        
    }//GEN-LAST:event_cpffuncActionPerformed

    private void botaoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadActionPerformed
        String nome = nomefunc.getText();
        String cpf = cpffunc.getText();
        String endereco = endfunc.getText();
        String salario = salfunc.getText();
        double salarioConvertido = Double.parseDouble(salario);
        String codigo = "";
        String cursodep = this.camposelecionavel.getText();
        
        boolean profSelecionado = prof.isSelected();
        boolean coorSelecionado = coor.isSelected();
        
        if(profSelecionado == true){
            Professor p = new Professor(cursodep, codigo, salarioConvertido, nome, cpf, endereco);
            RH.ListaPessoas.add(p);
            JOptionPane.showMessageDialog(rootPane, "CADASTRO DE PROFESSOR CONCLUÍDO");
        }else{
            Coordenador c = new Coordenador(cursodep, codigo, salarioConvertido, nome, cpf, endereco);
            RH.ListaPessoas.add(c);
            JOptionPane.showMessageDialog(rootPane, "CADASTRO DE COORDENADOR CONCLUÍDO");
        }
     
        nomefunc.setText("");
        cpffunc.setText("");
        endfunc.setText("");
        salfunc.setText("");
        textosel.setText("");
         
       
    }//GEN-LAST:event_botaoCadActionPerformed

    private void coorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coorActionPerformed
       camposelecionavel.setVisible(true);
       textosel.setVisible(true);  
       camposelecionavel.setText("CURSO");
       
       botaoCad.setEnabled(true);
    }//GEN-LAST:event_coorActionPerformed

    private void profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profActionPerformed
        camposelecionavel.setVisible(true);
        textosel.setVisible(true);  
        camposelecionavel.setText("DEPARTAMENTO");
        
        botaoCad.setEnabled(true);
    }//GEN-LAST:event_profActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCad;
    private javax.swing.JLabel camposelecionavel;
    private javax.swing.JRadioButton coor;
    private javax.swing.JTextField cpffunc;
    private javax.swing.JTextField endfunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nomefunc;
    private javax.swing.JRadioButton prof;
    private javax.swing.JTextField salfunc;
    private javax.swing.JTextField textosel;
    private javax.swing.ButtonGroup tipofunc;
    // End of variables declaration//GEN-END:variables
}
