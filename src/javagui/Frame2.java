/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

/**
 *
 * @author ASUS
 */
public class Frame2 extends javax.swing.JFrame {

  
   public Frame2(String name, String kelab, String absent, String jurusan, String omah){
       initComponents();
       Nama.setText(name);
       Absen.setText(absent);
       Kelas.setText(kelab);
       Jurusan.setText(jurusan);
       Alamat.setText(omah);
    

   
    }

    private Frame2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        Nama = new javax.swing.JLabel();
        Absen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Kelas = new javax.swing.JLabel();
        Jurusan = new javax.swing.JLabel();
        Alamat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Biodata");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 10, 166, 39);

        Nama.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Nama.setForeground(new java.awt.Color(204, 204, 204));
        Nama.setText("Nama");
        jPanel1.add(Nama);
        Nama.setBounds(30, 60, 110, 30);

        Absen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Absen.setForeground(new java.awt.Color(204, 204, 204));
        Absen.setText("Absen");
        jPanel1.add(Absen);
        Absen.setBounds(30, 100, 120, 30);

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 100, 60, 20);

        Kelas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Kelas.setForeground(new java.awt.Color(204, 204, 204));
        Kelas.setText("Kelas");
        jPanel1.add(Kelas);
        Kelas.setBounds(30, 150, 90, 30);

        Jurusan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Jurusan.setForeground(new java.awt.Color(204, 204, 204));
        Jurusan.setText("Jurusan");
        jPanel1.add(Jurusan);
        Jurusan.setBounds(30, 200, 110, 30);

        Alamat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Alamat.setForeground(new java.awt.Color(204, 204, 204));
        Alamat.setText("Alamat");
        jPanel1.add(Alamat);
        Alamat.setBounds(30, 250, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 340);

        setBounds(0, 0, 494, 380);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Absen;
    private javax.swing.JLabel Alamat;
    private javax.swing.JLabel Jurusan;
    private javax.swing.JLabel Kelas;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
