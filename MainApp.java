package ru.kaznu.ruslan.oop1;

public class MainApp {
    public static void main(String[] args) {
        User[] users = {
                new User("Sukhorukov", "Ruslan", "Alexey", 2003, "suhorukovrus0@gmail.com"),
                new User("Petrov", "Petr", "Petrovich", 1990, "petrov.petr90@yahoo.com"),
                new User("Sidorov", "Sidr", "Sidorovich", 1985, "sidorov.sidr85@mail.ru"),
                new User("Smirnov", "Semyon", "Semyonovich", 2000, "smirnov.semyon00@outlook.com"),
                new User("Kuznetsov", "Andrei", "Andreevich", 1988, "kuznetsov.andrei88@gmail.com"),
                new User("Morozov", "Alexey", "Alexeyevich", 1992, "morozov.alexey92@gmail.com"),
                new User("Fedorov", "Fedor", "Fedorovich", 1980, "fedorov.fedor80@gmail.com"),
                new User("Nikolaev", "Nikolai", "Nikolayevich", 1993, "nikolaev.nikolai93@hotmail.com"),
                new User("Dmitriev", "Dmitry", "Dmitrievich", 1987, "dmitriev.dmitry87@gmail.com"),
                new User("Gavrilov", "Gavril", "Gavrilovich", 1994, "gavrilov.gavril94@gmail.com")
        };

        int currentYear = 2024;
        for (int i = 0; i < users.length; i++) {
            int usersAge = currentYear - users[i].getYearOfBirth();
            if (usersAge > 40) {
                users[i].info();
            }
        }
    }
}
