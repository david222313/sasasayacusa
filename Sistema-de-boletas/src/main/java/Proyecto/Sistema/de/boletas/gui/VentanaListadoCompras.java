package Proyecto.Sistema.de.boletas.gui;

import javax.swing.*;

public class VentanaListadoCompras extends JFrame {

    public VentanaListadoCompras(){

        setTitle("Listado Compras");

        setSize(500,400);

        JTextArea area = new JTextArea();

        add(area);

        setVisible(true);
    }
}