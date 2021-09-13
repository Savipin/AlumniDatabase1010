package alumnidatabase;
import java.util.Date;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tjpeltier
 */
public class Campaign {
    
    private String name;
    private String description;
    private String status; // starting, running, complete
    private String owner;
    Date launchDate;
    Date fundraiserDeadline;
    private double fundraisingGoal;
    private double totalRaised;
    private int daysLeft;
    private double amountToGoal;

    
    public Campaign() {
    }

    public Campaign(String name, String description, String status, String owner, Date launchdate, Date funderaiserDeadline) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.owner = owner;
        this.launchDate = new Date();
        this.fundraiserDeadline = new Date();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getOwner() {
        return owner;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public Date getFundraiserDeadline() {
        return fundraiserDeadline;
    }

    public double getFundraisingGoal() {
        return fundraisingGoal;
    }

    public double getTotalRaised() {
        return totalRaised;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public double getAmountToGoal() {
        return amountToGoal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public void setFundraiserDeadline(Date fundraiserDeadline) {
        this.fundraiserDeadline = fundraiserDeadline;
    }
     
    public void daysLeftToDeadline(){
        daysLeft = launchDate.compareTo(fundraiserDeadline); // 0 if equal, neg if early, pos if late
        
    }
    
    public void amountToGoal() {
        amountToGoal = fundraisingGoal - totalRaised;
        
    }
    
    
}
