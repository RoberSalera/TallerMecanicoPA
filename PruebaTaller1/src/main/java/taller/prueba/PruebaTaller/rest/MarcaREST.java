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
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestBody;
import taller.prueba.PruebaTaller.model.Marca;
import taller.prueba.PruebaTaller.repository.MarcaRepository;
import taller.prueba.PruebaTaller.service.MarcaService;

/**
 *
 * @author cg_sa
 */

@Controller
@RequestMapping ("/api/marca/")
public class MarcaREST {
    
    @Autowired
    private MarcaService servicio;
    
    @GetMapping({"/marcas","/"})
    public String listarMarcas(Model modelo){
        modelo.addAttribute("marcas", servicio.listarTodasLasMarcas());
        return "marcas";
    }

    
    
}
