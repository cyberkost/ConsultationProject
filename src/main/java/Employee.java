public class Employee {
    private String name;
    private String surname;
    private String position;
    private int salary;
    private String department;

    public Employee(String name, String surname, String position, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class StaffEmployee extends Employee {

    public StaffEmployee(String name, String surname, String position, int salary, String department) {
        super(name, surname, position, salary, department);
    }
}

class ContractEmployee extends Employee {

    public ContractEmployee(String name, String surname, String position, int salary, String department) {
        super(name, surname, position, salary, department);
    }
}


