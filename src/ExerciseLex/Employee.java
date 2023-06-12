package ExerciseLex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Employee implements Comparable<Employee>{
    private String empId;
    private String empName;
    private Integer salary;
    private String empRole;

    public Employee() {
    }

    public Employee(String empId, String empName, Integer salary, String empRole) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.empRole = empRole;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    @Override
    public int compareTo(Employee object) {
        return this.empName.compareTo(object.empName);
    }
}
class EmployeeDemo{
    public static void main(String[] args) {
        List<Employee> emplist= Arrays.asList(new Employee("11102","Arnoid",5000,"Manager"),
                new Employee("11103","Zarvis",7000,"Consultant"),
                new Employee("11104","Mathew",9000,"Manager"));
        for (Employee e:emplist) {
            Consumer<Employee> beforeInc=(emp)-> System.out.println(e.getEmpName()+e.getEmpRole()+e.getSalary());
            beforeInc.accept(e);

            Function<Employee,Integer> salaryIncrease=(emp)->emp.getEmpRole().equals("Manager")?emp.getSalary()+5000:emp.getSalary();
            e.setSalary(salaryIncrease.apply(e));

            Consumer<Employee> afterInc=(emp)-> System.out.println(e.getEmpName()+e.getEmpRole()+e.getSalary());
            afterInc.accept(e);

        }

    }

}
