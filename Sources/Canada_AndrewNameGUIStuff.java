/*
 *Andrew Canada
 *Period 4
 *IBCS 2
 *NameGUI
 */

/**
 *
 * @author andrew.canada
 */
public class NameGUIStuff extends javax.swing.JFrame {


    public NameGUIStuff() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Start = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ResultTextBox = new javax.swing.JTextField();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jTextField1.setEditable(false);
        jTextField1.setText("                          Letter Counter");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Name Here:");

        Start.setText("Start!");
        Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartMouseClicked(evt);
            }
        });

        jLabel2.setText("Amount of letters:");

        ResultTextBox.setEditable(false);

        Exit.setText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResultTextBox))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Start, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addComponent(Start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ResultTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(Exit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed

    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseClicked
/**
 * This program is the starting method
 * When clicked, it does 3 methods:
 * 1.Get information from the GUI
 * 2.Call LetterCounting to get the letter count
 * 3.Puts the amount of letters into the textbox
 */    
/**
 * 1.Get information from the GUI
 */  
    String Name=NameTextField.getText();
    int NumberOfChar = Name.length();
/**
 * 2.Call LetterCounting to get the letter count
 */    
    int NumberOfLetters = LetterCounting(Name, NumberOfChar);
/**
 * 3.Puts the amount of letters into the textbox
 */   
    ResultTextBox.setText(Integer.toString(NumberOfLetters));
    }//GEN-LAST:event_StartMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
    System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked
    
/**
 * This method is LetterCounting, where it counts the letters before returning.
 * This method has 3 main aspects: 
 * 1.Intialize variables and create the Alphabet String
 * 2.Checks each part of the string with each letter in the alphabet.
 * 3.Returns the number of letters
 */
    private int LetterCounting(String Name, int NumberofChar){
/**
 * 1.Intialize variables and create the Alphabet String
 */
        int NumberOfLetters = 0;
        String[]Alphabet = new String[26];
        Alphabet[0] = "A";
        Alphabet[1] = "B";
        Alphabet[2] = "C";
        Alphabet[3] = "D";
        Alphabet[4] = "E";
        Alphabet[5] = "F";
        Alphabet[6] = "G";
        Alphabet[7] = "H";
        Alphabet[8] = "I";
        Alphabet[9] = "J";
        Alphabet[10] = "K";
        Alphabet[11] = "L";
        Alphabet[12] = "M";
        Alphabet[13] = "N";
        Alphabet[14] = "O";
        Alphabet[15] = "P";
        Alphabet[16] = "Q";
        Alphabet[17] = "R";
        Alphabet[18] = "S";
        Alphabet[19] = "T";
        Alphabet[20] = "U";
        Alphabet[21] = "V";
        Alphabet[22] = "W";
        Alphabet[23] = "X";
        Alphabet[24] = "Y";
        Alphabet[25] = "Z";
/**
 * 2.Checks each part of the string with each letter in the alphabet.
 */
        for(int x=0;x<NumberofChar;x++){
            for (int l=0; l<25; l++){
                if (Character.toString(Name.charAt(x)).equalsIgnoreCase(Alphabet[l])){
                    NumberOfLetters++;
                }
        }
        }
/**
 * 3.Returns the number of letters
 */
        return NumberOfLetters;
    }
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
            java.util.logging.Logger.getLogger(NameGUIStuff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NameGUIStuff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NameGUIStuff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NameGUIStuff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NameGUIStuff().setVisible(true);
            }
        });
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField ResultTextBox;
    private javax.swing.JButton Start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
