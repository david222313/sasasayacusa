package Proyecto.Sistema.de.boletas;

import Proyecto.Sistema.de.boletas.gui.VentanaPrincipal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.swing.*;

@SpringBootApplication
public class SistemaDeBoletasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeBoletasApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void onApplicationReady() {
		SwingUtilities.invokeLater(() -> {
			VentanaPrincipal ventana = new VentanaPrincipal();
			ventana.setVisible(true);
		});
	}
}