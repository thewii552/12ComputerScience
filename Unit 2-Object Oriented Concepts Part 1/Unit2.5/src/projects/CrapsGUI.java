/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

/**
 *
 * @author andr6491
 */
public class CrapsGUI extends javax.swing.JFrame {

    /**
     * Creates new form CrapsGUI
     */
    Dice d;
    Craps game;
    int money = 100;
    int totalGames = 0;
    boolean newGame = true;

    public CrapsGUI() {
        d = new Dice();
        initComponents();
        game = new Craps();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblD1 = new javax.swing.JLabel();
        btnRoll = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        lblD2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        lblRolls = new javax.swing.JLabel();
        lblMoney = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblD1.setToolTipText("");
        lblD1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblD1.setMaximumSize(new java.awt.Dimension(88, 88));
        lblD1.setMinimumSize(new java.awt.Dimension(88, 88));
        lblD1.setPreferredSize(new java.awt.Dimension(88, 88));

        btnRoll.setText("Roll");
        btnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollActionPerformed(evt);
            }
        });

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        lblD2.setToolTipText("");
        lblD2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblD2.setMaximumSize(new java.awt.Dimension(88, 88));
        lblD2.setMinimumSize(new java.awt.Dimension(88, 88));
        lblD2.setPreferredSize(new java.awt.Dimension(88, 88));

        txtComment.setEditable(false);
        txtComment.setColumns(20);
        txtComment.setRows(5);
        txtComment.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtComment.setFocusable(false);
        jScrollPane2.setViewportView(txtComment);

        lblRolls.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRolls.setText("Rolls: 0");

        lblMoney.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMoney.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMoney.setText("$100");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRolls)
                                    .addComponent(lblMoney))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(lblD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblRolls)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMoney)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoll)
                    .addComponent(btnQuit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollActionPerformed
        
        stepGame();
        updatePics();
        //Display the results

    }//GEN-LAST:event_btnRollActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

   
    private void stepGame() {
        //Check for a new game
        if (newGame) {
            //Reset the game
            game = new Craps();
            //Clear the text area
            txtComment.setText("");
            //Add the "NEW GAME" header
            txtComment.append("NEW GAME\n========");
            //Subtract the game fee
            money -= 5;
            newGame = false;
        }
        //Check for no money
        if (money <= 0) {
            txtComment.append("\nOut of money!");
            newGame = true;
        }
        
        //Roll
        game.roll();
        //Show roll results
        txtComment.append("\nYou rolled: " + game.getTotal());
        
        
        
        if (game.hasWon()) {
            txtComment.append("\nYOU HAVE WON!\nRoll again for new game");
            
            //Give prize
            money += 15;
            
            //Set newGame to true
            newGame = true;
            
        } else if (game.hasLost()) {
            
            txtComment.append("\nSorry! You lost!\nRoll again for new game");
            //new game
            newGame = true;
        }
        lblRolls.setText("Rolls: " + game.getNumRolls());
        lblMoney.setText("$" + money);
       

    }

    private void updatePics() {
        //Set the label icons to their respective die
        lblD1.setIcon(game.getDicePic(1));
        lblD2.setIcon(game.getDicePic(2));
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
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrapsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnRoll;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblD1;
    private javax.swing.JLabel lblD2;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblRolls;
    private javax.swing.JTextArea txtComment;
    // End of variables declaration//GEN-END:variables
}