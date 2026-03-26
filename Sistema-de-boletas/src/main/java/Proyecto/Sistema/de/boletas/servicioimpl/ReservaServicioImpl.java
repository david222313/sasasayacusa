package Proyecto.Sistema.de.boletas.servicioimpl;

import Proyecto.Sistema.de.boletas.Entidades.Compra;
import Proyecto.Sistema.de.boletas.Entidades.Evento;
import Proyecto.Sistema.de.boletas.Entidades.MetodoPago;
import Proyecto.Sistema.de.boletas.Entidades.Zona;
import Proyecto.Sistema.de.boletas.Servicio.CompraServicio;
import Proyecto.Sistema.de.boletas.Servicio.ReservaServicio;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ReservaServicioImpl implements ReservaServicio {
    private final CompraServicio CompraServicio;
    @Override
    public Compra reservar(Long cedula, String nombre, Evento evento, MetodoPago metodoPago, Map<Zona,Integer> zonas) {
        return CompraServicio.reservarCompra(cedula, nombre, evento, metodoPago, zonas
        );
    }
}