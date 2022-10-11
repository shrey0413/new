Final Result
<html>
    <head>
        <title>Enter two numbers to add up</title>
    </head>
    
    <body>
    <%= "<h1> The sum is "+(Integer.parseInt(request.getParameter("num1"))+Integer.parseInt(request.getParameter("num2")))+"</h1>"%>
    
    <a href="index">Calculate more</a> 
</body>
</html>