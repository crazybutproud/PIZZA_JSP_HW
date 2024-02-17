package Servlets;

import DAO.DBdao;
import Model.Client;
import Model.OrderClassic;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/order-classic")
public class MainPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try {
            completeRequest(request);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher dispatcher =
                request.getServletContext().getRequestDispatcher("/order_classic.jsp");
        dispatcher.forward(request, response);

    }

    private void completeRequest(HttpServletRequest request) throws SQLException {
        DBdao dao = new DBdao();
        ArrayList<String> pizza = new ArrayList<>(dao.allPizza());
        request.setAttribute("namesPizza", pizza);


        dao.closeConnection();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        Client clientAdd = new Client(request);
        OrderClassic orderAdd = new OrderClassic(request);
        response.setContentType("text/html");
        DBdao dao = new DBdao();
        dao.addQueryFromOrderClassic(clientAdd,orderAdd);
        request.setAttribute("orderAdded", orderAdd);
        request.setAttribute("clientAdded", clientAdd);

        try {
            dao.closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

