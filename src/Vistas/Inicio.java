/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Inicio extends javax.swing.JFrame {
    
    public static Datos datos;
    public static Gráfico gráfico;
    

    public Inicio() 
    {
        initComponents();
        Start();
    }
    
    private void Start() 
    {
        this.setLocationRelativeTo(null);
         // Desplazar el frame a la izquierda
        int x = 0;
        int y = getLocation().y;
        setLocation(x, y);
        Set_Image( Img_dda, "dda.jpg" );
        Set_Image( Img_UNACH, "UNACH.png" );
        datos = new Datos();
        gráfico = new Gráfico();

    }
    
    public static void ShowContent(JPanel P)
    {
        P.setSize( 1080, 540 );
        P.setLocation( 0,0 );
        
        Content.removeAll();
        Content.add( P ,BorderLayout.CENTER );
        Content.revalidate();
        Content.repaint();
    }
    
    public void Set_Image( JLabel label, String imagen )
    {
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(imagen));
        Image img  = icon.getImage();
        Image imgScale;
        imgScale = img.getScaledInstance(label.getWidth()-2, label.getHeight()-4, Image.SCALE_SMOOTH); 
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }
    
    public static void Msg_error( String mensaje ) 
    {
        JLabel label = new JLabel( mensaje );
        label.setFont(new Font("Monospaced", Font.BOLD , 16));
        label.setForeground(Color.black);
        UIManager UI=new UIManager();
        UI.put("OptionPane.background", Color.lightGray );
        UI.put("Panel.background", Color.lightGray );
        
        JOptionPane.showMessageDialog( null, label, "Mensaje de error", JOptionPane.ERROR_MESSAGE );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        Btn_Start = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Img_dda = new javax.swing.JLabel();
        Encabezado = new javax.swing.JPanel();
        Label_Encuesta = new javax.swing.JLabel();
        Linea = new javax.swing.JLabel();
        Label_Encuesta1 = new javax.swing.JLabel();
        Img_UNACH = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        Content.setBackground(new java.awt.Color(0, 153, 153));
        Content.setPreferredSize(new java.awt.Dimension(690, 540));

        Btn_Start.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Btn_Start.setText("Empezar");
        Btn_Start.setFocusPainted(false);
        Btn_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_StartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 0, 50)); // NOI18N
        jLabel1.setText("Algoritmo DDA");

        Img_dda.setText("Picture");

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(Btn_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel1))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(Img_dda, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Img_dda, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(Btn_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        Encabezado.setBackground(new java.awt.Color(255, 255, 255));

        Label_Encuesta.setFont(new java.awt.Font("sansserif", 1, 40)); // NOI18N
        Label_Encuesta.setForeground(new java.awt.Color(43, 84, 163));
        Label_Encuesta.setText("Graficación");

        Linea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Label_Encuesta1.setFont(new java.awt.Font("sansserif", 1, 40)); // NOI18N
        Label_Encuesta1.setForeground(new java.awt.Color(15, 116, 117));
        Label_Encuesta1.setText("Trazado de lineas_Algoritmo DDA");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_Encuesta1)
                    .addComponent(Label_Encuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Linea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(Img_UNACH, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                .addComponent(Label_Encuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Label_Encuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
            .addComponent(Img_UNACH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Alegría Sanchez Martín de Jesus_A18009");

        jLabel4.setText("Hernández Jiménez Edder Gerardo_A180019");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Equipo No.4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_StartActionPerformed
        ShowContent( datos );
    }//GEN-LAST:event_Btn_StartActionPerformed


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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Start;
    private static javax.swing.JPanel Content;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel Img_UNACH;
    private javax.swing.JLabel Img_dda;
    private javax.swing.JLabel Label_Encuesta;
    private javax.swing.JLabel Label_Encuesta1;
    private javax.swing.JLabel Linea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
