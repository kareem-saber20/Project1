package company;

public class EmployeeUtils {

    public static double calculateAnnualSalary(Employee employee) {

        return employee.getSalary() * 12;
    }

    public static boolean isHighEarner(Employee employee) {

        boolean b;

        if (employee.getSalary() > 15000) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    public static void promote(Employee employee, JobLevel newJobLevel) {

        employee.setJobLevel(newJobLevel);
    }

//    public static void promote(Employee employee, int codelevel) {
//        switch (codelevel) {
//            case 1:
//                employee.setJobLevel(JobLevel.JUNIOR);
//                break;
//
//            case 2:
//                employee.setJobLevel(JobLevel.MID);
//                break;
//
//            case 3:
//                employee.setJobLevel(JobLevel.SENIOR);
//                break;
//
//            case 4:
//                employee.setJobLevel(JobLevel.LEAD);
//                break;
//
//            default:
//                System.out.println("Enter number from 1  to 4");
//        }
//
//    }

    static class DepartmentHelper {

        public static boolean isTechnicalDepartment(String department) {

            return department.equals("IT") || department.equals("SUPPORT");


        }
    }
}
