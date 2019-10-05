package com.homework.testpoz04.people;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {

    private String name;
    private String surname;
    private Date dateOfBirth;

    public Person(String name, String surname, Date birthDate){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = birthDate;
    }

    public void presentYourself(){
        System.out.println(String.format("Hi, I'm %s %s, I'm %d years old", this.getName(), this.getSurname(), this.getAge()));
    }

    public Integer getAge() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Warsaw"));
        cal.setTime(this.dateOfBirth);
        Integer yearOfBirth = cal.get(Calendar.YEAR);
        Integer thisYear = Year.now().getValue();
        return thisYear - yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
