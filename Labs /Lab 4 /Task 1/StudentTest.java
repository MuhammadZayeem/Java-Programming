public class StudentTest{

public static void main(String[] args){

          Date d=new Date(1,1,2005);
          Address a=new Address(500,12,"LDA");

          Student s1=new Student("Zayeem",d,a,"Male");
          Student s2=new Student("Zayeem",d,a,"Male");
          Student s3=new Student("Zayeem",d,a,"Male");
          System.out.println(s1);
          System.out.println(s2);
          System.out.println(s3);
          System.out.println("After update ");
          System.out.println(s1);
          System.out.println(s2);
          System.out.println(s3);

                if(s1.equals(s2))
			System.out.println("Student 1 and 2 are same..");

		if(s1.equals(s3))
			System.out.println("Student 1 and 3 are same..");
}
}