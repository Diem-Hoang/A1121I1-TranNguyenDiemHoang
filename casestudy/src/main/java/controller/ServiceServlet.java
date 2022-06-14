package controller;

import model.bean.RentType;
import model.bean.Service;
import model.bean.ServiceDAO.ServiceType;
import model.service.Interface.IOpject2FieldService;
import model.service.Interface.IServiceDAO_Service;
import model.service.Impl.Opject2FieldService;
import model.service.Impl.ServiceDAO_Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {


    private ServiceDAO_Service rentTypeService = new ServiceDAO_Service();
    private List<RentType> rent_typeList = rentTypeService.getListRent_Type() ;
    private IOpject2FieldService iOpject2FieldService = new Opject2FieldService();
    private  List<ServiceType> service_typeList = iOpject2FieldService.getListServiceType();
    private IServiceDAO_Service iServiceDAO_service = new ServiceDAO_Service();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String  action = request.getParameter("action");
        if( action == null)
            action = "";

        switch (action){
            case "add":{

                int service_area = Integer.parseInt(request.getParameter("service_area"));
                int service_max_people = Integer.parseInt(request.getParameter("service_max_people"));
                int service_type_id = Integer.parseInt(request.getParameter("service_type_id"));
                int rent_type_id = Integer.parseInt(request.getParameter("rent_type_id"));
                int number_of_floors = Integer.parseInt(request.getParameter("number_of_floors"));
                double pool_area  = Double.parseDouble(request.getParameter("pool_area" ));
                double service_cost  = Double.parseDouble(request.getParameter("service_cost" ));
                String service_name = request.getParameter("service_name");
                String standard_room = request.getParameter("standard_room");
                String description_other_convenience = request.getParameter("description_other_convenience");

                HttpSession session = request.getSession();
                Service service = new Service(0,service_name,service_area,service_cost,service_max_people,rent_type_id,service_type_id,number_of_floors,standard_room,description_other_convenience,pool_area);
                if(iServiceDAO_service.addService(service)){
                    session.setAttribute("msgSucces"," Them thanh cong");
                }
                else{
                    session.setAttribute("msgFail"," Them that bai");
                }

            }
        }

        response.sendRedirect("/customers");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action ==null)
            action ="" ;

        request.setAttribute("rent_typeList",rent_typeList);
        switch (action){
            case "showFormAddServiceVilla":{
                RequestDispatcher dispatcher = request.getRequestDispatcher("service/add_villa.jsp");
                try {
                    dispatcher.forward(request,response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case "showFormAddServiceHouse":{
                RequestDispatcher dispatcher = request.getRequestDispatcher("service/add_house.jsp");
                try {
                    dispatcher.forward(request,response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }   break;

            }
            case "showFormAddServiceRoom":{

                RequestDispatcher dispatcher = request.getRequestDispatcher("service/add_room.jsp");
                try {
                    dispatcher.forward(request,response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } break;
            }
        }
    }
}