package School;

import java.util.ArrayList;


public class Students extends PersonalInformation {


    private String createBy;

    private ArrayList<Courses> studentCourses;

    private double studentCoursedegree;

    //Constructor

    Students(String name, String gender, int id, String phone, String email) {
        super(name, gender, id, phone, email);
        studentCourses = new ArrayList<>();

    }

    //....................................................

    public void setStudentCourses(Courses course) {

        studentCourses.add(course);
    }


    public void getStudentCourses() {

        System.out.print("List Of Students Courses: ");

        for (Courses x : studentCourses) {
            System.out.print(x.getCourseName() + " ");
        }

        System.out.println();
    }

    public Courses getSpecificStudentCourse(int number){


        return this.studentCourses.get(number);
    }

    //....................................................

    public void deleteCourse(Courses course) {

        this.studentCourses.remove(course);

    }

    //....................................................

    public  double getStudentCoursedegree(Courses course){

        return studentCoursedegree = course.getStudentDregeeInCourse();

    }

    //....................................................



}
