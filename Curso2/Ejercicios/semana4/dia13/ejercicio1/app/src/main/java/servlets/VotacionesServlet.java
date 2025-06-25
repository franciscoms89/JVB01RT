package servlets;

import controllers.VotoController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/votaciones")
public class VotacionesServlet extends HttpServlet {
    private final VotoController votoController = new VotoController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("votaciones.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String partidoVotado = req.getParameter("partido");

        // Lo guardamos en la DB
        votoController.create(partidoVotado);

        // Link a la página votaciones
        req.getRequestDispatcher("votaciones.jsp").forward(req,resp);
    }
}
