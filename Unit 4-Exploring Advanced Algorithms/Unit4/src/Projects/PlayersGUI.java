/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;

/**
 *
 * @author andr6491
 */
public class PlayersGUI extends javax.swing.JFrame {

    ArrayList<Player> players = new ArrayList();
    DefaultListModel model = new DefaultListModel();

    /**
     * Creates new form PlayersGUI
     */
    public PlayersGUI() {
        initComponents();
        
        //Load the players
        load("./data/nhlplayers.txt");
        //Set up the list with the model
        lstPlayers.setModel(model);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPlayers = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOut = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuEdit = new javax.swing.JMenu();
        itmDelete = new javax.swing.JMenuItem();
        mnuFilter = new javax.swing.JMenu();
        optTeam = new javax.swing.JRadioButtonMenuItem();
        optAll = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstPlayers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstPlayers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPlayersMouseClicked(evt);
            }
        });
        lstPlayers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPlayersValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPlayers);

        txtOut.setColumns(20);
        txtOut.setRows(5);
        jScrollPane2.setViewportView(txtOut);

        jMenu2.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        mnuEdit.setText("Edit");

        itmDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        itmDelete.setText("Delete");
        itmDelete.setEnabled(false);
        itmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleteActionPerformed(evt);
            }
        });
        mnuEdit.add(itmDelete);

        jMenuBar1.add(mnuEdit);

        mnuFilter.setText("Filter...");

        optTeam.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        buttonGroup1.add(optTeam);
        optTeam.setText("By Selected Team");
        optTeam.setEnabled(false);
        optTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optTeamActionPerformed(evt);
            }
        });
        mnuFilter.add(optTeam);

        optAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        buttonGroup1.add(optAll);
        optAll.setSelected(true);
        optAll.setText("Show All");
        optAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optAllActionPerformed(evt);
            }
        });
        mnuFilter.add(optAll);

        jMenuBar1.add(mnuFilter);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void load(String fileAddress){
        //Load the data
        try {
            FileReader fr = new FileReader(fileAddress);
            BufferedReader buffer = new BufferedReader(fr);

            while (buffer.ready()) {
                //Load the string
                String in = buffer.readLine();
                //Parse the data
                StringTokenizer st = new StringTokenizer(in, ",");
                String n = st.nextToken();
                String t = st.nextToken();
                String p = st.nextToken();
                String s = st.nextToken();
                String w = st.nextToken();
                //Make the player
                players.add(new Player(n, t, p, Double.parseDouble(s), Double.parseDouble(w)));
                model.addElement(n.replace("-", ", "));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }    
    private void optTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optTeamActionPerformed
        //Get the selected player's team
        int selected = lstPlayers.getSelectedIndex();
        String team = players.get(selected).getTeam();
        
        //Clear the model, run through the arraylist, and add all players of the right team
        model.clear();
        for (Player p: players){
            if (p.getTeam().equals(team)){
                model.addElement(p.getName());
            }
        }
    }//GEN-LAST:event_optTeamActionPerformed

    private void lstPlayersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPlayersValueChanged

    }//GEN-LAST:event_lstPlayersValueChanged

    private void lstPlayersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPlayersMouseClicked
        //Enable "delete" and "filter by team"
        itmDelete.setEnabled(true);
        optTeam.setEnabled(true);
        

        //Select the player and display the info
        int index = lstPlayers.getSelectedIndex();
        //Find the player's info to show
        index = search(players, new Player((String)model.get(index)));
        txtOut.setText(players.get(index).toString());
        
    }//GEN-LAST:event_lstPlayersMouseClicked

    private void itmDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleteActionPerformed
        //Delete the selected player
        //Start by getting the index of the selected player
        int selected = lstPlayers.getSelectedIndex();
        //Now remove that player from the arraylist and the list model
        model.removeElementAt(selected);
        players.remove(selected);


    }//GEN-LAST:event_itmDeleteActionPerformed

    private void optAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optAllActionPerformed
        //Run through the arrayList and add all players to the list 
        model.clear();
        for (Player p : players) {
            model.addElement(p.getName());
        }
        //Disable delete and team
        optTeam.setEnabled(false);
        itmDelete.setEnabled(false);
    }//GEN-LAST:event_optAllActionPerformed

    
    public static int search (ArrayList a, Player searchValue){
	   int left = 0;
	   int right = a.size()-1;
	   while (left <= right){
	      int midpoint = (left + right) / 2;
	      int result = ((Comparable)a.get(midpoint)).compareTo(searchValue); 
	      if (result == 0)
	         return midpoint;
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   return -1;	
		   
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
            java.util.logging.Logger.getLogger(PlayersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayersGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem itmDelete;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstPlayers;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenu mnuFilter;
    private javax.swing.JRadioButtonMenuItem optAll;
    private javax.swing.JRadioButtonMenuItem optTeam;
    private javax.swing.JTextArea txtOut;
    // End of variables declaration//GEN-END:variables
}
