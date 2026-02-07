package School;

public class testproject1 {

    public static void main(String[] args) {


        Courses listOfCourses = new Courses("list of courses: ");


        Courses course1 = new Courses("History");
        Courses course2 = new Courses("Arabic");
        Courses course3 = new Courses("English");
        Courses course4 = new Courses("French");


        listOfCourses.setNewCourse(course1);
        listOfCourses.setNewCourse(course2);
        listOfCourses.setNewCourse(course3);
        listOfCourses.setNewCourse(course4);

        course1.setCreditHours(2);
        course2.setCreditHours(3);
        course3.setCreditHours(4);
        course4.setCreditHours(5);


        System.out.println("History hours : " + course1.getCreditHours() + "\nArabic hours: " + course2.getCreditHours() +
                "\nEnglish hours: " + course3.getCreditHours() + "\nFrench hours: " + course4.getCreditHours());

        listOfCourses.getListOfCoursesName();
        //.......................................

//        ArrayList<Courses> fakeCourses = new ArrayList<>();
//        fakeCourses.add(course1);
//        fakeCourses.add(course2);
//        fakeCourses.add(course3);
//        fakeCourses.add(course4);
//
//        Courses listOfCourses = new Courses(fakeCourses);


        // ...............................

        // test student can enroll subjects


        Students student1 = new Students("kareem", "male", 19016168, "010214124", "kareem@gmail.com");

        student1.setStudentCourses(course1);
        student1.setStudentCourses(course2);
        student1.setStudentCourses(course3);
        student1.setStudentCourses(course4);

      //  student1.deleteCourse(course1);

        student1.getStudentCourses();

        System.out.println("ASDFASF: " + student1.getSpecificStudentCourse(0).getCreditHours());
        System.out.println("Name: " + student1.getName());
        System.out.println("ID: " + student1.getId());
        System.out.println("Email: " + student1.getEmail());

        System.out.println();


        // ...............................

        Instructors instructor1 = new Instructors("Ahmed" , "male", 18013887 , "0155821412" , "Ahmed@gmail.com");

        instructor1.setInstructorCourses(course1); // History
        instructor1.setInstructorCourses(course2);

        instructor1.setStudentCourseDegree(student1 , 0 , 40.5);
        instructor1.setStudentCourseDegree(student1 , 1 , 33);

        instructor1.getInstructorCourses();

        System.out.println("Student1 Degree in History: "+ student1.getStudentCoursedegree(course1));

        System.out.println("Student1 Degree in Arabic: "+ student1.getStudentCoursedegree(course2));
    }

}
