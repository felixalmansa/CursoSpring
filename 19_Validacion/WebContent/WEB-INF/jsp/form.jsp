<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    	<style>
    	
    		.error {
    			color: red;
    		}
    	
    	</style>
    </head>
    <body>
        <h3>Bienvenido, introduzca los detalles del empleado</h3>
        <form:form method="POST" action="addEmpleado" modelAttribute="empleadoForm">
             <table>
                <tr>
                    <td><form:label path="nombre">Nombre</form:label></td>
                    <td><form:input path="nombre"/></td>
                    <td><form:errors path="nombre" cssClass="error"></form:errors></td>
                </tr>
                <tr>
                    <td><form:label path="id">Id</form:label></td>
                    <td><form:input path="id"/></td>
                    <td><form:errors path="id" cssClass="error"></form:errors></td>
                </tr>
                <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email"/></td>
                    <td><form:errors path="email" cssClass="error"></form:errors></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>