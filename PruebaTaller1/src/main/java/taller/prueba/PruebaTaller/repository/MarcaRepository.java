/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller.prueba.PruebaTaller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taller.prueba.PruebaTaller.model.Marca;

/**
 *
 * @author cg_sa
 */
public interface MarcaRepository extends JpaRepository<Marca,Long>{
    
}
