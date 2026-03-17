package p1;

public class Employee {
    private final int id;
    private int salary;
    private final String firstName;
    private final String lastName;

    public Employee(int i, String f, String l, int s) {
        id=i;
        firstName=f;
        lastName=l;
        salary=s;
    }
    public int getId() {
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName+" "+lastName;
    }
    public void setSalary(int newSalary){
        salary=newSalary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        salary=(salary*percent)/100+salary;
        return salary;
    }
    public String toString() {
        return "Employee[id="+id+",name="+getName()+",salary="+salary+"]";
    }
}