package testsageit;
public abstract class Employee {

    public abstract void setSalary(int salary);

    public abstract int  getSalary();

    public abstract void setGrade(String grade);

    public abstract String  getGrade();

     void label(int salary, String grade)
    {
        System.out.println("Employee's data :"+ "Salary:"+salary +"Grade:" +grade);
    }
}