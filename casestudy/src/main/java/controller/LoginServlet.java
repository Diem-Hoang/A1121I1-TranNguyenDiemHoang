package controller;


import model.bean.Service;
import model.service.Impl.LoginService;
import model.service.Interface.ILoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private ILoginService iLoginService = new LoginService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null ){
            action = "";
        }

        switch (action){
            case "login":{
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String cookie = request.getParameter("cookie");

                Service.User userCheck = new Service.User(username,password);
                Service.User user = iLoginService.checkExits(userCheck);

                if( cookie != null) {
                    Cookie c = new Cookie("username", username);
                    Cookie p = new Cookie("password", password);
                    c.setMaxAge(60);
                    p.setMaxAge(60);
                    response.addCookie(c);
                    response.addCookie(p);
                    System.out.println(cookie);
                }

                if(  user == null){
                    request.setAttribute("msg", "Dang Nhap Khong Thanh Cong");
                    RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                    dispatcher.forward(request,response);
                }else{


                    HttpSession session = request.getSession();
                    session.setAttribute("user", user);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
                    dispatcher.forward(request,response);
                }
                break;
            }
            case "logout" : {
                HttpSession session = request.getSession();
                session.invalidate();
                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                dispatcher.forward(request, response);
                break;

            }
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if( action == null)
            action ="";
        switch ( action) {

            default:{
                Cookie ck[] = request.getCookies();
                for ( Cookie o: ck) {
                    if(  o.getName().equals("username"))
                        request.setAttribute("username",o.getValue() );
                    if(  o.getName().equals("password"))
                        request.setAttribute("password",o.getValue() );
                }

                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                dispatcher.forward(request,response);
                break;

            }
        }
    }
}
