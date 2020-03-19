/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGO_ManagerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.NGOOrganization;
import Business.POJO.Homeless;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.NGO_ManagertoFieldWorker_WorkRequest;
import Business.network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nares
 */
public class NGO_ManagertoDoctor extends javax.swing.JPanel {

    /**
     * Creates new form NGOtoDoctor
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private NGOOrganization ngoOrganization;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance(); 
    private NGO_ManagertoFieldWorker_WorkRequest request;
    private String Canname;
    private int id;
    
    
    NGO_ManagertoDoctor(JPanel userProcessContainer, UserAccount userAccount, NGOOrganization ngoOrganization,Enterprise enterprise, EcoSystem system,NGO_ManagertoFieldWorker_WorkRequest request,int id,String name) {
       initComponents(); 
       this.userProcessContainer = userProcessContainer;
       this.userAccount = userAccount;
       this.system = system;
       this.ngoOrganization = ngoOrganization;
       this.enterprise=enterprise;
       this.request=request;
       this.Canname=name;
       this.id=id;
       txtCandidate.setText(String.valueOf(id));
       txtCandidateName.setText(Canname);
       populateTxt();
       dB4OUtil.storeSystem(system);
           
        
    }
    public  void populateTxt(){
    
    for (Homeless homeless: system.gethomlessDirectory().getHomelesslist()){
             if(id==homeless.getCandidateID()){
                 txtExisting.setText(homeless.getDisease());
             }
               
            }
}
     static boolean isStringValid(String number)
    {
        String regex = "^[a-zA-Z]*$";
        return number.matches(regex);
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
        btnRequest = new javax.swing.JButton();
        txtCandidate = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        resultJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCandidateName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtExisting = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setText("Candidate ID");

        btnRequest.setBackground(new java.awt.Color(102, 102, 255));
        btnRequest.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnRequest.setText("Request");
        btnRequest.setBorder(new javax.swing.border.MatteBorder(null));
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        txtCandidate.setEditable(false);
        txtCandidate.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        txtCandidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCandidateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        resultJTextField.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        resultJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel3.setText("Message To field Worker");

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setText("Candidate Name");
        jLabel2.setToolTipText("");

        txtCandidateName.setEditable(false);
        txtCandidateName.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel4.setText("Existing Medical Ailments");

        txtExisting.setEditable(false);
        txtExisting.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel5.setText("Request To Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(238, 238, 238)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCandidateName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtExisting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCandidateName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtExisting, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
       if(txtCandidate.getText().isEmpty()||txtCandidateName.getText().isEmpty()||txtExisting.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "Please select the candidate from table");  
       }else{
           
       String Id =txtCandidate.getText();
       Date date = new Date(); 
       request.setReceiver(userAccount);
       request.setResolveDate(date);
       request.setStatus("Completed");
       request.setTempStatus("Requested Doctor");
       request.setMessageNGO(resultJTextField.getText());
       DoctorWorkRequest request = new DoctorWorkRequest();
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setMessage(Id);
        request.setRequestDate(date);
        request.setName(Canname);
        request.setRole("Doctor");
        
         if(resultJTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please send a message to field worker");
            return;
       }else{
             if(isStringValid(resultJTextField.getText()) == false)    
        {
           
            JOptionPane.showMessageDialog(null, "Please enter a valid message");
            return;
        }  
        
        Network netwk=system.getNetworkList().stream().filter(item->item.getEnterpriseDirectory().getEnterpriseList().stream().anyMatch(item1->item1.getName().equalsIgnoreCase(enterprise.getName())))
                                                   .findFirst()
                                                    .orElse(null);
           netwk.getEnterpriseDirectory().getEnterpriseList().stream().filter(item->item instanceof HospitalEnterprise)
                                                                            .forEach(item->item.getOrganizationDirectory().getOrganizationList().stream().filter(org->org instanceof DoctorOrganization)
                                                                            .forEach(org->org.getWorkQueue().getWorkRequestList().add(request)));
           userAccount.getWorkQueue().getWorkRequestList().add(request);
             dB4OUtil.storeSystem(system);
             //populateTable();
             JOptionPane.showMessageDialog(null, "Requested" );
             txtCandidate.setText("");
             txtCandidateName.setText("");
             txtExisting.setText("");
             resultJTextField.setText("");
         }
       }
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
       NgotoFieldWorkerView dwjp = (NgotoFieldWorkerView) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCandidateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCandidateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JTextField txtCandidate;
    private javax.swing.JTextField txtCandidateName;
    private javax.swing.JTextField txtExisting;
    // End of variables declaration//GEN-END:variables

    
}

