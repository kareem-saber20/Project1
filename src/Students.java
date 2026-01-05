import java.util.ArrayList;

public class Students extends PersonalInformation {
    

        private String createBy;
        private ArrayList<String> courses; 
        private double grade;

        //functions

        Students() {

            courses = new ArrayList<>();
        }
        
        public void setCourses(String course){

            courses.add(course);
        }

        public void getCourses(){
            
             for( String x :courses){

                System.out.print( x + " ");
            }
        }

        public double getGrade(){

            return grade;
        }
    }
