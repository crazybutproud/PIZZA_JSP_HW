<%@ page import="Model.OrderClassic" %>
<%@ page import="Model.Client" %>
<%@ page import="DAO.DBdao" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pizza Delivery</title>
    <link rel="stylesheet" href="Styles.css">
</head>
<body>

<h1>Pizza Delivery</h1>
<img src="https://img.icons8.com/?size=64&id=qF1tmIj6kSPW&format=png">
<br/>
<div class="main">
    <h2>Choose your pizza!
        <img src="https://img.icons8.com/?size=50&id=1911&format=png"></h2>
    <br>
    <a href="order_constructor.jsp">Do it yourself</a> <br>
    or <br>
    Choose pizza: <br>
    <select id="first-info" class="list">
        <option value="p-margarita" name="name_pizza">Margarita</option>
        <option value="p-4cheeses" name="name_pizza">4 cheeses</option>
        <option value="p-hawaii" name="name_pizza">Hawaii</option>
        <option value="p-capriciousness" name="name_pizza">Capriciousness</option>
    </select>
    <br>
    Choose extra topping: <br>
    <input type="radio" id="top-cheese" value="cheese" name="topping">Extra cheese <img
        src="https://img.icons8.com/?size=50&id=277&format=png"><br>
    <input type="radio" id="top-chicken" value="chicken" name="topping">Extra chicken <img
        src="https://img.icons8.com/?size=50&id=2719&format=png"><br>
    <input type="radio" id="top-mushroom" value="mushroom" name="topping">Extra mushroom <img
        src="https://img.icons8.com/?size=32&id=18284&format=png"><br>
    <input type="radio" id="top-pickles" value="pickels" name="topping">Extra pickles <img
        src="https://img.icons8.com/?size=64&id=MIeKtu3zRus6&format=png"><br>
    <input type="radio" id="top-bacon" value="bacon" name="topping">Extra bacon <img
        src="https://img.icons8.com/?size=50&id=0ZSp_wzVjIwg&format=png"><br>
    <input type="radio" id="top-idw" value="no" name="topping">-<br>
    <br>
    <div class="delivery">
        <img src="https://img.icons8.com/?size=50&id=2nDx3uxLUmmH&format=png">
        Delivery: <br>
        <input name="name" placeholder="NAME"> <br>
        <input name="phone" placeholder="PHONE"> <br>
        <input name="email" placeholder="EMAIL"> <br>
        <input name="adress" placeholder="ADRESS"> <br>
    </div>
    <button type="submit">
        <a href="done.jsp">Submit</a> <br>
    </button>

</div>
</body>
</html>
