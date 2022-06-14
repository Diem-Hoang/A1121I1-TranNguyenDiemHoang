package controller;

import model.bean.ContractDAO.Contract;
import model.repository.Impl.ContractRepository;
import model.service.Impl.ContractService;
import model.service.Interface.IContractService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contracts")
public class ContractServlet extends HttpServlet {
    private IContractService iContractService = new ContractService();
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
                deleteContract(request, response);
                break;
            default:
                showListContract(request, response);
                break;
        }

    }
    private void deleteContract(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idDelete"));
        if(iContractService.deleteContract(id)){
            System.out.println("Delete contract success!");
            try {
                response.sendRedirect("/contracts");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else
            System.out.println("Delete contract failed!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":

                break;
            case "edit":

                break;
            default:
                showListContract(request, response);
                break;
        }
    }


    private void showListContract(HttpServletRequest request, HttpServletResponse response) {
        List<Contract> contracts = iContractService.getAllListContract();
        request.setAttribute("contracts", contracts);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contract/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
