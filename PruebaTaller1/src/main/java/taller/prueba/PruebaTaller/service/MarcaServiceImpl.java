
package taller.prueba.PruebaTaller.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taller.prueba.PruebaTaller.model.Marca;
import taller.prueba.PruebaTaller.repository.MarcaRepository;





@Service
public class MarcaServiceImpl implements MarcaService{
    
    @Autowired
    private MarcaRepository repositorio;
    
    @Override
    public List<Marca> listarTodasLasMarcas(){
        return repositorio.findAll();
    }
}
