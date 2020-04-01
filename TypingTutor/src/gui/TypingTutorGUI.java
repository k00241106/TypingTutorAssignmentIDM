/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Eoghan
 */
public class TypingTutorGUI extends javax.swing.JFrame implements KeyListener {

    Color highlight = new Color(127, 255, 0);
    Color release = new Color(240, 240, 240);

    ArrayList<String> easyLevelPangram = new ArrayList<>();

    String easyPangramOne = "The quick brown fox jumps over the lazy dog";//31+8 spaces =39;
    String easyPangramTwo = "The five boxing wizards jump quickly";//31+5 spaces=36;
    String easyPangramThree = "Waxy and quivering, jocks fumble the pizza";//36+6 spaces =42;

    ArrayList<String> mediumLevelPangram = new ArrayList<>();

    String mediumPangramOne = "Sphinx of black quartz, judge my vow";
    String mediumPangramTwo = "Jackdaws love my big sphinx of quartz";
    String mediumPangramThree = "Two driven jocks help fax my big quiz";

    ArrayList<String> hardLevelPangram = new ArrayList<>();

    String hardPangramOne = "A wizard's job is to vex chumps quickly in fog";
    String hardPangramTwo = "By Jove, my quick study of lexicography won a prize";
    String hardPangramThree = "How vexingly quick daft zebras jump";

    ArrayList<String> tips = new ArrayList<>();

    String tipOne = "Try out all the difficulties to challenge yourself!!!";
    String tipTwo = "Place your fingers on the f and j keys for better accuracy";
    String tipThree = "Check out the leaderboards for your score";

