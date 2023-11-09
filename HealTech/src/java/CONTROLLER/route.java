/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author jr_ma
 */
@WebServlet(urlPatterns = {"", "/home","/home/quizP","/home/quizN", "/home/insertQuestion"})
public class route extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            RequestDispatcher dispatcher = new RequestDispatcher() {
                @Override
                public void forward(ServletRequest request, ServletResponse response) throws ServletException, IOException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void include(ServletRequest request, ServletResponse response) throws ServletException, IOException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
            
            HttpSession session = request.getSession();
            
            if(request.getServletPath().equals("")){
            
            }
            
            if(request.getServletPath().contains("/home")){
                
                if(request.getServletPath().equals("/home/quizP")){
                    session.setAttribute("paginaAtual", "/PaginasUser/quizPersonal.jsp");
                }
                if(request.getServletPath().equals("/home/quizN")){
                    session.setAttribute("paginaAtual", "/PaginasUser/quizNormal.jsp");
                }
                
                /*ADMIN - MUDAR DPS*/
                if(request.getServletPath().equals("/home/insertQuestion")){
                    session.setAttribute("paginaAtual", "/PaginasADM/insertQuestion.jsp");
                }
                /*ADMIN - MUDAR DPS (END)*/
                dispatcher = request.getRequestDispatcher("/PaginasCONTAINER/homeUser.jsp");
            }
            
             
            dispatcher.forward(request, response);
            
            
        }
    
        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
        }
    
    
}
