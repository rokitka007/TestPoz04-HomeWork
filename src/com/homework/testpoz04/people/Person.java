package com.homework.testpoz04.people;

import java.time.Year;
import java.util.*;

public class Person {

    private String name;
    private String surname;
    private Date dateOfBirth;
    private Map<Skill, Float> skills = new HashMap<>();

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
        return Year.now().getValue() - cal.get(Calendar.YEAR);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Map<Skill, Float> getSkills(){
        return this.skills;
    }

    public void presentSkills(){
        System.out.println("My skills are:");
        for(Map.Entry<Skill, Float> entry: this.skills.entrySet()){
            System.out.println(String.format("%s %s",entry.getKey().name(), entry.getValue().toString()));
        }
    }

    public void setSkill(Skill name, Float value){
        this.skills.put(name, value);
    }
}
