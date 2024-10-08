package ru.kaznu.ruslan.oop1;

public class User {
    private String surname;
    private String name;
    private String fathersName;
    private String dateOfBirth;
    private String email;

    public User (String surname, String name, String fathersName, String dateOfBirth, String email){
        this.surname = surname;
        this.name = name;
        this.fathersName = fathersName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void info() {
        System.out.println("ФИО: " + surname + " " + name + " " + fathersName);
        System.out.println("Год рождения: " + dateOfBirth);
        System.out.println("email: " + email);
    }
}
