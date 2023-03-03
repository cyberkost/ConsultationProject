package company;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private Department department;

    public Employee(String name, String surname, int salary, Department department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

class StaffEmployee extends Employee {
    private int term;

    public StaffEmployee(int term, String name, String surname, int salary, Department department) {
        super(name, surname, salary, department);
        this.term = term;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}

class ContractEmployee extends Employee {

    public ContractEmployee(String name, String surname, int salary, Department department) {
        super(name, surname, salary, department);
    }
}


