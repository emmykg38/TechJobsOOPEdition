package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import org.junit.Assert.*;

import javax.swing.text.Position;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    Job testJob1;
    Job testJob2;
    @Before
    public void createJobObjects() {
        testJob1 = new Job();
        testJob2 = new Job();
    }


    @Test
    public void testSettingJobIdAreNotEqual() {
        Assert.assertFalse(testJob1.getId() == testJob2.getId());
    }


    @Test
    public void testSettingJobIdIncrementCorrectly() {
        Assert.assertTrue(testJob2.getId() > testJob1.getId());
    }

    @Test
    public void testSettingJobIdIncrementsByOne() {
        Assert.assertEquals(1, testJob1.getId(), .001);
        Assert.assertEquals(2, testJob2.getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //use assert statements to test constructor assigns the class and value of each field
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType position = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Assert.assertTrue(testJob.getName() instanceof String);
        Assert.assertTrue(testJob.getEmployer() instanceof Employer);
        Assert.assertTrue(testJob.getLocation() instanceof Location);
        Assert.assertTrue(testJob.getPositionType() instanceof PositionType);
        Assert.assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);

        Assert.assertEquals("Product tester", testJob.getName());
        Assert.assertEquals("ACME", testJob.getEmployer().getValue());
        Assert.assertEquals("Desert", testJob.getLocation().getValue());
        Assert.assertEquals("Quality control", testJob.getPositionType().getValue());
        Assert.assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }


    @Test
    public void testJobsForEquality() {
        Job funJob = new Job("iOS Developer", new Employer("Square"), new Location("St. Louis"),
                new PositionType("Lead developer"), new CoreCompetency("Problem solving"));
        Job notFunJob = new Job("iOS Developer", new Employer("Square"), new Location("St. Louis"),
                new PositionType("Lead developer"), new CoreCompetency("Problem solving"));
        Assert.assertFalse(funJob.equals(notFunJob));

        //i'm not understanding the id generator here... and how can I be sure this test is running properly?
    }


}
