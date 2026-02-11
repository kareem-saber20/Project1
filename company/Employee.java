package company;

import java.util.HashMap;

public class Employee {

    private final int id;
    private String name;

    private Department department;
    private JobLevel jobLevel;

    private double salary;
    public static String companyName;


    public Employee(String name, int id, Department department, JobLevel jobLevel, double salary) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.jobLevel = jobLevel;
        this.salary = salary;

    }

    static {
        companyName = "CBC";
    }

    @Override
    public String toString() {
        return "Employee data: " + " (name) " + this.name + " (id) " + this.id + " (Department) " + this.department + " (Joblevel) " + this.jobLevel + " (Salary) " + this.salary;
    }


    @Override
    public boolean equals(Object obj) {

//        if(this==obj) return  true;
//        if (!(obj instanceof Employee)) return false;
        return this.id == ((Employee) obj).id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
//        return Integer.hashCode(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public JobLevel getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(JobLevel jobLevel) {
        this.jobLevel = jobLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        this.salary = Math.abs(salary);
    }
}
