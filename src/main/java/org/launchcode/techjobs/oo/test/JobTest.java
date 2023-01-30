package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertNotEquals;
import org.launchcode.techjobs.oo.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void emptyTest() {
        assertEquals(1, 1);
    }

    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne, jobTwo);
    }

    @Test
    public void testJobConstructorSetAllFields() {
        Job jobThree = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals(1, jobThree.getId());
        assertEquals("Product tester", jobThree.getName());
        assertEquals("ACME", jobThree.getEmployer().getValue());
        assertEquals("Desert", jobThree.getLocation().getValue());
        assertEquals("Quality control", jobThree.getPositionType().getValue());
        assertEquals("Persistence", jobThree.getCoreCompetency().getValue());
        assertTrue(jobThree instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        Job jobFour =
                new Job("Product tester",
                        new Employer("ACME"),
                        new Location("Desert"),
                        new PositionType("Quality control"),
                        new CoreCompetency("Persistence"));
        Job jobFive =
                new Job("Product tester",
                        new Employer("ACME"),
                        new Location("Desert"),
                        new PositionType("Quality control"),
                        new CoreCompetency("Persistence"));

        System.out.println("#" + jobFour.getId() + " is the ID for jobFour");
        // jobFour ID: 1
        System.out.println("#" + jobFive.getId() + " is the ID for jobFive");
        // jobFive ID: 2
//        assertEquals(jobFour, jobFive);

//It might seem logical to follow up the false case by testing to make sure that equals returns true when two objects have the same ID.
//However, the positive test is irrelevant in this case.
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobSix =
                new Job("Product Tester",
                        new Employer("ACME"),
                        new Location("Desert"),
                        new PositionType("Quality control"),
                        new CoreCompetency("Persistence"));
        assertTrue(jobSix.toString().startsWith("\n"));
        assertTrue(jobSix.toString().endsWith("\n"));
        System.out.println(jobSix.toString());
//        assertTrue(Job.toString(jobSix).startsWith("\n"));
//        assertTrue(Job.toString(jobSix).endsWith("\n"));
//        System.out.println(Job.toString(jobSix));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job jobSeven =
                new Job("Product Tester",
                        new Employer("ACME"),
                        new Location("Desert"),
                        new PositionType("Quality control"),
                        new CoreCompetency("Persistence"));
        System.out.println(jobSeven);
        assertTrue(jobSeven.toString().contains("ID: 1"));
        assertTrue(jobSeven.toString().contains("Name: Product Tester"));
        assertTrue(jobSeven.toString().contains("Employer: ACME"));
        assertTrue(jobSeven.toString().contains("Location: Desert"));
        assertTrue(jobSeven.toString().contains("Position Type: Quality control"));
        assertTrue(jobSeven.toString().contains("Core Competency: Persistence"));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job jobEight = new Job("", new Employer("ACME"), new Location(""), new PositionType(""), new CoreCompetency(""));
        System.out.println(jobEight);
        assertTrue(jobEight.toString().contains("Data not available"));
    }

    @Test
    public void testToStringHandlesEmptyFieldOopsBonus() {
        Job jobNine = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        System.out.println(jobNine);
        assertTrue(jobNine.toString().contains("OOPS! This job does not seem to exist"));

    }
}



