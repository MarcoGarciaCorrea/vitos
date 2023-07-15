package Persistencia;

import Logica.Administrador;
import java.util.List;

public class ControladoraPersistencia {
        
    AdministradorJpaController adminJpa = new AdministradorJpaController();
    
    //create
    public void crearAdmin(Administrador admin){
        adminJpa.create(admin);
    }
    
    //read
    public List<Administrador> traerAdministradores(){
        return adminJpa.findAdministradorEntities();
    }
}
