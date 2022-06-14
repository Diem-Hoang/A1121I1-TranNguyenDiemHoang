package controller;

import model.bean.Employee;
import model.service.Interface.IEmployeeService;
import model.service.Impl.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employees")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addEmployee(request, response);
                break;
            case "edit":
                editEmployee(request, response);
                break;
            case "delete":
                deleteEmployee(request, response);
                break;
            default:
                showListEmployee(request, response);
                break;
        }
    }

    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employees = iEmployeeService.getAllListEmployee();
        request.setAttribute("employees", employees);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        Double salary = Double.parseDouble(request.getParameter("salary"));
        String idCard = request.getParameter("id-card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idPosition = Integer.parseInt(request.getParameter("idPosition"));
        int idEducationDegree= Integer.parseInt(request.getParameter("idEducationDegree"));
        int idDivision = Integer.parseInt(request.getParameter("idDivision"));

        Employee employee = new Employee(id, name, birthday, idCard, phone, email, address, salary, idPosition, idEducationDegree, idDivision);
        try {
            iEmployeeService.editEmployee(employee);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        response.sendRedirect("/employees");
    }


    private void addEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        Double salary = Double.parseDouble(request.getParameter("salary"));
        String idCard = request.getParameter("id-card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idPosition = Integer.parseInt(request.getParameter("idPosition"));
        int idEducationDegree = Integer.parseInt(request.getParameter("idEducationDegree"));
        int idDivision = Integer.parseInt(request.getParameter("idDivision"));
        Employee employee = new Employee(name, birthday, idCard, phone, email, address, salary, idPosition, idEducationDegree, idDivision);
        if (iEmployeeService.addEmployee(employee) )
            System.out.println("Add employee success!");
        else System.out.println("Add employee failed!");
        try {
            response.sendRedirect("/home?action=showEmployee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idDelete"));
        if(iEmployeeService.deleteEmployee(id)){
            System.out.println("Delete employee success!");
            try {
                response.sendRedirect("/employees");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else
            System.out.println("Delete employee failed!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                showEditEmployee(request, response);
            case "create":
                showCreateEmployee(request, response);
                break;
            case "search":
                searchEmployee(request, response);
                break;
            default:
                showEmployee(request, response);
                break;
        }

    }

    private void searchEmployee(HttpServletRequest request, HttpServletResponse response) {
        int idEmployee = Integer.parseInt(request.getParameter("idEmployee"));
        String nameEmployee = request.getParameter("nameEmployee");

        List<Employee> employeeList = iEmployeeService.searchEmployee(idEmployee, nameEmployee);

        request.setAttribute("employeeList", employeeList);
        request.setAttribute("idEmployee", idEmployee);
        request.setAttribute("nameEmployee", nameEmployee);

        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditEmployee(HttpServletRequest request, HttpServletResponse response) {
        int idEdit = Integer.parseInt(request.getParameter("id"));
        Employee employee = iEmployeeService.getEmployeeById(idEdit);
        request.setAttribute("employee", employee);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/edit.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateEmployee(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employees = iEmployeeService.getAllListEmployee();
        request.setAttribute("employees", employees);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
