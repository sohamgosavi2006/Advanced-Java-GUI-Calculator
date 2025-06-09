/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APPLET_JFRAME_FORM;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.util.*;

/**
 *
 * @author GENTLEMAN
 */
public class CALCULATOR extends javax.swing.JFrame {

    public CALCULATOR() {

        // THE BELOW CODE IS FOR SPECIAL EFFECTS OF WINDOWS...    
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (Exception ex) {
            ex.getMessage();
        }

        initComponents();

        extra1.setVisible(false);
        extra2.setVisible(false);
        extra3.setVisible(false);
        extra4.setVisible(false);

        control_1.setVisible(false);
        option_colour.setVisible(false);
        settings_display_1.setVisible(false);
        apply_1.setVisible(false);
        settings_1.setVisible(false);
        enter_settings_1.setVisible(false);

        review_1.setVisible(true);
        review_2.setVisible(true);
        feedback.setVisible(true);

        DisableButtons();

    }

    public void DisableButtons() {
        ON_BUTTON.setEnabled(true);
        OFF_BUTTON.setEnabled(false);

        display1.setEnabled(false);
        display2.setEnabled(false);
        storage.setEnabled(false);
        current_calculation.setEnabled(false);

        ENTER.setEnabled(false);
        one.setEnabled(false);
        four.setEnabled(false);
        seven.setEnabled(false);
        two.setEnabled(false);
        nine.setEnabled(false);
        three.setEnabled(false);
        eight.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        zero.setEnabled(false);
        back.setEnabled(false);
        POINT.setEnabled(false);
        add.setEnabled(false);
        substract.setEnabled(false);
        multiply.setEnabled(false);
        jButton17.setEnabled(false);
        divide.setEnabled(false);
        ac.setEnabled(false);
        c.setEnabled(false);
        plus_minus.setEnabled(false);
        percent.setEnabled(false);
        square_root.setEnabled(false);
        square.setEnabled(false);
        one_divide.setEnabled(false);
        power.setEnabled(false);
        root.setEnabled(false);
        factorial.setEnabled(false);
        hcf.setEnabled(false);
        lcm.setEnabled(false);
        degree_radian.setEnabled(false);
        sin.setEnabled(false);
        cos.setEnabled(false);
        tan.setEnabled(false);
        M_add.setEnabled(false);
        M_substract.setEnabled(false);
        M_multiply.setEnabled(false);
        M_divide.setEnabled(false);
        M_recall.setEnabled(false);
        M_store.setEnabled(false);
        M_clear.setEnabled(false);
        delete.setEnabled(false);
        history.setEnabled(true);

    }

