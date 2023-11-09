/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package CONTROLLER;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.function.Function;
import com.google.gson.Gson;

import MODEL.Categoria;
import DAL.CategoriaDAL;
import java.util.List;



@WebServlet(urlPatterns = {"/categoria/send", "/categoria/get"})
public class CategoriaController extends HttpServlet {

    CategoriaDAL objDAL = new CategoriaDAL();
    Gson gson = new Gson();
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        if(request.getServletPath().equals("/categoria/get")){
            try{
                
                List<Categoria> categorias = getCategoria();
                
                 if(!categorias.isEmpty()){
                     
                     String jsonCategorias = gson.toJson(categorias);
                     
                     response.setContentType("application/json");
                     response.getWriter().write(jsonCategorias);
                     response.setStatus(HttpServletResponse.SC_OK);
                 } else {
                     response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
                 }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        if(request.getServletPath().equals("/categoria/send")){
            try{
                String categoria = (String) request.getParameter("categoriaInput");
                 if(postCategoria(categoria) && categoria != null){
                     response.setStatus(HttpServletResponse.SC_OK);
                 } else {
                     response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
                 }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    //FUNÇÕES INTERMEDIARIAS COM A DAL
    
    private List<Categoria> getCategoria() throws SQLException, ClassNotFoundException {
        return objDAL.selectCategoria();
    }
    
    private boolean postCategoria(String categoria) throws SQLException, ClassNotFoundException {
        return objDAL.insertCategoria(categoria);
    }
    
    
}
