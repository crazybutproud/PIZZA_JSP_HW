
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Do it yourself</title>
    <link rel="stylesheet" href="Styles.css">
</head>
<body>
<h1>Pizza Delivery</h1>
<img src="https://img.icons8.com/?size=64&id=qF1tmIj6kSPW&format=png">
<br/>
<div class="main">
    Your pizza contains: <br>
    Base <br>
    Sause <br>
    <input type="checkbox" id="con-chicken" value="chicken" name="toppings"/>Chicken <img src="https://img.icons8.com/?size=50&id=2719&format=png"><br>
    <input type="checkbox" id="con-bacon" value="bacon" name="toppings"/>Bacon <img src="https://img.icons8.com/?size=50&id=0ZSp_wzVjIwg&format=png"> <br>
    <input type="checkbox" id="con-mushroom" value="mushroom" name="toppings"/>Mushroom <img src="https://img.icons8.com/?size=32&id=18284&format=png"><br>
    <input type="checkbox" id="con-pickles" value="pickles" name="toppings"/>Pickles <img src="https://img.icons8.com/?size=64&id=MIeKtu3zRus6&format=png"> <br>
    <input type="checkbox" id="con-cheese" value="cheese" name="toppings"/>Cheese <img src="https://img.icons8.com/?size=50&id=277&format=png"><br>
    <input type="checkbox" id="con-onion" value="onion" name="toppings"/>Onion <img src="https://img.icons8.com/?size=64&id=22ZPzsJcZqPz&format=png"><br>
    <input type="checkbox" id="con-beef" value="beef" name="toppings"/>Beef <img src="https://img.icons8.com/?size=50&id=35917&format=png"><br>
    <input type="checkbox" id="con-tomato" value="tomato" name="toppings"/>Tomato <img src="https://img.icons8.com/?size=50&id=1811&format=png"> <br>

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

