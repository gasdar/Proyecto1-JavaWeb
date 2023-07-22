<%-- 
    Document   : index
    Created on : 21-07-2023, 16:49:58
    Author     : Eliulson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <link href="assets/css/Estilo1.css" rel="stylesheet" type="text/css">
        <script src="https://kit.fontawesome.com/0c418a5786.js" crossorigin="anonymous"></script>
        <title>ISimple.Inicio</title>
    </head>
    <body>
        
        <!-- Logo tipo y presentación de la pagína principal -->
        <header class="container-fluid justify-content-between align-items-center row" id="container1">
            
            <img src="assets/img/logo.png" alt="logo de la empresa" class="img-fluid"/>
                   
        </header>
        
        <!-- Introducción al cálculo simple y formulario -->
        <main class="container-fluid" id="container2">
            
            <section class="row align-items-center justify-content-around">
                <div class="col-lg-7">
                    <h1 class="text-center">Cálculo de Interés Simple</h1>
                    <p>
                        Acá podrás hacer tu propia tasa de interés simple, está constará de 3 datos necesarios de los cuales tu proveerás:<br><br>c = capital a invertir, i = tasa de interés, n = número de años.<br><br>
                        Al ingresar los datos podrás saber el interés que tendrás que cancelar respecto a los datos proporcionados, y podrás juzgar por tu cuenta si en una buena elección, o de lo contrario buscar una tasa de interés mas baja.
                    </p>
                </div>
                
                <div class="col-lg-3">
                    <img src="assets/img/1.jpg" alt="persona consiguindo un cálculo" class="img-fluid img-thumbnail"/>      
                </div>
            </section>
            
            <section class="row justify-content-center">
                <div class="col-10">
                    <h2>Ingrese los Siguientes Datos:</h2>
                    <form action="" method="post" name="formulario1" id="formulario1">
                        <div class="col-12 div-in">
                            <label for="capital" class="form-label">Capital total</label>
                            <input type="number" name="capital" id="capital" class="form-control" required>
                        </div>

                        <div class="col-12 div-in">
                            <label for="interes" class="form-label">Tasa de interes</label>
                            <input type="number" name="interes" id="interes" class="form-control" required>
                        </div>

                        <div class="col-12 div-in">
                            <label for="capital" class="form-label">Números de Años</label>
                            <input type="number" name="capital" id="capital" class="form-control" required>
                        </div>

                        <div class="col-12 div-in">
                            <input type="submit" value="ENVIAR" form="formulario1">
                        </div>
                    </form>
                </div>
            </section>
            
            <section class="row align-items-center justify-content-around">
                <div class="col-md-6">
                    <h2 class="text-center">Ejemplo de Cálculo de Interés Simple</h2>
                    <p>
                        Supongamos los siguientes datos: c = $100.000 de capital, i = 10% de interés, n = 3 años.
                        <br><br>Resultado =  c * (i/100) * n<br>Resultado = interés simple de $30.000<br><br>
                        En otras palabras, una capital de $100.000 a una tasa anual del 10% en 3 años genera un interés simple de: $30.000
                    </p>
                </div>
                
                <div class="col-md-4">
                    <img src="assets/img/2.jpg" alt="Personas poniendose de acuerdo." class="img-fluid img-thumbnail"/>
                </div>
            </section>
            
        </main>
        
        <div id="amplia">
            <p>INTENTA AMPLIAR LA PANTALLA</p>
        </div>
        
        <!-- Enlace de github y vuelve al inicio -->
        <footer class="container-fluid row align-items-center justify-content-around text-center" id="container3">
            <div class="col-sm-5" id="isimple">
                <a href="#container1">Somos ISimple</a>
            </div>
            <div class="col-sm-5">
                <a href="#">Encuentra el código en <i class="fa-brands fa-github"></i></a>
            </div>
        </footer>
        
    </body>
</html>
