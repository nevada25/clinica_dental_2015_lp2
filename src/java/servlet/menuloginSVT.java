package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NEVADA
 */
public class menuloginSVT extends HttpServlet {

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
           int menu=Integer.parseInt(request.getParameter("menu"));
           
           switch(menu){
            case 1:
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>BIENVENIDOS</title>");
            out.println("<meta charset='utf-8'><meta charset='iso-8859-2'><meta name='viewport' content='width=device-width, initial-scale=1'>");
            out.println("<link rel='stylesheet' href='bootstrap/css/bootstrap.min.css'>"
                    + "<link href='http://fonts.googleapis.com/css?family=Montserrat\' rel='stylesheet'>"
                    + "<script src='jquery/jquery-2.1.4.min.js'></script>"
                    + " <link rel='stylesheet' href='../estilos/loginnuevo.css'>"
                    + "<script src='bootstrap/js/bootstrap.min.js'></script>");
            out.println("<link rel='shortcut icon'  href='img/logo.ico'/>");
            out.println("<style> "
                    + "body {font: 20px Montserrat, sans-serif;line-height: 1.8;color: #f5f6f7;}p {font-size: 16px;}.margin {margin-bottom: 45px;}"
                    + ".bg-1 {background:#000000 ;color: #ffffff;}.bg-2 {background-color: #474e5d;color: #ffffff;}.bg-3 {background-color: #ffffff;"
                    + "color: #555555;}.bg-4 {background-color: #2f2f2f;color: #fff;}.container-fluid {padding-top: 70px;padding-bottom: 70px;}"
                    + ".navbar {padding-top: 15px;padding-bottom: 15px;border: 0;border-radius: 0;margin-bottom: 0;font-size: 14px;letter-spacing: 3px;"
                    + "}.navbar-nav  li a:hover {color: #1abc9c !important;}</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav class='navbar navbar-default navbar-fixed-top' style='height: 80px;'><div class='container'><form action='menuloginSVT' method='POST' >"
                    + "<div class='navbar-header'><button type='button' class='navbar-toggle' data-toggle='collapse' data-target='#myNavbar'><span class='icon-bar'>"
                    + "</span><span class='icon-bar'></span><span class='icon-bar'></span></button><a href='login2.jsp' class='navbar-brand'>PERUANO JAPONES</a></div>"
                    + "<div class='collapse navbar-collapse' id='myNavbar' style='padding-right: -10px;'><ul class='nav navbar-nav navbar-right' ><li><a>"
                    + "<button  type='submit' value='2' name=menu' style='background: none; border: none;'>GALERIA</button></a></li><li><a href='#'>REGISTRATE</a></li>"
                    + "<li><a href='#'>INICIAR SESSI&Oacute;N</a></li></ul></div></form></div></nav>");
            out.println("<!-- First Container --><div class='container-fluid bg-1 text-center' style='margin-top: 30px;'><div class='img-responsive '>"
                    + "<img src='img/LOGOCD.jpg' style='width: 100%;height: 600px; margin-bottom:-70px;margin-left:-70;margin-right:-70; '></div></div>"
                    + "<!-- Second Container --><div class='container-fluid bg-2 text-center 'style='width: 100%; text-align: center;'><center><h1 class='margin'>QUIENES SOMOS</h1>"
                    + "<h3 style=' text-align: center; '><p>El &#34;CENTRO ODONTOLÓGICO PERUANO JAPONESA&#34; se inauguró el 3 de agosto del año 2013,</p><p>teniendo por representante "
                    + "legas a señorita Yuriko Matayoshi R. .</p><p>GERENTE GENERAL: Yuriko Matayoshi R.</p><p>GERENTE COMERCIAL: Reina E. Sánchez Irigoin</p></h3>"
                    + "</center></div>");
            out.println("<footer class='container-fluid bg-2 text-center' style='background: #1abc9c'><p>&COPY;HECHO POR KEVIN CALDERON Y LUIS LAVADO<a href='#'></a></p></footer>");
            out.println("</body>");
            out.println("</html>");
     
            
             break;
                
            case 2:
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>GALERIA</title>");
            out.println("<meta charset='utf-8'><meta charset='iso-8859-2'><meta name='viewport' content='width=device-width, initial-scale=1'>");
            out.println("<link rel='stylesheet' href='bootstrap/css/bootstrap.min.css'>"
                    + "<link href='http://fonts.googleapis.com/css?family=Montserrat\' rel='stylesheet'>"
                    + "<script src='jquery/jquery-2.1.4.min.js'></script>"
                    + " <link rel='stylesheet' href='../estilos/loginnuevo.css'>"
                    + "<script src='bootstrap/js/bootstrap.min.js'></script>");
            out.println("<link rel='shortcut icon'  href='img/galeria.ico'/>");
            out.println("<style> "
                    + "body {font: 20px Montserrat, sans-serif;line-height: 1.8;color: #f5f6f7;}p {font-size: 16px;}.margin {margin-bottom: 45px;}"
                    + ".bg-1 {background:#000000 ;color: #ffffff;}.bg-2 {background-color: #474e5d;color: #ffffff;}.bg-3 {background-color: #ffffff;"
                    + "color: #555555;}.bg-4 {background-color: #2f2f2f;color: #fff;}.container-fluid {padding-top: 70px;padding-bottom: 70px;}"
                    + ".navbar {padding-top: 15px;padding-bottom: 15px;border: 0;border-radius: 0;margin-bottom: 0;font-size: 14px;letter-spacing: 3px;"
                    + "}.navbar-nav  li a:hover {color: #1abc9c !important;}</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav class='navbar navbar-default navbar-fixed-top' style='height: 80px;'><div class='container'><form action='menuloginSVT' method='POST' >"
                    + "<div class='navbar-header'><button type='button' class='navbar-toggle' data-toggle='collapse' data-target='#myNavbar'><span class='icon-bar'>"
                    + "</span><span class='icon-bar'></span><span class='icon-bar'></span></button><a href='login2.jsp'  class='navbar-brand'>PERUANO JAPONES</a>"
                    + "</div><div class='collapse navbar-collapse' id='myNavbar' style='padding-right: -10px;'><ul class='nav navbar-nav navbar-right' ><li><a>"
                    + "<button  type='submit' value='2' name='menu' style='background: none; border: none;'>GALERIA</button></a></li><li><a href='#'>REGISTRATE</a></li>"
                    + "<li><a href='#'>INICIAR SESSI&Oacute;N</a></li></ul></div></form></div></nav>");
            out.println("<div id='carousel-example-generic' class='carousel slide' data-ride='carousel' style='margin-top: 80px;' >");
            out.println("<ol class='carousel-indicators'>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='0' class='active'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='1'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='2'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='3'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='4'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='5'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='6'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='7'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='8'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='9'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='10'></li><li data-target='#carousel-example-generic' data-slide-to='1'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='11'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='12'></li>\n" +
                    "    <li data-target='#carousel-example-generic' data-slide-to='13'></li>\n" +
                    "     </ol>");
            out.println("<div class='carousel-inner' role='listbox'><div class='item active'><img src='img/Nueva carpeta/carrosel(1).jpg' style='width: 100%; height:600px;' alt='...'>"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(2).jpg' style='width: 100%; height:600px;'  >"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(3).jpg' style='width: 100%; height:600px;'  >"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(4).jpg' style='width: 100%; height:600px;'  >"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(5).jpg' style='width: 100%; height:600px;'  alt='...'>"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(6).jpg' style='width: 100%; height:600px;'  alt='...'>"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(7).jpg' style='width: 100%; height:600px;'  alt='...'>"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(8).jpg' style='width: 100%; height:600px;'  alt='...'>"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(9).jpg' style='width: 100%; height:600px;'  alt='...'>"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(10).jpg' style='width: 100%; height:600px;'  alt='...'>"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(11).jpg' style='width: 100%; height:600px;'  alt='...'>"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(12).jpg' style='width: 100%; height:600px;'  alt='...'>"
                    + "<div class='carousel-caption'></div></div><div class='item'><img src='img/Nueva carpeta/carrosel(13).jpg' style='width: 100%; height:600px;'  alt='...'>"
                    + "<div class='carousel-caption'></div></div></div>");
            out.println("<!-- Controls --><a class='left carousel-control' href='#carousel-example-generic' role='button' data-slide='prev'>\n" +
"    <span class='glyphicon glyphicon-chevron-left' aria-hidden='true'></span><span class='sr-only'>Previous</span></a><a class='right carousel-control' href='#carousel-example-generic' role='button' data-slide='next'>"
                    + "<span class='glyphicon glyphicon-chevron-right' aria-hidden='true'></span><span class='sr-only'>Next</span></a>");
            out.println("</div>");
            out.println("<footer class='container-fluid bg-2 text-center' style='background: #1abc9c'><p>&COPY;HECHO POR KEVIN CALDERON Y LUIS LAVADO<a href='#'></a></p></footer>");
            out.println("</body>");
            out.println("</html>");
     
            
            break;
               
            
           }
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
        processRequest(request, response);
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