    /**
     * Creates new form TypingTutorGUI
     */
    public TypingTutorGUI() {
        initComponents();
        disableButton();
        deselectButton();
//        displayTextArea.addKeyListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        difficultyButtonGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        typingTutorPanel = new javax.swing.JPanel();
        mainTypingPanel = new javax.swing.JPanel();
        instructionPanel = new javax.swing.JPanel();
        instructionLabel = new javax.swing.JLabel();
        radioButtonPanel = new javax.swing.JPanel();
        easyRadioButton = new javax.swing.JRadioButton();
        mediumRadioButton = new javax.swing.JRadioButton();
        hardRadioButton = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        leaderBoardPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Typing Application");

        instructionLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        instructionLabel.setForeground(new java.awt.Color(0, 51, 255));
        instructionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructionLabel.setText("NB: When you have finsihed click the finish button to see your score!!!");

        javax.swing.GroupLayout instructionPanelLayout = new javax.swing.GroupLayout(instructionPanel);
        instructionPanel.setLayout(instructionPanelLayout);
        instructionPanelLayout.setHorizontalGroup(
            instructionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(instructionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        instructionPanelLayout.setVerticalGroup(
            instructionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instructionLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        difficultyButtonGroup.add(easyRadioButton);
        easyRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        easyRadioButton.setForeground(new java.awt.Color(0, 204, 51));
        easyRadioButton.setText("Easy");

        difficultyButtonGroup.add(mediumRadioButton);
        mediumRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mediumRadioButton.setForeground(new java.awt.Color(255, 165, 0));
        mediumRadioButton.setText("Medium");

        difficultyButtonGroup.add(hardRadioButton);
        hardRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hardRadioButton.setForeground(new java.awt.Color(220, 20, 60));
        hardRadioButton.setText("Hard");

        javax.swing.GroupLayout radioButtonPanelLayout = new javax.swing.GroupLayout(radioButtonPanel);
        radioButtonPanel.setLayout(radioButtonPanelLayout);
        radioButtonPanelLayout.setHorizontalGroup(
            radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioButtonPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(easyRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)
                .addComponent(mediumRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hardRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        radioButtonPanelLayout.setVerticalGroup(
            radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioButtonPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(radioButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediumRadioButton)
                    .addComponent(hardRadioButton)
                    .addComponent(easyRadioButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Your Message is:");

        jButton1.setText("`");

        jButton2.setText("1");

        jButton3.setText("2");

        jButton4.setText("3");

        jButton5.setText("4");

        jButton6.setText("5");

        jButton7.setText("6");

        jButton8.setText("7");

        jButton9.setText("8");

        jButton10.setText("9");

        jButton11.setText("0");

        jButton12.setText("-");

        jButton13.setText("+");

        jButton14.setText("backspace");

        jButton15.setText("tab");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainTypingPanelLayout = new javax.swing.GroupLayout(mainTypingPanel);
        mainTypingPanel.setLayout(mainTypingPanelLayout);
        mainTypingPanelLayout.setHorizontalGroup(
            mainTypingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainTypingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainTypingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(instructionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
            .addGroup(mainTypingPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(mainTypingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainTypingPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        mainTypingPanelLayout.setVerticalGroup(
            mainTypingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTypingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instructionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radioButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout typingTutorPanelLayout = new javax.swing.GroupLayout(typingTutorPanel);
        typingTutorPanel.setLayout(typingTutorPanelLayout);
        typingTutorPanelLayout.setHorizontalGroup(
            typingTutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typingTutorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTypingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        typingTutorPanelLayout.setVerticalGroup(
            typingTutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, typingTutorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTypingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TypingTutor", typingTutorPanel);

        javax.swing.GroupLayout leaderBoardPanelLayout = new javax.swing.GroupLayout(leaderBoardPanel);
        leaderBoardPanel.setLayout(leaderBoardPanelLayout);
        leaderBoardPanelLayout.setHorizontalGroup(
            leaderBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1045, Short.MAX_VALUE)
        );
        leaderBoardPanelLayout.setVerticalGroup(
            leaderBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("LeaderBoard", leaderBoardPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TypingTutorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TypingTutorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TypingTutorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TypingTutorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TypingTutorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup difficultyButtonGroup;
    private javax.swing.JRadioButton easyRadioButton;
    private javax.swing.JRadioButton hardRadioButton;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JPanel instructionPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel leaderBoardPanel;
    private javax.swing.JPanel mainTypingPanel;
    private javax.swing.JRadioButton mediumRadioButton;
    private javax.swing.JPanel radioButtonPanel;
    private javax.swing.JPanel typingTutorPanel;
    // End of variables declaration//GEN-END:variables

    private void displayEasyPan(ArrayList<String> easyLevelPangram) {
        Random rand = new Random();
        for (int i = 0; i < easyLevelPangram.size(); i++) {
            pangramLabel.setText(easyLevelPangram.get(rand.nextInt(easyLevelPangram.size())));
            pangramLabel.setForeground(Color.RED);
        }
    }

    private void fillEasyPan(ArrayList<String> easyLevelPangram) {
        easyLevelPangram.add(easyPangramOne);
        easyLevelPangram.add(easyPangramTwo);
        easyLevelPangram.add(easyPangramThree);
    }

    public void displayMediumPan(ArrayList<String> mediumLevelPangram) {
        Random rands = new Random();
        for (int i = 0; i < mediumLevelPangram.size(); i++) {
            pangramLabel.setText(mediumLevelPangram.get(rands.nextInt(mediumLevelPangram.size())));
            pangramLabel.setForeground(Color.RED);
        }
    }

    public void fillMediumPan(ArrayList<String> mediumLevelPangram) {
        mediumLevelPangram.add(mediumPangramOne);
        mediumLevelPangram.add(mediumPangramTwo);
        mediumLevelPangram.add(mediumPangramThree);
    }

    public void displayHardPan(ArrayList<String> hardLevelPangram) {
        Random rands = new Random();
        for (int i = 0; i < hardLevelPangram.size(); i++) {
            pangramLabel.setText(hardLevelPangram.get(rands.nextInt(hardLevelPangram.size())));
            pangramLabel.setForeground(Color.RED);
        }
    }

    public void fillHardPan(ArrayList<String> hardLevelPangram) {
        hardLevelPangram.add(hardPangramOne);
        hardLevelPangram.add(hardPangramTwo);
        hardLevelPangram.add(hardPangramThree);
    }

    public void displayTips(ArrayList<String> tips) {

    }

    public void fillTips(ArrayList<String> tips) {

    }

    public void disableButton() {
        backspaceButton.setEnabled(false);
        backTickButton.setEnabled(false);
    }

    public void resetAfterFinish() {
        displayTextArea.setText("");
        pangramLabel.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        displayTextArea.setText(displayTextArea.getText() + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Get The KeyCode
        int keyCode = e.getKeyCode();
        //Switch statement for handling keys pressed
        switch (keyCode) {
            //numbers
            case KeyEvent.VK_0:
                zeroButton.setBackground(highlight);
                break;
            case KeyEvent.VK_1:
                oneButton.setBackground(highlight);
                break;
            case KeyEvent.VK_2:
                twoButton.setBackground(highlight);
                break;
            case KeyEvent.VK_3:
                threeButton.setBackground(highlight);
                break;
            case KeyEvent.VK_4:
                fourButton.setBackground(highlight);
                break;
            case KeyEvent.VK_5:
                fiveButton.setBackground(highlight);
                break;
            case KeyEvent.VK_6:
                sixButton.setBackground(highlight);
                break;
            case KeyEvent.VK_7:
                sevenButton.setBackground(highlight);
                break;
            case KeyEvent.VK_8:
                eightButton.setBackground(highlight);
                break;
            case KeyEvent.VK_9:
                nineButton.setBackground(highlight);
                break;
            //letters
            case KeyEvent.VK_A:
                aButton.setBackground(highlight);
                break;
            case KeyEvent.VK_B:
                bButton.setBackground(highlight);
                break;
            case KeyEvent.VK_C:
                cButton.setBackground(highlight);
                break;
            case KeyEvent.VK_D:
                dButton.setBackground(highlight);
                break;
            case KeyEvent.VK_E:
                eButton.setBackground(highlight);
                break;
            case KeyEvent.VK_F:
                fButton.setBackground(highlight);
                break;
            case KeyEvent.VK_G:
                gButton.setBackground(highlight);
                break;
            case KeyEvent.VK_H:
                hButton.setBackground(highlight);
                break;
            case KeyEvent.VK_I:
                iButton.setBackground(highlight);
                break;
            case KeyEvent.VK_J:
                jButton.setBackground(highlight);
                break;
            case KeyEvent.VK_K:
                kButton.setBackground(highlight);
                break;
            case KeyEvent.VK_L:
                lButton.setBackground(highlight);
                break;
            case KeyEvent.VK_M:
                mButton.setBackground(highlight);
                break;
            case KeyEvent.VK_N:
                nButton.setBackground(highlight);
                break;
            case KeyEvent.VK_O:
                oButton.setBackground(highlight);
                break;
            case KeyEvent.VK_P:
                pButton.setBackground(highlight);
                break;
            case KeyEvent.VK_Q:
                qButton.setBackground(highlight);
                break;
            case KeyEvent.VK_R:
                rButton.setBackground(highlight);
                break;
            case KeyEvent.VK_S:
                sButton.setBackground(highlight);
                break;
            case KeyEvent.VK_T:
                tButton.setBackground(highlight);
                break;
            case KeyEvent.VK_U:
                uButton.setBackground(highlight);
                break;
            case KeyEvent.VK_V:
                vButton.setBackground(highlight);
                break;
            case KeyEvent.VK_W:
                wButton.setBackground(highlight);
                break;
            case KeyEvent.VK_X:
                xButton.setBackground(highlight);
                break;
            case KeyEvent.VK_Y:
                yButton.setBackground(highlight);
                break;
            case KeyEvent.VK_Z:
                zButton.setBackground(highlight);
                break;
            //special charachters
            case KeyEvent.VK_OPEN_BRACKET:
                openSquareBracketButton.setBackground(highlight);
                break;
            case KeyEvent.VK_CLOSE_BRACKET:
                closeSquareBracketButton.setBackground(highlight);
                break;
            case KeyEvent.VK_MINUS:
                minusButton.setBackground(highlight);
                break;
//            case KeyEvent.VK_EQUALS+KeyEvent.VK_SHIFT:
//                plusButton.setBackground(highlight);
//                break;
            case KeyEvent.VK_BACK_SPACE:
                backspaceButton.setBackground(highlight);
                break;
            case KeyEvent.VK_TAB:
                tabButton.setBackground(highlight);
                break;
            case KeyEvent.VK_CAPS_LOCK:
                capsButton.setBackground(highlight);
                break;
            case KeyEvent.VK_SHIFT:
                shiftButton.setBackground(highlight);
                break;
            case KeyEvent.VK_BACK_SLASH:
                forwardSlashButton.setBackground(highlight);
                break;
            case KeyEvent.VK_SEMICOLON:
                semicolonButton.setBackground(highlight);
                break;
            case KeyEvent.VK_QUOTE:
                apostropheButton.setBackground(highlight);
                break;
            case KeyEvent.VK_ENTER:
                enterButton.setBackground(highlight);
                break;
            case KeyEvent.VK_COMMA:
                commaButton.setBackground(highlight);
                break;
            case KeyEvent.VK_PERIOD:
                dotButton.setBackground(highlight);
                break;
            case KeyEvent.VK_UP:
                upArrowButton.setBackground(highlight);
                break;
            case KeyEvent.VK_LEFT:
                leftButton.setBackground(highlight);
                break;
            case KeyEvent.VK_RIGHT:
                rightButton.setBackground(highlight);
                break;
            case KeyEvent.VK_DOWN:
                downArrowButton.setBackground(highlight);
                break;
            case KeyEvent.VK_SPACE:
                spaceButton.setBackground(highlight);
                break;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            //numbers
            case KeyEvent.VK_0:
                zeroButton.setBackground(release);
                break;
            case KeyEvent.VK_1:
                oneButton.setBackground(release);
                break;
            case KeyEvent.VK_2:
                twoButton.setBackground(release);
                break;
            case KeyEvent.VK_3:
                threeButton.setBackground(release);
                break;
            case KeyEvent.VK_4:
                fourButton.setBackground(release);
                break;
            case KeyEvent.VK_5:
                fiveButton.setBackground(release);
                break;
            case KeyEvent.VK_6:
                sixButton.setBackground(release);
                break;
            case KeyEvent.VK_7:
                sevenButton.setBackground(release);
                break;
            case KeyEvent.VK_8:
                eightButton.setBackground(release);
                break;
            case KeyEvent.VK_9:
                nineButton.setBackground(release);
                break;
            //letters
            case KeyEvent.VK_A:
                aButton.setBackground(release);
                break;
            case KeyEvent.VK_B:
                bButton.setBackground(release);
                break;
            case KeyEvent.VK_C:
                cButton.setBackground(release);
                break;
            case KeyEvent.VK_D:
                dButton.setBackground(release);
                break;
            case KeyEvent.VK_E:
                eButton.setBackground(release);
                break;
            case KeyEvent.VK_F:
                fButton.setBackground(release);
                break;
            case KeyEvent.VK_G:
                gButton.setBackground(release);
                break;
            case KeyEvent.VK_H:
                hButton.setBackground(release);
                break;
            case KeyEvent.VK_I:
                iButton.setBackground(release);
                break;
            case KeyEvent.VK_J:
                jButton.setBackground(release);
                break;
            case KeyEvent.VK_K:
                kButton.setBackground(release);
                break;
            case KeyEvent.VK_L:
                lButton.setBackground(release);
                break;
            case KeyEvent.VK_M:
                mButton.setBackground(release);
                break;
            case KeyEvent.VK_N:
                nButton.setBackground(release);
                break;
            case KeyEvent.VK_O:
                oButton.setBackground(release);
                break;
            case KeyEvent.VK_P:
                pButton.setBackground(release);
                break;
            case KeyEvent.VK_Q:
                qButton.setBackground(release);
                break;
            case KeyEvent.VK_R:
                rButton.setBackground(release);
                break;
            case KeyEvent.VK_S:
                sButton.setBackground(release);
                break;
            case KeyEvent.VK_T:
                tButton.setBackground(release);
                break;
            case KeyEvent.VK_U:
                uButton.setBackground(release);
                break;
            case KeyEvent.VK_V:
                vButton.setBackground(release);
                break;
            case KeyEvent.VK_W:
                wButton.setBackground(release);
                break;
            case KeyEvent.VK_X:
                xButton.setBackground(release);
                break;
            case KeyEvent.VK_Y:
                yButton.setBackground(release);
                break;
            case KeyEvent.VK_Z:
                zButton.setBackground(release);
                break;
            //special charachters 
            case KeyEvent.VK_OPEN_BRACKET:
                openSquareBracketButton.setBackground(release);
                break;
            case KeyEvent.VK_CLOSE_BRACKET:
                closeSquareBracketButton.setBackground(release);
                break;
            case KeyEvent.VK_MINUS:
                minusButton.setBackground(release);
                break;
            case KeyEvent.VK_PLUS:
                plusButton.setBackground(release);
                break;
            case KeyEvent.VK_BACK_SPACE:
                backspaceButton.setBackground(release);
                break;
            case KeyEvent.VK_TAB:
                tabButton.setBackground(release);
                break;
            case KeyEvent.VK_CAPS_LOCK:
                capsButton.setBackground(release);
                break;
            case KeyEvent.VK_SHIFT:
                shiftButton.setBackground(release);
                break;
            case KeyEvent.VK_BACK_SLASH:
                forwardSlashButton.setBackground(release);
                break;
            case KeyEvent.VK_SEMICOLON:
                semicolonButton.setBackground(release);
                break;
            case KeyEvent.VK_QUOTE:
                apostropheButton.setBackground(release);
                break;
            case KeyEvent.VK_ENTER:
                enterButton.setBackground(release);
                break;
            case KeyEvent.VK_COMMA:
                commaButton.setBackground(release);
                break;
            case KeyEvent.VK_PERIOD:
                dotButton.setBackground(release);
                break;
            case KeyEvent.VK_UP:
                upArrowButton.setBackground(release);
                break;
            case KeyEvent.VK_LEFT:
                leftButton.setBackground(release);
                break;
            case KeyEvent.VK_RIGHT:
                rightButton.setBackground(release);
                break;
            case KeyEvent.VK_DOWN:
                downArrowButton.setBackground(release);
                break;
            case KeyEvent.VK_SPACE:
                spaceButton.setBackground(release);
                break;
        }
    }

    public void deselectButton() {
        homeButton.setFocusable(false);
        easyRadioButton.setFocusPainted(false);
        mediumRadioButton.setFocusPainted(false);
        hardRadioButton.setFocusPainted(false);
    }
    //TO DO: ADD TIPS FOR EXTRA FEATURE, UPDATE GUI,
}
