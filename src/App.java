import java.util.Scanner;
import Department.Department;
import Student.Student;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Student [] students = new Student[4];
    static Department [] departments = new Department[2];

    
    public static int registerStudents() {
        
        
        int i = 0;
        
        while(i < 4){
            System.out.println("");
            String sFirstName = sc.nextLine();
            String sLastName = sc.nextLine();
            
            Student std = new Student();
            
            std.setFirstName(sFirstName);
            std.setLastName(sLastName);
            students[i] = std;
            
            i++;
        }
        
        return 1;
    }
    
    public static void displayStudents() {
        for (Student student : students) {
            System.out.println(student.getFirstName());
        }
    }

    
    public static int registerDepts() {
        
        
        int i = 0;
        
        while(i < 2){
            System.out.println("");
            String name = sc.nextLine();
            double budget = sc.nextDouble();
            
            Department dpt = new Department();
            
            dpt.setName(name);
            dpt.setBudget(budget);
            departments[i] = dpt;
            
            i++;
        }
        
        return 1;
    }

       
    public static void displayDpts() {
        for (Department dpt : departments) {
            System.out.println(dpt.getName() + " -- " + dpt.getBudget());
        }
    }
    public static void main(String[] args)  {
        registerStudents();
    }       
}
