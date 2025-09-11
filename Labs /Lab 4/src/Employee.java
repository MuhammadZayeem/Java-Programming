//Muhammad Zayeem
//SP25-BCS-112

public class Employee{

    private String name;
    private String social_security_number;
    private double base_salary;
    private String address;

    public Employee(String name,String social_security_number,double base_salary,String address) {
        this.name = name;
        this.social_security_number = social_security_number;
        this.base_salary = base_salary;
        this.address= address;
    }

 public String getName() 
    {
 return name;
 }

 public String getSSN() 
    {
 return social_security_number;
 }

public double getSalary() 
    {
 return base_salary;
 }

public String getAddress() 
    {
 return address;
 }

public void setAddress(String address)
 {
 this.address = address;
 }

}