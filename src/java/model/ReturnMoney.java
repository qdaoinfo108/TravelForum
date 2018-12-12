/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class ReturnMoney {
    
    private int re_id;
    private double re_money;

    public ReturnMoney(int re_id, double re_money) {
        this.re_id = re_id;
        this.re_money = re_money;
    }

    public ReturnMoney() {
    }

    public int getRe_id() {
        return re_id;
    }

    public void setRe_id(int re_id) {
        this.re_id = re_id;
    }

    public double getRe_money() {
        return re_money;
    }

    public void setRe_money(double re_money) {
        this.re_money = re_money;
    }

}
