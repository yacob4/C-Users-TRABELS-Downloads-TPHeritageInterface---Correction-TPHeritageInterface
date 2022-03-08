/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPHeritageInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Jacques
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }
        int dureeDeValidite = 30;
        boolean isMembre;
        DefaultTableModel dtmClubs;
        DefaultTableModel dtmSports;
        ArrayList<Club> lesClubs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpMembre = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClubs = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSports = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblClubs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nom", "NbPoints"
            }
        ));
        tblClubs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClubsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClubs);

        jLabel7.setText("Liste des clubs");

        jLabel8.setText("Liste des sports du club sélectionné");

        tblSports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Nb Joueurs", "Description", "Largeur terrain", "Longueur terrain", "Distance"
            }
        ));
        jScrollPane2.setViewportView(tblSports);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
//        TableColumn col = tblSports.getColumnModel().getColumn(2);
//        col.setPreferredWidth(200);
        
        dtmClubs = (DefaultTableModel)tblClubs.getModel();
        dtmSports = (DefaultTableModel)tblSports.getModel();
        
        lesClubs = new ArrayList<>();
        
        // Les clubs
        Club c1 = new Club(1, "Dijon",63);
        Club c2 = new Club(2, "PSG",67);
        Club c3 = new Club(3, "Nantes",65);
        
        // Les sports du Club de DIJON
        SportBallon sb = new SportBallon("Basketball",5,35,45);

        c1.AjouterSport(sb);
        
        // Les sports du Club du PSG
        Sport s1 = new Sport("Javelot", 1);
        Sport s2 = new Sport("Judo",1);
        SportBallon sb1 = new SportBallon("Football",11,68,106);
        SportBallon sb2 = new SportBallon("Handball",7,35,65);
        SportRelais sr1 = new SportRelais("4 * 100", 400, 4);
        
        c2.AjouterSport(s1);
        c2.AjouterSport(s2);
        c2.AjouterSport(sb1);
        c2.AjouterSport(sb2);
        c2.AjouterSport(sr1);
        
        // Les sports du Club de NANTES
        Sport s3 = new Sport("Cyclisme", 1);
        SportBallon sb3 = new SportBallon("Football",11,68,105);
        SportBallon sb4 = new SportBallon("Rugby",15,65,115);
        SportRelais sr2 = new SportRelais("100 mètres", 100, 1);
        
        c3.AjouterSport(s3);
        c3.AjouterSport(sb3);
        c3.AjouterSport(sb4);
        c3.AjouterSport(sr2);
        
        
        lesClubs.add(c1);lesClubs.add(c2);lesClubs.add(c3);
        
        // TRI
        Collections.sort(lesClubs);
        Vector v;
        for (Club unClub : lesClubs) {
            v = new Vector();
            v.add(unClub.getIdClub());
            v.add(unClub.getNomClub());
            v.add(unClub.getNbPoints());
            dtmClubs.addRow(v);
        }
    }//GEN-LAST:event_formWindowOpened

    private void tblClubsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClubsMouseClicked
        
        while(dtmSports.getRowCount()>0)
        {
            dtmSports.removeRow(0);
        }
         Vector v;
        for (Sport  sport : lesClubs.get(tblClubs.getSelectedRow()).getLesSports())
        {
            v = new Vector();
            v.add(sport.GetNomSport());
            v.add(sport.GetNbJoueurs());      
            
            if (sport.getClass() == SportBallon.class) 
            {
                v.add(((SportBallon)sport).GetDescription());
                v.add(((SportBallon)sport).GetLargeur());
                v.add(((SportBallon)sport).GetLongueur());
            }
            else if (sport.getClass() == SportRelais.class) 
            {
                v.add(((SportRelais)sport).GetDescription());
                v.add("");
                v.add("");
                v.add(((SportRelais)sport).getDistance());
            }
            else
            {
                v.add(sport.GetDescription());
                v.add("");
                v.add("");
                v.add("");
            }
            dtmSports.addRow(v);
        }
    }//GEN-LAST:event_tblClubsMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grpMembre;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblClubs;
    private javax.swing.JTable tblSports;
    // End of variables declaration//GEN-END:variables
}
