import com.project.Student;
import com.project.StudentManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentManagerTest {

    private StudentManager manager;

    @BeforeEach
    public void setUp() {
        manager = new StudentManager();
        manager.addStudent(new Student("S001", "Alice", 3.5));
        manager.addStudent(new Student("S002", "Bob", 3.8));
        manager.addStudent(new Student("S003", "Charlie", 2.9));
    }


    @Test
    public void testAddStudent() {
        Student newStudent = new Student("S004", "Daisy", 4.0);
        manager.addStudent(newStudent);

        Student retrievedStudent = manager.findStudentById("S004");
        assertNotNull(retrievedStudent);
        assertEquals("Daisy", retrievedStudent.getName());
        assertEquals(4.0, retrievedStudent.getGpa(), 0.01);
    }

    @Test
    public void testRemoveStudentById() {
        boolean removed = manager.removeStudentById("S002");
        assertTrue(removed);

        Student removedStudent = manager.findStudentById("S002");
        assertNull(removedStudent);
    }

    @Test
    public void testFindStudentById() {
        Student student = manager.findStudentById("S001");
        assertNotNull(student);
        assertEquals("Alice", student.getName());
    }

    @Test
    public void testFindStudentsByName() {
        List<Student> students = manager.findStudentsByName("Bob");
        assertEquals(1, students.size());
        assertEquals("Bob", students.get(0).getName());
    }

    @Test
    public void testSortStudentsByGpaDescending() {
        List<Student> sortedStudents = manager.sortStudentsByGpaDescending();
        assertEquals("Bob", sortedStudents.get(0).getName());
        assertEquals("Alice", sortedStudents.get(1).getName());
        assertEquals("Charlie", sortedStudents.get(2).getName());
    }

    @Test
    public void testGetStudentsWithGpaAbove() {
        List<Student> highGpaStudents = manager.getStudentsWithGpaAbove(3.0);
        assertEquals(2, highGpaStudents.size());
    }

    @Test
    public void testCalculateAverageGpa() {
        double averageGpa = manager.calculateAverageGpa();
        assertEquals(3.4, averageGpa, 0.01);
    }

    @Test
    void testToString() {
        // Arrange
        Student student = new Student("123", "John Doe", 3.5);

        // Act
        String result = student.toString();

        // Assert
        String expected = "Student{id='123', name='John Doe', gpa=3.5}";
        assertEquals(expected, result, "The toString method output is incorrect!");
    }
}

