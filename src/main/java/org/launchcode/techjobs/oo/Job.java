package org.launchcode.techjobs.oo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //creation of primary key
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType,
               CoreCompetency coreCompetency) {
        this(); //uses the default constructor, which I don't want to do.. but need to implement the other constructor
        this.id = id;
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }




    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }



    //what if I stored the key value pairs in a HashMap? Then, run into issue of different value types(int)
    @Override
    public String toString() {


        return  "\nID: " + id +
                "\nName: " + name +
                "\nEmployer: " + employer +
                "\nLocation: " + location +
                "\nPosition Type: " + positionType +
                "\nCore Competency: " + coreCompetency + "\n";


    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}





//TOSTRING WORK



//ARRAYLIST
//    ArrayList<Object> value = new ArrayList<>();
//        value.add(name);
//                value.add(employer);
//                value.add(location);
//                value.add(positionType);
//                value.add(coreCompetency);
//
//                for(int i = 0; i < value.size(); i++) {
//        if (value.get(i) == "") {
//        return "Data not available";
//        }
//
//        }
//        return  "\nID: " + id +
//        "\nName: " + value.get(0) +
//        "\nEmployer: " + value.get(1) +
//        "\nLocation: " + value.get(2) +
//        "\nPosition Type: " + value.get(3) +
//        "\nCore Competency: " + value.get(4) + "\n";






//HASHMAP
//        System.out.println("\n");
//        HashMap<String, Object> toString = new HashMap<>();
//        toString.put("Name: ", name);
//        toString.put("Employer: ", employer);
//        toString.put("Location: ", location);
//        toString.put("Position Type: ", positionType);
//        toString.put("Core Competency: ", coreCompetency);
//        for (key : toString.values()) {
//            System.out.println(key[i]);
//
//        }