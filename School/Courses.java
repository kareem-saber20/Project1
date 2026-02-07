package School;

import java.util.ArrayList;

public class Courses {

    private String createBy;

    private ArrayList<Courses> listOfCourses;

    private String courseName;

    private double studentDregeeInCourse;

    private String detailsAboutCourse;

    private int creditHours;
    private int sections;
    private int lectures;

    private String conditons;

    private double degreeOfExam;

    private String startEnrollment;
    private String deadline;
    private String examDate;


    //Constructor

    Courses(String courseName) {
        this.listOfCourses = new ArrayList<>();
        this.courseName = courseName;
    }

    Courses(ArrayList<Courses> listOfCourses) {

        this.listOfCourses = new ArrayList<>();
        this.listOfCourses.addAll(listOfCourses);

    }

    //.........................................

    @Override
    public String toString() {

        return "Course " + listOfCourses;
    }


    // .........................................


    public void setStudentDregeeInCourse(double studentDregeeInCourse) {

        this.studentDregeeInCourse = studentDregeeInCourse;
    }

    public double getStudentDregeeInCourse() {

        return studentDregeeInCourse;
    }

    //.........................................


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //.........................................

    // list of courses

    public void setNewCourse(Courses newCourse) {

        listOfCourses.add(newCourse);

    }

//    public void getListOfCoursesName() {
//
//        System.out.print("List Of Courses: ");
//        for (Courses x : listOfCourses) {
//
//            System.out.print(x.getCourseName() + "  ");
//        }
//        System.out.println();
//    }

    public ArrayList<Courses> getListOfCourses() {

        return listOfCourses;
    }

    //.........................................

    // Credit Hours for each course

    public void setCreditHours(int hours) {

        this.creditHours = hours;
    }

    public int getCreditHours() {

        return this.creditHours;
    }

    //.........................................

    // Details about each course

    public void setDetailsAboutCourse(String details) {

        this.detailsAboutCourse = details;
    }

    public String getDetailsAboutCourse() {

        return this.detailsAboutCourse;
    }

    //.........................................

    // Number of sections

    public void setNumberOfSections(int number) {

        this.sections = number;
    }

    public int getNumberOfSections() {

        return this.sections;

    }

    //.........................................

    // Number of Lectures

    public void setNumberOfLectures(int number) {

        this.lectures = number;
    }

    public int getNumberOfLectures() {

        return this.lectures;

    }

    //.........................................

    // Conditions to join any course

    public void setConditions(String conditions) {

        this.conditons = conditions;
    }

    public String getConditions() {

        return this.conditons;
    }

    //.........................................

    // Exam degree

    public void setExamGrade(double degree) {

        this.degreeOfExam = degree;
    }

    public double getExamGrade() {

        return this.degreeOfExam;

    }

    //.........................................

    // Start enrollment date

    public void setStartEnrollment(String date) {

        this.startEnrollment = date;

    }

    public String getStartEnrollment() {

        return this.startEnrollment;

    }

    //.........................................

    // deadline

    public void setDeadline(String date) {

        this.deadline = date;

    }

    public String getDeadline() {

        return this.deadline;

    }

    //.........................................

    // Exam date

    public void setExamDate(String date) {

        this.examDate = date;
    }

    public String getExamDate() {

        return this.examDate;
    }

    //.........................................

}
