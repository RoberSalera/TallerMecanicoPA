/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.prueba.PruebaTaller.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taller.prueba.PruebaTaller.model.Marca;
import taller.prueba.PruebaTaller.repository.MarcaRepository;

/**
 *
 * @author cg_sa
 */

@Service
public interface MarcaService {
    public List<Marca> listarTodasLasMarcas();
    
  
}
