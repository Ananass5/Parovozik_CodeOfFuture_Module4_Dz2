package com.ananas.serialization_codeoffuture_module4_3;

import java.io.Serializable;

public class Railway implements Serializable {

    private String ID, address, time, cost;

    public Railway(String ID, String address, String time, String cost) {
        this.ID = ID;
        this.address = address;
        this.time = time;
        this.cost = cost;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
