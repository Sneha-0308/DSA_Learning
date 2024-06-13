package org.example.newconcept.model;

public class UserDetails {
    private String name;
    private String phone;
    private String department;

    public UserDetails(String name, String phone,String department) {
        this.name = name;
        this.phone = phone;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
