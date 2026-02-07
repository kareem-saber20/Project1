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
                "\nEnglish hours: " + course3.getCreditHours() + "\nFrench hours: " + course4.getCreditHours() + "\n");

        System.out.print("List of Courses: ");

        for (Courses x : listOfCourses.getListOfCourses()) {

            System.out.print(x.getCourseName() + " ");

        }
        System.out.println("\n");
        ;
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


        Students student1 = new Students("kareem", "male", "19016168", "010214124", "kareem@gmail.com");

        student1.setStudentCourses(course1);
        student1.setStudentCourses(course2);
        student1.setStudentCourses(course3);
        student1.setStudentCourses(course4);

        //  student1.deleteCourse(course1);

        System.out.print("List Of Students Courses: ");

        for (Courses x : student1.getStudentCourses()) {
            System.out.print(x.getCourseName() + " ");
        }

        System.out.println();

        System.out.println("History: " + student1.getSpecificStudentCourse(0).getCreditHours() + " Credit hours");
        System.out.println("Name: " + student1.getName());
        System.out.println("ID: " + student1.getId());
        System.out.println("Email: " + student1.getEmail());

        System.out.println();


        // ...............................

        Instructors instructor1 = new Instructors("Ahmed", "male", "18013887", "0155821412", "Ahmed@gmail.com");

        instructor1.setInstructorCourses(course1); // History
        instructor1.setInstructorCourses(course2);

        instructor1.setStudentCourseDegree(student1, 0, 40.5);
        instructor1.setStudentCourseDegree(student1, 1, 33);


        System.out.print("List Of Instructor Courses: ");

        for (Courses x : instructor1.getInstructorCourses()) {
            System.out.print(x.getCourseName() + " ");
        }
        System.out.println("\n");


        System.out.println("Student1 Degree in History: " + student1.getStudentCoursedegree(course1));

        System.out.println("Student1 Degree in Arabic: " + student1.getStudentCoursedegree(course2)+ "\n");


        // ...............................

        Admins admin1 = new Admins("Ali", "male", "170239", "01123", "ali@gmail.com");

        admin1.setNewStudent("Alaa", "male", "170239", "01123", "alaa@gmail.com");

        System.out.print("Student data: " + " ");

        for (String x : admin1.getStudentPersonalData(student1)) {

            System.out.print(x + " ");
        }

    }


}
