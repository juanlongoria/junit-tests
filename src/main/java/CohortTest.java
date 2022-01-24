import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;
import java.util.List;

public class CohortTest {
    Student billy;
    Student susan;
    Cohort xoduko;

    @Before
    public void setup() {
        Student sam = new Student(1, "sam");
        Student susan = new Student(2, "susan");
        Cohort xoduko = new Cohort();
        xoduko.addStudent(sam);
        xoduko.addStudent(susan);
    }

    @Test
    public void canGetStudents() {
        Student sam = new Student(1, "sam");
        Student susan = new Student(2, "susan");
        Cohort xoduko = new Cohort();
        xoduko.addStudent(sam);
        xoduko.addStudent(susan);
        Assert.assertEquals(2, xoduko.getStudents().size());
        Assert.assertEquals(sam, xoduko.getStudents().get(0));
        Assert.assertEquals(susan, xoduko.getStudents().get(0));
    }

    @Test
    public void canGetCohortAverage() {
        Student sam = new Student(1, "sam");
        Student susan = new Student(2, "susan");
        Cohort xoduko= new Cohort();
        xoduko.addStudent(sam);
        xoduko.addStudent(susan);
        sam.addGrade(75);
        sam.addGrade(100);
        sam.addGrade(84);
        sam.addGrade(82);
        susan.addGrade(100);
        susan.addGrade(100);
        susan.addGrade(96);
        susan.addGrade(98);
        Assert.assertEquals(93, xoduko.getCohortAverage(), 0);


    }
}
