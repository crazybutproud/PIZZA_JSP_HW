package Model;

import jakarta.servlet.http.HttpServletRequest;

public class OrderClassic { //класс стандартного заказа(клиент выбирает название пиццы и топпинг по желанию)
    private Integer id;
    private String name_pizza;

    private String[] topping;
    private Integer user_id;


    public OrderClassic(){}

    public OrderClassic(String name_pizza, String topping[], Integer user_id) {
        this.name_pizza = name_pizza;
        this.topping = topping;
        this.user_id = user_id;
    }

    public OrderClassic(HttpServletRequest request) {
        this.name_pizza = request.getParameter("name_pizza");
        this.topping = request.getParameterValues("topping");
    }

    public Integer getId() {
        return id;
    }



    public String getName_pizza() {
        return name_pizza;
    }

    public void setName_pizza(String name_pizza) {
        this.name_pizza = name_pizza;
    }



    public String[] getTopping() {
        return topping;
    }

    public void setTopping(String topping []) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name_pizza='" + name_pizza + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
