package Model;

import jakarta.servlet.http.HttpServletRequest;

public class OrderConstructor { //класс заказа через конструктор(клиент сам выбирает топпинги)
    private Integer id;

    private String[] toppings;
    private Integer user_id;


    public OrderConstructor(){}

    public OrderConstructor(String toppings[], Integer user_id) {
        this.toppings = toppings;
        this.user_id = user_id;
    }

    public OrderConstructor(HttpServletRequest request) {
        this.toppings = request.getParameterValues("toppings");
    }

    public Integer getId() {
        return id;
    }



    public String[] getTopping() {
        return toppings;
    }

    public void setToppings(String toppings []) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}
