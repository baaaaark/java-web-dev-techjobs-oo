package org.launchcode.techjobs_oo.tests;

import org.launchcode.techjobs_oo.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {

    Job fantastic, banner, coyote, coyoteClone, emptyField, emptyFields;

    @Before
    public void createJobObjects() {

        fantastic = new Job("Cosmic Ray Physicist", new Employer("Fantastic Four"), new Location("NYC, New York"), new PositionType("Team Leader"), new CoreCompetency("Stretchiness"));
        banner = new Job("Nuclear Engineer", new Employer("S.H.I.E.L.D."), new Location( "Los Alamos, New Mexico"), new PositionType("Gamma Bomb Research"), new CoreCompetency("Control Temper"));
        coyote = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        coyoteClone = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        emptyField = new Job("", new Employer(""), new Location("Wakanda"), new PositionType("Product testing"), new CoreCompetency("Metallurgy"));
        emptyFields = new Job("",new Employer(""),new Location(""),new PositionType(""),new CoreCompetency(""));

    }

    @Test
    public void testSettingJobId() {

        assertTrue(banner.getId() == (fantastic.getId() + 1) || banner.getId() == (fantastic.getId() + 1));

    }

    @Test
    public void testJobConstructorSetsAllFields() {

        assertTrue(coyote instanceof Job);
        assertTrue(coyote.getName() instanceof String);
        assertTrue(coyote.getEmployer() instanceof Employer);
        assertTrue(coyote.getLocation() instanceof Location);
        assertTrue(coyote.getPositionType() instanceof PositionType);
        assertTrue(coyote.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", coyote.getName());
        assertEquals("ACME", coyote.getEmployer().toString());
        assertEquals("Desert", coyote.getLocation().toString());
        assertEquals("Quality control", coyote.getPositionType().toString());
        assertEquals("Persistence", coyote.getCoreCompetency().toString());

    }

    @Test
    public void testJobsForEquality() {

        assertTrue(coyote != coyoteClone);

    }

    //It returns a string that contains a blank line before and after the job information
    @Test
    public void testForBlankLineBeforeAndAfterInfo() {
        assertEquals('\n', coyote.toString().charAt(0));
    }

    //should contain a label for each field, followed by the data stored in that field.
    @Test
    public void testForFieldLabelAndData() {
        assertEquals("\nID: 3" + "\nName: Product tester" + "\nEmployer: ACME" + "\nLocation: Desert" +
                "\nPosition Type: Quality control" + "\nCore Competency: Persistence\n", coyote.toString());
    }

    //if it is empty, the method should add "Data not available" after the label

    @Test
    public void testForEmptyFields() {
        assertEquals("\nID: 5" + "\nName: Data not available" + "\nEmployer: Data not available" + "\nLocation: Wakanda" +
                "\nPosition Type: Product testing" + "\nCore Competency: Metallurgy\n", emptyField.toString());
    }
    //if a job object only contains an id, the method should return "OOPS! This job does not seem to exist."

}