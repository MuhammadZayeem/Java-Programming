public class EmployeeTest {
    public static void main(String[] args) {
    
            Employee E1= new Employee("Zayeem","abc123",20000.0,"LDA Avenue Lahore");

        System.out.println("Name:"+ E1.getName());
        System.out.println("Social Security Number:"+ E1.getSSN());
        System.out.println("Basic Salary :"+ E1.getSalary());    
        System.out.println("Address :"+ E1.getAddress());

        E1.setAddress("Johar Town Lahore");

        System.out.println("Updated Address:");
        System.out.println("Name:"+ E1.getName());
        System.out.println("Social Security Number:"+ E1.getSSN());
        System.out.println("Basic Salary :"+ E1.getSalary());    
        System.out.println("Address :"+ E1.getAddress());


}
}