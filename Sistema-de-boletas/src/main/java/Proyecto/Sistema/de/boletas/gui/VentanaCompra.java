package Proyecto.Sistema.de.boletas.gui;

import javax.swing.*;

public class VentanaCompra extends JFrame {

    public VentanaCompra(){

        setTitle("Compra Boletas");

        setSize(500,400);

        setLayout(null);

        JLabel cedula = new JLabel("Cedula");

        cedula.setBounds(50,50,100,30);

        add(cedula);

        JTextField txtCedula = new JTextField();

        txtCedula.setBounds(150,50,200,30);

        add(txtCedula);

        setVisible(true);
    }
}