package contacts;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.modelmbean.ModelMBean;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {
    
        public static int numberOfContacts;
        DefaultTableModel model;
        File f;
//CONSTRUCTOR
    public MainFrame() throws Exception {
 
        initComponents();
        ImageIcon img = new ImageIcon("src/Rescources/Contact.png");
        setIconImage(img.getImage());
        model = (DefaultTableModel) table.getModel();
        table.setAutoCreateRowSorter(true);
        f = new File("src/data.bin");
        if(!f.exists()){
            f.createNewFile();
        }
        start();
        
        // <editor-fold defaultstate="collapsed" desc="Setting a limit for input in the Text Input Field">
        fullNameField.setDocument(new JTextFieldCharLimit(30));
        phoneNumberField.setDocument(new JTextFieldCharLimit(13));
        emailField.setDocument(new JTextFieldCharLimit(30));
        adressField.setDocument(new JTextFieldCharLimit(30));
        searchField.setDocument(new JTextFieldCharLimit(30));
        // </editor-fold> 
    }
    
//JAVA SWING GUI ---------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        newClientPanel = new javax.swing.JPanel();
        editorLabel = new javax.swing.JLabel();
        nameIcon = new javax.swing.JLabel();
        phoneIcon = new javax.swing.JLabel();
        emailIcon = new javax.swing.JLabel();
        adressIcon = new javax.swing.JLabel();
        fullNameLabel = new javax.swing.JLabel();
        fullNameField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        adressLabel = new javax.swing.JLabel();
        adressField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        totalNumberOfContactsLabel = new javax.swing.JLabel();
        counterLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        contactsListLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contacts Program");
        setLocation(new java.awt.Point(220, 100));
        setMinimumSize(new java.awt.Dimension(990, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        mainPanel.setBackground(new java.awt.Color(237, 237, 237));
        mainPanel.setMinimumSize(new java.awt.Dimension(990, 550));
        mainPanel.setPreferredSize(new java.awt.Dimension(990, 550));

        newClientPanel.setBackground(new java.awt.Color(230, 230, 230));
        newClientPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(204, 204, 204)));
        newClientPanel.setForeground(new java.awt.Color(204, 204, 204));

        editorLabel.setFont(new java.awt.Font("Dubai", 0, 48)); // NOI18N
        editorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editorLabel.setText("Editor");

        nameIcon.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        nameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rescources/Full Name.png"))); // NOI18N

        phoneIcon.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        phoneIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rescources/Phone.png"))); // NOI18N

        emailIcon.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        emailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rescources/Mail.png"))); // NOI18N

        adressIcon.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        adressIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rescources/Adress.png"))); // NOI18N

        fullNameLabel.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        fullNameLabel.setText("Full Name");

        fullNameField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        fullNameField.setToolTipText("");
        fullNameField.setName(""); // NOI18N
        fullNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameFieldActionPerformed(evt);
            }
        });

        phoneNumberLabel.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        phoneNumberLabel.setText("Phone Number");

        phoneNumberField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        emailLabel.setText("Email");

        emailField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        adressLabel.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        adressLabel.setText("Adress (optional)");

        adressField.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        adressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adressFieldActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(204, 204, 204));
        addButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(51, 204, 0));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(204, 204, 204));
        clearButton.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(204, 204, 204));
        updateButton.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteButton.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 51, 51));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newClientPanelLayout = new javax.swing.GroupLayout(newClientPanel);
        newClientPanel.setLayout(newClientPanelLayout);
        newClientPanelLayout.setHorizontalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addGroup(newClientPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(newClientPanelLayout.createSequentialGroup()
                                    .addComponent(nameIcon)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fullNameField)
                                        .addComponent(fullNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(newClientPanelLayout.createSequentialGroup()
                                    .addComponent(emailIcon)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emailField)))
                                .addGroup(newClientPanelLayout.createSequentialGroup()
                                    .addComponent(phoneIcon)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(newClientPanelLayout.createSequentialGroup()
                                    .addComponent(adressIcon)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(adressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                        .addComponent(adressField, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        newClientPanelLayout.setVerticalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(editorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fullNameLabel)
                .addGap(4, 4, 4)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fullNameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberLabel)
                .addGap(4, 4, 4)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneNumberField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addGap(4, 4, 4)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adressLabel)
                .addGap(4, 4, 4)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adressIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        totalNumberOfContactsLabel.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        totalNumberOfContactsLabel.setText("Total Number Of Contacts");

        counterLabel.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        counterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counterLabel.setText("0");
        counterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        table.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Full Name", "Phone Number", "Email", "Adress"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setPreferredSize(new java.awt.Dimension(445, 710));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(150);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(100);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(100);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        searchField.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        searchField.setMinimumSize(new java.awt.Dimension(7, 23));
        searchField.setPreferredSize(new java.awt.Dimension(7, 23));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        comboBox.setBackground(new java.awt.Color(204, 204, 204));
        comboBox.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Full Name", "Phone Number", "Email", "Adress" }));
        comboBox.setPreferredSize(new java.awt.Dimension(107, 23));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(204, 204, 204));
        searchButton.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        searchButton.setText("Search");
        searchButton.setMaximumSize(new java.awt.Dimension(65, 23));
        searchButton.setMinimumSize(new java.awt.Dimension(65, 23));
        searchButton.setPreferredSize(new java.awt.Dimension(65, 23));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        contactsListLabel.setFont(new java.awt.Font("Dubai", 0, 48)); // NOI18N
        contactsListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactsListLabel.setText("Contact List");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(totalNumberOfContactsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(counterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(contactsListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newClientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(contactsListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalNumberOfContactsLabel)
                            .addComponent(counterLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void fullNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameFieldActionPerformed
        
    }//GEN-LAST:event_fullNameFieldActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
       
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        
    }//GEN-LAST:event_emailFieldActionPerformed

    private void adressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adressFieldActionPerformed
        
    }//GEN-LAST:event_adressFieldActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        
    }//GEN-LAST:event_searchFieldActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        
    }//GEN-LAST:event_comboBoxActionPerformed

