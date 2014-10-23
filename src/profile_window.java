
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Subham
 * 
 * ====TODO====
 * => Find a way to center the window.
 */

public class profile_window extends javax.swing.JFrame {

    /**
     * Creates new form profile_window
     */

    String[] backs = {"/res/back3.png","/res/002.jpg","/res/waterfall1.png","/res/003.jpg"};
    static public ArrayList profiles = new ArrayList();
    BufferedReader br;
    static profile_window pw;
    
    public profile_window() throws FileNotFoundException, URISyntaxException, IOException {
        //accessing profiles
        BufferedReader br = new BufferedReader(new FileReader("dat/profiles"));
        String line=""; int i=0;
        //populating profiles array
        while((line=br.readLine())!=null)
            profiles.add(line); i++;
        //Initalising everything
        initComponents();
        Random ran = new Random();
        int n;
        n = ran.nextInt(backs.length);
        System.out.println("setting background - "+backs[n]);
        background.setIcon(new ImageIcon(getClass().getResource(backs[n])));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        profile_select = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profileBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("xpenz Money Manager");
        setMinimumSize(new java.awt.Dimension(447, 510));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        profile_select.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Select a profile:");

        profileBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        profileBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                profileBoxItemStateChanged(evt);
            }
        });
        profileBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBoxActionPerformed(evt);
            }
        });
        profileBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                profileBoxPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout profile_selectLayout = new javax.swing.GroupLayout(profile_select);
        profile_select.setLayout(profile_selectLayout);
        profile_selectLayout.setHorizontalGroup(
            profile_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_selectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profileBox, 0, 315, Short.MAX_VALUE)
                .addContainerGap())
        );
        profile_selectLayout.setVerticalGroup(
            profile_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_selectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(profile_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(profileBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        getContentPane().add(profile_select);
        profile_select.setBounds(10, 420, 420, 40);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("by Team Black Hats");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 160, 270, 29);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/zpenz_logo_2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(14, 20, 410, 190);

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, background, org.jdesktop.beansbinding.ELProperty.create("${background}"), background, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        getContentPane().add(background);
        background.setBounds(0, 0, 460, 490);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBoxActionPerformed
        // TODO add your handling code here:
        System.out.println("action");
        vars.setSelectedProfile(profileBox.getSelectedIndex(), (String) profileBox.getSelectedItem());
        pw.setVisible(false);
        new mainWindow().setVisible(true);
    }//GEN-LAST:event_profileBoxActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
}//GEN-LAST:event_formWindowOpened

private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

}//GEN-LAST:event_formWindowGainedFocus

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// TODO add your handling code here:
    //populating combobox
    int i=0;
    while(i<profiles.size())
    {
        profileBox.addItem(profiles.get(i)); i++;
    }
}//GEN-LAST:event_formWindowActivated

private void profileBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_profileBoxItemStateChanged
// TODO add your handling code here:
    
}//GEN-LAST:event_profileBoxItemStateChanged

private void profileBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_profileBoxPropertyChange
// TODO add your handling code here:
    
}//GEN-LAST:event_profileBoxPropertyChange

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
            java.util.logging.Logger.getLogger(profile_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    pw = new profile_window();
                } catch (FileNotFoundException ex) {
                } catch (URISyntaxException | IOException ex) {
                }
                pw.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox profileBox;
    private javax.swing.JPanel profile_select;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
