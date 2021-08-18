package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.Location;
import org.junit.Assert.*;

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

}
