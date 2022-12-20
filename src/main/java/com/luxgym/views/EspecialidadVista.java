package com.luxgym.views;

import com.luxgym.controllers.EspecialidadControlador;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EspecialidadVista extends javax.swing.JFrame {

    int xMouse, yMouse;

    public EspecialidadVista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        favicon = new javax.swing.JLabel();
        favicon1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        iddocente = new javax.swing.JLabel();
        txtIdEspecialidad = new javax.swing.JTextField();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JPanel();
        agregarBtnTxt = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JPanel();
        buscarBtnTxt = new javax.swing.JLabel();
        deletelBtn = new javax.swing.JPanel();
        deleteBtnTxt = new javax.swing.JLabel();
        updateBtn = new javax.swing.JPanel();
        updateBtnTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEspecialidad = new javax.swing.JTable();
        txtDescripcion = new javax.swing.JTextField();
        panel5 = new javax.swing.JPanel();
        nombrelbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        favicon.setBackground(new java.awt.Color(187, 155, 107));
        favicon.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        favicon.setForeground(new java.awt.Color(0, 0, 51));
        favicon.setText("Panel de Especialidades");
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        favicon1.setBackground(new java.awt.Color(187, 155, 107));
        favicon1.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        favicon1.setForeground(new java.awt.Color(0, 0, 51));
        favicon1.setText("LUX GYM");
        bg.add(favicon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        panel.setBackground(new java.awt.Color(204, 255, 255));
        panel.setBorder(new javax.swing.border.MatteBorder(null));

        iddocente.setBackground(new java.awt.Color(255, 204, 255));
        iddocente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        iddocente.setForeground(new java.awt.Color(0, 0, 153));
        iddocente.setText("ID Especialidad");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(iddocente)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(iddocente))
        );

        bg.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 160, 20));

        txtIdEspecialidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtIdEspecialidad.setForeground(new java.awt.Color(0, 0, 0));
        txtIdEspecialidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdEspecialidad.setCaretColor(new java.awt.Color(0, 51, 204));
        txtIdEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdEspecialidadMousePressed(evt);
            }
        });
        txtIdEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEspecialidadActionPerformed(evt);
            }
        });
        bg.add(txtIdEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 270, 30));

        exitBtn.setBackground(new java.awt.Color(102, 102, 102));

        exitTxt.setBackground(new java.awt.Color(255, 255, 255));
        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        agregarBtn.setBackground(new java.awt.Color(182, 249, 205));
        agregarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        agregarBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        agregarBtnTxt.setForeground(new java.awt.Color(79, 209, 123));
        agregarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarBtnTxt.setText("AGREGAR");
        agregarBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 209, 123), 2));
        agregarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout agregarBtnLayout = new javax.swing.GroupLayout(agregarBtn);
        agregarBtn.setLayout(agregarBtnLayout);
        agregarBtnLayout.setHorizontalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(agregarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(agregarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        agregarBtnLayout.setVerticalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(agregarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(agregarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(agregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 120, 50));

        buscarBtn.setBackground(new java.awt.Color(197, 218, 249));
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buscarBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        buscarBtnTxt.setForeground(new java.awt.Color(91, 150, 238));
        buscarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarBtnTxt.setText("BUSCAR");
        buscarBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(91, 150, 238), 2));
        buscarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarBtnLayout = new javax.swing.GroupLayout(buscarBtn);
        buscarBtn.setLayout(buscarBtnLayout);
        buscarBtnLayout.setHorizontalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buscarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(buscarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        buscarBtnLayout.setVerticalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buscarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(buscarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 120, 50));

        deletelBtn.setBackground(new java.awt.Color(249, 206, 206));
        deletelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletelBtn.setPreferredSize(new java.awt.Dimension(120, 50));

        deleteBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        deleteBtnTxt.setForeground(new java.awt.Color(239, 71, 71));
        deleteBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteBtnTxt.setText("ELIMINAR");
        deleteBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 71, 71), 2));
        deleteBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout deletelBtnLayout = new javax.swing.GroupLayout(deletelBtn);
        deletelBtn.setLayout(deletelBtnLayout);
        deletelBtnLayout.setHorizontalGroup(
            deletelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(deletelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletelBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deleteBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        deletelBtnLayout.setVerticalGroup(
            deletelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(deletelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletelBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deleteBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(deletelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, -1, -1));

        updateBtn.setBackground(new java.awt.Color(255, 255, 204));
        updateBtn.setForeground(new java.awt.Color(102, 102, 102));
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.setPreferredSize(new java.awt.Dimension(120, 50));

        updateBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        updateBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        updateBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateBtnTxt.setText("ACTUALIZAR");
        updateBtnTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        updateBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout updateBtnLayout = new javax.swing.GroupLayout(updateBtn);
        updateBtn.setLayout(updateBtnLayout);
        updateBtnLayout.setHorizontalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBtnLayout.createSequentialGroup()
                .addComponent(updateBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        updateBtnLayout.setVerticalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBtnLayout.createSequentialGroup()
                .addComponent(updateBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, -1, -1));

        tableEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCION"
            }
        ));
        jScrollPane1.setViewportView(tableEspecialidad);
        if (tableEspecialidad.getColumnModel().getColumnCount() > 0) {
            tableEspecialidad.getColumnModel().getColumn(0).setResizable(false);
            tableEspecialidad.getColumnModel().getColumn(1).setResizable(false);
            tableEspecialidad.getColumnModel().getColumn(1).setPreferredWidth(130);
        }

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 510));

        txtDescripcion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDescripcion.setCaretColor(new java.awt.Color(0, 51, 204));
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionMousePressed(evt);
            }
        });
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        bg.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 270, 30));

        panel5.setBackground(new java.awt.Color(204, 255, 255));
        panel5.setBorder(new javax.swing.border.MatteBorder(null));

        nombrelbl1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrelbl1.setForeground(new java.awt.Color(0, 0, 153));
        nombrelbl1.setText("Descripcion");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nombrelbl1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(nombrelbl1))
        );

        bg.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked

    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.black);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(new Color(102, 102, 102));
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseExited

    private void agregarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarBtnTxtMouseEntered
        agregarBtn.setBackground(new Color(79, 209, 123));
        agregarBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_agregarBtnTxtMouseEntered

    private void agregarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarBtnTxtMouseExited
        agregarBtn.setBackground(new Color(182, 249, 205));
        agregarBtnTxt.setForeground(new Color(79, 209, 123));
    }//GEN-LAST:event_agregarBtnTxtMouseExited

    private void agregarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarBtnTxtMouseClicked
    }//GEN-LAST:event_agregarBtnTxtMouseClicked

    private void buscarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnTxtMouseClicked

    }//GEN-LAST:event_buscarBtnTxtMouseClicked

    private void buscarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnTxtMouseEntered
        buscarBtn.setBackground(new Color(91, 150, 238));
        buscarBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_buscarBtnTxtMouseEntered

    private void buscarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnTxtMouseExited
        buscarBtn.setBackground(new Color(197, 218, 249));
        buscarBtnTxt.setForeground(new Color(91, 150, 238));
    }//GEN-LAST:event_buscarBtnTxtMouseExited

    private void deleteBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxtMouseClicked

    }//GEN-LAST:event_deleteBtnTxtMouseClicked

    private void deleteBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxtMouseEntered
        deletelBtn.setBackground(new Color(239, 71, 71));
        deleteBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_deleteBtnTxtMouseEntered

    private void deleteBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxtMouseExited
        deletelBtn.setBackground(new Color(249, 206, 206));
        deleteBtnTxt.setForeground(new Color(239, 71, 71));
    }//GEN-LAST:event_deleteBtnTxtMouseExited

    private void txtIdEspecialidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdEspecialidadMousePressed

    }//GEN-LAST:event_txtIdEspecialidadMousePressed

    private void txtIdEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEspecialidadActionPerformed

    private void updateBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnTxtMouseClicked

    }//GEN-LAST:event_updateBtnTxtMouseClicked

    private void updateBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnTxtMouseEntered
        updateBtn.setBackground(Color.white);
        updateBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_updateBtnTxtMouseEntered

    private void updateBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnTxtMouseExited
        updateBtn.setBackground(new Color(255, 255, 204));
        updateBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_updateBtnTxtMouseExited

    private void txtDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMousePressed

    }//GEN-LAST:event_txtDescripcionMousePressed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        EspecialidadVista vista = new EspecialidadVista();
        EspecialidadControlador controlador = new EspecialidadControlador(vista);
        vista.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarBtn;
    public javax.swing.JLabel agregarBtnTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel buscarBtn;
    public javax.swing.JLabel buscarBtnTxt;
    public javax.swing.JLabel deleteBtnTxt;
    private javax.swing.JPanel deletelBtn;
    private javax.swing.JPanel exitBtn;
    public javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JLabel favicon1;
    private javax.swing.JLabel iddocente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombrelbl1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel5;
    public javax.swing.JTable tableEspecialidad;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtIdEspecialidad;
    private javax.swing.JPanel updateBtn;
    public javax.swing.JLabel updateBtnTxt;
    // End of variables declaration//GEN-END:variables
}
