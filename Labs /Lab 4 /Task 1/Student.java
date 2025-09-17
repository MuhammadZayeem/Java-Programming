public class Student{
     
     private String id;
     private String Name;
     private Date   DateOfBirth;
     private Address address;
     private String Gender;
     static int counter;
     
     Student(){
counter++;
this.id=String.format("SP25-BCS-%03d",counter);
}
     Student(String Name,Date DateOfBirth,Address address,String Gender){
          counter++;
          this.id=String.format("SP25-BCS-%03d",counter);
          this.Name=Name;
          this.DateOfBirth=DateOfBirth;
          this.address=address;
          this.Gender=Gender;       
}
  Student(Student s){
          counter++;
          this.id=String.format("SP25-BCS-%03d",counter);
          this.Name=s.Name;
          this.DateOfBirth=s.DateOfBirth;
          this.address=s.address;
          this.Gender=s.Gender;       
}
public String getName(){
     return Name;
}
public Date getDateOfBirth(){
     return DateOfBirth;
}
public Address getaddress(){
     return address;
}
public String getGender(){
     return Gender;
}
public void setDateOfBirth( String dateofbirth){
     this.DateOfBirth=DateOfBirth;
     }
public void setAddress( Address address){
     this.address=address;
}

public String toString(){
		return String.format("%-5s %-5s %-5s %-5s %-5s",id,Name,DateOfBirth,address,Gender);
	}
}