    public void EnableButtons() {
        ON_BUTTON.setEnabled(false);
        OFF_BUTTON.setEnabled(true);

        display1.setEnabled(true);
        display2.setEnabled(true);
        storage.setEnabled(true);
        current_calculation.setEnabled(true);

        ENTER.setEnabled(true);
        one.setEnabled(true);
        four.setEnabled(true);
        seven.setEnabled(true);
        two.setEnabled(true);
        nine.setEnabled(true);
        three.setEnabled(true);
        eight.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        zero.setEnabled(true);
        back.setEnabled(true);
        POINT.setEnabled(true);
        add.setEnabled(true);
        substract.setEnabled(true);
        multiply.setEnabled(true);
        jButton17.setEnabled(true);
        divide.setEnabled(true);
        ac.setEnabled(true);
        c.setEnabled(true);
        plus_minus.setEnabled(true);
        percent.setEnabled(true);
        square_root.setEnabled(true);
        square.setEnabled(true);
        one_divide.setEnabled(true);
        power.setEnabled(true);
        root.setEnabled(true);
        factorial.setEnabled(true);
        hcf.setEnabled(true);
        lcm.setEnabled(true);
        lcm.setEnabled(true);
        degree_radian.setEnabled(true);
        sin.setEnabled(true);
        cos.setEnabled(true);
        tan.setEnabled(true);
        sin.setEnabled(true);
        cos.setEnabled(true);
        tan.setEnabled(true);
        M_add.setEnabled(true);
        M_substract.setEnabled(true);
        M_multiply.setEnabled(true);
        M_divide.setEnabled(true);
        M_recall.setEnabled(true);
        M_store.setEnabled(true);
        M_clear.setEnabled(true);
        delete.setEnabled(true);
        history.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton17 = new javax.swing.JButton();
        button1 = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jSlider1 = new javax.swing.JSlider();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuItem2 = new javax.swing.JMenuItem();
        jButton2 = new javax.swing.JButton();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        ENTER = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ON_BUTTON = new javax.swing.JRadioButton();
        OFF_BUTTON = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        display1 = new javax.swing.JTextPane();
        one = new javax.swing.JButton();
        four = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        two = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        three = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        back = new javax.swing.JButton();
        add = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        display2 = new javax.swing.JLabel();
        substract = new javax.swing.JButton();
        POINT = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        c = new javax.swing.JButton();
        plus_minus = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        square_root = new javax.swing.JButton();
        square = new javax.swing.JButton();
        one_divide = new javax.swing.JButton();
        power = new javax.swing.JButton();
        root = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        password = new javax.swing.JPasswordField();
        hcf = new javax.swing.JButton();
        lcm = new javax.swing.JButton();
        degree_radian = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        pass = new javax.swing.JButton();
        M_add = new javax.swing.JButton();
        M_substract = new javax.swing.JButton();
        M_clear = new javax.swing.JButton();
        M_recall = new javax.swing.JButton();
        M_multiply = new javax.swing.JButton();
        M_store = new javax.swing.JButton();
        M_divide = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        storage = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        current_calculation = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        history = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        extra1 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        extra2 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        extra3 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        extra4 = new javax.swing.JTextPane();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        control_1 = new javax.swing.JTextPane();
        settings_display_1 = new javax.swing.JLabel();
        enter_settings_1 = new javax.swing.JButton();
        settings_1 = new javax.swing.JLabel();
        option_colour = new javax.swing.JButton();
        apply_1 = new javax.swing.JButton();
        feedback = new javax.swing.JButton();
        review_1 = new javax.swing.JLabel();
        review_2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        standard_size = new javax.swing.JMenuItem();
        scientific_size = new javax.swing.JMenuItem();
        full_size = new javax.swing.JMenuItem();

        jButton17.setText("jButton17");

        button1.setLabel("button1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButton1.setText("jRadioButton1");

        jToggleButton1.setText("jToggleButton1");

        jMenuItem2.setText("jMenuItem2");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        ENTER.setBackground(new java.awt.Color(153, 255, 255));
        ENTER.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N
        ENTER.setText("ENTER");
        ENTER.setToolTipText("");
        ENTER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTERActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("CALCULATOR BY SOHAM");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        ON_BUTTON.setBackground(new java.awt.Color(255, 204, 51));
        buttonGroup1.add(ON_BUTTON);
        ON_BUTTON.setFont(new java.awt.Font("Ravie", 3, 14)); // NOI18N
        ON_BUTTON.setText("ON");
        ON_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ON_BUTTONActionPerformed(evt);
            }
        });

        OFF_BUTTON.setBackground(new java.awt.Color(255, 51, 0));
        buttonGroup1.add(OFF_BUTTON);
        OFF_BUTTON.setFont(new java.awt.Font("Ravie", 3, 14)); // NOI18N
        OFF_BUTTON.setText("OFF");
        OFF_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFF_BUTTONActionPerformed(evt);
            }
        });

        display1.setEditable(false);
        display1.setFont(new java.awt.Font("Andalus", 3, 24)); // NOI18N
        jScrollPane2.setViewportView(display1);

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        back.setText("<-----");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        multiply.setText("*");
        multiply.setToolTipText("");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        display2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        display2.setForeground(new java.awt.Color(0, 204, 102));
        display2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        substract.setText("-");
        substract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractActionPerformed(evt);
            }
        });

        POINT.setText(".");
        POINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POINTActionPerformed(evt);
            }
        });

        ac.setText("AC");
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });

        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        plus_minus.setText("+/- (Sign)");
        plus_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_minusActionPerformed(evt);
            }
        });

        percent.setText("%");
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        square_root.setText("√x");
        square_root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square_rootActionPerformed(evt);
            }
        });

        square.setText("x2");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        one_divide.setText("1/x");
        one_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_divideActionPerformed(evt);
            }
        });

        power.setText("x^y");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        root.setText("n√x");
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootActionPerformed(evt);
            }
        });

        factorial.setText("X!");
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        hcf.setText("HCF");
        hcf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hcfActionPerformed(evt);
            }
        });

        lcm.setText("LCM");
        lcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcmActionPerformed(evt);
            }
        });

        degree_radian.setText("deg");
        degree_radian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degree_radianActionPerformed(evt);
            }
        });

        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cos.setText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        tan.setText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        pass.setText("ADMIN");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        M_add.setText("M +");
        M_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_addActionPerformed(evt);
            }
        });

        M_substract.setText("M -");
        M_substract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_substractActionPerformed(evt);
            }
        });

        M_clear.setText("MC");
        M_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_clearActionPerformed(evt);
            }
        });

        M_recall.setText("MR");
        M_recall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_recallActionPerformed(evt);
            }
        });

        M_multiply.setText("M *");
        M_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_multiplyActionPerformed(evt);
            }
        });

        M_store.setText("MS");
        M_store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_storeActionPerformed(evt);
            }
        });

        M_divide.setText("M /");
        M_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_divideActionPerformed(evt);
            }
        });

        storage.setEditable(false);
        jScrollPane1.setViewportView(storage);

        current_calculation.setEditable(false);
        current_calculation.setFont(new java.awt.Font("Felix Titling", 3, 14)); // NOI18N
        jScrollPane3.setViewportView(current_calculation);

        history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VALUE 1", "OPERATION", "VALUE 2", "RESULT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        history.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(history);
        if (history.getColumnModel().getColumnCount() > 0) {
            history.getColumnModel().getColumn(0).setResizable(false);
            history.getColumnModel().getColumn(1).setResizable(false);
            history.getColumnModel().getColumn(2).setResizable(false);
            history.getColumnModel().getColumn(3).setResizable(false);
        }

        jScrollPane5.setViewportView(extra1);

        jScrollPane6.setViewportView(extra2);

        jScrollPane7.setViewportView(extra3);

        jScrollPane8.setViewportView(extra4);

        delete.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setText("HISTORY");

        control_1.setCaretColor(new java.awt.Color(255, 51, 51));
        jScrollPane9.setViewportView(control_1);

        settings_display_1.setFont(new java.awt.Font("Yu Mincho Light", 3, 14)); // NOI18N
        settings_display_1.setText("PLEASE SELECT YOUR CHOICE");

        enter_settings_1.setText("ENTER SETTINGS");
        enter_settings_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_settings_1ActionPerformed(evt);
            }
        });

        settings_1.setFont(new java.awt.Font("Berlin Sans FB", 3, 14)); // NOI18N
        settings_1.setText("BACKGROUND SETTINGS");

        option_colour.setText("OPTIONS AVAILABLE");
        option_colour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_colourActionPerformed(evt);
            }
        });

        apply_1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        apply_1.setText("APPLY");
        apply_1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        apply_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apply_1ActionPerformed(evt);
            }
        });

        feedback.setFont(new java.awt.Font("Segoe UI Black", 3, 11)); // NOI18N
        feedback.setText("FEEDBACK");
        feedback.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 255)));
        feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackActionPerformed(evt);
            }
        });

        review_1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        review_1.setText("TO PROGRAMMER");

        review_2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        review_2.setText("CLICK THE BUTTON");

        jMenu1.setText("CALCULATOR OPTIONS");

        standard_size.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        standard_size.setText("STANDARD CALCULATOR");
        standard_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standard_sizeActionPerformed(evt);
            }
        });
        jMenu1.add(standard_size);

        scientific_size.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        scientific_size.setText("SCIENTIFIC CALCULATOR");
        scientific_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scientific_sizeActionPerformed(evt);
            }
        });
        jMenu1.add(scientific_size);

        full_size.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        full_size.setText("HISTORY");
        full_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_sizeActionPerformed(evt);
            }
        });
        jMenu1.add(full_size);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ON_BUTTON, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(OFF_BUTTON, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(c, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plus_minus, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hcf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lcm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(M_store, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(seven, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(POINT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(one_divide, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(172, 172, 172)
                                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(square, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(substract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(square_root, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(M_add, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(power, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                        .addComponent(root, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(M_substract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(degree_radian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(factorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(M_multiply, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(M_recall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(M_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(settings_1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option_colour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(settings_display_1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enter_settings_1)
                                .addGap(18, 18, 18)
                                .addComponent(apply_1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(review_1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(review_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pass))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(delete)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ON_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(M_substract, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M_divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(M_multiply, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(OFF_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(square_root, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(multiply, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(degree_radian, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(POINT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(one_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(M_recall, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(plus_minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hcf, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lcm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(M_store, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(M_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(settings_1)
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enter_settings_1)
                            .addComponent(apply_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(settings_display_1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(option_colour)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(review_1)
                        .addGap(18, 18, 18)
                        .addComponent(review_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ENTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTERActionPerformed
        // TODO add your handling code here:

        if (display1.getText().length() > 0 && display2.getText().length() > 0) {
            value1 = Double.parseDouble(display1.getText()); // THE VALUE WE JUST GOT FROM USER (DISPLAY 1)
            currentcalculation1(); // DISPLAYING CURRENT CALCULATION

            switch (sign) {
                case "+":
                    add(value2, value1);
                    break;
                case "-":
                    substract(value2, value1);
                    break;
                case "*":
                    multiply(value2, value1);
                    break;
                case "/":
                    divide(value2, value1);
                    break;

                case "x^y":
                    power(value2, value1);
                    break;
                case "n√x":
                    root(value2, value1);
                    break;
                case "sin":
                    trigonometry(value1);
                    break;
                case "cos":
                    trigonometry(value1);
                    break;
                case "tan":
                    trigonometry(value1);
                    break;
                case "hcf":
                    hcf(value2, value1);
                    break;
                case "lcm":
                    lcm(value2, value1);
                    break;
            }
        }

        if (display1.getText().length() > 0) {
            ans = Double.parseDouble(display1.getText());
            extra4.setText(Double.toString(ans));

            if (sign.equals("null")) {
                extra4.setText("0.0");
                currentcalculation1();
            }

            history();
        }

        value1 = 0;
        value2 = 0;
        sign = "null";

    }//GEN-LAST:event_ENTERActionPerformed

    private void ON_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ON_BUTTONActionPerformed
        // TODO add your handling code here:

        EnableButtons();
    }//GEN-LAST:event_ON_BUTTONActionPerformed

    private void OFF_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFF_BUTTONActionPerformed
        // TODO add your handling code here:

        DisableButtons();
    }//GEN-LAST:event_OFF_BUTTONActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
        display1.setText(display1.getText() + "1");
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
        display1.setText(display1.getText() + "2");
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
        display1.setText(display1.getText() + "3");
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
        display1.setText(display1.getText() + "4");
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
        display1.setText(display1.getText() + "5");
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        display1.setText(display1.getText() + "6");
    }//GEN-LAST:event_sixActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
        display1.setText(display1.getText() + "8");
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
        display1.setText(display1.getText() + "9");
    }//GEN-LAST:event_nineActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        display1.setText(display1.getText() + "0");
    }//GEN-LAST:event_zeroActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
        display1.setText(display1.getText() + "7");
    }//GEN-LAST:event_sevenActionPerformed

    private void POINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POINTActionPerformed
        // TODO add your handling code here:
        if (!point) {
            display1.setText(display1.getText() + ".");
            point = true;
        }
    }//GEN-LAST:event_POINTActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
        display1.setText("");
        point = false;
    }//GEN-LAST:event_cActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        // TODO add your handling code here:
        display1.setText("");
        display2.setText("");

        current_calculation.setText("");
        point = false;
    }//GEN-LAST:event_acActionPerformed

    private void plus_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_minusActionPerformed
        // TODO add your handling code here:

        String value = display1.getText();

        if (!value.contains("-")) {
            display1.setText("-" + value);
        } else {
            try {
                display1.setText(value.split("-")[1]);
            } catch (IndexOutOfBoundsException e) {
                display1.setText("");
            }
        }
    }//GEN-LAST:event_plus_minusActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:

        String value = display1.getText();
        int length = value.length();

        if (length > 0) {
            StringBuilder builder = new StringBuilder(value);
           builder.deleteCharAt(length - 1);
            display1.setText(builder.toString());
           
           
            point = false;
            
        }

    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:

        sign = "+";
        if (display1.getText().length() > 0) {
            display2valueCalculation(sign);
        }
    }//GEN-LAST:event_addActionPerformed

    private void substractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractActionPerformed
        // TODO add your handling code here:

        sign = "-";
        if (display1.getText().length() > 0) {
            display2valueCalculation(sign);
        }
    }//GEN-LAST:event_substractActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        // TODO add your handling code here:

        sign = "*";
        if (display1.getText().length() > 0) {
            display2valueCalculation(sign);
        }
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        // TODO add your handling code here:

        sign = "/";
        if (display1.getText().length() > 0) {
            display2valueCalculation(sign);
        }
    }//GEN-LAST:event_divideActionPerformed

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
        // TODO add your handling code here:

        if (display1.getText().length() > 0) {
            value1 = Double.parseDouble(display1.getText());
            operation = "%";
            currentcalculation1();
        }

        Percentage(value2, value1);
        ans = Double.parseDouble(display1.getText());
        extra4.setText(Double.toString(ans));
        history();
    }//GEN-LAST:event_percentActionPerformed

    private void square_rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square_rootActionPerformed
        // TODO add your handling code here:
        if (display1.getText().length() > 0) {
            sign = "√x";
            currentcalculation1();
            value2 = Double.parseDouble(display1.getText());
            sqrRoot(value2);
        }
        ans = Double.parseDouble(display1.getText());
        extra4.setText(Double.toString(ans));
        history();
    }//GEN-LAST:event_square_rootActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        // TODO add your handling code here:

        if (display1.getText().length() > 0) {
            sign = "x^2";
            currentcalculation1();
            if (display1.getText().length() > 0) {
                value2 = Double.parseDouble(display1.getText());
                square(value2);
            }
        }
        ans = Double.parseDouble(display1.getText());
        extra4.setText(Double.toString(ans));
        history();
    }//GEN-LAST:event_squareActionPerformed

    private void one_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_divideActionPerformed
        // TODO add your handling code here:

        if (display1.getText().length() > 0) {
            sign = "1/x";
            currentcalculation1();
            if (display1.getText().length() > 0) {
                value2 = Double.parseDouble(display1.getText());
                OneByX(value2);
            }
        }
        ans = Double.parseDouble(display1.getText());
        extra4.setText(Double.toString(ans));
        history();
    }//GEN-LAST:event_one_divideActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        // TODO add your handling code here:

        sign = "x^y";
        if (display1.getText().length() > 0) {
            value2 = Double.parseDouble(display1.getText());
            display2valueCalculation(sign);
        }
    }//GEN-LAST:event_powerActionPerformed

    private void standard_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standard_sizeActionPerformed
        // TODO add your handling code here:

        this.setResizable(false);
        this.setLocation(600, 350);
        this.setSize(485, 560); // x axis and y axis
    }//GEN-LAST:event_standard_sizeActionPerformed

    private void scientific_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scientific_sizeActionPerformed
        // TODO add your handling code here:

        this.setResizable(false);
        this.setLocation(600, 350);
        this.setSize(805, 560);
    }//GEN-LAST:event_scientific_sizeActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

        this.setResizable(false);
        this.setLocation(600, 350);
        this.setSize(485, 560);
    }//GEN-LAST:event_formWindowActivated

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootActionPerformed
        // TODO add your handling code here:

        sign = "n√x";
        if (display1.getText().length() > 0) {
            value2 = Double.parseDouble(display1.getText());
            display2valueCalculation(sign);
        }


    }//GEN-LAST:event_rootActionPerformed

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed
        // TODO add your handling code here:

        sign = "x!";
        if (display1.getText().length() > 0) {
            value2 = Double.parseDouble(display1.getText());
            factorial(value2);
        }

        ans = Double.parseDouble(display1.getText());
        extra4.setText(Double.toString(ans));
        history();
    }//GEN-LAST:event_factorialActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:

        if (password.getText().length() > 0) {
            display2.setText("USER CAN USE ONLY CALCULATOR !!! ");
        }
    }//GEN-LAST:event_passwordActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:

        String code = password.getText();

        if (code.equalsIgnoreCase("YOUTUBE")) {
            display1.setText("WELCOME - TO GUI CALCULATOR");
            display2.setText("GRANTED PERMISSION !!!");
            storage.setText("CALCULATOR TURNED OFF ");
            current_calculation.setText("WELCOME TO SETTINGS --- CHOOSE : ");
            settings_1.setVisible(true);
            enter_settings_1.setVisible(true);
            ON_BUTTON.setVisible(false);
            DisableButtons();
            history.setEnabled(false);
        }
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CALCULATOR.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CALCULATOR.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CALCULATOR.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CALCULATOR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_passActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        // TODO add your handling code here:

        display2.setText("sin( )");
        sign = "sin";

    }//GEN-LAST:event_sinActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        // TODO add your handling code here:

        display2.setText("cos( )");
        sign = "cos";
    }//GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        // TODO add your handling code here:

        display2.setText("tan( ) ");
        sign = "tan";
    }//GEN-LAST:event_tanActionPerformed

    private void degree_radianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degree_radianActionPerformed
        // TODO add your handling code here:

        String choice = degree_radian.getText();

        if (choice.equals("deg")) {
            choice = "rad";
            degree_radian.setText("rad");
        } else if (choice.equals("rad")) {
            choice = "deg";
            degree_radian.setText("deg");
        }

    }//GEN-LAST:event_degree_radianActionPerformed

    private void hcfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hcfActionPerformed
        // TODO add your handling code here:

        sign = "hcf";
        if (display1.getText().length() > 0) {
            display2valueCalculation(sign);
        }

    }//GEN-LAST:event_hcfActionPerformed

    private void lcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcmActionPerformed
        // TODO add your handling code here:

        sign = "lcm";
        if (display1.getText().length() > 0) {
            display2valueCalculation(sign);
        }

    }//GEN-LAST:event_lcmActionPerformed

    private void M_storeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_storeActionPerformed
        // TODO add your handling code here:

        operation = "store";

        Memory_Centre(operation);
    }//GEN-LAST:event_M_storeActionPerformed

    private void M_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_addActionPerformed
        // TODO add your handling code here:

        operation = "+";
        Memory_Centre(operation);
    }//GEN-LAST:event_M_addActionPerformed

    private void M_substractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_substractActionPerformed
        // TODO add your handling code here:

        operation = "-";
        Memory_Centre(operation);
    }//GEN-LAST:event_M_substractActionPerformed

    private void M_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_multiplyActionPerformed
        // TODO add your handling code here:

        operation = "*";
        Memory_Centre(operation);
    }//GEN-LAST:event_M_multiplyActionPerformed

    private void M_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_divideActionPerformed
        // TODO add your handling code here:

        operation = "/";
        Memory_Centre(operation);
    }//GEN-LAST:event_M_divideActionPerformed

    private void M_recallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_recallActionPerformed
        // TODO add your handling code here:

        operation = "recall";
        Memory_Centre(operation);

    }//GEN-LAST:event_M_recallActionPerformed

    private void M_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_clearActionPerformed
        // TODO add your handling code here:

        operation = "cancel";
        Memory_Centre(operation);
    }//GEN-LAST:event_M_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:

        history.setModel(new DefaultTableModel(null, new String[]{"VALUE 1", "OPERATION", "VALUE 2", "RESULT"}));
    }//GEN-LAST:event_deleteActionPerformed

    private void enter_settings_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_settings_1ActionPerformed
        // TODO add your handling code here:

        control_1.setVisible(true);
        option_colour.setVisible(true);
        settings_display_1.setVisible(true);
        apply_1.setVisible(true);
        JOptionPane.showMessageDialog(null, "ENTER OPTIONS GIVEN FOR BACKGROUND COLOUR");

    }//GEN-LAST:event_enter_settings_1ActionPerformed

    private void option_colourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_colourActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null, "1 - GOLD BACKGROUND");
        JOptionPane.showMessageDialog(null, "2 - ALUMINIUM BACKGROUND");
        JOptionPane.showMessageDialog(null, "3 - TEXTURE BACKGROUND");
        JOptionPane.showMessageDialog(null, "4 - MINT BACKGROUND");
        JOptionPane.showMessageDialog(null, "5 - MAC BACKGROUND");
        JOptionPane.showMessageDialog(null, "6 - HI-FI BACKGROUND");

    }//GEN-LAST:event_option_colourActionPerformed

    private void apply_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apply_1ActionPerformed
        // TODO add your handling code here:

        int choose = Integer.parseInt(control_1.getText());

        switch (choose) {
            case 1:
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel"); // LINK IN DESCRIPTION
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(CALCULATOR.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false); // close current calculator

                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new CALCULATOR().setVisible(true);
                    }
                });

                break;

            case 2:
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(CALCULATOR.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new CALCULATOR().setVisible(true);
                    }
                });
                break;

            case 3:
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(CALCULATOR.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new CALCULATOR().setVisible(true);
                    }
                });
                break;

            case 4:
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(CALCULATOR.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new CALCULATOR().setVisible(true);
                    }
                });
                break;

            case 5:
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(CALCULATOR.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new CALCULATOR().setVisible(true);
                    }
                });
                break;

            case 6:
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(CALCULATOR.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new CALCULATOR().setVisible(true);
                    }
                });
                break;
        }
    }//GEN-LAST:event_apply_1ActionPerformed

    private void feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null, "WE HAVE OPENED YOUR GMAIL... CHECK IT OUT FOR FEEDBACK!!!");
        JOptionPane.showMessageDialog(null, "THANK YOU FOR USING CALCULATOR");
        JOptionPane.showMessageDialog(null, "THANK YOU FOR YOUR KIND FEEDBACK... !!! ");

        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("https://mail.google.com/mail/u/0/#inbox?compose=DmwnWsdLSJFLGCnSwnZvSPLrvWlzXczSzJkXWQMqsCsLSJtBKtJspgdmTbmqTQcXmfSRXFxSPPRQ"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(CALCULATOR.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_feedbackActionPerformed

    private void full_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_sizeActionPerformed
        // TODO add your handling code here:

        this.setResizable(false);
        this.setLocation(600, 350);
        this.setSize(1280, 560);
    }//GEN-LAST:event_full_sizeActionPerformed

    private void Memory_Centre(String a) {

        switch (a) {
            case "store":
                if (display1.getText().length() > 0) {
                    stored1 = Double.parseDouble(display1.getText());
                    storage.setText("" + stored1);
                    display1.setText("");
                }
                break;

            case "+":
                if (display1.getText().length() > 0) {
                    stored2 = (Double.parseDouble(display1.getText()));
                    stored3 = stored1 + stored2;
                    storage.setText("" + stored3);
                    stored1 = (Double.parseDouble(storage.getText()));
                    display1.setText("");
                }
                break;

            case "-":
                if (display1.getText().length() > 0) {
                    stored2 = (Double.parseDouble(display1.getText()));
                    stored3 = stored1 - stored2;
                    storage.setText("" + stored3);
                    stored1 = (Double.parseDouble(storage.getText()));
                    display1.setText("");
                }
                break;

            case "*":
                if (display1.getText().length() > 0) {
                    stored2 = (Double.parseDouble(display1.getText()));
                    stored3 = stored1 * stored2;
                    storage.setText("" + stored3);
                    stored1 = (Double.parseDouble(storage.getText()));
                    display1.setText("");
                }
                break;

            case "/":
                if (display1.getText().length() > 0) {
                    stored2 = (Double.parseDouble(display1.getText()));
                    stored3 = stored1 / stored2;
                    storage.setText("" + stored3);
                    stored1 = (Double.parseDouble(storage.getText()));
                    display1.setText("");
                }
                break;

            case "recall":
                Result(stored1);
                break;

            case "cancel":

                storage.setText("");
                stored1 = 0;

        }
    }

    private void currentcalculation1() {
        double show2 = Double.parseDouble(display1.getText());
        String show1 = (display2.getText());

        if (sign.equalsIgnoreCase("+") || sign.equalsIgnoreCase("-") || sign.equalsIgnoreCase("*") || sign.equalsIgnoreCase("/") || sign.equalsIgnoreCase("x^y") || sign.equalsIgnoreCase("n√x") || sign.equalsIgnoreCase("sin") || sign.equalsIgnoreCase("cos") || sign.equalsIgnoreCase("tan") || sign.equalsIgnoreCase("lcm") || sign.equalsIgnoreCase("hcf")) {
            current_calculation.setText("CALCULATION -> " + show1 + " " + show2);

            if (operation.equalsIgnoreCase("%")) {
                current_calculation.setText("QUICK CALCULATION " + show1 + " " + show2 + "PERCENTAGE!");
                operation = "";
            }
        } else if (sign.equalsIgnoreCase("x^2")) {
            current_calculation.setText("CALCULATION -> " + show1 + " " + show2 + " Square");
        } else if (sign.equalsIgnoreCase("√x")) {
            current_calculation.setText("CALCULATION -> " + show1 + " " + show2 + " Square Root");
        } else if (sign.equalsIgnoreCase("x!")) {
            current_calculation.setText("CALCULATION -> " + show1 + " " + show2 + " Factorial");
        } else if (sign.equalsIgnoreCase("null")) {
            current_calculation.setText("PLEASE ENTER FULL DATA");
        }
    }

    private void hcf(double a, double b) {
        double c;
        while (b != 0) {
            c = b;
            b = a % b;
            a = c;
        }
        double ans = a;
        Result(ans);
    }

    private void lcm(double a, double b) {
        double d, e;
        d = b;
        e = a;

        while (d != e) {
            if (d > e) {
                d = d - e;
            } else {
                e = e - d;
            }

        }
        double hcf = e;
        double ans = (b * a) / hcf;
        Result(ans);
    }

    private void trigonometry(double a) {
        String choice = (degree_radian.getText());

        if (choice.equals("deg") && display1.getText().length() > 0) { // DEGREE ---  TO BE APPLIED FOR CALCULATION
            a = Math.toRadians(a);
        }

        switch (sign) {
            case "sin":
                Result(Math.sin(a));
                break;
            case "cos":
                Result(Math.cos(a));
                break;
            case "tan":
                Result(Math.tan(a));
                break;
        }
    }

    private void factorial(double a) {
        long factorial = 1l;

        for (int i = 1; i <= a; i++) {
            factorial *= i;
            Result(factorial);
        }
    }

    private void root(double a, double b) {
        Result(Math.round(Math.pow(a, 1 / b)));
    }

    private void power(double a, double b) {
        Result(Math.pow(a, b));
    }

    private void OneByX(double a) {
        display1.setText(Double.toString(1 / a));
    }

    private void square(double a) {
        display1.setText(Double.toString(Math.pow(a, 2)));
    }

    private void sqrRoot(double a) {
        display1.setText(Double.toString(Math.sqrt(a)));
    }

    private void Percentage(double a, double b) {
        double ans;
        switch (sign) {
            case "+":
                ans = a + ((b * a) / 100);
                Result(ans);
                break;
            case "-":
                ans = a - ((b * a) / 100);
                Result(ans);
                break;
            case "*":
                ans = a * (b / 100);
                Result(ans);
                break;
            case "/":
                ans = a / (b / 100);
                Result(ans);
                break;
            default:
                display1.setText("ERROR - USE CORRECT WAY");
        }
    }

    private void display2valueCalculation(String sign) {
        String value = display1.getText();
        value2 = Double.parseDouble(value);

        display2.setText(value + " " + sign);
        display1.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        /**
         * Creates new form CALCULATOR
         *
         * @throws java.lang.ClassNotFoundException
         * @throws java.lang.InstantiationException
         * @throws java.lang.IllegalAccessException
         * @throws javax.swing.UnsupportedLookAndFeelException
         */
        // NOTE --->>> REMOVE COMMENT TO CHOOSE YOUR FAVOURITE BACKGROUND
        //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");    // THIS WILL ENABLE ROUND BUTTONS AND SILVER BACKGROUND IN THE CALCULATOR (BEST)
        // UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");    // THIS IS A GOLD BACKGROUND
        // UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");        // PEACH BACKGROUND , CARPET STYLE (BEST)
        //UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");              // MINT LOOK AND FEEL
        //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");            // MAC (APPLE) STYLE 
        //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");               // ADVANCED BLACK BACKGROUND
        // UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");              // OTHERS 1 (TRY IT)
        // UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");              // OTHERS 2 (TRY IT)
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CALCULATOR().setVisible(true);
            }
        });

    }

    public void add(double a, double b) {

        Result(a + b);

    }

    public void substract(double a, double b) {

        Result(a - b);
    }

    public void multiply(double a, double b) {

        Result(a * b);
    }

    public void divide(double a, double b) {

        Result(a / b);
    }

    private void Result(double result) {

        display1.setText(Double.toString(result));
        display2.setText("");

    }

    private void history() {

        extra1.setText(Double.toString(value1));
        extra2.setText(Double.toString(value2));
        extra3.setText(sign);

        String data[] = {extra2.getText(), extra3.getText(), extra1.getText(), extra4.getText()}; // FIRST VALUE , OPERATION , SECOND VALUE ,RESULT...

        DefaultTableModel model = (DefaultTableModel) history.getModel();
        model.addRow(data);

    }

    private double value2; // VALUE TO BE CALCULATED
    private double value1, ans, stored1, stored2, stored3; // VALUE TO BE CALCULATED
    private String sign = "null", operation = "null";
    private boolean point = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ENTER;
    private javax.swing.JButton M_add;
    private javax.swing.JButton M_clear;
    private javax.swing.JButton M_divide;
    private javax.swing.JButton M_multiply;
    private javax.swing.JButton M_recall;
    private javax.swing.JButton M_store;
    private javax.swing.JButton M_substract;
    private javax.swing.JRadioButton OFF_BUTTON;
    private javax.swing.JRadioButton ON_BUTTON;
    private javax.swing.JButton POINT;
    private javax.swing.JButton ac;
    private javax.swing.JButton add;
    private javax.swing.JButton apply_1;
    private javax.swing.JButton back;
    private java.awt.Button button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton c;
    private javax.swing.JTextPane control_1;
    private javax.swing.JButton cos;
    private javax.swing.JTextPane current_calculation;
    private javax.swing.JButton degree_radian;
    private javax.swing.JButton delete;
    private javax.swing.JTextPane display1;
    private javax.swing.JLabel display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton enter_settings_1;
    private javax.swing.JTextPane extra1;
    private javax.swing.JTextPane extra2;
    private javax.swing.JTextPane extra3;
    private javax.swing.JTextPane extra4;
    private javax.swing.JButton factorial;
    private javax.swing.JButton feedback;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JMenuItem full_size;
    private javax.swing.JButton hcf;
    private javax.swing.JTable history;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton lcm;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton one_divide;
    private javax.swing.JButton option_colour;
    private java.awt.Panel panel1;
    private javax.swing.JButton pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton percent;
    private javax.swing.JButton plus_minus;
    private javax.swing.JButton power;
    private javax.swing.JLabel review_1;
    private javax.swing.JLabel review_2;
    private javax.swing.JButton root;
    private javax.swing.JMenuItem scientific_size;
    private javax.swing.JLabel settings_1;
    private javax.swing.JLabel settings_display_1;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton square;
    private javax.swing.JButton square_root;
    private javax.swing.JMenuItem standard_size;
    private javax.swing.JTextPane storage;
    private javax.swing.JButton substract;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
