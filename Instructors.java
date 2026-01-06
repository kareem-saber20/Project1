import java.util.ArrayList;

public class Instructors extends PersonalInformation {

    private String createBy;
    private ArrayList<Courses> courses;
    private double grade; 
        
    //functions

    Instructors (){

        courses = new ArrayList<>();
    }

    public void setCourses(Courses courses){    

        this.courses.add(courses);

    }

    public void getCourses(){

        for(Courses x :courses){

            System.out.println(x);
        }
    }

    public void deleteCourse(){

    }

    public void setStudentGarde(){

    }

    
    

}

