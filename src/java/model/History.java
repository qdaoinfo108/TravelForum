/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author Admin
 */
public class History {
    
    private int history_id;
    private String account_username;
    private int viewTotal;
    private double money;
    private Timestamp date;

    
    public History() {
    }

    public History(int history_id, String account_username, int viewTotal, double money, Timestamp date) {
        this.history_id = history_id;
        this.account_username = account_username;
        this.viewTotal = viewTotal;
        this.money = money;
        this.date = date;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    
    public int getHistory_id() {
        return history_id;
    }

    public void setHistory_id(int history_id) {
        this.history_id = history_id;
    }

    public String getAccount_username() {
        return account_username;
    }

    public void setAccount_username(String account_username) {
        this.account_username = account_username;
    }

    public int getViewTotal() {
        return viewTotal;
    }

    public void setViewTotal(int viewTotal) {
        this.viewTotal = viewTotal;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
