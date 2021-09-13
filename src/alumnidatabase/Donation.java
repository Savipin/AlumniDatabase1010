package alumnidatabase;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tjpeltier
 */
public class Donation {
    private String description; 
    private String contributor;
    private String campaign;
    private String event;
    private double amountPledged;
    private double amountPaid;
    Date pledgeDate;
    Date paymentDate;
    private String paymentMethod;
    private String comment;

    public Donation() {
    }

    public Donation(String description, String contributor, String campaign, String event, double amountPledged, double amountPaid, Date pledgeDate, Date paymentDate, String paymentMethod, String comment) {
        this.description = description;
        this.contributor = contributor;
        this.campaign = campaign;
        this.event = event;
        this.amountPledged = amountPledged;
        this.amountPaid = amountPaid;
        this.pledgeDate = pledgeDate;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.comment = comment;
    }

    public String getDescription() {
        return description;
    }

    public String getContributor() {
        return contributor;
    }

    public String getCampaign() {
        return campaign;
    }

    public String getEvent() {
        return event;
    }

    public double getAmountPledged() {
        return amountPledged;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public Date getPledgeDate() {
        return pledgeDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getComment() {
        return comment;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setAmountPledged(double amountPledged) {
        this.amountPledged = amountPledged;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public void setPledgeDate(Date pledgeDate) {
        this.pledgeDate = pledgeDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
