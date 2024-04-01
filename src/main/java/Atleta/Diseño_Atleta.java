package Atleta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Diseño_Atleta extends javax.swing.JFrame {
    
    private String Nombre;
    private String Actividad;
    private String Estado;
    private String Nacionalidad;
     
    public Diseño_Atleta() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String actividad) {
        Actividad = actividad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Ingresar = new javax.swing.JButton();
        btn_Mostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Ingresar.setBackground(new java.awt.Color(153, 153, 0));
        btn_Ingresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ingresar.setText("Ingresar Texto");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 160, 110));

        btn_Mostrar.setBackground(new java.awt.Color(153, 153, 0));
        btn_Mostrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Mostrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Mostrar.setText("Mostrar Texto");
        btn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 160, 110));

        jLabel2.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa Texto a un block de notas y despues visualizalo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btn_Salir.setBackground(new java.awt.Color(153, 153, 0));
        btn_Salir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        try {
            File file = new File("Datos.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

                Nombre=JOptionPane.showInputDialog("Dame el Nombre del Atleta");
                bw.write("El Nombre del Atleta es: "+getNombre());

                Actividad=JOptionPane.showInputDialog("Dame la Actividad del atleta");
                bw.write("\nLa Actividad del Atleta es: "+getActividad());

                Estado=JOptionPane.showInputDialog("Dame el Estado del atleta");
                bw.write("\nEL Estado Actual del Atleta es: "+getEstado());

            Nacionalidad=JOptionPane.showInputDialog("Dame la Nacionalidad del Atleta");
            bw.write("\nLa Nacionalidad del Atleta es: "+getNacionalidad());

            bw.close();
            JOptionPane.showInternalMessageDialog(null, "Los Datos Fueron Cargados Con Exito.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void btn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarActionPerformed
       FileReader archivo;
        BufferedReader lector;
        try{
            archivo=new FileReader("Datos.txt");
            if (archivo.ready()) {
                lector=new BufferedReader(archivo);
                String cadena;
                while ((cadena=lector.readLine())!= null) {                    
                    JOptionPane.showMessageDialog(null,cadena);
                }  
            }else{
                JOptionPane.showMessageDialog(null,"El archivo no esta listo para ser leido...");
            }
            JOptionPane.showInternalMessageDialog(null, "Fin del Texto.");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btn_MostrarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Diseño_Atleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diseño_Atleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diseño_Atleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diseño_Atleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diseño_Atleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JButton btn_Mostrar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

