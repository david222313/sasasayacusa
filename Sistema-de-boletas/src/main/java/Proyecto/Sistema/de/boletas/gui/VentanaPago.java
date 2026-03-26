package Proyecto.Sistema.de.boletas.gui;

import javax.swing.*;

public class VentanaPago extends JFrame {

    public VentanaPago(){

        setTitle("Registrar Pago");

        setSize(400,300);

        setLayout(null);

        JLabel comprobante = new JLabel("Comprobante");

        comprobante.setBounds(50,50,120,30);

        add(comprobante);

        JTextField txtComprobante = new JTextField();

        txtComprobante.setBounds(180,50,150,30);

        add(txtComprobante);

        setVisible(true);
    }
}