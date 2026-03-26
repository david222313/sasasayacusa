package Proyecto.Sistema.de.boletas.gui;

import javax.swing.*;

public class VentanaEvento extends JFrame {

    public VentanaEvento() {

        setTitle("Crear Evento");

        setSize(500,400);

        setLayout(null);

        JLabel nombre = new JLabel("Nombre Evento");

        nombre.setBounds(40,50,150,30);

        add(nombre);
        JTextField txtNombre = new JTextField();

        txtNombre.setBounds(200,50,200,30);

        add(txtNombre);

        setVisible(true);
    }
}