package lettercounter;
public class LetterCounter_ extends javax.swing.JFrame {

    public LetterCounter_() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Input = new javax.swing.JTextField();
        Calc = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        Letters = new javax.swing.JRadioButton();
        Consonants = new javax.swing.JRadioButton();
        Vowels = new javax.swing.JRadioButton();
        NonLetters = new javax.swing.JRadioButton();
        Output = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Input.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputActionPerformed(evt);
            }
        });

        Calc.setText("Calculate");
        Calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel1.setText("Insert Word");

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        buttonGroup1.add(Letters);
        Letters.setText("Letters");
        Letters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LettersActionPerformed(evt);
            }
        });

        buttonGroup1.add(Consonants);
        Consonants.setText("Consonants");

        buttonGroup1.add(Vowels);
        Vowels.setText("Vowels");
        Vowels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VowelsActionPerformed(evt);
            }
        });

        buttonGroup1.add(NonLetters);
        NonLetters.setText("Non-Letters");

        Output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Input)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Calc, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Output, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NonLetters)
                                    .addComponent(Consonants)
                                    .addComponent(Letters)
                                    .addComponent(Vowels)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(Exit))))
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Letters, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Vowels, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Input))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Consonants, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NonLetters, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Output))
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear)
                    .addComponent(Calc)
                    .addComponent(Exit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputActionPerformed

    private void CalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcActionPerformed
        String a = Input.getText().toLowerCase();
        int number = 0;
        int vowel = 0;
        int output = 0;
        for (int x = 0; x < a.length(); x++) {
            if (a.charAt(x) == 'a') {
                vowel++;
            }
            if (a.charAt(x) == 'b') {
                number++;
            }
            if (a.charAt(x) == 'c') {
                number++;
            }
            if (a.charAt(x) == 'd') {
                number++;
            }
            if (a.charAt(x) == 'e') {
                vowel++;
            }
            if (a.charAt(x) == 'f') {
                number++;
            }
            if (a.charAt(x) == 'g') {
                number++;
            }
            if (a.charAt(x) == 'h') {
                number++;
            }
            if (a.charAt(x) == 'i') {
                vowel++;
            }
            if (a.charAt(x) == 'j') {
                number++;
            }
            if (a.charAt(x) == 'k') {
                number++;
            }
            if (a.charAt(x) == 'l') {
                number++;
            }
            if (a.charAt(x) == 'm') {
                number++;
            }
            if (a.charAt(x) == 'n') {
                number++;
            }
            if (a.charAt(x) == 'o') {
                vowel++;
            }
            if (a.charAt(x) == 'p') {
                number++;
            }
            if (a.charAt(x) == 'q') {
                number++;
            }
            if (a.charAt(x) == 'r') {
                number++;
            }
            if (a.charAt(x) == 's') {
                number++;
            }
            if (a.charAt(x) == 't') {
                number++;
            }
            if (a.charAt(x) == 'u') {
                vowel++;
            }
            if (a.charAt(x) == 'v') {
                number++;
            }
            if (a.charAt(x) == 'w') {
                number++;
            }
            if (a.charAt(x) == 'x') {
                number++;
            }
            if (a.charAt(x) == 'y') {
                number++;
            }
            if (a.charAt(x) == 'z') {
                number++;
            }
        }
        if (Letters.isSelected()) {
            output = number + vowel;
            Output.setText(String.valueOf(output));
        } else {
            if (Vowels.isSelected()) {
                output = vowel;
                Output.setText(String.valueOf(output));
            } else {

                if (Consonants.isSelected()) {
                    output = number;
                    Output.setText(String.valueOf(output));
                } else {
                    if (NonLetters.isSelected()) {
                        output = a.length() - number - vowel;
                        Output.setText(String.valueOf(output));
                    } else {
                        Output.setText("Choose a letter group");
                    }
                }
            }
        }
    }//GEN-LAST:event_CalcActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Input.setText("");
        Output.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void LettersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LettersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LettersActionPerformed

    private void VowelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VowelsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VowelsActionPerformed

    private void OutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OutputActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LetterCounter_().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calc;
    private javax.swing.JButton Clear;
    private javax.swing.JRadioButton Consonants;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField Input;
    private javax.swing.JRadioButton Letters;
    private javax.swing.JRadioButton NonLetters;
    private javax.swing.JTextField Output;
    private javax.swing.JRadioButton Vowels;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
