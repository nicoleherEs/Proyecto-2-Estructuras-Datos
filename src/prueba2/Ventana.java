/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba2;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.Queue;

/**
 *
 * @author admin
 */
public class Ventana extends javax.swing.JFrame {

   DefaultListModel < String> modelo = new DefaultListModel  <>();
   DefaultListModel < String> modelo2 = new DefaultListModel  <>();
   DefaultListModel < String> modelo3 = new DefaultListModel  <>();
   DefaultListModel < String> modelo4 = new DefaultListModel  <>();
    Cola cola1=new Cola();
    Cola2 cola2=new Cola2();
    Cola3 cola3=new Cola3();
    Cola4 cola4=new Cola4();
    /**
     * Creates new form Ventana
     */
   
    public Ventana() {
        initComponents();
        jList1.setModel(modelo);
        jList2.setModel(modelo2);
        jList3.setModel(modelo3);
        jList4.setModel(modelo4);
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
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLnumero1 = new javax.swing.JLabel();
        jLnumero2 = new javax.swing.JLabel();
        jLnumero3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel1.setText("Digite el nombre del cliente ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, 305, 33));

        txtNombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 16, 181, 33));

        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jButton2.setText("Ingresar cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 17, 195, 50));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 180, 210));

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 200, 210));

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 190, 210));

        jButton1.setText("Atender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        jButton3.setText("Atender");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jButton4.setText("Atender");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        jLabel5.setText("Cola #1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel6.setText("Cola #2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jLabel7.setText(" Cola#3");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));
        jPanel1.add(jLnumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, 30));
        jPanel1.add(jLnumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 416, 80, 30));
        jPanel1.add(jLnumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 100, 40));

        jScrollPane4.setViewportView(jList4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 200, 210));

        jLabel3.setText("Cola #4");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, -1, -1));

        jButton5.setText("Atender");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    cola1.extraer();
    cola1.llena_JList(jList1, modelo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       //cliente c= new cliente();
       String nom="";

        nom =txtNombre.getText();
         
 
  
    if(cola1.contar()==0 ){
     cola1.insertar(nom);
     cola1.llena_JList(jList1, modelo);
      JOptionPane.showMessageDialog(null, "La cola 1 fue actualizado");
  
     }  else{
        if(cola2.contar()==0){
            cola2.insertar(nom);
            cola2.llena_Jlist2(jList2, modelo);
        }else{
            if(cola3.contar()==0){
                cola3.insertar(nom);
                cola3.llena_Jlist3(jList3, modelo);
            }else{
                if(cola4.contar()==0){
                    cola4.insertar(nom);
                    cola4.llena_Jlist4(jList4, modelo);
                }else{
                     if(cola1.contar() <cola2.contar()&& cola1.contar()< cola3.contar() && cola1.contar()< cola4.contar())
                      {
                         cola1.insertar(nom);
                         cola1.llena_JList(jList1, modelo);
                      }else{
                              if(cola2.contar()< cola3.contar() && cola2.contar() <cola4.contar() )
                              {
                                  cola2.insertar(nom);
                                  cola2.llena_Jlist2(jList2, modelo);
                              }else
                              {
                                  if(cola3.contar()<cola4.contar()){
                                     cola3.insertar(nom);
                                     cola3.llena_Jlist3(jList3, modelo); 
                                  }else{
                                       cola4.insertar(nom);
                                       cola4.llena_Jlist4(jList4, modelo);
                                  }
                               }
                            }
                    //*****
                }
            }
        }
    }
  
 
  
 //
 // cola1.insertar("s");
//  cola1.insertar("s");
  //cola1.extraer();
  //cola1.estaVacia();
 // cola1.contar();
// if)
 // {
//   JOptionPane.showMessageDialog(null, "JList actualizado");
 // }
  //f()
  
  //{
   //JOptionPane.showMessageDialog(null, "JList actualizado");
  //}
 
 //if(cola2.llena_JList(jList3, modelo3))
  
//{
   //JOptionPane.showMessageDialog(null, "JList actualizado");
  
  //}
 
 
 
 
     
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cola2.extraer();
        cola2.llena_Jlist2(jList2, modelo);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       cola3.extraer();
       cola3.llena_Jlist3(jList3, modelo);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cola4.extraer();
        cola4.llena_Jlist4(jList4, modelo);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JLabel jLnumero1;
    private javax.swing.JLabel jLnumero2;
    private javax.swing.JLabel jLnumero3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
