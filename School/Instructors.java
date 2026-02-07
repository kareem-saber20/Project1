package School;

import java.util.ArrayList;

public class Instructors extends  PersonalInformation{

    private String createBy;
    private ArrayList<Courses> instructorCourses;

    //functions

        Instructors(String name, String gender, int id, String phone, String email) {
            super(name, gender, id, phone, email);

            instructorCourses = new ArrayList<>();

        }

    //....................................................

    public void setInstructorCourses(Courses course) {

        instructorCourses.add(course);
    }


    public void getInstructorCourses() {

        System.out.print("List Of Instructor Courses: ");

        for (Courses x : instructorCourses) {
            System.out.print(x.getCourseName() + " ");
        }

        System.out.println();
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

