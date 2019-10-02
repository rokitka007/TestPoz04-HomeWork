package com.homework.testpoz04.people;

import java.time.Year;
import java.util.Date;

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
        Integer now = Year.now().getValue();
        return new Integer(21);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
