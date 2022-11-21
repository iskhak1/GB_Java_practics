package ru.gb;

import ru.gb.home5.ex2.EX2;

public class Main {
    public static void main(String[] args) {
        String[] strings = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов",
        };
        EX2 ex2 = new EX2();
        ex2.createList(strings);
        System.out.println(ex2.getNames());
        ex2.getPopularName();
    }
}