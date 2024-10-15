package ru.kaznu.ruslan.oop1;

public class Box {
    private double sizeX;
    private double sizeY;
    private double sizeZ;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(double sizeX, double sizeY, double sizeZ, String color, boolean isOpen, String item) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
        this.color = color;
        this.isOpen = false;
        this.item = "Пусто";
    }

    public void Open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Вы открыли коробку");
        } else {
            System.out.println("Коробка открыта");
        }
    }

    public void Close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Вы закрыли коробку");
        } else {
            System.out.println("Коробка закрыта");
        }
    }

    public void setColor(String newColor) {
        this.color = newColor;
        System.out.println("Установлен цвет: " + newColor);
    }

    public void putItem(String newItem) {
        if (isOpen) {
            if (item.equals("Пусто")) {
                item = newItem;
                System.out.println("Предмет " + newItem + " положен в коробку.");
            } else {
                System.out.println("Коробка уже содержит предмет: " + item);
            }
        } else {
            System.out.println("Коробка закрыта. Откройте ее, чтобы положить предмет.");
        }
    }

    public void removeItem() {
        if (isOpen) {
            if (!item.equals("Пусто")) {
                System.out.println("Предмет " + item + " выкинут из коробки.");
                item = "Пусто";
            } else {
                System.out.println("Коробка пуста. Нечего выкидывать.");
            }
        } else {
            System.out.println("Коробка закрыта. Откройте ее, чтобы выкинуть предмет.");
        }
    }

    public void info() {
        System.out.println("Размеры коробки: " + sizeX + " x " + sizeY + " x " + sizeZ);
        System.out.println("Цвет коробки: " + color);
        System.out.println("Открыта ли коробка: " + isOpen);
        System.out.println("Предмет в коробке: " + item);
        System.out.println();


    }


}
