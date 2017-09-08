import javax.swing.*;
import java.awt.*;

/*
* View class with a setter method
* */

public class View {
    public JComboBox comboBox1;
    public JComboBox comboBox2;
    public JComboBox comboBox3;
    public JComboBox comboBox4;
    private JLabel standardPrice;
    private JLabel oapPrice;
    private JLabel studentPrice;
    private JLabel childPrice;
    protected JButton purchaseButton;


    public View() {
        JFrame frame = new JFrame();


        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());

        final JLabel label1 = new JLabel();
        label1.setText("Standard Price: ");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label1, gbc);

        final JLabel label2 = new JLabel();
        label2.setText("Child Price: ");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label2, gbc);

        final JLabel label3 = new JLabel();
        label3.setText("Student Price: ");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label3, gbc);

        final JLabel label4 = new JLabel();
        label4.setText("OAP Price: ");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label4, gbc);

        comboBox1 = new JComboBox();
        comboBox1.addItem(0);
        comboBox1.addItem(1);
        comboBox1.addItem(2);
        comboBox1.addItem(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox1, gbc);

        comboBox2 = new JComboBox();
        comboBox2.addItem(0);
        comboBox2.addItem(1);
        comboBox2.addItem(2);
        comboBox2.addItem(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox2, gbc);

        comboBox3 = new JComboBox();
        comboBox3.addItem(0);
        comboBox3.addItem(1);
        comboBox3.addItem(2);
        comboBox3.addItem(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox3, gbc);

        comboBox4 = new JComboBox();
        comboBox4.addItem(0);
        comboBox4.addItem(1);
        comboBox4.addItem(2);
        comboBox4.addItem(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox4, gbc);

        standardPrice = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(standardPrice, gbc);

        oapPrice = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(oapPrice, gbc);

        studentPrice = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(studentPrice, gbc);

        childPrice = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(childPrice, gbc);

        purchaseButton = new JButton();
        purchaseButton.setText("Purchase");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(purchaseButton, gbc);

        frame.add(panel1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
    }

    public void setPrices(int stan, int oap, int std, int chd) {
        standardPrice.setText(String.valueOf(stan));
        oapPrice.setText(String.valueOf(oap));
        studentPrice.setText(String.valueOf(std));
        childPrice.setText(String.valueOf(chd));

    }
}

