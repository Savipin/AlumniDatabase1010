/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnidatabase;

/**
 *
 * @author tjpeltier
 */
public class Contact {
    private boolean isActive;
    private boolean isEmployee; 
    private boolean hasPaidFees;
    private String name;
    private String company;
    private String email;
    private String jobTitle;
    private String businessPhone;
    private String address;
    private String gradMajor;
    private int gradYear;
    

    public Contact() {
    }

  
    public Contact(String name, String company,  String jobTitle, String email,String businessPhone, String address, String gradMajor, int gradYear, boolean isActive, boolean isEmployee, boolean hasPaidFees) {
        this.name = name;
        this.company = company;
        this.jobTitle = jobTitle;
        this.email = email;
        this.businessPhone = businessPhone;
        this.address = address;
        this.gradMajor = gradMajor;
        this.gradYear = gradYear;
        this.isActive = isActive;
        this.isEmployee = isEmployee;
        this.hasPaidFees = hasPaidFees;
    }

    public boolean getIsActive() {
        return isActive;
    }
    public boolean getIsIsEmployee() {
        return isEmployee;
    }

    public boolean getIsHasPaidFees() {
        return hasPaidFees;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public String getAddress() {
        return address;
    }

    public String getGradMajor() {
        return gradMajor;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public void setIsEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public void setHasPaidFees(boolean hasPaidFees) {
        this.hasPaidFees = hasPaidFees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGradMajor(String gradMajor) {
        this.gradMajor = gradMajor;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
    
     
    
    
    
    
}
