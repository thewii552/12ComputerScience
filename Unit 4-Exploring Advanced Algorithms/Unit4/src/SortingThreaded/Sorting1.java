/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingThreaded;

import Projects.*;
import SortingThreaded.Sorter.BubbleSort;
import SortingThreaded.Sorter.ExchangeSort;
import SortingThreaded.Sorter.InsertionSort;
import SortingThreaded.Sorter.QuickSort;
import SortingThreaded.Sorter.Sorter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author andr6491
 */
public class Sorting1 extends javax.swing.JFrame {

    /**
     * Creates new form Sorting1
     */
    DefaultListModel list = new DefaultListModel();

    //Create a sorter
    Sorter s;

    public Sorting1() {
        initComponents();
        //Set up the table
        lstOut.setModel(list);
    }
    //Number array
    int numbers[];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstOut = new javax.swing.JList();
        btnGenerate = new javax.swing.JButton();
        btnBubble = new javax.swing.JButton();
        btnExchange = new javax.swing.JButton();
        btnInsertion = new javax.swing.JButton();
        btnQuick = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sort-O-Tron 5000");

        jScrollPane1.setViewportView(lstOut);

        btnGenerate.setText("Generate Numbers");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnBubble.setText("Bubble Sort");
        btnBubble.setEnabled(false);
        btnBubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBubbleActionPerformed(evt);
            }
        });

        btnExchange.setText("Selection Sort");
        btnExchange.setEnabled(false);
        btnExchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExchangeActionPerformed(evt);
            }
        });

        btnInsertion.setText("Insertion Sort");
        btnInsertion.setEnabled(false);
        btnInsertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertionActionPerformed(evt);
            }
        });

        btnQuick.setText("Quick Sort");
        btnQuick.setEnabled(false);
        btnQuick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuickActionPerformed(evt);
            }
        });

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTime.setText("Time: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBubble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsertion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnExchange, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTime))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGenerate)
                        .addGap(18, 18, 18)
                        .addComponent(btnBubble)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExchange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTime)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        //Start by clearing the list
        list.clear();

        //Ask for the new length
        int howMany = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "How many numbers?"));
        numbers = new int[howMany];

        //Generate the numbers
        for (int x = 0; x < howMany; x++) {
            numbers[x] = (int) (Math.random() * howMany + 1);
            list.addElement(numbers[x]);
        }

        changeButtons(true);
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnBubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBubbleActionPerformed
        //Bubble sort the array

        //Create a bubblesorter
        s = new BubbleSort(numbers);

        long time = System.currentTimeMillis();
        //Create the thread
        (new Thread(s)).start();

        time = System.currentTimeMillis() - time;
        numbers = s.getArray();
        list.clear();
        for (int num : numbers) {
            list.addElement(num);

        }

        //Display the time
        lblTime.setText("Time: " + time + " ms");

        changeButtons(false);
    }//GEN-LAST:event_btnBubbleActionPerformed

    private void btnExchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExchangeActionPerformed
        //Exchange sort the array
        //Create  a exchangesorter
        s = new ExchangeSort(numbers);
        long time = System.currentTimeMillis();
        (new Thread(s)).start();
        time = System.currentTimeMillis() - time;

        //Show the numbers
        numbers = s.getArray();
        list.clear();
        for (int num : numbers) {
            list.addElement(num);
        }
        //Display the time
        lblTime.setText("Time: " + time + " ms");
        changeButtons(false);
    }//GEN-LAST:event_btnExchangeActionPerformed

    private void btnInsertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertionActionPerformed
        //Sort
        //Create the insertionSorter
        s = new InsertionSort(numbers);
        long time = System.currentTimeMillis();
        (new Thread(s)).start();
        time = System.currentTimeMillis() - time;

        list.clear();
        
        numbers = s.getArray();
        for (int num : numbers) {
            list.addElement(num);
        }

        //Display the time
        lblTime.setText("Time: " + time + " ms");
        changeButtons(false);
    }//GEN-LAST:event_btnInsertionActionPerformed

    private void btnQuickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuickActionPerformed
        //Make a quicksorter
        s = new QuickSort(numbers);
        long time = System.currentTimeMillis();
        (new Thread(s)).start();
        time = System.currentTimeMillis() - time;

        list.clear();
        numbers = s.getArray();
        for (int num : numbers) {
            list.addElement(num);
        }

        //Display the time
        lblTime.setText("Time: " + time + " ms");
        changeButtons(false);
    }//GEN-LAST:event_btnQuickActionPerformed

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
            java.util.logging.Logger.getLogger(Sorting1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorting1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorting1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorting1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorting1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBubble;
    private javax.swing.JButton btnExchange;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnInsertion;
    private javax.swing.JButton btnQuick;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JList lstOut;
    // End of variables declaration//GEN-END:variables

    private void changeButtons(boolean state) {
        btnBubble.setEnabled(state);
        btnExchange.setEnabled(state);
        btnInsertion.setEnabled(state);
        btnQuick.setEnabled(state);
    }

////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////
}
