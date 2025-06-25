package servlets;

import controllers.VotoController;
import entities.Voto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

@WebServlet(urlPatterns = "/resultados")
public class ResultadosServlet extends HttpServlet {
    private final VotoController votoController = new VotoController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Leemos las votaciones que están en el DB con un map

        Map<String, Long> votos = votoController.findAll()
                .stream().collect(Collectors.groupingBy(Voto::getPartido, Collectors.counting()));

        req.setAttribute("listado", votos);
        req.getRequestDispatcher("resultados.jsp").forward(req,resp);
    }
}
