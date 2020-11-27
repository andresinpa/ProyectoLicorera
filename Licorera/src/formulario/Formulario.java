package formulario;

/**
 * Jesus Andres Infante Paez Version 1 26/11/2020 Programa: Licorera
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {

    PreparedStatement pS;
    ResultSet rS;
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/dbLicorera";

    public Formulario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Connection getConnection() { //Este metodo nnos retorn la conexion
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conexion establecida con la DB");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar con la base de datos " + e);
        }
        return conn;

    }

    //metodo para desconectar
    public void desconectar() {
        conn = null;
        if (conn == null) {
            System.out.println("Se desconecto de la DB");
        }
    }

    public void BorrarTextField() {
        fNombre.setText(null);
        fDocum.setText(null);
        fLicor.setText(null);
        fTelefono.setText(null);
        boxEdad.setSelectedIndex(0);
        boxSexo.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lFormulario = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        fNombre = new javax.swing.JTextField();
        lDocumento = new javax.swing.JLabel();
        fDocum = new javax.swing.JTextField();
        lEdad = new javax.swing.JLabel();
        boxEdad = new javax.swing.JComboBox<>();
        lTelefono = new javax.swing.JLabel();
        fTelefono = new javax.swing.JTextField();
        lSexo = new javax.swing.JLabel();
        boxSexo = new javax.swing.JComboBox<>();
        lLicor = new javax.swing.JLabel();
        fLicor = new javax.swing.JTextField();
        lLogo = new javax.swing.JLabel();
        bConectar = new javax.swing.JButton();
        bDesconectar = new javax.swing.JButton();
        bEnviar = new javax.swing.JButton();
        lFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(510, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lTitulo.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 18)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(51, 0, 51));
        lTitulo.setText("LICORERA LGSUS ");
        getContentPane().add(lTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("\"LICOR Y AMIGOS LA MEZCLA PERFECTA\"");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        lFormulario.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        lFormulario.setText("Formulario de Registro");
        getContentPane().add(lFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        lNombre.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lNombre.setForeground(new java.awt.Color(102, 0, 0));
        lNombre.setText("Nombre: ");
        getContentPane().add(lNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        fNombre.setBackground(new java.awt.Color(255, 255, 153));
        fNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNombreActionPerformed(evt);
            }
        });
        getContentPane().add(fNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, -1));

        lDocumento.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lDocumento.setForeground(new java.awt.Color(102, 0, 0));
        lDocumento.setText("Numero Documento: ");
        getContentPane().add(lDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        fDocum.setBackground(new java.awt.Color(255, 255, 153));
        fDocum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(fDocum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 120, -1));

        lEdad.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lEdad.setForeground(new java.awt.Color(102, 0, 0));
        lEdad.setText("Edad: ");
        getContentPane().add(lEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        boxEdad.setBackground(new java.awt.Color(255, 255, 153));
        boxEdad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boxEdad.setForeground(new java.awt.Color(255, 255, 153));
        boxEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "18 - 25", "26 - 35", "36- 48", "Mayor a 48" }));
        getContentPane().add(boxEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        lTelefono.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lTelefono.setForeground(new java.awt.Color(102, 0, 0));
        lTelefono.setText("Telefono: ");
        getContentPane().add(lTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 20));

        fTelefono.setBackground(new java.awt.Color(255, 255, 153));
        fTelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(fTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 180, -1));

        lSexo.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lSexo.setForeground(new java.awt.Color(102, 0, 0));
        lSexo.setText("Sexo: ");
        getContentPane().add(lSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        boxSexo.setBackground(new java.awt.Color(255, 255, 153));
        boxSexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boxSexo.setForeground(new java.awt.Color(255, 255, 153));
        boxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "M", "F" }));
        getContentPane().add(boxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        lLicor.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        lLicor.setForeground(new java.awt.Color(102, 0, 0));
        lLicor.setText("Licor preferido: ");
        getContentPane().add(lLicor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        fLicor.setBackground(new java.awt.Color(255, 255, 153));
        fLicor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(fLicor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 160, -1));

        lLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.PNG"))); // NOI18N
        getContentPane().add(lLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        bConectar.setBackground(new java.awt.Color(255, 255, 153));
        bConectar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bConectar.setForeground(new java.awt.Color(51, 0, 51));
        bConectar.setText("CONECTAR");
        bConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConectarActionPerformed(evt);
            }
        });
        getContentPane().add(bConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        bDesconectar.setBackground(new java.awt.Color(255, 255, 153));
        bDesconectar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bDesconectar.setForeground(new java.awt.Color(51, 0, 51));
        bDesconectar.setText("DESCONECTAR");
        bDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDesconectarActionPerformed(evt);
            }
        });
        getContentPane().add(bDesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        bEnviar.setBackground(new java.awt.Color(255, 255, 153));
        bEnviar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bEnviar.setForeground(new java.awt.Color(51, 0, 51));
        bEnviar.setText("ENVIAR");
        bEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(bEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        lFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(lFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNombreActionPerformed

    }//GEN-LAST:event_fNombreActionPerformed

    private void bDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDesconectarActionPerformed
        desconectar();
    }//GEN-LAST:event_bDesconectarActionPerformed

    private void bEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarActionPerformed
        Connection conn = null;
        try {

            conn = getConnection();
            if (fNombre.getText().trim().isEmpty() ||fDocum.getText().trim().isEmpty() ||fTelefono.getText().trim().isEmpty()
                || fLicor.getText().trim().isEmpty() ||boxEdad.getSelectedItem().toString() == "" || boxSexo.getSelectedItem().toString() == "") {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            } else {
                pS = conn.prepareStatement("insert into tabla (Nombre, NumeroDocumento, Edad, Sexo, Telefono, LicorPreferido, FechaReg)VALUES(?,?,?,?,?,?,?)");
                pS.setString(1, fNombre.getText().trim()); //trim() para eliminar espacios iniciales
                pS.setLong(2, Long.parseLong(fDocum.getText().trim()));
                pS.setString(3, boxEdad.getSelectedItem().toString());
                pS.setString(4, boxSexo.getSelectedItem().toString());
                pS.setLong(5, Long.parseLong(fTelefono.getText().trim()));
                pS.setString(6, fLicor.getText().trim());
                pS.setDate(7, Date.valueOf(LocalDate.now()));
            }

            int result = pS.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Los datos fueron enviados correctamente");
                BorrarTextField();
            } else {
                JOptionPane.showMessageDialog(null, "Los datos no fueron enviados");
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("No se han llenado todos los campos o hay un error " + e);
        }

    }//GEN-LAST:event_bEnviarActionPerformed

    private void bConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConectarActionPerformed
        Connection reg = getConnection();
    }//GEN-LAST:event_bConectarActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConectar;
    private javax.swing.JButton bDesconectar;
    private javax.swing.JButton bEnviar;
    private javax.swing.JComboBox<String> boxEdad;
    private javax.swing.JComboBox<String> boxSexo;
    private javax.swing.JTextField fDocum;
    private javax.swing.JTextField fLicor;
    private javax.swing.JTextField fNombre;
    private javax.swing.JTextField fTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lDocumento;
    private javax.swing.JLabel lEdad;
    private javax.swing.JLabel lFondo;
    private javax.swing.JLabel lFormulario;
    private javax.swing.JLabel lLicor;
    private javax.swing.JLabel lLogo;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lSexo;
    private javax.swing.JLabel lTelefono;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}
