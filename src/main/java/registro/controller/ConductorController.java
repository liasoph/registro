package registro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import registro.Persistence.entity.Conductor;
import registro.Service.ConductorService;

import java.util.List;

@RestController
@RequestMapping("/api/conductores")
public class ConductorController {
    @Autowired
    private ConductorService conductorService;
    @GetMapping ("/verConductor")
    public List <Conductor> findAll(){
        return conductorService.findAll();

    }
    @PostMapping ("/registrarConductor")
    private Conductor save (@RequestBody Conductor conductor){
       System.out.println(conductor);
        return conductorService.save(conductor);
    }

    @PutMapping("/deshabilitarConductor/{id}")
    public ResponseEntity<Conductor> delete (@PathVariable Long id ){
        Conductor conductor =  conductorService.actualizar(id);
        return ResponseEntity.ok(conductor);




    }
}
