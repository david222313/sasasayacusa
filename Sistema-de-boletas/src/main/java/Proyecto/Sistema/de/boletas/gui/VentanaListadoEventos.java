package Proyecto.Sistema.de.boletas.gui;

import javax.swing.*;

public class VentanaListadoEventos extends JFrame {

    public VentanaListadoEventos(){

        setTitle("Listado Eventos");

        setSize(500,400);

        JTable tabla = new JTable();

        add(new JScrollPane(tabla));

        setVisible(true);
    }
}