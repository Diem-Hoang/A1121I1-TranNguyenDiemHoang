package model.service.Impl;

import model.bean.Customer;
import model.bean.CustomerType;
import model.bean.EmployeeDAO.Division;
import model.bean.EmployeeDAO.EducationDegree;
import model.bean.EmployeeDAO.Position;
import model.bean.EmployeeDAO.Role;
import model.bean.ObjectType2Filed;
import model.bean.ServiceDAO.ServiceType;
import model.repository.Impl.Opject2FieldRepository;
import model.repository.Interface.IOpject2FieldRepository;
import model.service.Interface.IOpject2FieldService;

import java.util.ArrayList;
import java.util.List;

public class Opject2FieldService  implements IOpject2FieldService {
    private IOpject2FieldRepository iOpjectRepository = new Opject2FieldRepository();
    @Override
    public List<ObjectType2Filed> getAllList2Field(String nameTable) {
        return iOpjectRepository.getAllList2Field(nameTable);
    }

    @Override
    public List<CustomerType> getAllListCustomerType() {
        List<CustomerType> customerList = new ArrayList<>();
        for ( ObjectType2Filed tmp:
                getAllList2Field( "customer_type")
        ){
            customerList.add(new CustomerType(tmp.getId(),tmp.getName()));

        }
        return customerList;
    }

    @Override
    public List<Division> getAllListDivison() {
        List<Division> customerList = new ArrayList<>();
        for ( ObjectType2Filed tmp:
                getAllList2Field( "division")
        ){
            customerList.add(new Division(tmp.getId(),tmp.getName()));

        }
        return customerList;
    }

    @Override
    public List<Position> getAllListPositon() {
        List<Position> customerList = new ArrayList<>();
        for ( ObjectType2Filed tmp:
                getAllList2Field( "positions")
        ){
            customerList.add(new Position(tmp.getId(),tmp.getName()));

        }
        return customerList;    }

    @Override
    public List<Role> getListRole(int i) {
        List<Role> customerList = new ArrayList<>();
        for ( ObjectType2Filed tmp:
                getAllList2Field( "role")
        ){

            if( tmp.getId() <= i  )
                customerList.add(new Role(tmp.getId(),tmp.getName()));

        } return customerList;
    }

    @Override
    public List<EducationDegree> getAllListEducationDegree() {
        List<EducationDegree> customerList = new ArrayList<>();
        for ( ObjectType2Filed tmp:
                getAllList2Field( "education_degree")
        ){
            customerList.add(new EducationDegree(tmp.getId(),tmp.getName()));

        } return customerList;
    }

    @Override
    public List<ServiceType> getListServiceType() {
        List<ServiceType> customerList = new ArrayList<>();
        for ( ObjectType2Filed tmp:
                getAllList2Field( "education_degree")
        ){
            customerList.add(new ServiceType(tmp.getId(),tmp.getName()));

        } return customerList;
    }


}
