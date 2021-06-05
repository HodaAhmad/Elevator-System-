/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import esper.Config;
import events.DoorEvent;
import events.EmergencyStopEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.DoorController;

/**
 *
 * @author Laptop Shop
 */
public class ElevatorUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public ElevatorUI() {
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

        ElevPanel = new javax.swing.JPanel();
        ElevatorControllerPanel = new javax.swing.JPanel();
        ElevatorPanel = new javax.swing.JLabel();
        Floor1btn = new javax.swing.JButton();
        Floor2btn = new javax.swing.JButton();
        Floor3btn = new javax.swing.JButton();
        StopBtn = new javax.swing.JButton();
        DoorBtn = new javax.swing.JButton();
        DoorStatus = new javax.swing.JLabel();
        doorStatusField = new javax.swing.JTextField();
        Light = new javax.swing.JLabel();
        LightOff = new javax.swing.JLabel();
        LightOn = new javax.swing.JLabel();
        LightPanel = new javax.swing.JPanel();
        CloseDoorBtn = new javax.swing.JButton();
        CallElevatorBtn1 = new javax.swing.JButton();
        CallElevatorBtn2 = new javax.swing.JButton();
        CallElevatorBtn3 = new javax.swing.JButton();
        Floor1 = new javax.swing.JLabel();
        Floor2 = new javax.swing.JLabel();
        Floor3 = new javax.swing.JLabel();
        WeightInput = new javax.swing.JTextField();
        WeightLabel = new javax.swing.JLabel();
        Floor3Label = new javax.swing.JLabel();
        Floor2Label = new javax.swing.JLabel();
        Floor1Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));

        ElevatorControllerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ElevatorPanel.setText("Elevator  Panel");

        Floor1btn.setText("Floor 1");

        Floor2btn.setText("Floor 2");
        Floor2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Floor2btnActionPerformed(evt);
            }
        });

        Floor3btn.setText("Floor 3");

        StopBtn.setText("Emergency STOP");
        StopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopBtnActionPerformed(evt);
            }
        });

        DoorBtn.setText("Open Door");
        DoorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoorBtnActionPerformed(evt);
            }
        });

        DoorStatus.setText("Door Status");

        doorStatusField.setEditable(false);
        doorStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doorStatusFieldActionPerformed(evt);
            }
        });

        Light.setText("Light ");

        LightOff.setMaximumSize(new java.awt.Dimension(20, 20));
        LightOff.setMinimumSize(new java.awt.Dimension(20, 20));
        LightOff.setPreferredSize(new java.awt.Dimension(20, 20));

        LightOn.setMaximumSize(new java.awt.Dimension(20, 20));
        LightOn.setMinimumSize(new java.awt.Dimension(20, 20));
        LightOn.setPreferredSize(new java.awt.Dimension(20, 20));

        LightPanel.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout LightPanelLayout = new javax.swing.GroupLayout(LightPanel);
        LightPanel.setLayout(LightPanelLayout);
        LightPanelLayout.setHorizontalGroup(
            LightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );
        LightPanelLayout.setVerticalGroup(
            LightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        CloseDoorBtn.setText("Close Door");
        CloseDoorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseDoorBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ElevatorControllerPanelLayout = new javax.swing.GroupLayout(ElevatorControllerPanel);
        ElevatorControllerPanel.setLayout(ElevatorControllerPanelLayout);
        ElevatorControllerPanelLayout.setHorizontalGroup(
            ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                        .addComponent(DoorStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doorStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                        .addComponent(Light, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LightOn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LightOff, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ElevatorPanel)
                            .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Floor3btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Floor2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Floor1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CloseDoorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ElevatorControllerPanelLayout.setVerticalGroup(
            ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                .addComponent(ElevatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Floor1btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Floor2btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Floor3btn)
                .addGap(18, 18, 18)
                .addComponent(StopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CloseDoorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                        .addComponent(LightOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LightOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                        .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DoorStatus)
                            .addComponent(doorStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                                .addComponent(Light)
                                .addGap(10, 10, 10))
                            .addComponent(LightPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CallElevatorBtn1.setText("CALL");
        CallElevatorBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CallElevatorBtn1ActionPerformed(evt);
            }
        });

        CallElevatorBtn2.setText("CALL");

        CallElevatorBtn3.setText("CALL");

        WeightLabel.setText("Weight");

        Floor3Label.setText("Floor 3");

        Floor2Label.setText("Floor 2");

        Floor1Label.setText("Floor 1");

        javax.swing.GroupLayout ElevPanelLayout = new javax.swing.GroupLayout(ElevPanel);
        ElevPanel.setLayout(ElevPanelLayout);
        ElevPanelLayout.setHorizontalGroup(
            ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElevPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ElevatorControllerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ElevPanelLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Floor3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WeightLabel)
                            .addGroup(ElevPanelLayout.createSequentialGroup()
                                .addComponent(Floor2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Floor1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ElevPanelLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(WeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ElevPanelLayout.createSequentialGroup()
                        .addComponent(CallElevatorBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Floor1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ElevPanelLayout.createSequentialGroup()
                        .addComponent(CallElevatorBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Floor2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ElevPanelLayout.createSequentialGroup()
                        .addComponent(CallElevatorBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Floor3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, Short.MAX_VALUE))
        );
        ElevPanelLayout.setVerticalGroup(
            ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElevPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ElevPanelLayout.createSequentialGroup()
                        .addComponent(ElevatorControllerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(ElevPanelLayout.createSequentialGroup()
                        .addComponent(WeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(WeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CallElevatorBtn3)
                            .addComponent(Floor3Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Floor3)
                        .addGap(34, 34, 34)
                        .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CallElevatorBtn2)
                            .addComponent(Floor2Label))
                        .addGap(30, 30, 30)
                        .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ElevPanelLayout.createSequentialGroup()
                                .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CallElevatorBtn1)
                                    .addComponent(Floor1Label))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ElevPanelLayout.createSequentialGroup()
                                .addComponent(Floor2)
                                .addGap(106, 106, 106)
                                .addComponent(Floor1)
                                .addGap(155, 155, 155))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ElevPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ElevPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CallElevatorBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CallElevatorBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CallElevatorBtn1ActionPerformed

    private void doorStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doorStatusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doorStatusFieldActionPerformed

    private void DoorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoorBtnActionPerformed
        // TODO add your handling code here:
        Config.sendEvent(new DoorEvent(true));
    }//GEN-LAST:event_DoorBtnActionPerformed

    private void StopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopBtnActionPerformed
        Config.sendEvent(new EmergencyStopEvent(true));
        
    }//GEN-LAST:event_StopBtnActionPerformed

    private void Floor2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Floor2btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Floor2btnActionPerformed

    private void CloseDoorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseDoorBtnActionPerformed
        // TODO add your handling code here:
        Config.sendEvent(new DoorEvent(false));
    }//GEN-LAST:event_CloseDoorBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ElevatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElevatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElevatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElevatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElevatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CallElevatorBtn1;
    private javax.swing.JButton CallElevatorBtn2;
    private javax.swing.JButton CallElevatorBtn3;
    private javax.swing.JButton CloseDoorBtn;
    private javax.swing.JButton DoorBtn;
    private javax.swing.JLabel DoorStatus;
    private javax.swing.JPanel ElevPanel;
    private javax.swing.JPanel ElevatorControllerPanel;
    private javax.swing.JLabel ElevatorPanel;
    private javax.swing.JLabel Floor1;
    private javax.swing.JLabel Floor1Label;
    private javax.swing.JButton Floor1btn;
    private javax.swing.JLabel Floor2;
    private javax.swing.JLabel Floor2Label;
    private javax.swing.JButton Floor2btn;
    private javax.swing.JLabel Floor3;
    private javax.swing.JLabel Floor3Label;
    private javax.swing.JButton Floor3btn;
    private javax.swing.JLabel Light;
    private javax.swing.JLabel LightOff;
    private javax.swing.JLabel LightOn;
    private javax.swing.JPanel LightPanel;
    private javax.swing.JButton StopBtn;
    private javax.swing.JTextField WeightInput;
    private javax.swing.JLabel WeightLabel;
    private javax.swing.JTextField doorStatusField;
    // End of variables declaration//GEN-END:variables

    public JButton getEmergencyStopBtn() {
        return StopBtn;
    }

    public JPanel getElevatorPanel() {
        return ElevatorControllerPanel; //To change body of generated methods, choose Tools | Templates.
    }
    
    public JPanel getElevPanel() {
        return ElevPanel; //To change body of generated methods, choose Tools | Templates.
    }
    
    public JTextField getDoorStatus(){
        return doorStatusField; 
    }
    
    public JPanel getLightPanel(){
        return LightPanel; 
    }
    
    
}
