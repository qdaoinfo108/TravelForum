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
public class Comment {
    
    private int comment_id;
    private Timestamp comment_date;
    private String comment_content;
    private int status_id;
    private String account_username;
    
    public Comment() {
    }

    public Comment(int comment_id, Timestamp comment_date, String comment_content, int status_id, String account_username) {
        this.comment_id = comment_id;
        this.comment_date = comment_date;
        this.comment_content = comment_content;
        this.status_id = status_id;
        this.account_username = account_username;
    }
    
    
    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getAccount_username() {
        return account_username;
    }

    public void setAccount_username(String account_username) {
        this.account_username = account_username;
    }

    
    
    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public Timestamp getComment_date() {
        return comment_date;
    }

    public void setComment_date(Timestamp comment_date) {
        this.comment_date = comment_date;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }
    
    
}
