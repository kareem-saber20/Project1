import java.util.ArrayList;

public class Courses {

    private String createBy;
    private ArrayList<String> courseName;

    private int creditHours;
    private String detailsAboutCourse;

    private int sections;
    private int lectures;

    private String conditons;
    private double examGarde;

    private String startEnrollment;
    private String deadline;
    private String examDate;  

    
    //functions

    // names of courses

    public void setCoursesName(String name){

        courseName.add(name);

    }

    public void getCoursesName(){
        
        for(String x : courseName){

            System.out.print(x + " ");

        }

    }  

    // Credit Hours for each course

    public void setCreditHours(Courses name , int hours){

        name.creditHours = hours;
    }

    public int getCreditHours(Courses name){

        return name.creditHours;
    }

    // Details about each course

    public void setDetailsAboutCourse(Courses name, String details){

        name.detailsAboutCourse =  details;
    }

    public String getDetailsAboutCourse(Courses name ){
        
        return detailsAboutCourse;
    }

    // Number of sections 
    
    public void setSections(Courses name , int number){

        name.sections = number;
    }

    public int getSections(Courses name){

        return name.sections;

    }

    // Number of Lectures 

    public void setLectures(Courses name , int number){

        name.lectures = number;
    }

    public int getLectures(Courses name){

        return name.lectures;

    }

    // Conditions to join any course

    public void setConditions(Courses name , String conditions){

        name.conditons = conditions;
    }

    public String getConditions(Courses name){

        return name.conditons;
    }

    // Exam degree 

    public void setExamGrade(Courses name , double degree){
    
        name.examGarde= degree;
    }

    public double getExamGrade(Courses name){

        return name.examGarde;

    }   

    // Start enrollment date 

    public void setStartEnrollment(Courses name , String date ){

        name.startEnrollment = date ;
        
    }

    public String getStartEnrollment(Courses name ){

       return name.startEnrollment;

    }

    // deadline 

    public void setDeadline(Courses name , String date ){

        name.deadline = date ;

    }

    public String getDeadline(Courses name ){

       return name.deadline;

    }

    // Exam date 

    public void setExamDate(Courses name , String date ){

        name.examDate = date ;
    }

    public String getExamDate(Courses name ){

       return name.examDate;
    }
}
