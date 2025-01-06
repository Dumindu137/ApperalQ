/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author user
 */
public class InvoiceItemModel {

    private String id;
    private Date date;
    private Double paid_amount;
    private Double discount;
    private int payment_method_id;
    private String employee_email;
    private String customer_mobile;
    
    private String productId;
    private String brandName;
    private String productName;
    private String qty;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the paid_amount
     */
    public Double getPaid_amount() {
        return paid_amount;
    }

    /**
     * @param paid_amount the paid_amount to set
     */
    public void setPaid_amount(Double paid_amount) {
        this.paid_amount = paid_amount;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * @return the payment_method_id
     */
    public int getPayment_method_id() {
        return payment_method_id;
    }

    /**
     * @param payment_method_id the payment_method_id to set
     */
    public void setPayment_method_id(int payment_method_id) {
        this.payment_method_id = payment_method_id;
    }

    /**
     * @return the employee_email
     */
    public String getEmployee_email() {
        return employee_email;
    }

    /**
     * @param employee_email the employee_email to set
     */
    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    /**
     * @return the customer_mobile
     */
    public String getCustomer_mobile() {
        return customer_mobile;
    }

    /**
     * @param customer_mobile the customer_mobile to set
     */
    public void setCustomer_mobile(String customer_mobile) {
        this.customer_mobile = customer_mobile;
    }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName the brandName to set
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
        public void setQty(String qty) {
        this.qty = qty;
    }
            
}
