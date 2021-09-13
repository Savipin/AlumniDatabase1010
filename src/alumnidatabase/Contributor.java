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
public class Contributor {
    private String name;
    private String company;
    private String email;
    private String supports;
    private String primaryContact;
    private String jobTitle;
    private long buisinessPhone;

    public Contributor() {
    }

    public Contributor(String name, String company, String email, String supports, String primaryContact, String jobTitle, long buisinessPhone) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.supports = supports;
        this.primaryContact = primaryContact;
        this.jobTitle = jobTitle;
        this.buisinessPhone = buisinessPhone;
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

    public String getSupports() {
        return supports;
    }

    public String getPrimaryContact() {
        return primaryContact;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public long getBuisinessPhone() {
        return buisinessPhone;
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

    public void setSupports(String supports) {
        this.supports = supports;
    }

    public void setPrimaryContact(String primaryContact) {
        this.primaryContact = primaryContact;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setBuisinessPhone(long buisinessPhone) {
        this.buisinessPhone = buisinessPhone;
    }
    
    
}
