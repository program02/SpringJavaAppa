package com.exam;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name="Spring";
    Computer computer;


    
    List<String>  stList;
    Set<String>  stSet;
    Map<String, String>  stMap;

    public Map<String, String> getStMap() {
        return stMap;
    }

    public void setStMap(Map<String, String> stMap) {
        this.stMap = stMap;
    }

    public Set<String> getStSet() {
        return stSet;
    }

    public void setStSet(Set<String> stSet) {
        this.stSet = stSet;
    }

    public List<String> getStList() {
        return stList;
    }

    public void setStList(List<String> stList) {
        this.stList = stList;
    }
    

    public Computer getComputer() {
        return computer;
    }

    public Student() {
 
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Student(Computer c) {
        this.computer=c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 


}