/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.top.servlet;

import com.top.ejb.CarrosFacadeLocal;
import com.top.ejb.ClientesFacadeLocal;
import com.top.ejb.VentasFacadeLocal;
import com.top.entity.Carros;
import com.top.entity.Clientes;
import com.top.entity.Ventas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres
 */
import javax.servlet.annotation.MultipartConfig;
@MultipartConfig(fileSizeThreshold=1024*1024*10, // 10 MB
 maxFileSize=1024*1024*50, // 50 MB
 maxRequestSize=1024*1024*100, // 100 MB
 location="/")

public class concesionarioservlet extends HttpServlet {

    @EJB
    private VentasFacadeLocal ventasFacade;

    @EJB
    private CarrosFacadeLocal carrosFacade;

    @EJB
    private ClientesFacadeLocal clientesFacade;

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
        PrintWriter out = response.getWriter();
        try {
            String action = request.getParameter("action");
            String url = "index.jsp";
            if ("listaClientes".equals(action)) {
                List<Clientes> findAll = clientesFacade.findAll();
                request.getSession().setAttribute("accounts", findAll);
                url = "listadoC.jsp";
            }else if("listaVentas".equals(action)){
                List<Ventas> findAll = ventasFacade.findAll();
                request.getSession().setAttribute("accounts", findAll);
                url = "listatdoV.jsp"; 
            }else if("buscarAuto".equals(action)){
                String matricula= request.getParameter("matricula");
                Carros foto= carrosFacade.buscarCarro(matricula);
                
            } else if ("login".equals(action)) {
                String u = request.getParameter("correo_electronico");
                String p = request.getParameter("contraseña");
                boolean checkLogin = clientesFacade.checkLogin(u, p);
                if (checkLogin) {
                    request.getSession().setAttribute("login", u);
                    url = "manager.jsp";
                } else {
                    url = "login.jsp?error=1";
                }
            } else if ("insertar".equals(action)) {
                Clientes a = new Clientes();
                Ventas b = new Ventas ();
                Carros c = new Carros();
                a.setCorreoElectronico(request.getParameter("correo_electronico"));
                a.setContraseña(request.getParameter("contraseña"));
                a.setId(Integer.parseInt(request.getParameter("Identificacion")));
                a.setNombre(request.getParameter("Nombre"));
                a.setApellido(request.getParameter("Apellido"));
                a.setRol(request.getParameter("rol"));
                b.setIDventa(Integer.parseInt(request.getParameter("IdFactura")));
                b.setFecha(request.getParameter("fecha"));
                b.setMatricula(c);
                b.setPropietario(a);
                c.setMatricula(request.getParameter("matricula"));
                c.setMarca(request.getParameter("marca"));
                c.setModelo(request.getParameter("modelo"));
                c.setAño(request.getParameter("año"));
                c.setValor(Integer.parseInt(request.getParameter("valor")));
                //c.setFoto(request.getParameter("foto"));
                c.setCaracteristica(request.getParameter("caracteristica"));
                clientesFacade.create(a);
                ventasFacade.create(b);
                carrosFacade.create(c);
                url = "login.jsp";
            } else if ("Eliminar".equals(action)) {
                String id = request.getParameter("id");
                Clientes a = clientesFacade.find(Integer.valueOf(id));
                int pro = a.getId();
                
                Ventas b = ventasFacade.find(pro);
                String placa = b.getMatricula().getMatricula();
                 Carros c = carrosFacade.find(placa);
                clientesFacade.remove(a);
                ventasFacade.remove(b);
                carrosFacade.remove(c);
                url = "concesionarioservlet?action=list";
            } else if ("logout".equals(action)) {
                request.getSession().removeAttribute("login");
                url = "login.jsp";
            }
            response.sendRedirect(url);
        } finally {
            out.close();
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
