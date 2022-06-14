package controller;

import model.bean.Customer;
import model.bean.CustomerType;
import model.repository.Interface.ICustomerType;
import model.repository.Impl.CustomerTypeRepository;
import model.service.Interface.ICustomerService;
import model.service.Impl.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    private ICustomerType iCustomerType = new CustomerTypeRepository();
    private ICustomerService iCustomerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
            case "delete":
                deleteCutomer(request, response);
            default:
                //showListCustomer(request, response);
                break;
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("id-card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idTypeCustomer = Integer.parseInt(request.getParameter("customerTypes"));

        Customer customer = new Customer(id, name, birthday, gender, idCard, phone, email, address, idTypeCustomer);
        try {
            iCustomerService.editCustomer(customer);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        response.sendRedirect("/home?action=showCustomer");
    }

    private void deleteCutomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idDelete"));
        if(iCustomerService.deleteCustomer(id)){
            System.out.println("Delete customer success!");
            try {
                response.sendRedirect("/customers");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else
            System.out.println("Delete customer failed!");

    }

    private void addCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        System.out.println(gender);
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("id-card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idTypeCustomer = Integer.parseInt(request.getParameter("customerTypes"));
        Customer customer = new Customer(name, birthday,gender, idCard, phone, email, address, idTypeCustomer);
         if ( iCustomerService.addCustomer(customer) )
             System.out.println("Add customer success!");
         else System.out.println("Add customer failed");
        try {
            response.sendRedirect("/customers");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateCustomer(request, response);
                break;
            case "edit":
                showFormEditCustomer(request, response);
                break;
            default:
                showListCustomer(request, response);
                break;
        }

    }

    private void showListCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType> customerTypes = iCustomerType.getAllListCustomerType();
        List<Customer> customers = iCustomerService.getAllListCustomer();
        request.setAttribute("customers", customers);
        request.setAttribute("customerTypes", customerTypes);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idEdit = Integer.parseInt(request.getParameter("id"));
        Customer customer = iCustomerService.getCustomerById(idEdit);
        List<CustomerType> customerTypes = iCustomerType.getAllListCustomerType();
        request.setAttribute("customerTypes", customerTypes);
        request.setAttribute("customer", customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/edit.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType> customerTypes = iCustomerType.getAllListCustomerType();
        request.setAttribute("customerTypes", customerTypes);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
