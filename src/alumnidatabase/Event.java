/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnidatabase;
import java.util.Date;

/**
 *
 * @author tjpeltier
 */
public class Event {
    private String name;
    private String description;
    private String relatedCampain;
    private String status;
    Date startDate;
    Date endDate;
    private double fundraisingGoal;
    private double amountRaised;

    public Event() {
    }

    public Event(String name, String description, String relatedCampain, String status, Date startDate, Date endDate, double fundraisingGoal, double amountRaised) {
        this.name = name;
        this.description = description;
        this.relatedCampain = relatedCampain;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.fundraisingGoal = fundraisingGoal;
        this.amountRaised = amountRaised;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRelatedCampain() {
        return relatedCampain;
    }

    public String getStatus() {
        return status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public double getFundraisingGoal() {
        return fundraisingGoal;
    }

    public double getAmountRaised() {
        return amountRaised;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRelatedCampain(String relatedCampain) {
        this.relatedCampain = relatedCampain;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setFundraisingGoal(double fundraisingGoal) {
        this.fundraisingGoal = fundraisingGoal;
    }

    public void setAmountRaised(double amountRaised) {
        this.amountRaised = amountRaised;
    }
    
}
