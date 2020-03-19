/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Shelter_ManagerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ShelterOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ShelterManager_WorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Surya
 */
public class ShelterSelectionPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShelterSelectionPanel
     */
      private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private ShelterOrganization shelterOrganization;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Enterprise enterprise;
    public ShelterSelectionPanel(JPanel userProcessContainer, UserAccount userAccount, ShelterOrganization shelterOrganization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.shelterOrganization = shelterOrganization;
        this.enterprise=enterprise;
     //    jLabel2.setText(enterprise.getName());
        populateTable();
        dB4OUtil.storeSystem(system);
    }
    
    public void  populateTable(){
        
          DefaultTableModel model = (DefaultTableModel)ShelterselectTable.getModel();
        
        model.setRowCount(0);
        
         for(WorkRequest request : shelterOrganization.getWorkQueue().getWorkRequestList()){
             if(request.getStatus().equalsIgnoreCase("Request Processed")){
                 Object[] row = new Object[2];
            row[0] = ((ShelterManager_WorkRequest)request).getMessage();
            row[1] = ((ShelterManager_WorkRequest)request).getName();
             model.addRow(row);
             }
        
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ShelterselectTable = new javax.swing.JTable();
        requestButton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        ShelterselectTable.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        ShelterselectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Candidate ID", "Canditate Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ShelterselectTable);

        requestButton.setBackground(new java.awt.Color(102, 102, 255));
        requestButton.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        requestButton.setForeground(new java.awt.Color(255, 255, 255));
        requestButton.setText("Request");
        requestButton.setBorder(new javax.swing.border.MatteBorder(null));
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });

        backbutton.setBackground(new java.awt.Color(102, 102, 102));
        backbutton.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        backbutton.setForeground(new java.awt.Color(255, 255, 255));
        backbutton.setText("<<Back");
        backbutton.setToolTipText("");
        backbutton.setBorder(new javax.swing.border.MatteBorder(null));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setText("Select a Candidate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed
       
         int selectedRow = ShelterselectTable.getSelectedRow();

            if (selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Please select a row from table");
            }else{
                String ID =  (String) ShelterselectTable.getValueAt(selectedRow, 0);
                String name = (String) ShelterselectTable.getValueAt(selectedRow, 1);
                ShelterManagerto_Foodadmin ngo_doctor=new ShelterManagerto_Foodadmin(userProcessContainer,userAccount,shelterOrganization,enterprise,system,ID,name) ;
                userProcessContainer.add("TODOctor", ngo_doctor );
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
    }//GEN-LAST:event_requestButtonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ShelterselectTable;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestButton;
    // End of variables declaration//GEN-END:variables
}
