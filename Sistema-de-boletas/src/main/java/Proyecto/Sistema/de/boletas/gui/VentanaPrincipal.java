package Proyecto.Sistema.de.boletas.gui;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {

        setTitle("Sistema Venta Boletas");

        setSize(400,300);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton eventos = new JButton("Eventos");

        eventos.setBounds(100,80,200,40);

        add(eventos);

        setLayout(null);

        setVisible(true);
    }
}