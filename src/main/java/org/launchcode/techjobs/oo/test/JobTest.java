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
    public void emptyTest(){
        assertEquals(1, 1);
    }

    @Test
    public void testSettingJobId(){
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne, jobTwo);
    }
    @Test
    public void testJobConstructorSetAllFields(){
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
        Job jobFour = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        Job jobFive = new Job("Product tester",
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
}
