package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the

    // Removed int id from line 24 to leave constructor empty taking no parameter from 3) Complete the Job Class #1
    // Change Line 25 from this.id = (id) to this.id = (nextId) like other classes
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    public Job() {
        this.id = (nextId);
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
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
        return id == job.id;
    }

//    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // TODO 3) Complete the Job Class #4. Generate a getter for the id field

    public int getId() {
        return id;
    }

    // Create First Test for toString
//    ID:  _______
//    Name: _______
//    Employer: _______
//    Location: _______
//    Position Type: _______
//    Core Competency: _______
@Override
    public String toString() {
        String noData = "Data not available";
// 3. If a field is empty, the method should add, “Data not available” after the label.
// 4. (Bonus) If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”
    // testing empty field should print out "Data not available"
        if (name == null && employer == null && location == null && positionType ==  null && coreCompetency == null) {
            return "OOPS! This job does not seem to exist.";
        } else {
            return "\n" +
                    "ID: " + id +
                    "\nName: " + (name == null || name.equals("") ? noData : name) +
                    "\nEmployer: " + (employer == null || employer.getValue() == null || employer.getValue().equals("") ? noData : employer.getValue()) +
                    "\nLocation: " + (location == null || location.getValue() == null || location.getValue().equals("") ? noData : location.getValue()) +
                    "\nPosition Type: " + (positionType == null || positionType.getValue() == null || positionType.getValue().equals("") ? noData: positionType.getValue()) +
                    //Position Type had to change to getValue???
                    "\nCore Competency: " + (coreCompetency == null || coreCompetency.getValue() == null || coreCompetency.getValue().equals("") ? noData : coreCompetency.getValue()) +
                    "\n";
        }
    }
}

