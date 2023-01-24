package week1;

public class program11 {
    int empID;
    int salary;
    String department;
    //constructor - same name as class name
    //No return type.

    //PURPOSE
    //it creates/initializes objects in memory
    //we can use constructor block to initialise default values.
    program11() {
        empID=101;
        salary=30000;
        department="testing";
    }
    public static void main(String[] args) {
        program11 rahul=new program11();
        System.out.println(rahul.empID +" " +  rahul.salary +" " +  rahul.department);
    }
}
