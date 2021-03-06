package com.example.a16022706.notification_p06_ps;

import java.io.Serializable;

public class Task implements Serializable {

    private int id;
    private String name;
    private String description;

    public Task(int id, String name,String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//    @Override
//    public String toString() {
//        return "ID:" + id + ", " + name;
//    }
//



}
