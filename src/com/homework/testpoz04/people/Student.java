package com.homework.testpoz04.people;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Student extends Person {

    private String cv = "";
    private final String fileName = String.format("cv_%s_%s.txt", this.getName(), this.getSurname());

    public Student(String name, String surname, Date birthDate){
        super(name, surname, birthDate);
    }

    public void setCV(List<String> exp, List<String> hobby){
        this.cv = String.format("Name: %s\n" +
                "Surname: %s\n" +
                "Age: %d\n",
                this.getName(), this.getSurname(), this.getAge());
        this.cv += "Experience:\n";
        for (String el: exp){
            this.cv += el + "\n";
        }
        this.cv += "Hobby:\n";
        for(String el: hobby){
            this.cv += el + "\n";
        }
    }

    public void presentCV() throws IOException {
        if(this.cv.isEmpty()){
            throw new IOException("You haven't set your CV. Please set it first with setCV()");
        }
        System.out.println(this.cv);
    }

    public void downloadCV() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter
                (this.fileName));
        writer.write(this.cv);
        writer.close();
    }

    public void uploadCV() throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        Stream<String> stream = Files.lines( Paths.get(this.fileName), StandardCharsets.UTF_8);
        stream.forEach(s -> contentBuilder.append(s).append("\n"));
        this.cv = contentBuilder.toString();
    }
}
