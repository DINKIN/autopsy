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
package org.sleuthkit.autopsy.ingest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JMenuItem;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import org.openide.util.Lookup;
import org.sleuthkit.autopsy.casemodule.Case;
import org.sleuthkit.autopsy.corecomponentinterfaces.BlackboardResultViewer;
import org.sleuthkit.autopsy.ingest.IngestMessagePanel.IngestMessageGroup;
import org.sleuthkit.datamodel.AbstractFile;
import org.sleuthkit.datamodel.BlackboardArtifact;
import org.sleuthkit.datamodel.TskData.TSK_DB_FILES_TYPE_ENUM;
import org.sleuthkit.datamodel.TskException;

/**
 * Details panel within IngestMessagePanel
 */
class IngestMessageDetailsPanel extends javax.swing.JPanel {

    private IngestMessageMainPanel mainPanel;

    /**
     * Creates new form IngestMessageDetailsPanel
     */
    IngestMessageDetailsPanel(IngestMessageMainPanel mainPanel) {
        this.mainPanel = mainPanel;
        initComponents();
        customizeComponents();
    }

    private void customizeComponents() {
        messageDetailsPane.setContentType("text/html"); //NON-NLS
        viewArtifactButton.setEnabled(false);
        viewContentButton.setEnabled(false);
        HTMLEditorKit kit = new HTMLEditorKit();
        messageDetailsPane.setEditorKit(kit);
        StyleSheet styleSheet = kit.getStyleSheet();
        /*
         * I tried to define the font-size only on body to have it inherit, it
         * didn't work in all cases.
         */
        styleSheet.addRule("body {font-family:Arial;font-size:10pt;}"); //NON-NLS
        styleSheet.addRule("p {font-family:Arial;font-size:10pt;}"); //NON-NLS
        styleSheet.addRule("li {font-family:Arial;font-size:10pt;}"); //NON-NLS
        styleSheet.addRule("table {table-layout:fixed;}"); //NON-NLS
        styleSheet.addRule("td {white-space:pre-wrap;overflow:hidden;}"); //NON-NLS
        styleSheet.addRule("th {font-weight:bold;}"); //NON-NLS

        BlackboardResultViewer v = Lookup.getDefault().lookup(BlackboardResultViewer.class);
        v.addOnFinishedListener(new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals(BlackboardResultViewer.FINISHED_DISPLAY_EVT)) {
                    artifactViewerFinished();
                }
            }

        });

        //right click
        messageDetailsPane.setComponentPopupMenu(rightClickMenu);
        ActionListener actList = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem jmi = (JMenuItem) e.getSource();
                if (jmi.equals(copyMenuItem)) {
                    messageDetailsPane.copy();
                } else if (jmi.equals(selectAllMenuItem)) {
                    messageDetailsPane.selectAll();
                }
            }
        };
        copyMenuItem.addActionListener(actList);
        selectAllMenuItem.addActionListener(actList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightClickMenu = new javax.swing.JPopupMenu();
        copyMenuItem = new javax.swing.JMenuItem();
        selectAllMenuItem = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageDetailsPane = new javax.swing.JTextPane();
        jToolBar1 = new javax.swing.JToolBar();
        backButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        viewArtifactButton = new javax.swing.JButton();
        viewContentButton = new javax.swing.JButton();

        copyMenuItem.setText(org.openide.util.NbBundle.getMessage(IngestMessageDetailsPanel.class, "IngestMessageDetailsPanel.copyMenuItem.text")); // NOI18N
        rightClickMenu.add(copyMenuItem);

        selectAllMenuItem.setText(org.openide.util.NbBundle.getMessage(IngestMessageDetailsPanel.class, "IngestMessageDetailsPanel.selectAllMenuItem.text")); // NOI18N
        rightClickMenu.add(selectAllMenuItem);

        messageDetailsPane.setEditable(false);
        messageDetailsPane.setBackground(new java.awt.Color(221, 221, 235));
        messageDetailsPane.setBorder(null);
        messageDetailsPane.setContentType(org.openide.util.NbBundle.getMessage(IngestMessageDetailsPanel.class,
                                                                               "IngestMessageDetailsPanel.messageDetailsPane.contentType")); // NOI18N
        messageDetailsPane.setFont(messageDetailsPane.getFont().deriveFont(Font.PLAIN, 10));
        messageDetailsPane.setToolTipText(org.openide.util.NbBundle.getMessage(IngestMessageDetailsPanel.class,
                                                                               "IngestMessageDetailsPanel.messageDetailsPane.toolTipText")); // NOI18N
        jScrollPane1.setViewportView(messageDetailsPane);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/ingest/btn_step_back.png"))); // NOI18N NON-NLS
        backButton.setText(org.openide.util.NbBundle.getMessage(IngestMessageDetailsPanel.class, "IngestMessageDetailsPanel.backButton.text")); // NOI18N
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        backButton.setMaximumSize(new java.awt.Dimension(23, 23));
        backButton.setMinimumSize(new java.awt.Dimension(23, 23));
        backButton.setPreferredSize(new java.awt.Dimension(23, 23));
        backButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/ingest/btn_step_back_hover.png"))); // NOI18N NON-NLS
        backButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/ingest/btn_step_back_hover.png"))); // NOI18N NON-NLS
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(backButton);
        jToolBar1.add(filler1);

        viewArtifactButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/ingest/goto_res.png"))); // NOI18N NON-NLS
        viewArtifactButton.setText(org.openide.util.NbBundle.getMessage(IngestMessageDetailsPanel.class, "IngestMessageDetailsPanel.viewArtifactButton.text")); // NOI18N
        viewArtifactButton.setIconTextGap(2);
        viewArtifactButton.setPreferredSize(new java.awt.Dimension(93, 23));
        viewArtifactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewArtifactButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(viewArtifactButton);

        viewContentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/ingest/goto_dir.png"))); // NOI18N NON-NLS
        viewContentButton.setText(org.openide.util.NbBundle.getMessage(IngestMessageDetailsPanel.class, "IngestMessageDetailsPanel.viewContentButton.text")); // NOI18N
        viewContentButton.setIconTextGap(2);
        viewContentButton.setPreferredSize(new java.awt.Dimension(111, 23));
        viewContentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewContentButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(viewContentButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewContentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewContentButtonActionPerformed
        viewContent(evt);
    }//GEN-LAST:event_viewContentButtonActionPerformed

    private void viewArtifactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewArtifactButtonActionPerformed
        viewArtifact(evt);
    }//GEN-LAST:event_viewArtifactButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        mainPanel.showMessages();
    }//GEN-LAST:event_backButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextPane messageDetailsPane;
    private javax.swing.JPopupMenu rightClickMenu;
    private javax.swing.JMenuItem selectAllMenuItem;
    private javax.swing.JButton viewArtifactButton;
    private javax.swing.JButton viewContentButton;
    // End of variables declaration//GEN-END:variables

    private void viewArtifact(java.awt.event.ActionEvent evt) {
        artifactViewerInvoked();

        final IngestMessageGroup messageGroup = mainPanel.getMessagePanel().getSelectedMessage();
        if (messageGroup != null) {
            BlackboardArtifact art = messageGroup.getData();
            if (art != null) {
                BlackboardResultViewer v = Lookup.getDefault().lookup(BlackboardResultViewer.class);
                v.viewArtifact(art);
            }
        }

    }

    private void viewContent(java.awt.event.ActionEvent evt) {
        artifactViewerInvoked();

        final IngestMessageGroup messageGroup = mainPanel.getMessagePanel().getSelectedMessage();
        if (messageGroup != null) {
            BlackboardArtifact art = messageGroup.getData();
            if (art != null) {
                BlackboardResultViewer v = Lookup.getDefault().lookup(BlackboardResultViewer.class);
                v.viewArtifactContent(art);
            }
        }
    }

    private void artifactViewerInvoked() {
        //viewArtifactButton.setEnabled(false);
        //viewContentButton.setEnabled(false);
        messageDetailsPane.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

    }

    private void artifactViewerFinished() {
        //viewArtifactButton.setEnabled(true);
        //viewContentButton.setEnabled(true);
        messageDetailsPane.setCursor(null);
    }

    /**
     * Display the details of a given message
     *
     * @param rowNumber index to the message to display
     */
    void showDetails(int rowNumber) {
        final IngestMessageGroup messageGroup = mainPanel.getMessagePanel().getMessageGroup(rowNumber);
        if (messageGroup != null) {
            String details = messageGroup.getDetails();
            if (details != null) {
                StringBuilder b = new StringBuilder();
                if (details.startsWith("<html><body>") == false) { //NON-NLS
                    b.append("<html><body>"); //NON-NLS
                    b.append(details);
                    b.append("</body></html>"); //NON-NLS
                } else {
                    b.append(details);
                }
                this.messageDetailsPane.setText(b.toString());
            } else {
                this.messageDetailsPane.setText("");
            }
            //show artifact/content only for a message group with a single message
            BlackboardArtifact artifact = messageGroup.getData();;
            if (artifact != null && messageGroup.getCount() == 1) {
                viewArtifactButton.setEnabled(true);

                //check file type
                long objId = artifact.getObjectID();
                AbstractFile file = null;
                try {
                    file = Case.getCurrentCase().getSleuthkitCase().getAbstractFileById(objId);
                } catch (TskException ex) {

                }
                if (file == null) {
                    viewContentButton.setEnabled(false);
                } else if (!file.getType().equals(TSK_DB_FILES_TYPE_ENUM.FS)) {
                    viewContentButton.setEnabled(false);
                } else {
                    viewContentButton.setEnabled(true);
                }
            } else {
                viewArtifactButton.setEnabled(false);
                viewContentButton.setEnabled(false);
            }
        } else {
            viewArtifactButton.setEnabled(false);
            viewContentButton.setEnabled(false);
            messageDetailsPane.setText("");
        }

    }
}
