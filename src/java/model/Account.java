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
public class Account {
    private String user;
    private String pass;
    private String name;
    private String image;
    private int level;
    private int role;
    private int point;
    private String url;
    private String date;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

    public Account(){
        
    }
    public Account(String user, String pass, String name, String image, int role) {
        this.user = user;
        this.pass = pass;
        this.name = name;
        this.image = image;
        this.role = role;
    }

    public Account(String user, String pass, String name, String image, int level, int role, int point, String url, String date) {
        this.user = user;
        this.pass = pass;
        this.name = name;
        this.image = image;
        this.level = level;
        this.role = role;
        this.point = point;
        this.url = url;
        this.date = date;
    }

    
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int isRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
    
}
