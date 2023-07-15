
package servlets;

import Logica.Administrador;
import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvAdministradores", urlPatterns = {"/SvAdministradores"})
public class SvAdministradores extends HttpServlet {
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Administrador> listaAdministradores = new ArrayList();
        listaAdministradores = control.traerAdministradores();
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaAdministradores", listaAdministradores);
        response.sendRedirect("admin/listarAdmin.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");
      
        Administrador admin = new Administrador();
        admin.setNombre(nombre);
        admin.setApellido(apellido);
        admin.setCorreo(correo);
        admin.setContrasena(contrasena);
        control.crearAdminsitrador(admin);
        response.sendRedirect("admin/index.jsp");
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
