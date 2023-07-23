/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import root.model.CalcularIntere;
import root.model.ComprobarDato;

/**
 *
 * @author Eliulson
 */
@WebServlet(name = "Controller", urlPatterns = {"/controller"})
public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Obtener los parametros del formulario
        String capital = request.getParameter("capital");
        String interes = request.getParameter("interes");
        String anio = request.getParameter("anio");
        
        
        // Validar los datos (almacenar mensajes de error en un Map)
        Map<String, String> errores = new HashMap<>();
        ComprobarDato info = new ComprobarDato();
        
        if(info.sinData(capital)){
            errores.put("capital", "La capital a ingresar es obligatoria");
        } else if(Integer.parseInt(capital) <= 500){
            errores.put("capital", "La capital a ingresar debe ser mayor a $500");
        }
        
        if(info.sinData(interes)){
            errores.put("interes", "El interés a ingresar es obligatorio");
        } else if(Integer.parseInt(interes) < 1 || Integer.parseInt(interes) > 100){
            errores.put("interes", "Solo puede ingresar una tasa de interes entre 1% - 100%");
        }
        
        if(info.sinData(anio)){
            errores.put("anio", "El año a ingresar es obligatorio");
        } else if(Integer.parseInt(anio) <= 0 || Integer.parseInt(anio) > 50){
            errores.put("anio", "Solo puede ingresar un año entre 1-50");
        }
        
        // Si hay errores, enviamos el objeto errores como atributo a la página index, para que el usuario vuelva agregar los datos
        // Si la coleción está vacia es porque no sea registrado ningún error, de lo contrario si hay errores y vuelve al formulario.
        if(!errores.isEmpty()){
            
            request.setAttribute("errores", errores);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            
        } else{
            
            CalcularIntere c = new CalcularIntere();
            
            int simple =  c.intereSimple(Double.parseDouble(capital), Double.parseDouble(interes), Double.parseDouble(anio));
            String resultado = Integer.toString(simple);
            request.setAttribute("resultado", resultado);
            request.setAttribute("capital", capital);
            request.setAttribute("interes", interes);
            request.setAttribute("anio", anio);
            
            RequestDispatcher rd = request.getRequestDispatcher("salida.jsp");
            rd.forward(request, response);
            
        }
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
