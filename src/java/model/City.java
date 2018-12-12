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
public class City {
    
    private int city_id;
    private String city_name;
    private String city_image;

    public City() {
    }

    public City(int city_id, String city_name, String city_image) {
        this.city_id = city_id;
        this.city_name = city_name;
        this.city_image = city_image;
    }

    
    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCity_image() {
        return city_image;
    }

    public void setCity_image(String city_image) {
        this.city_image = city_image;
    }
    
    
}
