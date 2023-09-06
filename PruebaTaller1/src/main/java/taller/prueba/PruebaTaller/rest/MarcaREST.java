/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.prueba.PruebaTaller.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import taller.prueba.PruebaTaller.model.Marca;
import taller.prueba.PruebaTaller.service.MarcaService;

/**
 *
 * @author cg_sa
 */

@RestController
@RequestMapping ("/api/marca/")
public class MarcaREST {
    
    @Autowired
    private MarcaService marcaService;
    
    @PostMapping
    private ResponseEntity<Marca> guardar (@RequestBody Marca marca){
        Marca temporal = marcaService.create(marca);
        
        try {
            return ResponseEntity.created(new URI("/api/marca"+temporal.getId())).body(temporal);        
        
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    @GetMapping
    private ResponseEntity<List<Marca>> listarTodasLasMarcas (){
        return ResponseEntity.ok(marcaService.getAllMarcas());    
    }
    
    @DeleteMapping
    private ResponseEntity<Void> eliminarMarca (@RequestBody Marca marca){
        marcaService.delete(marca);
        return ResponseEntity.ok().build();    
    }
    
    @GetMapping (value = "{id}")
    private ResponseEntity<Optional<Marca>> listarMarcasPorID (@PathVariable ("id") Long id){
        return ResponseEntity.ok(marcaService.findById(id)); 
    }
    
    
}
