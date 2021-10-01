import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StudentTest {
    rivate Student student;




    @Before
    public void setup(){
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(95);
        grades.add(50);
        student = new Student("Bob",123456, grades);

    }

    @Test
    public void testStudentInstances(){
        assertNotNull(student);

    }

    @Test
    public void testGetId(){
        assertEquals(123456, student.getId());
    }

    @Test
    public void testGetName(){
        assertEquals("Bob", student.getName());
    }

    @Test
    public void testAddGrades(){
        ArrayList<Integer> grades1 = new ArrayList<>();
        grades1.add(95);
        grades1.add(50);
        assertEquals(grades1, student.getGrades());
        grades1.add(70);
        student.addGrade(70);
        assertEquals(grades1, student.getGrades());
    }

    @Test
    public void testGetGrade(){
        ArrayList<Integer> grades1 = new ArrayList<>();
        grades1.add(95);
        grades1.add(50);
        assertEquals(grades1, student.getGrades());
    }

    @Test
    public void testGetGradeAverage(){
        assertEquals(72.5,student.getGradeAverage());

    }
}
