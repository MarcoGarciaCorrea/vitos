<%@ include file="header.jsp" %>

<main>
    <h1>Datos del administrador</h1>
    <form action="..\SvAdministradores" method="POST">
        <p><label>Nombre:</label><input type="text" name="nombre"></p>
        <p><label>Apellido:</label><input type="text" name="apellido"></p>
        <p><label>Correo:</label><input type="text" name="correo"></p>
        <p><label>Contraseña</label><input type="text" name="contrasena"></p>
        <button type="submit">Enviar</button>                    
    </form>

    
</main>
<%@ include file="footer.jsp" %>