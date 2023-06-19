package com.mycompany.pro1.vista;

import java.awt.Dimension;



/**
 *
 * @author zarpa
 */
public class InterGestionarCategoria extends javax.swing.JInternalFrame {


    public InterGestionarCategoria() {
        initComponents();
        this.setSize(new Dimension(600, 400));
        this.setTitle("Gestionar Categoria");



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_categorias = new javax.swing.JTable();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton_buscar = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Administrar Categorias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_categorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_categorias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 250));

        jButton_actualizar.setBackground(new java.awt.Color(204, 255, 255));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 110, 30));

        jButton_eliminar.setBackground(new java.awt.Color(204, 255, 255));
        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 170, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/numero2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jButton_buscar.setBackground(new java.awt.Color(204, 255, 255));
        jButton_buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_buscar.setText("Buscar");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 110, 30));

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_id.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 60, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Descripcion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
     
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_actualizar;
    public javax.swing.JButton jButton_buscar;
    public javax.swing.JButton jButton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_categorias;
    public javax.swing.JTextField txt_descripcion;
    public javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables

    /*
    *
    *metodo para mostrar  todas las categorias registradas
     */
}