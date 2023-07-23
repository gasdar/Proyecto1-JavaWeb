<%-- 
    Document   : salida
    Created on : 22-07-2023, 21:44:06
    Author     : Eliulson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <link href="assets/css/Estilo2.css" rel="stylesheet" type="text/css">
        <script src="https://kit.fontawesome.com/0c418a5786.js" crossorigin="anonymous"></script>
        <title>ISimple.Resultado</title>
    </head>
    <body>
        
        <%
            String capital = (String) request.getAttribute("capital");
            String interes = (String) request.getAttribute("interes");
            String anio = (String) request.getAttribute("anio");
            String resultado = (String) request.getAttribute("resultado");
        %>
        
        <header class="container-fluid justify-content-between align-items-center row" id="container1">
            <img src="assets/img/logo.png" alt="logo de la empresa" class="img-fluid"/>           
        </header>
        
        <main class="container-fluid" id="container2">
            <section class="row align-items-center justify-content-around">
                <div class="col-md-5">
                    <h1 class="text-center">Resultado del Cálculo</h1>
                    <p>Una capital de $<%=capital%>, con una tasa de interés del <%=interes%>% y con <%=anio%> años de plazo, genera un interés simple de: $<%=resultado%>.</p>
                </div>
                <div class="col-md-5">
                    <img src="assets/img/3.jpg" alt="señora sentada disfrutando de la calma" class="img-fluid img-thumbnail"/>
                </div>
            </section>
                
                
            <section class="row align-items-center justify-content-around">
                <div class="col-md-5">
                    <img src="assets/img/4.jpg" alt="cuadernos, lapices, en una mesa para realizar calculos" class="img-fluid img-thumbnail"/>
                </div>
                <div class="col-md-5 text-center">
                    <h2 class="text-center display-6">Deseas hacer otro cálculo</h2>
                    <a href="index.jsp" class="btn btn-success">Si Quiero!</a>
                </div>
            </section>
        </main>
                
        <footer class="container-fluid row align-items-center justify-content-around text-center" id="container3">
            <div class="col-sm-5" id="isimple">
                <a href="#container1">Somos ISimple</a>
            </div>
            <div class="col-sm-5">
                <a href="https://github.com/gasdar/Proyecto1-JavaWeb">Encuentra el código en <i class="fa-brands fa-github"></i></a>
            </div>
        </footer>
        
    </body>
</html>
