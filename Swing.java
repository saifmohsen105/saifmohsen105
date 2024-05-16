package algorithm;

import static algorithm.FileIO.getImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Swing {

    /**
     * choose color from color palete
     *
     * @param title
     * @return
     */
    public static Color chooseColor(String title) {
        JColorChooser choose = new JColorChooser();
        return choose.showDialog(choose, title, Color.black);
    }

    /**
     * create radio buttons group
     *
     * @param list
     */
    public static void radioGroup(JRadioButton[] list) {
        ButtonGroup group = new ButtonGroup();
        for (JRadioButton rbtn : list) {
            group.add(rbtn);
        }
    }

    /**
     * set icon on label
     *
     * @param imagePath
     * @param labelName
     * @throws IOException
     */
    public static void setImageOnLabel(String imagePath, JLabel labelName) throws IOException {
        labelName.setIcon(new ImageIcon(new FileIO().getImageClass(imagePath)));
    }

    /**
     * set icon on label
     *
     * @param button
     * @param imagePath
     * @throws IOException
     */
    public static void setIconOnButton(JButton button, String imagePath) throws IOException {
        button.setIcon(getImageIcon(imagePath));
    }

    /**
     * change frame icon
     *
     * @param frame
     * @param imagePath
     * @throws IOException
     */
    public static void setFrameIcon(JFrame frame, String imagePath) throws IOException {
        frame.setIconImage(new FileIO().getImageClass(imagePath));
    }

    /**
     * show message with JOptionPane
     *
     * @param location
     * @param message
     * @param title
     */
    public static void showMessage(Component location, Object message, String title) {
        JOptionPane.showMessageDialog(location, message, title, 1);
    }

    /**
     * show message with JOptionPane
     *
     * @param location
     * @param message
     */
    public static void showMessage(Component location, Object message) {
        showMessage(location, message, "Message");
    }

    /**
     * show error message with JOptionPane
     *
     * @param location
     * @param message
     * @param title
     */
    public static void showErrorMessage(Component location, Object message, String title) {
        JOptionPane.showMessageDialog(location, message, title, 0);
    }

    /**
     * show error message with JOptionPane
     *
     * @param location
     * @param message
     */
    public static void showErrorMessage(Component location, Object message) {
        showErrorMessage(location, message, "Error Message *_*");
    }

    /**
     * show error message with JOptionPane
     *
     * @param location
     * @param message
     * @param title
     */
    public static void showAlarmMessage(Component location, Object message, String title) {
        JOptionPane.showMessageDialog(location, message, title, 2);
    }

    /**
     * show error message with JOptionPane
     *
     * @param location
     * @param message
     */
    public static void showAlarmMessage(Component location, Object message) {
        showAlarmMessage(location, message, "Alarm Message");
    }

    /**
     * get value and show message with JOptionPane
     *
     * @param cmpnt
     * @param message
     * @return String
     */
    public static String getValue(Component cmpnt, String message) {
        return JOptionPane.showInputDialog(cmpnt, message);
    }

    /**
     * clear table
     *
     * @param table
     */
    public static void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
    }

    /**
     * add row in table
     *
     * @param table
     * @param values
     */
    public static void addRow(JTable table, Object[] values) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(values);
    }

    /**
     * add column in table
     *
     * @param table
     * @param name
     */
    public static void addColumn(JTable table, Object name) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addColumn(name);
    }

    /**
     * open frame from other frame and give it the same data
     *
     * @param frame
     * @param from
     * @param lastFrame
     * @param resizable
     */
    public static void openFrame(JFrame frame, JFrame from, boolean lastFrame, boolean resizable) {
        if (!lastFrame) {
            from.dispose();
        }
        frame.setVisible(true);
        frame.setLocationRelativeTo(from);
        frame.setIconImage(from.getIconImage());
        frame.setResizable(resizable);
    }

    /**
     * open frame from other frame and give it the same data
     *
     * @param frame
     * @param from
     * @param lastFrame
     */
    public static void openFrame(JFrame frame, JFrame from, boolean lastFrame) {
        openFrame(frame, from, lastFrame, false);
    }

    /**
     * open frame
     *
     * @param frame
     * @param resizable
     */
    public static void openFrame(JFrame frame, boolean resizable) {
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(resizable);
    }

    /**
     * open frame
     *
     * @param frame
     */
    public static void openFrame(JFrame frame) {
        openFrame(frame, false);
    }

    /**
     * change frame background color
     *
     * @param frame
     * @param color
     */
    public static void setFrameBackground(JFrame frame, Color color) {
        frame.getContentPane().setBackground(color);
    }

    /**
     * change frame background color using hash code
     *
     * @param frame
     * @param colorCode
     */
    public static void setFrameBackground(JFrame frame, String colorCode) {
        setFrameBackground(frame, Color.decode(colorCode));
    }

    /**
     * Check text input is number or not Used for Text Field
     *
     * @param evt
     */
    public static void checkNumberTybing(java.awt.event.KeyEvent evt) {
        switch (evt.getKeyChar()) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
            }
            default -> evt.setKeyChar((char) 0);
        }
    }

    /**
     * Show list use JTable 
     *
     * @param title
     * @param from
     * @param columns
     * @param rows
     */
    public static void showTableList(String title, JFrame from, String[] columns, Object[][] rows) {
        javax.swing.table.DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel();
        javax.swing.JFrame frame = new javax.swing.JFrame(title);
        javax.swing.JTable table = new javax.swing.JTable(tableModel);
        javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(table);
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(from);
        frame.add(scroll);
        frame.setVisible(true);
        for (String column : columns) {
            tableModel.addColumn(column);
        }
        for (Object[] row : rows) {
            tableModel.addRow(row);
        }
    }
}
