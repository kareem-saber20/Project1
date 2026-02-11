package company;

public class test {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Kareem", 1901618, Department.FINANCE, JobLevel.JUNIOR, 3500);
        Employee employee2 = new Employee("Kareem", 1701618, Department.IT, JobLevel.LEAD, 20000);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString() + "\n");


        System.out.println("Annual salary for employee1: " + EmployeeUtils.calculateAnnualSalary(employee1));
        System.out.println("Annual salary for employee2: " + EmployeeUtils.calculateAnnualSalary(employee2) + "\n");

        EmployeeUtils.promote(employee1 , JobLevel.MID);

        System.out.println("Salary is more than $15000 for employee1: " + EmployeeUtils.isHighEarner(employee1));
        System.out.println("Salary is more than $15000 for employee2: " + EmployeeUtils.isHighEarner(employee2) + "\n");

        System.out.println("Company Legal Name: " + CompanyInfo.legalName + "\n" + "Country: " + CompanyInfo.country);

        System.out.println("Company Name: " + Employee.companyName + "\n");


//        CompanyInfo company1 = new CompanyInfo();
        //  System.out.println(CompanyInfo.legalName);

//        JobLevel test1 = JobLevel.JUNIOR;
//        System.out.println(test1.getLevelCode());
//        System.out.println(test1.toString());
//
//
//            Department d1 = Department.SALES;
//            Department d2 = Department.SUPPORT;
//        Department d3 = Department.IT;
//        Department d4 = Department.HR;
//
//            System.out.println(d1.toString());
//        System.out.println(d2.toString());
//        System.out.println(d3.toString());
//        System.out.println(d4.toString());
//


//        System.out.println("Company name: " + Employee.companyName);

//        System.out.println(employee1.equals(employee2));
//
//
//        System.out.println(employee1.toString());
//
//
//        System.out.println(employee1.hashCode());
//        System.out.println(employee2.hashCode());
//
//        System.out.println(EmployeeUtils.isHighEarner(employee1));
//
//        System.out.println(employee1.getJobLevel());
//
//        System.out.println(EmployeeUtils.DepartmentHelper.isTechnicalDepartment("IT"));

    }


}

