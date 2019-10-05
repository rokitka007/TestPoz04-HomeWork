package com.homework.testpoz04;

import com.homework.testpoz04.people.Person;
import com.homework.testpoz04.people.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class School {
    public static void main (String[] args) throws IOException {

        System.out.println("Welcome in My School");

        Person checkPerson = new Person("Kasia", "Nowakowska",
                new GregorianCalendar(1991, Calendar.AUGUST, 3).getTime());
        checkPerson.presentYourself();

        Student checkStudent = new Student("Tomasz", "Popielarczyk",
                new GregorianCalendar(1991, Calendar.AUGUST, 3).getTime());
        List<String> experience = new ArrayList<>();
        experience.add("2010-2012 Konstruktor");
        experience.add("2012-2014 Sprzatacz klatek");

        List<String> hobby = new ArrayList<>();
        hobby.add("Koszykowka");
        hobby.add("Gotowanie");

        checkStudent.presentYourself();
        checkStudent.uploadCV();
        checkStudent.presentCV();
        checkStudent.setCV(experience, hobby);
        try {
            checkStudent.presentCV();
        } catch (IOException e) {
            e.printStackTrace();
        }

        checkStudent.downloadCV();
    }
}
