package com.web.service.phone.model;

public class Phone {

    private String name;

    private String owner;

    private int total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Phone [name=" + name + ", owner=" + owner + ", total=" + total + "]";
    }

}
