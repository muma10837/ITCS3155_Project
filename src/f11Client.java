/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bobby
 */
public class f11Client extends javax.swing.JFrame {

    
    double income = 0;
    double savings = 0;
    double rent = 0;
    double electric = 0;
    double carI = 0;
    double phone = 0;
    double groceries = 0;
    double vehicleM = 0;
    double schoolD = 0;
    double toPay = 0;
    double afford = 0;
    double paidW = 0;
    
    /**
     * Creates new form f11Client
     */
    public f11Client() {
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

        tabbedPanelMain = new javax.swing.JTabbedPane();
        incomePanel = new javax.swing.JPanel();
        incomeLabel = new javax.swing.JLabel();
        incomeTextField = new javax.swing.JTextField();
        incomeEnterButton = new javax.swing.JButton();
        expensePanel = new javax.swing.JPanel();
        rentLabel = new javax.swing.JLabel();
        electricLabel = new javax.swing.JLabel();
        carInsuranceLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        groceryLabel = new javax.swing.JLabel();
        vehicleMaintanenceLabel = new javax.swing.JLabel();
        schoolDebtLabel = new javax.swing.JLabel();
        rentTextField = new javax.swing.JTextField();
        electricTextField = new javax.swing.JTextField();
        carTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        groceryTextField = new javax.swing.JTextField();
        vehicleMainTextField = new javax.swing.JTextField();
        schoolDebtTextField = new javax.swing.JTextField();
        expenseEnterButton = new javax.swing.JButton();
        debtPanel = new javax.swing.JPanel();
        canPayLabel = new javax.swing.JLabel();
        willPayLabel = new javax.swing.JLabel();
        debtDoneLabel = new javax.swing.JLabel();
        canPayTextField = new javax.swing.JTextField();
        willPayTextField = new javax.swing.JTextField();
        debtDoneTextField = new javax.swing.JTextField();
        debtDoneMonthlyLabel = new javax.swing.JLabel();
        calculateDebtButton = new javax.swing.JButton();
        savingsPanel = new javax.swing.JPanel();
        iSavedLabel = new javax.swing.JLabel();
        iSavedTextField = new javax.swing.JTextField();
        iSavedMonthlyLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Financial// Help Tool");

        incomeLabel.setText("Your Income:");

        incomeEnterButton.setText("Enter");
        incomeEnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeEnterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout incomePanelLayout = new javax.swing.GroupLayout(incomePanel);
        incomePanel.setLayout(incomePanelLayout);
        incomePanelLayout.setHorizontalGroup(
            incomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incomePanelLayout.createSequentialGroup()
                .addComponent(incomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incomeEnterButton)
                .addGap(0, 463, Short.MAX_VALUE))
        );
        incomePanelLayout.setVerticalGroup(
            incomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(incomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incomeLabel)
                    .addComponent(incomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incomeEnterButton))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        tabbedPanelMain.addTab("Income", incomePanel);

        rentLabel.setText("Rent/House Payment:");

        electricLabel.setText("Electric:");

        carInsuranceLabel.setText("Car Insurance:");

        phoneLabel.setText("Phone Bill:");

        groceryLabel.setText("Groceries:");

        vehicleMaintanenceLabel.setText("Vehicle Maintanence:");

        schoolDebtLabel.setText("School Debt:");

