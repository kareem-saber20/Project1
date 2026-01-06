import java.util.ArrayList;

public class Students extends PersonalInformation {
    

        private String createBy;
        private ArrayList<Courses> studentCourses; 
        private Courses studentGrade;

        //functions



        public void setCourses(Courses name){

            studentCourses.add(name);
        }

        public void getCourses(){
            
            for(Courses x : studentCourses){
                System.out.println(x);
            }
        }

        public void deleteCourse(){

        }
        
        public void getStudentGrade(Courses name){
            
             System.out.println();;
        }
        



      
}
