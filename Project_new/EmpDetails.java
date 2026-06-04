public class EmpDetails{
    public staticvoid main(String[] args){
        EmpDetails emp1 = new EmpDetails();
        int empId;
        String empName;
        double empSalary;
        emp1.empId = 123;
        emp1.empName = "John Doe";
        emp1.empSalary = 50000;
        System.out.println("Employee ID: " + emp1.empId);
        System.out.println("Employee Name: " + emp1.empName);
        System.out.println("Employee Salary: " + emp1.empSalary);
    }
}