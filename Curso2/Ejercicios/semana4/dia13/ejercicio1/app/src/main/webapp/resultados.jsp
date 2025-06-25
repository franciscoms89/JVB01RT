<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Resultados</title>
    <link rel="stylesheet" href="public/css/style.css" />
  </head>
  <body>
    <main class="center-content">
      <div class="content-box">
        <h1>Resultados</h1>
        <table class="tabla-resultados">
          <thead>
            <tr>
              <th>Nombre Partido</th>
              <th>Cantidad de votos</th>
            </tr>
          </thead>
          <tbody>
            <%
              Map<String, Long> listado = (Map<String, Long>) request.getAttribute("listado");
              for (Map.Entry<String, Long> entry : listado.entrySet()) {
                  String key = entry.getKey();
                  Long value = entry.getValue();
            %>
              <tr>
                <td>Partido <%= key %></td>
                <td><%= value %></td>
              </tr>
            <%
              }
            %>
          </tbody>
        </table>
        <a href="/app/votaciones" class="btn-votar">¿Quieres volver a votar?</a>
      </div>
    </main>
  </body>
</html>
