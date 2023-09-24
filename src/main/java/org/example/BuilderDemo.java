package org.example;


class Employee{
    int empId;
    String name;
    double salary;
    String dept;

    Employee() {}
    Employee(int id, String name, double salary,String dept ) {
        empId = id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    public Employee setEmpId(int empId) {
        this.empId = empId;
        return this;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Employee setDept(String dept) {
        this.dept = dept;
        return this;
    }
    public Employee getEmployee(){
        return new Employee(empId,name,salary,dept);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
public class BuilderDemo {
    public static void main(String[] args) {
        Employee emp = new Employee().setEmpId(99).setName("Subhi").getEmployee();
        System.out.println(emp);
    }


}
