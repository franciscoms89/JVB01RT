package com.pruebaTecnica.vuelos_api.services;

import com.pruebaTecnica.vuelos_api.dtos.VueloDTO;
import com.pruebaTecnica.vuelos_api.models.Vuelo;
import com.pruebaTecnica.vuelos_api.models.VueloResponse;
import com.pruebaTecnica.vuelos_api.utils.FechaUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Servicio que implementa la lógica de negocio para la gestión de vuelos. Incluye operaciones CRUD y filtrado con ordenación.

@Service
public class VueloService implements VueloServiceInterface {

    private final List<Vuelo> listadoVuelos = new ArrayList<>();

    // Constructor que inicializa la lista con 10 vuelos predefinidos
    public VueloService() {
        listadoVuelos.add(new Vuelo(1, "IB1245", "IBERIA", "Madrid", "Barcelona", LocalDate.of(2025, 10, 5), LocalDate.of(2025, 10, 5)));
        listadoVuelos.add(new Vuelo(2, "TK3409", "TURKISH", "Estambul", "Madrid", LocalDate.of(2025, 10, 5), LocalDate.of(2025, 10, 5)));
        listadoVuelos.add(new Vuelo(3, "AF7841", "AIR FRANCE", "París", "Roma", LocalDate.of(2025, 7, 10), LocalDate.of(2025, 7, 10)));
        listadoVuelos.add(new Vuelo(4, "IB5678", "IBERIA", "Barcelona", "Roma", LocalDate.of(2025, 7, 10), LocalDate.of(2025, 7, 10)));
        listadoVuelos.add(new Vuelo(5, "TK9876", "TURKISH", "Estambul", "París", LocalDate.of(2025, 8, 5), LocalDate.of(2025, 8, 5)));
        listadoVuelos.add(new Vuelo(6, "AF2234", "AIR FRANCE", "París", "Londres", LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 1)));
        listadoVuelos.add(new Vuelo(7, "UX4502", "AIR EUROPA", "Valencia", "París", LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 1)));
        listadoVuelos.add(new Vuelo(8, "EK2201", "EMIRATES", "Dubái", "Madrid", LocalDate.of(2025, 10, 10), LocalDate.of(2025, 10, 10)));
        listadoVuelos.add(new Vuelo(9, "DL8723", "DELTA", "Los Ángeles", "Tokio", LocalDate.of(2025, 12, 1), LocalDate.of(2025, 12, 2)));
        listadoVuelos.add(new Vuelo(10, "LH9900", "LUFTHANSA", "Berlín", "Roma", LocalDate.of(2025, 7, 10), LocalDate.of(2025, 7, 10)));
    }

    // Función para filtrar vuelos
    @Override
    public ResponseEntity<List<VueloDTO>> filtrarVuelos(String empresa, String lugarLlegada, LocalDate fechaSalida, String ordenarPor) {

        Comparator<VueloDTO> comparator = switch (ordenarPor == null ? "fechaSalida" : ordenarPor.trim().toLowerCase()) {
            case "empresa" -> Comparator.comparing(VueloDTO::getEmpresa, String.CASE_INSENSITIVE_ORDER);
            case "lugarllegada" -> Comparator.comparing(VueloDTO::getLugarLlegada, String.CASE_INSENSITIVE_ORDER);
            default -> Comparator.comparing(VueloDTO::getFechaSalida);
        };

        List<VueloDTO> listaFiltrada = this.listadoVuelos.stream()
                .filter(v -> empresa == null || v.getEmpresa().equalsIgnoreCase(empresa))
                .filter(v -> lugarLlegada == null || v.getLugarLlegada().equalsIgnoreCase(lugarLlegada))
                .filter(v -> fechaSalida == null || v.getFechaSalida().isEqual(fechaSalida))
                .map(this::mappedToDTO)
                .sorted(comparator)
                .toList();

        return ResponseEntity.ok(listaFiltrada);
    }

    // Función para buscar vuelo por id
    @Override
    public ResponseEntity<VueloDTO> buscarVuelo(Integer id) {
        Vuelo vueloBuscado = buscarVueloPorId(id);
        if (vueloBuscado == null) {
            return ResponseEntity.notFound().build();
        }
        VueloDTO vueloDTO = mappedToDTO(vueloBuscado);
        return ResponseEntity.ok(vueloDTO);
    }

    // Función para crear un vuelo
    @Override
    public ResponseEntity<VueloResponse> crearVuelo(VueloDTO vueloDTO) {
        if (!esValido(vueloDTO)) {
            return ResponseEntity.badRequest().body(new VueloResponse(
                    "Datos del cuelo inválidos",
                    400,
                    LocalDateTime.now()));
        }

        vueloDTO.setId(this.listadoVuelos.size() + 1);
        Vuelo vuelo = this.mappedToObj(vueloDTO);
        this.listadoVuelos.add(vuelo);

        return ResponseEntity.status(201).body(new VueloResponse(
                "Vuelo creado correctamente",
                201,
                LocalDateTime.now()));
    }

    // Función para actualizar un vuelo completamente
    @Override
    public ResponseEntity<VueloResponse> actualizarVuelo(Integer id, VueloDTO vueloAActualizar) {
        Vuelo vueloExistente = buscarVueloPorId(id);

        if (vueloExistente == null) return ResponseEntity.status(404)
                .body(new VueloResponse(
                        "Vuelo no encontrado",
                        404,
                        LocalDateTime.now()));
        if (!esValido(vueloAActualizar)) return ResponseEntity.status(400)
                .body(new VueloResponse(
                        "Datos del vuelo inválidos",
                        400,
                        LocalDateTime.now()));

        vueloAActualizar.setId(id);
        Vuelo vueloActualizado = mappedToObj(vueloAActualizar);

        this.listadoVuelos.removeIf(v -> v.getId().equals(id));
        this.listadoVuelos.add(vueloActualizado);

        return ResponseEntity.status(200)
                .body(new VueloResponse(
                        "Vuelo actualizado correctamente",
                        200,
                        LocalDateTime.now()));
    }

    // Función para modificar un vuelo parcialmente
    @Override
    public ResponseEntity<VueloResponse> modificarVuelo(Integer id, VueloDTO vueloAModificar) {
        Vuelo vueloExistente = buscarVueloPorId(id);

        if (vueloExistente == null) {
            return ResponseEntity.status(404)
                    .body(new VueloResponse(
                            "Vuelo no encontrado",
                            404,
                            LocalDateTime.now()));
        }

        if (vueloAModificar.getFechaSalida() != null && vueloAModificar.getFechaLlegada() != null &&
                vueloAModificar.getFechaSalida().isAfter(vueloAModificar.getFechaLlegada())) {
            return ResponseEntity.status(400)
                    .body(new VueloResponse(
                            "La fecha de salida no puede ser superior a la de llegada",
                            400,
                            LocalDateTime.now()));
        }

        if (vueloAModificar.getNombreVuelo() != null) vueloExistente.setNombreVuelo(vueloAModificar.getNombreVuelo());
        if (vueloAModificar.getEmpresa() != null) vueloExistente.setEmpresa(vueloAModificar.getEmpresa());
        if (vueloAModificar.getLugarSalida() != null) vueloExistente.setLugarSalida(vueloAModificar.getLugarSalida());
        if (vueloAModificar.getLugarLlegada() != null) vueloExistente.setLugarLlegada(vueloAModificar.getLugarLlegada());
        if (vueloAModificar.getFechaSalida() != null) vueloExistente.setFechaSalida(vueloAModificar.getFechaSalida());
        if (vueloAModificar.getFechaLlegada() != null)
            vueloExistente.setFechaLlegada(vueloAModificar.getFechaLlegada());

        return ResponseEntity.status(200)
                .body(new VueloResponse(
                        "Vuelo modificado correctamente",
                        200,
                        LocalDateTime.now()));
    }

    // Función para eliminar un vuelo
    @Override
    public ResponseEntity<VueloResponse> eliminarVuelo(Integer id) {
        boolean estaEliminado = this.listadoVuelos.removeIf(v -> v.getId().equals(id));
        if (estaEliminado) {
            return ResponseEntity.accepted()
                    .body(new VueloResponse(
                            "Vuelo eliminado correctamente",
                            202,
                            LocalDateTime.now()));
        } else {
            return ResponseEntity.status(404)
                    .body(new VueloResponse(
                            "Vuelo no encontrado",
                            404,
                            LocalDateTime.now()));
        }
    }

    // =================================== métodos auxiliares ====================================

    private Vuelo buscarVueloPorId(Integer id) {
        return this.listadoVuelos.stream()
                .filter(v -> v.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    private boolean esValido(VueloDTO dto) {
        return dto.getNombreVuelo() != null &&
                dto.getEmpresa() != null &&
                dto.getLugarSalida() != null &&
                dto.getLugarLlegada() != null &&
                dto.getFechaSalida() != null &&
                dto.getFechaLlegada() != null &&
                !dto.getFechaSalida().isAfter(dto.getFechaLlegada());
    }

    // =================================== métodos de mapeo DTO ===================================

    @Override
    public VueloDTO mappedToDTO(Vuelo v) {
        long duracionDias = FechaUtil.calcularDuracionDias(v.getFechaSalida(), v.getFechaLlegada());
        return new VueloDTO(
                v.getId(),
                v.getNombreVuelo(),
                v.getEmpresa(),
                v.getLugarSalida(),
                v.getLugarLlegada(),
                v.getFechaSalida(),
                v.getFechaLlegada(),
                duracionDias
        );
    }

    @Override
    public Vuelo mappedToObj(VueloDTO v) {
        return new Vuelo(
                v.getId(),
                v.getNombreVuelo(),
                v.getEmpresa(),
                v.getLugarSalida(),
                v.getLugarLlegada(),
                v.getFechaSalida(),
                v.getFechaLlegada()
        );
    }
}