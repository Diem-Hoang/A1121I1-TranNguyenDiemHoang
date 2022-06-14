package controller;

import model.Student;
import model.StudentType;
import service.Impl.StudentService;
import service.Impl.StudentTypeService;
import service.Interface.IStudentService;
import service.Interface.IStudentTypeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = "/students")
public class StudentServlet extends HttpServlet {
    private IStudentService iStudentService = new StudentService();
    private IStudentTypeService iStudentTypeService = new StudentTypeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":

                break;
            case "edit":

                break;
            case "delete":   
                deleteStudent(request, response);
                break;
            default:
                showListStudent(request, response);
                break;
        }
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idDelete"));
        if(iStudentService.deleteStudent(id)){
            System.out.println("Delete student success!");
            try {
                response.sendRedirect("/students");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else
            System.out.println("Delete student failed!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "edit":
               
                break;
            default:
                showListStudent(request, response);
                break;
        }

    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("student/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListStudent(HttpServletRequest request, HttpServletResponse response) {
        List<StudentType> studentTypes = iStudentTypeService.getAllListStudentType();
        List<Student> students = iStudentService.getAllListStudent();
        request.setAttribute("students", students);
        request.setAttribute("studentTypes", studentTypes);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("student/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