//CLEAR
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed
//ADD
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       
        if(checkMainInfo()){
            Contact newContact;
            
            if(adressField.getText().trim().isEmpty()){
                newContact = new Contact(fullNameField.getText().trim(),
                        phoneNumberField.getText().trim(), 
                        emailField.getText().trim());
            }
            else{
                newContact = new Contact(fullNameField.getText().trim(),
                        phoneNumberField.getText().trim(), 
                        emailField.getText().trim(),
                        adressField.getText().trim());
            }
            if(!newContact.flag()){
                JOptionPane.showMessageDialog(this,
                        newContact.getMessage(),
                        "Invalid Information" , 
                        JOptionPane.ERROR_MESSAGE);
            }
            else{
                try {
                    addToTable(newContact);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
                JOptionPane.showMessageDialog(this, 
                        "Please Enter All Main Information!", 
                        "Empty Fields" , 
                        JOptionPane.CANCEL_OPTION);
        }
        
    }//GEN-LAST:event_addButtonActionPerformed
//DELETE
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       if(numberOfContacts ==0){
           JOptionPane.showMessageDialog(this, 
                   "There is Nothing to Delete!",
                   "Empty Table",
                   JOptionPane.CANCEL_OPTION);
       }
       else{
            int index = table.getSelectedRow();
            
            if(index <0){
               JOptionPane.showMessageDialog(this,
                       "Select A Row to Delete!",
                       "Unable to Delete",
                       JOptionPane.CANCEL_OPTION);
            }
            else{
               model.removeRow(index);
               numberOfContacts--;
               updateCounter(numberOfContacts);
               
                try {
                    updateFile();
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                checkIdNumbers();
            }
       }
    }//GEN-LAST:event_deleteButtonActionPerformed
//SEARCH
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (searchField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Search Field is Empty!",
                    "Unable to Search", 
                    JOptionPane.CANCEL_OPTION);
        }
        else{
            if (comboBox.getSelectedItem().equals("All")) {
                for (int i = 0; i < numberOfContacts; i++) {
                    for (int j = 1; j < 5; j++) {
                        if(model.getValueAt(i, j).equals(searchField.getText().trim())){
                            validSearch(i);
                            return;
                        }
                    }
                    
                }
            }
            else if (comboBox.getSelectedItem().equals("Full Name")){
                for (int i = 0; i < numberOfContacts; i++) {
                        if(model.getValueAt(i, 1).equals(searchField.getText().trim())){
                            validSearch(i);
                            return;
                        }
                }
            }
            else if (comboBox.getSelectedItem().equals("Phone Number")){
                for (int i = 0; i < numberOfContacts; i++) {
                        if(model.getValueAt(i, 2).equals(searchField.getText().trim())){
                            validSearch(i);
                            return;
                        }
                }
            }
            else if (comboBox.getSelectedItem().equals("Email")){
                for (int i = 0; i < numberOfContacts; i++) {
                        if(model.getValueAt(i, 3).equals(searchField.getText().trim())){
                            validSearch(i);
                            return;
                        }
                }
            }
            else {
                for (int i = 0; i < numberOfContacts; i++) {
                        if(model.getValueAt(i, 4).equals(searchField.getText().trim())){
                            validSearch(i);
                            return;
                        }
                }
            }
            JOptionPane.showMessageDialog(this,"No Data found in "+comboBox.getSelectedItem(),
                    "Search Error",
                    JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_searchButtonActionPerformed
//UPDATE
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       
        int index = table.getSelectedRow();
        
        if(index <0){
               JOptionPane.showMessageDialog(this,
                       "Select A Row to Update!",
                       "Unable to Update",
                       JOptionPane.CANCEL_OPTION);
            }
        else{
            if(checkMainInfo()){
                Contact newContact;

                if(adressField.getText().trim().isEmpty()){
                    newContact = new Contact(fullNameField.getText().trim(),
                            phoneNumberField.getText().trim(), 
                            emailField.getText().trim());
                }
                else{
                    newContact = new Contact(fullNameField.getText().trim(),
                            phoneNumberField.getText().trim(), 
                            emailField.getText().trim(),
                            adressField.getText().trim());
                }
                if(!newContact.flag()){
                    JOptionPane.showMessageDialog(this,
                            newContact.getMessage(),
                            "Invalid Information" , 
                            JOptionPane.ERROR_MESSAGE);
                }
                else{
                    try {
                        updateToTable(newContact);
                    } catch (Exception ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else{
                    JOptionPane.showMessageDialog(this, 
                            "Please Enter All Main Information!", 
                            "Empty Fields" , 
                            JOptionPane.CANCEL_OPTION);
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

//MY METHODS -------------------------------------------------------------------
    
    public void start() throws Exception{
        
        FileInputStream fi= new FileInputStream(f);
        if(f.length() <= 0){
            return;
        }
        ObjectInputStream oi= new ObjectInputStream(fi);
        Vector<Vector> tableData = (Vector<Vector>) oi.readObject();
        oi.close();
        fi.close();
        numberOfContacts= tableData.size();
        
        for (int i = 0; i < numberOfContacts; i++) {
            model.addRow(new Object[]{tableData.get(i).get(0),
                tableData.get(i).get(1), 
                tableData.get(i).get(2), 
                tableData.get(i).get(3), 
                tableData.get(i).get(4)});
        }
        updateCounter(numberOfContacts);
        
    }
    
    public void updateFile() throws Exception{
        Vector<Vector> tableData = model.getDataVector();
        FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(tableData);
        fo.close();
        oo.close();
    }
    
    public void addToTable(Contact c) throws Exception {
        model.addRow(new Object[]{table.getRowCount()+1, c.getFullName(), c.getPhoneNumber(), c.getEmail(),
            c.getAdress().isEmpty()? "": c.getAdress()});
        numberOfContacts++;
        updateCounter(numberOfContacts);
        updateFile();
        clear();
        
    }
    
    public void updateToTable(Contact c ) throws Exception{
        int i=  table.getSelectedRow();
        model.setValueAt(c.getFullName(),i, 1);
        model.setValueAt(c.getPhoneNumber(), i, 2);
        model.setValueAt(c.getEmail(), i, 3);
        model.setValueAt(c.getAdress(), i, 4);
        updateFile();
    }
    
    public boolean checkMainInfo(){
       return !fullNameField.getText().trim().isEmpty() &&
              !phoneNumberField.getText().trim().isEmpty() && 
              !emailField.getText().trim().isEmpty();
    }
    
    public void checkIdNumbers(){
        for (int i = 0; i < numberOfContacts; i++) {
            model.setValueAt(i+1, i, 0);
        }
        updateCounter(numberOfContacts);
    }
    
    public void clear(){
        fullNameField.setText("");
        phoneNumberField.setText("");
        emailField.setText("");
        adressField.setText("");
    }
    
    public void updateCounter(int numberOfContacts){
         counterLabel.setText(numberOfContacts+"");
    }
    
    public void validSearch(int row){
        table.setRowSelectionInterval(row, row);
        setFields(row);
    }
    
    public void setFields(int row){
        fullNameField.setText(model.getValueAt(row, 1)+"");
        phoneNumberField.setText(model.getValueAt(row, 2)+"");
        emailField.setText(model.getValueAt(row, 3)+"");
        adressField.setText(model.getValueAt(row, 4)+"");
    }
    
//MAIN METHOD ------------------------------------------------------------------
    
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField adressField;
    private javax.swing.JLabel adressIcon;
    private javax.swing.JLabel adressLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel contactsListLabel;
    private javax.swing.JLabel counterLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel editorLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailIcon;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameIcon;
    private javax.swing.JPanel newClientPanel;
    private javax.swing.JLabel phoneIcon;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable table;
    private javax.swing.JLabel totalNumberOfContactsLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
