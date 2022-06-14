package model.bean.EmployeeDAO;

import model.bean.ObjectType2Filed;

public class Role extends ObjectType2Filed {


    public Role(int id, String name) {
        super(id, name);
    }


    public int getRole_Id() {
        return super.getId();
    }


    public void setRole_Id(int id) {
        super.setId(id);
    }


    public String getRole_Name() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

}
