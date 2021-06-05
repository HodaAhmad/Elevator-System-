/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import esper.Config;

import event.ChooseFloorEvent;

import events.CallCarEvent;
import javax.swing.*;

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
        CallElevatorBtn1.setName("CallElevatorBtn1");
        CallElevatorBtn2.setName("CallElevatorBtn2");
        CallElevatorBtn3.setName("CallElevatorBtn3");
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
        jPanel1 = new javax.swing.JPanel();
        CallElevatorBtn1 = new javax.swing.JButton();
        CallElevatorBtn2 = new javax.swing.JButton();
        CallElevatorBtn3 = new javax.swing.JButton();
        Floor1 = new javax.swing.JLabel();
        Floor2 = new javax.swing.JLabel();
        Floor3 = new javax.swing.JLabel();
        WeightInput = new javax.swing.JTextField();
        WeightLabel = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));

        CallElevatorBtn1.setText("CALL");
        CallElevatorBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CallElevatorBtn1ActionPerformed(evt);
            }
        });

        CallElevatorBtn2.setText("CALL");
        CallElevatorBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CallElevatorBtn2ActionPerformed(evt);
            }
        });

        CallElevatorBtn3.setText("CALL");
        CallElevatorBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CallElevatorBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CallElevatorBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CallElevatorBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CallElevatorBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(CallElevatorBtn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CallElevatorBtn2)
                .addGap(84, 84, 84)
                .addComponent(CallElevatorBtn1)
                .addContainerGap())
        );

        Floor1.setIcon(new javax.swing.ImageIcon("M:\\ics\\rts\\RTS-Project\\RTS\\src\\view\\images\\Elevator.png")); // NOI18N

        Floor2.setIcon(new javax.swing.ImageIcon("M:\\ics\\rts\\RTS-Project\\RTS\\src\\view\\images\\Elevator.png")); // NOI18N

        Floor3.setIcon(new javax.swing.ImageIcon("M:\\ics\\rts\\RTS-Project\\RTS\\src\\view\\images\\Elevator.png")); // NOI18N

        WeightLabel.setText("Weight");

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
        Floor3btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Floor3btnActionPerformed(evt);
            }
        });

        StopBtn.setText("Emergency STOP");

        DoorBtn.setText("Open Door");

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

        javax.swing.GroupLayout ElevatorControllerPanelLayout = new javax.swing.GroupLayout(ElevatorControllerPanel);
        ElevatorControllerPanel.setLayout(ElevatorControllerPanelLayout);
        ElevatorControllerPanelLayout.setHorizontalGroup(
            ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ElevatorControllerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DoorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Floor3btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Floor2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Floor1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ElevatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                                .addComponent(DoorStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doorStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Light, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ElevatorControllerPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LightOn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LightOff, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(ElevatorControllerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoorStatus)
                    .addComponent(doorStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Light)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LightOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LightOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        javax.swing.GroupLayout ElevPanelLayout = new javax.swing.GroupLayout(ElevPanel);
        ElevPanel.setLayout(ElevPanelLayout);
        ElevPanelLayout.setHorizontalGroup(
            ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElevPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ElevatorControllerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ElevPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(WeightLabel))
                    .addGroup(ElevPanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(WeightInput)
                            .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Floor3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Floor2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Floor1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        ElevPanelLayout.setVerticalGroup(
            ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ElevPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ElevPanelLayout.createSequentialGroup()
                        .addComponent(WeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ElevPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ElevPanelLayout.createSequentialGroup()
                                .addComponent(Floor3)
                                .addGap(52, 52, 52)
                                .addComponent(Floor2)
                                .addGap(48, 48, 48)
                                .addComponent(Floor1)
                                .addGap(6, 6, 6))
                            .addGroup(ElevPanelLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addComponent(ElevatorControllerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ElevPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ElevPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Floor2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Floor2btnActionPerformed

    }//GEN-LAST:event_Floor2btnActionPerformed

    private void doorStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doorStatusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doorStatusFieldActionPerformed

    private void CallElevatorBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CallElevatorBtn1ActionPerformed
        Config.sendEvent(new CallCarEvent(1));
    }//GEN-LAST:event_CallElevatorBtn1ActionPerformed



    private void Floor3btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Floor3btnActionPerformed
        Config.sendEvent(new ChooseFloorEvent(3));
    }//GEN-LAST:event_Floor3btnActionPerformed
    
    private void CallElevatorBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CallElevatorBtn3ActionPerformed
        Config.sendEvent(new CallCarEvent(3));
    }//GEN-LAST:event_CallElevatorBtn3ActionPerformed

    private void CallElevatorBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CallElevatorBtn2ActionPerformed
        Config.sendEvent(new CallCarEvent(2));
    }//GEN-LAST:event_CallElevatorBtn2ActionPerformed


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

    public JButton getCallElevatorBtn1() {
        return CallElevatorBtn1;
    }

    public JButton getCallElevatorBtn2() {
        return CallElevatorBtn2;
    }

    public JButton getCallElevatorBtn3() {
        return CallElevatorBtn3;
    }

    public JButton getDoorBtn() {
        return DoorBtn;
    }

    public JLabel getDoorStatus() {
        return DoorStatus;
    }

    public JPanel getElevPanel() {
        return ElevPanel;
    }

    public JPanel getElevatorControllerPanel() {
        return ElevatorControllerPanel;
    }

    public JLabel getElevatorPanel() {
        return ElevatorPanel;
    }

    public JLabel getFloor1() {
        return Floor1;
    }

    public JButton getFloor1btn() {
        return Floor1btn;
    }

    public JLabel getFloor2() {
        return Floor2;
    }

    public JButton getFloor2btn() {
        return Floor2btn;
    }

    public JLabel getFloor3() {
        return Floor3;
    }

    public JButton getFloor3btn() {
        return Floor3btn;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JLabel getLight() {
        return Light;
    }

    public JLabel getLightOff() {
        return LightOff;
    }

    public JLabel getLightOn() {
        return LightOn;
    }

    public JButton getStopBtn() {
        return StopBtn;
    }

    public JTextField getWeightInput() {
        return WeightInput;
    }

    public JLabel getWeightLabel() {
        return WeightLabel;
    }

    public JTextField getDoorStatusField() {
        return doorStatusField;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CallElevatorBtn1;
    public javax.swing.JButton CallElevatorBtn2;
    public javax.swing.JButton CallElevatorBtn3;
    private javax.swing.JButton DoorBtn;
    private javax.swing.JLabel DoorStatus;
    private javax.swing.JPanel ElevPanel;
    private javax.swing.JPanel ElevatorControllerPanel;
    private javax.swing.JLabel ElevatorPanel;
    private javax.swing.JLabel Floor1;
    private javax.swing.JButton Floor1btn;
    private javax.swing.JLabel Floor2;
    private javax.swing.JButton Floor2btn;
    private javax.swing.JLabel Floor3;
    private javax.swing.JButton Floor3btn;
    private javax.swing.JLabel Light;
    private javax.swing.JLabel LightOff;
    private javax.swing.JLabel LightOn;
    private javax.swing.JButton StopBtn;
    private javax.swing.JTextField WeightInput;
    private javax.swing.JLabel WeightLabel;
    private javax.swing.JTextField doorStatusField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
