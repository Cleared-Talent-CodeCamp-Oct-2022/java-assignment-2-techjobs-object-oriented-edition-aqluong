package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId =1;
    private String value;

    public JobField(){
        id = nextId;
        nextId++;
    }
// Constructor
    public JobField(String value) {
        this.value = value;
    }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters and Setters only Getter and Setter on Value and just Getter for Id
    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

}
