<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Administrador"%>
<%@ include file="header.jsp" %>
<!--<meta http-equiv="refresh" content="0;URL=..\SvAdministradores">-->

<main>
    <h1>Mostrar Lista</h1>
    <%
        List<Administrador> listaAdministradores = (List) request.getSession().getAttribute("listaAdministradores");
        int cont = 1;
        for (Administrador admin : listaAdministradores) {
    %>
    <p><b>Admin N°<%=cont%></b></p>
    <p>Cliente:<%=admin.getNombre()%></p>
    <p>Cliente:<%=admin.getApellido()%></p>
    <p>Cliente:<%=admin.getCorreo()%></p>
    <p>Cliente:<%=admin.getContrasena()%></p>
    <p>---------------------------------------------</p>
    <%cont = cont + 1;%>
    <%
        }
    %>
</main>
<%@ include file="footer.jsp" %>