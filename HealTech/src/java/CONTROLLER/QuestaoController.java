/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*
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

import MODEL.Categoria;
import DAL.CategoriaDAL;
import java.util.List;



@WebServlet(urlPatterns = {"/questao/send"})
public class QuestaoController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    }
    
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        if(request.getServletPath().equals("/questao/send")){
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
    
    protected boolean postCategoria(String categoria) throws SQLException, ClassNotFoundException {
        CategoriaDAL objDAL = new CategoriaDAL();
        return objDAL.insertCategoria(categoria);
    }
    
    
}*/
