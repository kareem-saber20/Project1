package School;

import java.util.ArrayList;

public class Admins extends PersonalInformation {

    private String password;

    Courses course;


    //Constructors

    Admins(String name, String gender, String id, String phone, String email) {

        super(name, gender, id, phone, email);

    }

    //....................................................

    public void setNewStudent(String name, String gender, String id, String phone, String email) {

        Students student = new Students(name, gender, id, phone, email);
    }

    public String[] getStudentPersonalData(Students student) {

        String[] studentPersonalData = {student.name, student.gender, student.id, student.getPhone(), student.getEmail()};

        return studentPersonalData;
    }

    public void deleteStudents() {

    }

    //....................................................

    public void setNewInstructor(String name, String gender, String id, String phone, String email) {

        Instructors instructor = new Instructors(name, gender, id, phone, email);
    }

    public String[] getInstructorPersonalData(Instructors instructor) {

        String[] instructorPersonalData = {instructor.name, instructor.gender, instructor.id, instructor.getPhone(), instructor.getEmail()};

        return instructorPersonalData;
    }

    public void deleteInstructor() {

    }

    //....................................................


    public void setNewCourse(Courses course) {

        this.course.setNewCourse(course);
    }

    public ArrayList<Courses> getCourseData(Courses course) {

        return course.getListOfCourses();
    }

    public void deleteCourse(int number) {

        course.getListOfCourses().remove(number);


    }

    //....................................................


}