        expenseEnterButton.setText("Enter");
        expenseEnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expenseEnterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout expensePanelLayout = new javax.swing.GroupLayout(expensePanel);
        expensePanel.setLayout(expensePanelLayout);
        expensePanelLayout.setHorizontalGroup(
            expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expensePanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(electricLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carInsuranceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(groceryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehicleMaintanenceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(schoolDebtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(electricTextField)
                    .addComponent(carTextField)
                    .addComponent(phoneTextField)
                    .addComponent(groceryTextField)
                    .addComponent(vehicleMainTextField)
                    .addComponent(schoolDebtTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expenseEnterButton)
                .addGap(0, 387, Short.MAX_VALUE))
        );
        expensePanelLayout.setVerticalGroup(
            expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expensePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentLabel)
                    .addComponent(rentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(electricLabel)
                    .addComponent(electricTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carInsuranceLabel)
                    .addComponent(carTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groceryLabel)
                    .addComponent(groceryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleMaintanenceLabel)
                    .addComponent(vehicleMainTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schoolDebtLabel)
                    .addComponent(schoolDebtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expenseEnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        tabbedPanelMain.addTab("Expenses", expensePanel);

        canPayLabel.setText("I Can Afford To Pay:");

        willPayLabel.setText("I Would Like To Pay:");

        debtDoneLabel.setText("Debt Paid Within:");

        canPayTextField.setEditable(false);
        canPayTextField.setBackground(new java.awt.Color(204, 204, 204));

        debtDoneTextField.setEditable(false);
        debtDoneTextField.setBackground(new java.awt.Color(204, 204, 204));

        debtDoneMonthlyLabel.setText("Months");

        calculateDebtButton.setText("Calculate");
        calculateDebtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateDebtButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout debtPanelLayout = new javax.swing.GroupLayout(debtPanel);
        debtPanel.setLayout(debtPanelLayout);
        debtPanelLayout.setHorizontalGroup(
            debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debtPanelLayout.createSequentialGroup()
                .addGroup(debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(canPayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(willPayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(debtDoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(willPayTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(debtDoneTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canPayTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(debtDoneMonthlyLabel)
                    .addComponent(calculateDebtButton))
                .addGap(0, 388, Short.MAX_VALUE))
        );
        debtPanelLayout.setVerticalGroup(
            debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canPayLabel)
                    .addComponent(canPayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(willPayLabel)
                        .addComponent(willPayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calculateDebtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debtDoneLabel)
                    .addComponent(debtDoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debtDoneMonthlyLabel))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        tabbedPanelMain.addTab("Debt De-Escalator", debtPanel);

        iSavedLabel.setText("I Am Saving:");

        iSavedTextField.setEditable(false);
        iSavedTextField.setBackground(new java.awt.Color(204, 204, 204));

        iSavedMonthlyLabel.setText("Monthly");

        javax.swing.GroupLayout savingsPanelLayout = new javax.swing.GroupLayout(savingsPanel);
        savingsPanel.setLayout(savingsPanelLayout);
        savingsPanelLayout.setHorizontalGroup(
            savingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savingsPanelLayout.createSequentialGroup()
                .addComponent(iSavedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iSavedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iSavedMonthlyLabel)
                .addGap(0, 487, Short.MAX_VALUE))
        );
        savingsPanelLayout.setVerticalGroup(
            savingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(savingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iSavedLabel)
                    .addComponent(iSavedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iSavedMonthlyLabel))
                .addContainerGap(368, Short.MAX_VALUE))
        );

        tabbedPanelMain.addTab("Savings", savingsPanel);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPanelMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void incomeEnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeEnterButtonActionPerformed
        // TODO add your handling code here:
        income = Double.parseDouble(incomeTextField.getText());
    }//GEN-LAST:event_incomeEnterButtonActionPerformed

    private void calculateDebtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateDebtButtonActionPerformed
        // TODO add your handling code here:
        toPay = Double.parseDouble(willPayTextField.getText());
        savings = afford - toPay;
        paidW = schoolD/toPay;
        debtDoneTextField.setText(Double.toString(paidW));
        iSavedTextField.setText(Double.toString(savings));
    }//GEN-LAST:event_calculateDebtButtonActionPerformed

    private void expenseEnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expenseEnterButtonActionPerformed
        // TODO add your handling code here:
        rent = Double.parseDouble(rentTextField.getText());
        electric = Double.parseDouble(electricTextField.getText());
        carI = Double.parseDouble(carTextField.getText());
        phone = Double.parseDouble(phoneTextField.getText());
        groceries = Double.parseDouble(groceryTextField.getText());
        vehicleM = Double.parseDouble(vehicleMainTextField.getText());
        schoolD = Double.parseDouble(schoolDebtTextField.getText());
        afford = income - (rent + electric + carI + phone + groceries + vehicleM);
        canPayTextField.setText(Double.toString(afford));
    }//GEN-LAST:event_expenseEnterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(f11Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f11Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f11Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f11Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f11Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateDebtButton;
    private javax.swing.JLabel canPayLabel;
    private javax.swing.JTextField canPayTextField;
    private javax.swing.JLabel carInsuranceLabel;
    private javax.swing.JTextField carTextField;
    private javax.swing.JLabel debtDoneLabel;
    private javax.swing.JLabel debtDoneMonthlyLabel;
    private javax.swing.JTextField debtDoneTextField;
    private javax.swing.JPanel debtPanel;
    private javax.swing.JLabel electricLabel;
    private javax.swing.JTextField electricTextField;
    private javax.swing.JButton expenseEnterButton;
    private javax.swing.JPanel expensePanel;
    private javax.swing.JLabel groceryLabel;
    private javax.swing.JTextField groceryTextField;
    private javax.swing.JLabel iSavedLabel;
    private javax.swing.JLabel iSavedMonthlyLabel;
    private javax.swing.JTextField iSavedTextField;
    private javax.swing.JButton incomeEnterButton;
    private javax.swing.JLabel incomeLabel;
    private javax.swing.JPanel incomePanel;
    private javax.swing.JTextField incomeTextField;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel rentLabel;
    private javax.swing.JTextField rentTextField;
    private javax.swing.JPanel savingsPanel;
    private javax.swing.JLabel schoolDebtLabel;
    private javax.swing.JTextField schoolDebtTextField;
    private javax.swing.JTabbedPane tabbedPanelMain;
    private javax.swing.JTextField vehicleMainTextField;
    private javax.swing.JLabel vehicleMaintanenceLabel;
    private javax.swing.JLabel willPayLabel;
    private javax.swing.JTextField willPayTextField;
    // End of variables declaration//GEN-END:variables
}
