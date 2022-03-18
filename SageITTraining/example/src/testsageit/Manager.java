package testsageit;
public class Manager extends Employee {

    private int salary;
    private String grade;

    public void setSalary(int salary) {
        salary = this.salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setGrade(String grade) {
        grade = this.grade;
    }

    public String getGrade() {
        return grade;
    }

    public static void main(String args[]) {
        Manager m1 = new Manager();
        m1.label(50000,"Grade-B");
    }
}