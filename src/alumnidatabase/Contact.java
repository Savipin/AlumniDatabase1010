/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnidatabase;

import java.util.ArrayList;
import java.util.Scanner;
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
    
    Scanner in = new Scanner(System.in);
    ArrayList<Contact> memberList ;

    public Contact() {
        memberList = new ArrayList<>();
        memberList.add(new Contact( "bob", "pepsi", "ceo", "bob@pepsi.com",  "5555555555", "000 pepsi way", "business mang", 1881, true, true, true));
        memberList.add(new Contact("sarah", "coke", "cto", "sarah@coke.com",  "8005555555", "555 coke lane", "accounting", 1789, true, true, true));
    }

  
    public Contact(String name, String company, String email, String jobTitle, String buisinessPhone, String address, String gradMajor, int gradYear, boolean isActive, boolean isEmployee, boolean hasPaidFees) {
        
        this.name = name;
        this.company = company;
        this.jobTitle = jobTitle;
        this.email = email;
        this.businessPhone = buisinessPhone;
        this.address = address;
        this.gradMajor = gradMajor;
        this.gradYear = gradYear;
        this.isActive = isActive;
        this.isEmployee = isEmployee;
        this.hasPaidFees = hasPaidFees;
    }

    public void formatContact(int i) {
        
        System.out.println("Name: " + memberList.get(i).getName());
        System.out.println("Company: " + memberList.get(i).getCompany());
        System.out.println("Job Title: " + memberList.get(i).getJobTitle());
        System.out.println("Email: " + memberList.get(i).getEmail());
        System.out.println("Business Phone: " + memberList.get(i).getBusinessPhone());
        System.out.println("Address: " + memberList.get(i).getAddress());
        System.out.println("Graduate Major: " + memberList.get(i).getGradMajor());
        System.out.println("Graduation Year: " + memberList.get(i).getGradYear());
        System.out.println("Is Active Member? " + memberList.get(i).getIsActive());
        System.out.println("Is Club Employee? " + memberList.get(i).getIsIsEmployee());
        System.out.println("Paid Membership Fees? " + memberList.get(i).getIsHasPaidFees());
    }
    
    public void printMemberList() {
        for (int i = 0; i < memberList.size(); i++ ) {
            int position = i + 1;
            System.out.println("Position on List:" + position );
            formatContact(i);
            System.out.println("------------------------------");
        }
    }

    public void addMember() {
      
      System.out.print("Name: ");
      String memberName = in.next();
      
      System.out.print("Company: ");
      String memberCompany = in.next();
      
      System.out.print("Job Title: ");
      String memberJob = in.next();
      
      System.out.print("Email: ");
      String memberEmail = in.next();
      
      System.out.print("Business Phone: ");
      String memeberPhone = in.next();
      
      System.out.print("Address: ");
      String memberAddress = in.next();
      
      System.out.print("Graduating Major: ");
      String memberMajor = in.next();
      
      
      System.out.print("Graduating Year: ");
      int year = in.nextInt();
      
      System.out.print("Active Club Member: ");
      boolean memberStatus = in.nextBoolean();
      
      System.out.print("Is Club Employee: ");
      boolean alsoEmployee = in.nextBoolean();
      
      System.out.print("Paid Membership Fees: ");
      boolean hasPaid = in.nextBoolean();
   
      memberList.add(new Contact(memberName, memberCompany, memberJob, memberEmail, memeberPhone, memberAddress, memberMajor, year, memberStatus, alsoEmployee, hasPaid));
      
      
        
    }
    public void deactivateMember(){
        
    }
    public void modifyMember(int i) {
       // memberList.set(i, );
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
