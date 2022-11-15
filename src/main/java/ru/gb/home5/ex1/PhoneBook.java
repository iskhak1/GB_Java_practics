package ru.gb.home5.ex1;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        new PhoneBook();
    }
    public PhoneBook(){
        PersonPOJO person1 = new PersonPOJO();
        person1.setName("Ivanov Ivan");

        ArrayList<String> person1Numbers = new ArrayList<>();
        person1Numbers.add("8-908-450-21-32");
        person1Numbers.add("8-978-450-21-38");

        person1.setPhoneNumber(person1Numbers);

        HashMap<String,ArrayList> phoneMap = new HashMap<>();

        phoneMap.put(person1.getName(), person1.getPhoneNumber());

        System.out.println(phoneMap);
    }

}
