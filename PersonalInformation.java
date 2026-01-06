import java.util.*;
public class PersonalInformation {

    private String name;
    private int id;
    private int phone;
    private String email;
    private Date date;


    //functions

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        
        return id;
    }

    public void setPhone(){

        this.phone = phone;
    }

    public int getPhone(){
        
        return phone;
    }

    public void setEmail(String name){

        this.email = email;
    } 

     public String getEmail(){

        return email;
    }

    public void getDate(){

        System.err.println("Date of join:"+ date.toString());
    }
}