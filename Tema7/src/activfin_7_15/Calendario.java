/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activfin_7_15;

/**
 *
 * @author algupl336
 */
public class Calendario {

    private final int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int day;
    private int month;
    private int year;

    public Calendario(int year, int month, int day) {
        this.year = year > 0 ? year : 1;
        this.month = month > 0 && month < 13 ? month : 1;
        this.day = day > 0 && day < monthDays[this.month - 1] ? day : 1;
    }

    public void addDay() {
        day += 1;
        if (day > monthDays[month - 1]) {
            addMonth();
            day = 1;
        }
    }

    public void addMonth() {
        month += 1;
        if (month > 12) {
            addYear();
            month = 1;
        }
    }

    public void addYear() {
        year += 1;
    }

    public void show() {
        System.out.println("La fecha es: " + this.toString());
    }

    public boolean iguales(Calendario c) {
        return this.toString().equalsIgnoreCase(c.toString()) ;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

}
