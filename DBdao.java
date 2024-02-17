package DAO;

import Model.Client;
import Model.OrderClassic;
import Model.OrderConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBdao { // класс для работы с бд
    private final String DB_URL = "jdbc:postgresql://localhost:8080/pizza delivery";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "postgres";
    private final String DB_DRIVER = "org.postgresql.Driver";
    private final Connection connection;

    public DBdao() {
        try {
            Class.forName(DB_DRIVER);
            this.connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Ошибка бд");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Ошибка драйвера");
            throw new RuntimeException(e);
        }
    }

    public ArrayList<String> allPizza() {
        ArrayList<String> pizza = new ArrayList<>();
        pizza.add("Маргарита");
        pizza.add("Четыре сыра");
        pizza.add("Капричоза");
        pizza.add("Гавайская");
        return pizza;
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }

    public Client addClient(Client client) { //метод добавления клиента в бд
        try {
            connection.createStatement().executeUpdate(getQueryFromUser(client));
            return client;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private String getQueryFromUser(Client client) throws SQLException {
        return String.format("INSERT INTO client (name,number_phone,email,address)  VALUES ( '%s', '%d', '%s', '%s')",
                client.getName(), client.getNumber_phone(), client.getEmail(), client.getAddress());

    }


    public void addOrderClassic(OrderClassic orderClassic) { //добавления классического заказа(пицца,топпинг)
        try {
            connection.createStatement().executeUpdate(getQueryFromOrderClassic(orderClassic));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private String getQueryFromOrderClassic(OrderClassic orderClassic) throws SQLException {
        return String.format("INSERT INTO order_pizza_classic (name_pizza,topping)  VALUES ( '%s', '%s')",
                orderClassic.getName_pizza(), orderClassic.getTopping());

    }

    private String getStrToppings(String[] top) { //получаем строку составляющих для пиццы созданной через конструктор
        StringBuilder builder = new StringBuilder();
        for (String t : top) {
            builder.append(t + " ");
        }
        return builder.toString();
    }

    public void addOrderConstructor(OrderConstructor orderConstructor) { //добавления классического заказа(пицца,топпинг)
        try {
            connection.createStatement().executeUpdate(getQueryFromOrderClassic(orderConstructor));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private String getQueryFromOrderClassic(OrderConstructor orderConstructor) throws SQLException {
        return String.format("INSERT INTO order_pizza_constructor (toppings)  VALUES ( '%s')",
                 getStrToppings(orderConstructor.getTopping()));

    }
}
