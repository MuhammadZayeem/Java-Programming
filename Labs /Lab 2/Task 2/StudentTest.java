public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("Zayeem", "ZAyeem@gmail.com", 3.7);

        System.out.println("Name:"+ s1.getName());
        System.out.println("Email:"+ s1.getEmail());
        System.out.println("GPA:"+ s1.getGpa());


        s1.setName("Ahad");
        s1.setEmail("ahad@outlook.com");
        s1.setGpa(3.9);

        System.out.println("Updated Info:");
        System.out.println("Name:"+ s1.getName());
        System.out.println("Email:"+ s1.getEmail());
        System.out.println("GPA:"+ s1.getGpa());
    }
}