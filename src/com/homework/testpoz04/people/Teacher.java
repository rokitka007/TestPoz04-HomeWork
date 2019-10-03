package com.homework.testpoz04.people;

import java.util.Date;

public class Teacher extends Person {
    private Float engagement;
    private Integer vacationLeft = 26;

    public Teacher(String name, String surname, Date dateBirth, Float engagement){
        super(name, surname, dateBirth);
        this.engagement = engagement;
    }

    private Integer takeVacation(Integer days){
        if(days > this.vacationLeft)
            System.out.println("You do not have so many days. You are left " + this.vacationLeft + " days");
        else
            this.vacationLeft -= days;
        return this.vacationLeft;
    }
}
