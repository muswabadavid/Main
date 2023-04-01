import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegister {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        int option = 0;
        
        while (option != 3) {
            System.out.println("1. Register new student");
            System.out.println("2. View all registered students");
            System.out.println("3. Exit");
            System.out.print("Enter your option: ");
            option = input.nextInt();
            input.nextLine(); // consume newline character
            
            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();
                    System.out.print("Enter student ID: ");
                    String id = input.nextLine();
                    System.out.print("Enter student email: ");
                    String email = input.nextLine();
                    Student newStudent = new Student(name, id, email);
                    studentList.add(newStudent);
                    System.out.println("Student registered successfully!");
                    break;
                    
                case 2:
                    if (studentList.isEmpty()) {
                        System.out.println("No student registered yet.");
                    } else {
                        System.out.println("Registered students:");
                        for (Student student : studentList) {
                            System.out.println(student);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
            
            System.out.println(); // print empty line for formatting
        }
        
        input.close(); // close scanner
    }
}

class Student {
    private String name;
    private String id;
    private String email;
    
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Email: " + email;
    }
}