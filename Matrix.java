package matrix;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Matrix extends javax.swing.JFrame {
    
    public Matrix() {
        this.setResizable(false);
        this.setTitle("Matrix Solve-Saif Mohsen");
        initComponents();
        char operation[] = {'+', '-', '*'};
        combo_operation.addItem("");
        for (char ope : operation) {
            combo_operation.addItem(ope + "");
            combo_operation.setFont(new Font("", 10, 14));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        lab_matrix1 = new javax.swing.JLabel();
        lab_row1 = new javax.swing.JLabel();
        lab_column1 = new javax.swing.JLabel();
        lab_matrix2 = new javax.swing.JLabel();
        lab_row2 = new javax.swing.JLabel();
        lab_column2 = new javax.swing.JLabel();
        txt_column1 = new javax.swing.JTextField();
        txt_row1 = new javax.swing.JTextField();
        txt_row2 = new javax.swing.JTextField();
        txt_column2 = new javax.swing.JTextField();
        lab_operation = new javax.swing.JLabel();
        combo_operation = new javax.swing.JComboBox<>();
        lab_done = new javax.swing.JLabel();
        lab_pic = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,00));

        lab_matrix1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_matrix1.setForeground(new java.awt.Color(0, 102, 102));
        lab_matrix1.setText("Matrix 1");

        lab_row1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_row1.setForeground(new java.awt.Color(0, 102, 102));
        lab_row1.setText("Row  ");

        lab_column1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_column1.setForeground(new java.awt.Color(0, 102, 102));
        lab_column1.setText("Column ");

        lab_matrix2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_matrix2.setForeground(new java.awt.Color(0, 102, 102));
        lab_matrix2.setText("Matrix 2");

        lab_row2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_row2.setForeground(new java.awt.Color(0, 102, 102));
        lab_row2.setText("Row ");

        lab_column2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_column2.setForeground(new java.awt.Color(0, 102, 102));
        lab_column2.setText("Column ");

        txt_column1.setBackground(new java.awt.Color(0, 51, 51));
        txt_column1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_column1.setForeground(new java.awt.Color(0, 0, 0));
        txt_column1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_column1KeyTyped(evt);
            }
        });

        txt_row1.setBackground(new java.awt.Color(0, 51, 51));
        txt_row1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_row1.setForeground(new java.awt.Color(0, 0, 0));
        txt_row1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_row1KeyTyped(evt);
            }
        });

        txt_row2.setBackground(new java.awt.Color(0, 51, 51));
        txt_row2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_row2.setForeground(new java.awt.Color(0, 0, 0));
        txt_row2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_row2KeyTyped(evt);
            }
        });

        txt_column2.setBackground(new java.awt.Color(0, 51, 51));
        txt_column2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_column2.setForeground(new java.awt.Color(0, 0, 0));
        txt_column2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_column2KeyTyped(evt);
            }
        });

        lab_operation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_operation.setForeground(new java.awt.Color(0, 102, 102));
        lab_operation.setText("Operation");

        combo_operation.setForeground(new java.awt.Color(0, 51, 51));

        lab_done.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_done.setText("Done");
        lab_done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_doneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(lab_matrix1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lab_matrix2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lab_column1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lab_row1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lab_row2)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lab_column2)
                        .addGap(87, 87, 87))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_row1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                        .addComponent(txt_row2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_column1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_column2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lab_done, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lab_operation)
                .addGap(44, 44, 44)
                .addComponent(combo_operation, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_matrix2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_matrix1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_row2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_row1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_row1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_row2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_column1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_column2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_column1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_column2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_operation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_operation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(lab_done)
                .addGap(68, 68, 68))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        lab_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matrix/images (22).jpeg"))); // NOI18N
        getContentPane().add(lab_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 420));

        setSize(new java.awt.Dimension(699, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lab_doneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_doneMouseClicked
        switch (txt_row1.getText()) {
            case "" -> {
                algorithm.Swing.showAlarmMessage(this, "Please write row in matrix 1...!");
                txt_row1.grabFocus();
                return;
            }
        }
        switch (txt_column1.getText()) {
            case "" -> {
                algorithm.Swing.showAlarmMessage(this, "Please write column in matrix 1...!");
                txt_column1.grabFocus();
                return;
            }
        }
        switch (txt_row2.getText()) {
            case "" -> {
                algorithm.Swing.showAlarmMessage(this, "Please write row in matrix 2...!");
                txt_row2.grabFocus();
                return;
            }
        }
        switch (txt_column2.getText()) {
            case "" -> {
                algorithm.Swing.showAlarmMessage(this, "Please write column in matrix 2...!");
                txt_column2.grabFocus();
                return;
            }
        }
        switch (combo_operation.getSelectedItem().toString()) {
            case "" -> {
                algorithm.Swing.showAlarmMessage(this, "Please choose one operation...!");
                return;
            }
        }
        int matrix1[][] = new int[100][100];
        int matrix2[][] = new int[100][100];
        int matrix_solve[][] = new int[100][100];
        try {
            switch (combo_operation.getSelectedItem().toString().charAt(0)) {
                case '*' -> {
                    if (Integer.parseInt(txt_column1.getText()) != Integer.parseInt(txt_row2.getText())) {
                        algorithm.Swing.showAlarmMessage(this, "I can not mul matrices because column of matrix1 dont equal row of matrix 2...!");
                        break;
                    }
                    for (int i = 0; i < Integer.parseInt(txt_column1.getText()); i++) {
                        for (int j = 0; j < Integer.parseInt(txt_row1.getText()); j++) {
                            matrix1[i][j] = Integer.parseInt(JOptionPane.showInputDialog(this, "Please wrire matrix 1 (" + (j + 1) + "," + i + ")"));
                        }
                    }
                    for (int i = 0; i < Integer.parseInt(txt_column2.getText()); i++) {
                        for (int j = 0; j < Integer.parseInt(txt_row2.getText()); j++) {
                            matrix2[i][j] = Integer.parseInt(JOptionPane.showInputDialog(this, "Please wrire matrix 2 (" + (j + 1) + "," + i + ")"));
                        }
                    }
                    for (int i = 0; i < Integer.parseInt(txt_column1.getText()); i++) {
                        for (int j = 0; j < Integer.parseInt(txt_row2.getText()); j++) {
                            for (int k = 0; k < Integer.parseInt(txt_column1.getText()); k++) {
                                matrix_solve[i][j] += matrix1[i][k] * matrix2[k][j];
                            }
                        }
                    }
                    break;
                }
                case '+' -> {
                    for (int i = 0; i < Integer.parseInt(txt_column1.getText()); i++) {
                        for (int j = 0; j < Integer.parseInt(txt_row1.getText()); j++) {
                            matrix1[i][j] = Integer.parseInt(JOptionPane.showInputDialog(this, "Please wrire matrix 1 (" + (j + 1) + "," + i + ")"));
                        }
                    }
                    for (int i = 0; i < Integer.parseInt(txt_column2.getText()); i++) {
                        for (int j = 0; j < Integer.parseInt(txt_row2.getText()); j++) {
                            matrix2[i][j] = Integer.parseInt(JOptionPane.showInputDialog(this, "Please wrire matrix 2 (" + (j + 1) + "," + i + ")"));
                        }
                    }
                    for (int i = 0; i < Integer.parseInt(txt_column1.getText()); i++) {
                        for (int j = 0; j < Integer.parseInt(txt_row2.getText()); j++) {
                            matrix_solve[i][j] += matrix1[i][j] + matrix2[i][j];
                        }
                    }
                    break;
                }
                case '-' -> {
                    for (int i = 0; i < Integer.parseInt(txt_column1.getText()); i++) {
                        for (int j = 0; j < Integer.parseInt(txt_row1.getText()); j++) {
                            matrix1[i][j] = Integer.parseInt(JOptionPane.showInputDialog(this, "Please wrire matrix 1 (" + (j + 1) + "," + i + ")"));
                        }
                    }
                    for (int i = 0; i < Integer.parseInt(txt_column2.getText()); i++) {
                        for (int j = 0; j < Integer.parseInt(txt_row2.getText()); j++) {
                            matrix2[i][j] = Integer.parseInt(JOptionPane.showInputDialog(this, "Please wrire matrix 2 (" + (j + 1) + "," + i + ")"));
                        }
                    }
                    for (int i = 0; i < Integer.parseInt(txt_column1.getText()); i++) {
                        for (int j = 0; j < Integer.parseInt(txt_row2.getText()); j++) {
                            matrix_solve[i][j] += matrix1[i][j] - matrix2[i][j];
                        }
                    }
                    break;
                }
            }
        } catch (NumberFormatException ex) {
            algorithm.Swing.showErrorMessage(this, "Please write Integer Value...! \n try again ");
            return;
        }
        JFrame show_matrix = new JFrame();
        show_matrix.setSize(500, 500);
        show_matrix.setResizable(false);
        show_matrix.setTitle("Show matrices solve");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        show_matrix.setLocation(dim.width / 2 - show_matrix.getSize().width / 2, dim.height / 2 - show_matrix.getSize().height / 2);
        TextArea t = new TextArea();
        t.setSize(show_matrix.getSize());
        t.setEnabled(false);
        for (int i = 0; i < Integer.parseInt(txt_row1.getText()); i++) {
            for (int j = 0; j < Integer.parseInt(txt_row2.getText()); j++) {
                t.append(matrix_solve[i][j] + "\t");
                t.setFont(new Font("", 10, 26));
            }
            t.append("\n");
        }
        show_matrix.add(t);
        show_matrix.setVisible(true);
        for (JTextField txt : new JTextField[]{txt_row1, txt_row2, txt_column1, txt_column2}) {
            txt.setText("");
        }
        combo_operation.setSelectedIndex(0);
    }//GEN-LAST:event_lab_doneMouseClicked

    private void txt_row1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_row1KeyTyped
        algorithm.Swing.checkNumberTybing(evt);
        if (txt_row1.getText().length() > 6) {
            evt.setKeyChar((char) 0);
        }
    }//GEN-LAST:event_txt_row1KeyTyped

    private void txt_column1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_column1KeyTyped
        algorithm.Swing.checkNumberTybing(evt);
        if (txt_column1.getText().length() > 6) {
            evt.setKeyChar((char) 0);
        }
    }//GEN-LAST:event_txt_column1KeyTyped

    private void txt_row2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_row2KeyTyped
        algorithm.Swing.checkNumberTybing(evt);
        if (txt_row2.getText().length() > 6) {
            evt.setKeyChar((char) 0);
        }
    }//GEN-LAST:event_txt_row2KeyTyped

    private void txt_column2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_column2KeyTyped
        algorithm.Swing.checkNumberTybing(evt);
        if (txt_column2.getText().length() > 6) {
            evt.setKeyChar((char) 0);
        }
    }//GEN-LAST:event_txt_column2KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_operation;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab_column1;
    private javax.swing.JLabel lab_column2;
    private javax.swing.JLabel lab_done;
    private javax.swing.JLabel lab_matrix1;
    private javax.swing.JLabel lab_matrix2;
    private javax.swing.JLabel lab_operation;
    private javax.swing.JLabel lab_pic;
    private javax.swing.JLabel lab_row1;
    private javax.swing.JLabel lab_row2;
    private javax.swing.JTextField txt_column1;
    private javax.swing.JTextField txt_column2;
    private javax.swing.JTextField txt_row1;
    private javax.swing.JTextField txt_row2;
    // End of variables declaration//GEN-END:variables
}
