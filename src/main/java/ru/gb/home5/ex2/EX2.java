package ru.gb.home5.ex2;

import java.util.*;

public class EX2 {
    private List list;

    public EX2() {
        this.list = new ArrayList<>();
    }

    public List getNames() {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).toString().split(" ")[0];
            names.add(name);
        }
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return names;
    }

    public void getPopularName() {
        System.out.println("GETPOPULARNAME");
        ArrayList<String> popular = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < getNames().size() - 1; i++) {
            if (getNames().get(i).equals(getNames().get(i + 1))) {
                count++;
            } else {
                count++;
                map.put(getNames().get(i).toString(), count);
                popular.add(getNames().get(i).toString());
                values.add(count);
                count = 0;
            }
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    public void createList(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
        }
    }

}
