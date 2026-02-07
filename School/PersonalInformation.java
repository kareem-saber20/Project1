package School;

import java.util.*;

public  class PersonalInformation {

    protected String name;
    protected String gender;
    protected String id;
    protected String phone;
    protected String email;
    protected Date date;

    PersonalInformation(String name , String gender , String id){

        this.name = name;
        this.id = id;
        this.gender = gender;
    }
    PersonalInformation(String name , String gender , String id , String phone , String email){

        this.name = name;
        this.id = id;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    //functions


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}