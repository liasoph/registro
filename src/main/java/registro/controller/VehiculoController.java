package registro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import registro.Persistence.entity.Vehiculo;
import registro.Service.VehiculoService;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
    @Autowired
    private VehiculoService vehiculoService;
    @GetMapping("/ver")
    public List<Vehiculo> findAll(){
        return vehiculoService.findAll();

    }
    @PostMapping("/registrarVehiculo")
    private Vehiculo save (@RequestBody Vehiculo vehiculo){
        return vehiculoService.save(vehiculo);
    }
    @PutMapping("/deshabilitarVehiculo/{id}")
    public ResponseEntity<Vehiculo> desabilitar(@PathVariable Long id ){
      Vehiculo vehiculo =  vehiculoService.actualizar(id);
     return ResponseEntity.ok(vehiculo);

    }
    @PutMapping("/editarVehiculo/{id}")
    public ResponseEntity<Vehiculo> actualizarVehiculo(
            @PathVariable Long id,
            @RequestBody Vehiculo vehiculoActualizado) {
        Vehiculo vehiculo = vehiculoService.actualizarVehiculo(id, vehiculoActualizado);
        return ResponseEntity.ok(vehiculo);
    }
    @PutMapping("/asignar/{vehiculoId}/a/{conductorId}")
    public ResponseEntity<Vehiculo> asignarConductor(
            @PathVariable Long vehiculoId,
            @PathVariable Long conductorId) {
        Vehiculo vehiculo = vehiculoService.asignarConductor(vehiculoId, conductorId);
        return ResponseEntity.ok(vehiculo);
    }

}
