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
public class Status {
    
    private int status_id;
    private String status_title;
    private Timestamp status_date;
    private String status_content;
    private int status_view;
    private int status_view2;
    private String status_image;
    private String status_location;
    private boolean status_enable;
    private String username;
    private int category;
    private int city;
    
    public Status() {
    }

    public Status(int status_id, String status_title, Timestamp status_date, String status_content, int status_view, int status_view2, String status_image, String status_location, boolean status_enable, String username, int category, int city) {
        this.status_id = status_id;
        this.status_title = status_title;
        this.status_date = status_date;
        this.status_content = status_content;
        this.status_view = status_view;
        this.status_view2 = status_view2;
        this.status_image = status_image;
        this.status_location = status_location;
        this.status_enable = status_enable;
        this.username = username;
        this.category = category;
        this.city = city;
    }

   
    

    public int getStatus_view2() {
        return status_view2;
    }

    public void setStatus_view2(int status_view2) {
        this.status_view2 = status_view2;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    
    public Status(int status_id, String status_title, Timestamp status_date, String status_content, int status_bookmark, int status_view, String status_image, String status_location, boolean status_enable) {
        this.status_id = status_id;
        this.status_title = status_title;
        this.status_date = status_date;
        this.status_content = status_content;
        this.status_view = status_view;
        this.status_image = status_image;
        this.status_location = status_location;
        this.status_enable = status_enable;
    }

    
    
    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getStatus_title() {
        return status_title;
    }

    public void setStatus_title(String status_title) {
        this.status_title = status_title;
    }

    public Timestamp getStatus_date() {
        return status_date;
    }

    public void setStatus_date(Timestamp status_date) {
        this.status_date = status_date;
    }

    public String getStatus_content() {
        return status_content;
    }

    public void setStatus_content(String status_content) {
        this.status_content = status_content;
    }


    public int getStatus_view() {
        return status_view;
    }

    public void setStatus_view(int status_view) {
        this.status_view = status_view;
    }

    public String getStatus_image() {
        return status_image;
    }

    public void setStatus_image(String status_image) {
        this.status_image = status_image;
    }

    public String getStatus_location() {
        return status_location;
    }

    public void setStatus_location(String status_location) {
        this.status_location = status_location;
    }

    public boolean isStatus_enable() {
        return status_enable;
    }

    public void setStatus_enable(boolean status_enable) {
        this.status_enable = status_enable;
    }
    
    
    
}
