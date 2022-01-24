import org.junit.Test;
import org.junit.Assert;

public class StudentTest {

    @Test
    public void studentProperlyInitialized() {
        Student sam = new Student(1, "sam");
        Assert.assertEquals("sam", sam.getName());
        Assert.assertEquals(1, sam.getId());
        Assert.assertTrue(sam.getGrades().isEmpty());

    }

    @Test
    public void addGradeTest() {
        Student sam = new Student(1, "sam");
        Assert.assertTrue(sam.getGrades().isEmpty());
        sam.addGrade(75);
//        Assert.assertFalse(sam.getGrades().isEmpty());
        Assert.assertSame(75, sam.getGrades().get(0));
    }

    @Test
    public void gradeAverageTest() {
        Student sam = new Student(1, "sam");
        sam.addGrade(75);
        sam.addGrade(100);
        sam.addGrade(84);
        sam.addGrade(62);
        Assert.assertEquals(83.5, sam.getGradeAverage(), 0);
        sam.addGrade(99);
        Assert.assertEquals(86.6, sam.getGradeAverage(), 0);
    }




}
