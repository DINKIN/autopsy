/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.directorytree;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * This is the form / panel to show the Volume Details.
 */
class VolumeDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolumeDetailPanel
     */
    VolumeDetailsPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        flagsValue = new javax.swing.JLabel();
        descValue = new javax.swing.JLabel();
        lengthValue = new javax.swing.JLabel();
        startValue = new javax.swing.JLabel();
        startLabel = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        volumeIDLabel = new javax.swing.JLabel();
        volumeIDValue = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        flagsLabel = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();

        flagsValue.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.flagsValue.text")); // NOI18N

        descValue.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.descValue.text")); // NOI18N

        lengthValue.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.lengthValue.text")); // NOI18N

        startValue.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.startValue.text")); // NOI18N

        startLabel.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.startLabel.text")); // NOI18N

        lengthLabel.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.lengthLabel.text")); // NOI18N

        jLabel1.setFont(jLabel1.getFont().deriveFont(Font.BOLD, 18));
        jLabel1.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.jLabel1.text")); // NOI18N

        volumeIDLabel.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.volumeIDLabel.text")); // NOI18N

        volumeIDValue.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.volumeIDValue.text")); // NOI18N

        descLabel.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.descLabel.text")); // NOI18N

        flagsLabel.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.flagsLabel.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startLabel)
                            .addComponent(volumeIDLabel)
                            .addComponent(lengthLabel)
                            .addComponent(descLabel)
                            .addComponent(flagsLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flagsValue)
                            .addComponent(descValue)
                            .addComponent(lengthValue)
                            .addComponent(startValue)
                            .addComponent(volumeIDValue)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volumeIDLabel)
                    .addComponent(volumeIDValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startLabel)
                    .addComponent(startValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthLabel)
                    .addComponent(lengthValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(descLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(flagsLabel)
                            .addComponent(flagsValue)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(descValue)
                        .addGap(25, 25, 25)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        OKButton.setText(org.openide.util.NbBundle.getMessage(VolumeDetailsPanel.class, "VolumeDetailsPanel.OKButton.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setVolumeIDValue(String arg) {
        volumeIDValue.setText(arg);
    }

    public void setStartValue(String arg) {
        startValue.setText(arg);
    }

    public void setLengthValue(String arg) {
        lengthValue.setText(arg);
    }

    public void setDescValue(String arg) {
        descValue.setText(arg);
    }

    public void setFlagsValue(String arg) {
        flagsValue.setText(arg);
    }

    public void setOKButtonActionListener(ActionListener e) {
        OKButton.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel descValue;
    private javax.swing.JLabel flagsLabel;
    private javax.swing.JLabel flagsValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JLabel lengthValue;
    private javax.swing.JLabel startLabel;
    private javax.swing.JLabel startValue;
    private javax.swing.JLabel volumeIDLabel;
    private javax.swing.JLabel volumeIDValue;
    // End of variables declaration//GEN-END:variables

}
