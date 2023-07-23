package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"assets/css/Estilo1.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/0c418a5786.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>ISimple.Inicio</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("        <!-- Logo tipo y presentación de la pagína principal -->\n");
      out.write("        <header class=\"container-fluid justify-content-between align-items-center row\" id=\"container1\">\n");
      out.write("            \n");
      out.write("            <img src=\"assets/img/logo.png\" alt=\"logo de la empresa\" class=\"img-fluid\"/>\n");
      out.write("                   \n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <!-- Introducción al cálculo simple y formulario -->\n");
      out.write("        <main class=\"container-fluid\" id=\"container2\">\n");
      out.write("            \n");
      out.write("            <section class=\"row align-items-center justify-content-around\">\n");
      out.write("                <div class=\"col-lg-7\">\n");
      out.write("                    <h1 class=\"text-center\">Cálculo de Interés Simple</h1>\n");
      out.write("                    <p>\n");
      out.write("                        Acá podrás hacer tu propia tasa de interés simple, está constará de 3 datos necesarios de los cuales tu proveerás:<br><br>c = capital a invertir, i = tasa de interés, n = número de años.<br><br>\n");
      out.write("                        Al ingresar los datos podrás saber el interés que tendrás que cancelar respecto a los datos proporcionados, y podrás juzgar por tu cuenta si en una buena elección, o de lo contrario buscar una tasa de interés mas baja.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                    <img src=\"assets/img/1.jpg\" alt=\"persona consiguindo un cálculo\" class=\"img-fluid img-thumbnail\"/>      \n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("            <section class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-10\">\n");
      out.write("                    <h2>Ingrese los Siguientes Datos:</h2>\n");
      out.write("                    <form action=\"controller\" method=\"post\" name=\"formulario1\" id=\"formulario1\">\n");
      out.write("                        <div class=\"col-12 div-in\">\n");
      out.write("                            <label for=\"capital\" class=\"form-label\">Capital total</label>\n");
      out.write("                            <input type=\"number\" name=\"capital\" id=\"capital\" class=\"form-control\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errores.capital}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <div id=\"error1\" class=\"form-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errores.capital}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                            </c:if>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 div-in\">\n");
      out.write("                            <label for=\"interes\" class=\"form-label\">Tasa de interes</label>\n");
      out.write("                            <input type=\"number\" name=\"interes\" id=\"interes\" class=\"form-control\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errores.interes}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <div id=\"error2\" class=\"form-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errores.interes}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                            </c:if>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 div-in\">\n");
      out.write("                            <label for=\"anio\" class=\"form-label\">Números de Años</label>\n");
      out.write("                            <input type=\"number\" name=\"anio\" id=\"anio\" class=\"form-control\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errores.anio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <div id=\"error3\" class=\"form-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errores.anio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                            </c:if>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 div-in\">\n");
      out.write("                            <input type=\"submit\" value=\"ENVIAR\" form=\"formulario1\" class=\"btn btn-secondary\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("            <section class=\"row align-items-center justify-content-around\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <h2 class=\"text-center\">Ejemplo de Cálculo de Interés Simple</h2>\n");
      out.write("                    <p>\n");
      out.write("                        Supongamos los siguientes datos: c = $100.000 de capital, i = 10% de interés, n = 3 años.\n");
      out.write("                        <br><br>Resultado =  c * (i/100) * n<br>Resultado = interés simple de $30.000<br><br>\n");
      out.write("                        En otras palabras, una capital de $100.000 a una tasa anual del 10% en 3 años genera un interés simple de: $30.000\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <img src=\"assets/img/2.jpg\" alt=\"Personas poniendose de acuerdo.\" class=\"img-fluid img-thumbnail\"/>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        <div id=\"amplia\">\n");
      out.write("            <p>INTENTA AMPLIAR LA PANTALLA</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- Enlace de github y vuelve al inicio -->\n");
      out.write("        <footer class=\"container-fluid row align-items-center justify-content-around text-center\" id=\"container3\">\n");
      out.write("            <div class=\"col-sm-5\" id=\"isimple\">\n");
      out.write("                <a href=\"#container1\">Somos ISimple</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-5\">\n");
      out.write("                <a href=\"https://github.com/gasdar/Proyecto1-JavaWeb\">Encuentra el código en <i class=\"fa-brands fa-github\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
