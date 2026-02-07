package School;

public class Admins extends PersonalInformation {

    private String password;


    //Constructors

    Admins(String name, String gender, String id, String phone, String email) {

        super(name, gender, id, phone, email);

    }

    //....................................................

    public void setNewStudents(String name, String gender, String id, String phone, String email) {

        Students student = new Students(name, gender, id, phone, email);
    }

    public String[] getStudentsData(Students student) {

        String[] studentData = {student.name, student.gender, student.id, student.getPhone(), student.getEmail()};

        return studentData;
    }

    public void deleteStudents() {

    }

    //....................................................

    public void setNewInstructors(String name, String gender, String id, String phone, String email) {

        Instructors instructor = new Instructors(name, gender, id, phone, email);
    }

    public String[] getInstructorsData(Instructors instructor) {

        String[] instructorData = {instructor.name, instructor.gender, instructor.id, instructor.getPhone(), instructor.getEmail()};

        return instructorData ;
    }

    public void deleteInstructors() {

    }

    //....................................................


    public void setNewCourses(Courses course) {
        course.setNewCourse(course);
    }

    public void getCoursesData(Courses course) {
            course.getListOfCoursesName();
    }

    public void deleteCourses() {

    }

    //....................................................


}
