/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class InovieItemModel {

    private String id;
    private double qty;
    private int stock_id;
    private String invoice_id;

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
     * @return the qty
     */
    public double getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(double qty) {
        this.qty = qty;
    }

    /**
     * @return the stock_id
     */
    public int getStock_id() {
        return stock_id;
    }

    /**
     * @param stock_id the stock_id to set
     */
    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;
    }

    /**
     * @return the invoice_id
     */
    public String getInvoice_id() {
        return invoice_id;
    }

    /**
     * @param invoice_id the invoice_id to set
     */
    public void setInvoice_id(String invoice_id) {
        this.invoice_id = invoice_id;
    }

}
