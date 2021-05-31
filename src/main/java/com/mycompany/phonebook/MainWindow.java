/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.phonebook;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GPC
 */
public class MainWindow extends javax.swing.JFrame {

    private List<Contact> allContacts = new List<>(); //DLL for holding all the contacts

    public MainWindow() {
        initComponents();
        
        //placeholders for textfields
        searchTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchTextField.getText().equals("Search")) {
                    searchTextField.setText("");
                    searchTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (searchTextField.getText().isEmpty()) {
                    searchTextField.setForeground(Color.GRAY);
                    searchTextField.setText("Search");
                }
            }
        });
        suggestionsTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (suggestionsTextField.getText().equals("Suggestions")) {
                    suggestionsTextField.setText("");
                    suggestionsTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (suggestionsTextField.getText().isEmpty()) {
                    suggestionsTextField.setForeground(Color.GRAY);
                    suggestionsTextField.setText("Suggestions");
                }
            }
        });
        suggestionsTextField.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContacts = new javax.swing.JTable();
        filteringPanel = new javax.swing.JPanel();
        sortButton = new javax.swing.JButton();
        sortComboBox = new javax.swing.JComboBox<>();
        searchByLabel1 = new javax.swing.JLabel();
        newEntryPanel = new javax.swing.JPanel();
        newNameLabel = new javax.swing.JLabel();
        newHomeLabel = new javax.swing.JLabel();
        newWorkLabel = new javax.swing.JLabel();
        newOther = new javax.swing.JLabel();
        newEmailLabel = new javax.swing.JLabel();
        newNameTextField = new javax.swing.JTextField();
        newHomeTextField = new javax.swing.JTextField();
        newWorkTextField = new javax.swing.JTextField();
        newFaxTextField = new javax.swing.JTextField();
        newEmailTextField = new javax.swing.JTextField();
        newPositionTextField = new javax.swing.JTextField();
        newPositionLabel = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        suggestionsTextField = new javax.swing.JTextField();
        searchTextField = new javax.swing.JTextField();
        suggestionsComboBox = new javax.swing.JComboBox<>();
        searchByLabel = new javax.swing.JLabel();
        suggestionsComboBox1 = new javax.swing.JComboBox<>();
        insertSuggestionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phonebook");
        setLocation(new java.awt.Point(300, 200));
        setMinimumSize(new java.awt.Dimension(800, 900));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Phonebook");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTableContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Home", "Work", "Fax", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableContacts);

        sortButton.setText("Sort");

        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Name", "Home", "Work", "Fax", "Email" }));
        sortComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortComboBoxActionPerformed(evt);
            }
        });

        searchByLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchByLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchByLabel1.setText("by");

        javax.swing.GroupLayout filteringPanelLayout = new javax.swing.GroupLayout(filteringPanel);
        filteringPanel.setLayout(filteringPanelLayout);
        filteringPanelLayout.setHorizontalGroup(
            filteringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filteringPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sortButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchByLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        filteringPanelLayout.setVerticalGroup(
            filteringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filteringPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(filteringPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortButton)
                    .addComponent(searchByLabel1)
                    .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                    .addComponent(filteringPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filteringPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        newNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newNameLabel.setText("Home");

        newHomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newHomeLabel.setText("Work");

        newWorkLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newWorkLabel.setText("Fax");

        newOther.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newOther.setText("E-Mail");

        newEmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newEmailLabel.setText("Name");

        newPositionLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newPositionLabel.setText("Position");

        javax.swing.GroupLayout newEntryPanelLayout = new javax.swing.GroupLayout(newEntryPanel);
        newEntryPanel.setLayout(newEntryPanelLayout);
        newEntryPanelLayout.setHorizontalGroup(
            newEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newEntryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newOther, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addGroup(newEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(newWorkLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newHomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(newEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(newPositionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPositionTextField)
                    .addComponent(newHomeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newNameTextField)
                    .addComponent(newFaxTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newWorkTextField)
                    .addComponent(newEmailTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        newEntryPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {newEmailLabel, newHomeLabel, newNameLabel, newOther, newPositionLabel, newWorkLabel});

        newEntryPanelLayout.setVerticalGroup(
            newEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newEntryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPositionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newHomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newHomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newWorkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newWorkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newFaxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newOther, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        newEntryPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {newEmailLabel, newEmailTextField, newFaxTextField, newHomeLabel, newHomeTextField, newNameLabel, newNameTextField, newOther, newPositionLabel, newPositionTextField, newWorkLabel, newWorkTextField});

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        suggestionsTextField.setForeground(java.awt.Color.GRAY);
        suggestionsTextField.setText("Suggestions");

        searchTextField.setForeground(java.awt.Color.GRAY);
        searchTextField.setText("Search");
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        suggestionsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Name", "Home", "Work", "Fax", "Other", "Email" }));

        searchByLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchByLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchByLabel.setText("by");

        suggestionsComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Starts with", "Ends with", "Contains", "Is exactly" }));

        insertSuggestionButton.setText("Insert Suggestion");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(suggestionsComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTextField))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(suggestionsTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertSuggestionButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(searchByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(suggestionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suggestionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertSuggestionButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suggestionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByLabel)
                    .addComponent(suggestionsComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, insertSuggestionButton, removeButton, searchByLabel, searchTextField, suggestionsComboBox, suggestionsComboBox1, suggestionsTextField});

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newEntryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newEntryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
        //filter the list then refrsh the table
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:

        if (newNameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please make sure to enter a name for the new contact.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Long.parseLong(newHomeTextField.getText());
            Long.parseLong(newWorkTextField.getText());
            Long.parseLong(newFaxTextField.getText());
            if (!newPositionTextField.getText().isEmpty()) {
                Integer.parseInt(newPositionTextField.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please make sure all fields other than the contact name are correct and contain only integers.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Contact newContact;
        if (newPositionTextField.getText().isEmpty()) {
            newContact = new Contact(newNameTextField.getText(), newHomeTextField.getText(), newWorkTextField.getText(), newFaxTextField.getText(), newEmailTextField.getText());
            allContacts.pushBack(newContact);
        } else {
            int pos = Integer.parseInt(newPositionTextField.getText());
            if (pos < 0 || pos > allContacts.size()) {
                JOptionPane.showMessageDialog(this, "Please insert at a valid position.", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                newContact = new Contact(newNameTextField.getText(), newHomeTextField.getText(), newWorkTextField.getText(), newFaxTextField.getText(), newEmailTextField.getText());
                allContacts.insert(pos, newContact);
            }
        }
        refreshTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        if (jTableContacts.getSelectedRowCount() == 0) {
            return;
        }
        int initialIndex = jTableContacts.getSelectedRow();
        int lastIndex = initialIndex + jTableContacts.getSelectedRowCount();
        for (int i = initialIndex; i < lastIndex; i++) {
            allContacts.remove(jTableContacts.getSelectedRow());
        }
        refreshTable();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void sortComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortComboBoxActionPerformed

    //read the DLL into the table from head to tail.
    private void refreshTable() {
        allContacts.printAll();
        DefaultTableModel model = (DefaultTableModel) jTableContacts.getModel();
        model.setRowCount(0);
        if (allContacts.size() == 0) {
            return;
        }
        List.Iterator itr = allContacts.front();
        do {
            try {
                Contact current = (Contact) itr.getValue();
                model.addRow(current.getVector());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.toString(), "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } while (itr.advance());

    }

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel filteringPanel;
    private javax.swing.JButton insertSuggestionButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContacts;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel newEmailLabel;
    private javax.swing.JTextField newEmailTextField;
    private javax.swing.JPanel newEntryPanel;
    private javax.swing.JTextField newFaxTextField;
    private javax.swing.JLabel newHomeLabel;
    private javax.swing.JTextField newHomeTextField;
    private javax.swing.JLabel newNameLabel;
    private javax.swing.JTextField newNameTextField;
    private javax.swing.JLabel newOther;
    private javax.swing.JLabel newPositionLabel;
    private javax.swing.JTextField newPositionTextField;
    private javax.swing.JLabel newWorkLabel;
    private javax.swing.JTextField newWorkTextField;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel searchByLabel;
    private javax.swing.JLabel searchByLabel1;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton sortButton;
    private javax.swing.JComboBox<String> sortComboBox;
    private javax.swing.JComboBox<String> suggestionsComboBox;
    private javax.swing.JComboBox<String> suggestionsComboBox1;
    private javax.swing.JTextField suggestionsTextField;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
