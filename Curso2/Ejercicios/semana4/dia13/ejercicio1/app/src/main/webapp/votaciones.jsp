<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Votación</title>
    <link rel="stylesheet" href="public/css/style.css" />
  </head>
  <body>
    <main class="center-content">
      <div class="content-box">
        <h1>Votación</h1>
        <h2>Elija su voto</h2>
        <form action="/app/votaciones" method="POST">
          <ul class="votacion-lista">
            <li><input required type="radio" name="partido" id="A" value="A" /><label for="A">Partido A</label></li>
            <li><input required type="radio" name="partido" id="B" value="B" /><label for="B">Partido B</label></li>
            <li><input required type="radio" name="partido" id="C" value="C" /><label for="C">Partido C</label></li>
          </ul>
          <button class="btn-votar">Votar</button>
        </form>
        <form action="/app/resultados" method="GET">
          <button class="btn-resultados">Mostrar resultados</button>
        </form>
      </div>
    </main>
  </body>
</html>