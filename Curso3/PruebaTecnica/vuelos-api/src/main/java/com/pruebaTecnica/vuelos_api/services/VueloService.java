package com.pruebaTecnica.vuelos_api.services;

import com.pruebaTecnica.vuelos_api.dtos.VueloDTO;
import com.pruebaTecnica.vuelos_api.models.Vuelo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class VueloService implements VueloServiceInterface {

    private final List<Vuelo> listadoVuelos = new ArrayList<>();

    public VueloService() {
        listadoVuelos.add(new Vuelo(1, "IB1245", "IBERIA", "Madrid", "Barcelona", LocalDate.of(2025, 10, 5), LocalDate.of(2025, 10, 5)));
        listadoVuelos.add(new Vuelo(2, "TK3409", "TURKISH", "Estambul", "Nueva York", LocalDate.of(2025, 11, 3), LocalDate.of(2025, 11, 3)));
        listadoVuelos.add(new Vuelo(3, "EK2201", "EMIRATES", "Dubái", "Sídney", LocalDate.of(2025, 8, 12), LocalDate.of(2025, 8, 13)));
        listadoVuelos.add(new Vuelo(4, "AF7841", "AIR FRANCE", "París", "Roma", LocalDate.of(2025, 7, 20), LocalDate.of(2025, 7, 20)));
        listadoVuelos.add(new Vuelo(5, "LH9900", "LUFTHANSA", "Berlín", "Londres", LocalDate.of(2025, 9, 2), LocalDate.of(2025, 9, 2)));
        listadoVuelos.add(new Vuelo(6, "UX4502", "AIR EUROPA", "Valencia", "Buenos Aires", LocalDate.of(2025, 10, 14), LocalDate.of(2025, 10, 15)));
        listadoVuelos.add(new Vuelo(7, "DL8723", "DELTA", "Los Ángeles", "Tokio", LocalDate.of(2025, 12, 1), LocalDate.of(2025, 12, 2)));
        listadoVuelos.add(new Vuelo(8, "BA3380", "BRITISH AIRWAYS", "Londres", "Madrid", LocalDate.of(2025, 6, 28), LocalDate.of(2025, 6, 28)));
        listadoVuelos.add(new Vuelo(9, "AZ1291", "ALITALIA", "Roma", "Atenas", LocalDate.of(2025, 7, 15), LocalDate.of(2025, 7, 15)));
        listadoVuelos.add(new Vuelo(10, "QR5540", "QATAR AIRWAYS", "Doha", "Ciudad de México", LocalDate.of(2025, 8, 21), LocalDate.of(2025, 8, 22)));
    }

    @Override
    public ResponseEntity<List<VueloDTO>> obtenerTodosLosVuelos() {
        List<VueloDTO> listaOrdenada = this.listadoVuelos.stream()
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .map(this::mappedToDTO)
                .toList();
        return ResponseEntity.ok(listaOrdenada);
    }

    @Override
    public ResponseEntity<VueloDTO> buscarVuelo(Integer id) {
        Vuelo vueloBuscado= this.listadoVuelos.stream()
                .filter(v-> v.getId().equals(id))
                .findFirst().orElse(null);
        if(vueloBuscado==null){
            return ResponseEntity.notFound().build();
        }
        VueloDTO vueloDTO = mappedToDTO(vueloBuscado);
        return ResponseEntity.ok(vueloDTO);
    }

    @Override
    public ResponseEntity<VueloDTO> crearVuelo(VueloDTO vueloDTO) {
        return null;
    }

    @Override
    public ResponseEntity<VueloDTO> actualizarVuelo(Integer id, VueloDTO vueloAActualizar) {
        return null;
    }

    @Override
    public ResponseEntity<VueloDTO> modificarVuelo(Integer id, VueloDTO vueloAModificar) {
        return null;
    }

    @Override
    public ResponseEntity<Void> eliminarVuelo(Integer id) {
        return null;
    }


    // TODO: =================================== métodos de mapeo DTO ===================================


    @Override
    public VueloDTO mappedToDTO(Vuelo v) {
        return new VueloDTO(v.getId(), v.getNombreVuelo(), v.getEmpresa(), v.getLugarSalida(), v.getLugarLlegada(), v.getFechaSalida(), v.getFechaLlegada());
    }

    @Override
    public Vuelo mappedToObj(VueloDTO v) {
        return new Vuelo(v.getId(), v.getNombreVuelo(), v.getEmpresa(), v.getLugarSalida(), v.getLugarLlegada(), v.getFechaSalida(), v.getFechaLlegada());
    }
}
