package taller.prueba.PruebaTaller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import taller.prueba.PruebaTaller.model.Marca;
import taller.prueba.PruebaTaller.repository.MarcaRepository;



@SpringBootApplication
public class PruebaTallerApplication implements CommandLineRunner{

    public static void main(String[] args) {
	SpringApplication.run(PruebaTallerApplication.class, args);
    }
        
    @Autowired
    private MarcaRepository repositorio;
    
    @Override
    public void run(String[] args) throws Exception{
        Marca marca2 = new Marca("Audi");
        repositorio.save(marca2);
    }


}


