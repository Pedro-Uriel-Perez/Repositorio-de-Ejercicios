package mx.utng.s24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class VentanaSuma {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Suma");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Crear formateador para números enteros
        NumberFormat integerFormat = NumberFormat.getIntegerInstance();
        NumberFormatter intFormatter = new NumberFormatter(integerFormat);
        intFormatter.setValueClass(Integer.class);
        intFormatter.setMinimum(0); // Puedes ajustar el mínimo según tus necesidades
        intFormatter.setMaximum(Integer.MAX_VALUE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);


        JFormattedTextField num1Field = createFormattedTextField(intFormatter);
        JFormattedTextField num2Field = createFormattedTextField(intFormatter);
        JButton sumButton = new JButton("Sumar");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = (int) num1Field.getValue();
                    int num2 = (int) num2Field.getValue();
                    int result = num1 + num2;
                    resultField.setText(Integer.toString(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Ingresa números válidos.");
                }
            }
        });

        JPanel panel = new JPanel(new GridLayout(5, 5, 5, 5)); // 4 filas, 2 columnas
        addLabeledField(panel, "Primer número:", num1Field);
        
        addLabeledField(panel, "Segundo número:", num2Field); 
        
        addLabeledField(panel, "Resultado:", resultField);
        panel.add(sumButton); 


        frame.add(panel);
        frame.setVisible(true);
    }

    // Función para crear un JFormattedTextField con el formateador dado
    private static JFormattedTextField createFormattedTextField(NumberFormatter formatter) {
        JFormattedTextField textField = new JFormattedTextField(formatter);
        textField.setColumns(10);
        return textField;
    }

    // Función para agregar un campo etiquetado al panel
    private static void addLabeledField(JPanel panel, String label, JComponent field) {
        panel.add(new JLabel(label));
        panel.add(field);
    }
}