/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author andr6491
 */
public class TaskOrganizer extends javax.swing.JFrame {

    /**
     * Creates new form TaskOrganizer
     */
    ArrayList list = new ArrayList();
    ListIterator<Task> iterator = list.listIterator();

    public TaskOrganizer() {
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

        txtTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        btnLeft = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        btnFarLeft = new javax.swing.JButton();
        btnFarRight = new javax.swing.JButton();
        lblPosition = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmNew = new javax.swing.JMenuItem();
        itmOpen = new javax.swing.JMenuItem();
        itmSave = new javax.swing.JMenuItem();
        itmSaveAs = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmUpdate = new javax.swing.JMenuItem();
        itmClear = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        itmInsertBefore = new javax.swing.JMenuItem();
        itmInsertAfter = new javax.swing.JMenuItem();
        itmAll = new javax.swing.JMenuItem();
        itmRemove = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });

        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        btnLeft.setText("<");
        btnLeft.setEnabled(false);
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });

        btnRight.setText(">");
        btnRight.setEnabled(false);
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });

        btnFarLeft.setText("<<");
        btnFarLeft.setEnabled(false);
        btnFarLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarLeftActionPerformed(evt);
            }
        });

        btnFarRight.setText(">>");
        btnFarRight.setEnabled(false);

        lblPosition.setText("Task 0/0");

        jMenu1.setText("File");

        itmNew.setText("New...");
        jMenu1.add(itmNew);

        itmOpen.setText("Open...");
        jMenu1.add(itmOpen);

        itmSave.setText("Save");
        jMenu1.add(itmSave);

        itmSaveAs.setText("Save As...");
        jMenu1.add(itmSaveAs);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        itmUpdate.setText("Update Current");
        itmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUpdateActionPerformed(evt);
            }
        });
        jMenu2.add(itmUpdate);

        itmClear.setText("Clear");
        jMenu2.add(itmClear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Task");

        jMenu4.setText("Insert...");

        itmInsertBefore.setText("Before Current");
        itmInsertBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmInsertBeforeActionPerformed(evt);
            }
        });
        jMenu4.add(itmInsertBefore);

        itmInsertAfter.setText("After Current");
        jMenu4.add(itmInsertAfter);

        jMenu3.add(jMenu4);

        itmAll.setText("View All");
        jMenu3.add(itmAll);

        itmRemove.setText("Remove");
        itmRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRemoveActionPerformed(evt);
            }
        });
        jMenu3.add(itmRemove);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txtTitle)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFarLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLeft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFarRight))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblPosition)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLeft)
                    .addComponent(btnRight)
                    .addComponent(btnFarRight)
                    .addComponent(btnFarLeft))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPosition)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFarLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarLeftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFarLeftActionPerformed

    private void itmInsertBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmInsertBeforeActionPerformed
        String t = txtTitle.getText();
        String i = txtInfo.getText();
        Task tas = new Task(t, i);
        if (tas.validate()) {
            //Add the item
            iterator.add(tas);

            if (list.size() > 1) {
                display();
            } else {
                updateCount();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please fill all fields", "Data Error", WIDTH);
        }


    }//GEN-LAST:event_itmInsertBeforeActionPerformed

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void itmRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmRemoveActionPerformed

    private void itmUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUpdateActionPerformed
        //set the title

        String t = txtTitle.getText();
        String i = txtInfo.getText();
        Task tas = new Task(t, i);
        if (tas.validate()) {
            //Make sure it isn't the first one
            if (list.isEmpty()) {
                //Add the item instead of setting it
                iterator.add(tas);
            } else {
                iterator.next();
                iterator.set(tas);
                iterator.previous();
            }
            updateCount();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please fill all fields", "Data Error", WIDTH);
        }


    }//GEN-LAST:event_itmUpdateActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        iterator.previous();
        display();
    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        iterator.next();
        display();
    }//GEN-LAST:event_btnRightActionPerformed

    private void display() {
        //Get the current task
        Task temp;
        if (iterator.hasNext()) {
            temp = iterator.next();
        } else {
            temp = iterator.previous();
        }
        //Set the text boxes to the task
        txtTitle.setText(temp.getTitle());
        txtInfo.setText(temp.getDescription());

        //Are we at the end?
        //Check for left
        if (!iterator.hasPrevious()) {
            btnFarLeft.setEnabled(false);
            btnLeft.setEnabled(false);
        } else {
            btnFarLeft.setEnabled(true);
            btnLeft.setEnabled(true);
        }
        if (!iterator.hasNext()) {
            btnFarRight.setEnabled(false);
            btnRight.setEnabled(false);
        } else {
            btnFarRight.setEnabled(true);
            btnRight.setEnabled(true);
        }

        //Move the iterator back to the left
        iterator.previous();
        //update the location label
        updateCount();

    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskOrganizer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFarLeft;
    private javax.swing.JButton btnFarRight;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JMenuItem itmAll;
    private javax.swing.JMenuItem itmClear;
    private javax.swing.JMenuItem itmInsertAfter;
    private javax.swing.JMenuItem itmInsertBefore;
    private javax.swing.JMenuItem itmNew;
    private javax.swing.JMenuItem itmOpen;
    private javax.swing.JMenuItem itmRemove;
    private javax.swing.JMenuItem itmSave;
    private javax.swing.JMenuItem itmSaveAs;
    private javax.swing.JMenuItem itmUpdate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

    private void updateCount() {
        lblPosition.setText("Task " + iterator.nextIndex() + "/" + list.size());
    }
}
