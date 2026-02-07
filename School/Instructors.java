package School;

import java.util.ArrayList;

public class Instructors extends  PersonalInformation{

    private String createBy;
    private ArrayList<Courses> instructorCourses;

    //functions

        Instructors(String name, String gender, String id, String phone, String email) {
            super(name, gender, id, phone, email);

            instructorCourses = new ArrayList<>();

        }

    //....................................................

    public void setInstructorCourses(Courses course) {

        instructorCourses.add(course);
    }


    public ArrayList<Courses> getInstructorCourses() {

      return instructorCourses;
    }

    //....................................................

    public void deleteCourse(Courses course) {

        instructorCourses.remove(course);

    }

    //....................................................

    public void setStudentCourseDegree(Students student, int NumberofCourse, double degree) {

        student.getSpecificStudentCourse(NumberofCourse).setStudentDregeeInCourse(degree);

    }

    //....................................................


}

