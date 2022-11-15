package ru.gb.home5.ex1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Queue;

public class PersonPOJO implements Serializable {
    private String name;
    private ArrayList<String> phoneNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(ArrayList<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
