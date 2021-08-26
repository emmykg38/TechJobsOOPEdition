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

//    @Before
//    public void createJobObjects() {
//        testJob1 = new Job();
//        testJob2 = new Job();
//    }


    @Test
    public void testSettingJobId() {
        testJob1 = new Job();
        testJob2 = new Job();
        Assert.assertFalse(testJob1.getId() == testJob2.getId());
    }


    @Test
    public void testSettingJobIdIncrementCorrectly() {
        testJob1 = new Job();
        testJob2 = new Job();
        Assert.assertTrue(testJob2.getId() > testJob1.getId());
    }

    @Test
    public void testSettingJobIdIncrementsByOne() {
        testJob1 = new Job();
        testJob2 = new Job();
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



    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job stringJob5 = new Job("Data Analyst", new Employer("Slalom"), new Location("St. Louis"),
                new PositionType("Data team"), new CoreCompetency("Cleaning data models"));
        String dataInfo = "ID: 7\nName: Data Analyst\nEmployer: Slalom\nLocation: St. Louis" +
        "\nPosition Type: Data team\nCore Competency: Cleaning data models";
        char firstChar = stringJob5.toString().charAt(0);
        char lastChar = stringJob5.toString().charAt(stringJob5.toString().length()-1);
       Assert.assertEquals('\n' + dataInfo + '\n', stringJob5.toString());
       Assert.assertEquals(firstChar, '\n');
       Assert.assertEquals(lastChar, '\n');
    }



    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job stringJob = new Job("Data Analyst", new Employer("Slalom"), new Location("St. Louis"),
                new PositionType("Data team"), new CoreCompetency("Cleaning data models"));
        String expected = "\nID: 6\nName: Data Analyst\nEmployer: Slalom\nLocation: St. Louis" +
                "\nPosition Type: Data team\nCore Competency: Cleaning data models\n";
        Assert.assertEquals(expected, stringJob.toString());
    }


    @Test
    public void testToStringHandlesEmptyField() {
        Job stringJob7 = new Job("Data Analyst", new Employer("Slalom"), new Location("St. Louis"),
                new PositionType(""), new CoreCompetency(""));
        String expected = "\nID: 5\nName: Data Analyst\nEmployer: Slalom\nLocation: St. Louis" +
                "\nPosition Type: Data not available\nCore Competency: Data not available\n";
        Assert.assertEquals(expected, stringJob7.toString());
    }


//    @Test
//    public void testToStringMethodReturnsOopsJobDoesntExistIfDataOnlyInIdField() {
//        Job stringJob = new Job("", new Employer(""), new Location(""),
//                new PositionType(""), new CoreCompetency(""));
//        String expected = "OOPS! This job does not seem to exist.";
//        Assert.assertEquals(expected, stringJob.toString());
//    }


}
