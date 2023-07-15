package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
   ControladoraPersistencia controlPersis = new  ControladoraPersistencia();
   public void crearAdminsitrador (Administrador admin){
       controlPersis.crearAdmin(admin);
   }
   
   public List<Administrador> traerAdministradores(){
       return controlPersis.traerAdministradores();
   }
}
