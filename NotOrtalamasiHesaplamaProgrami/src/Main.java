
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        int mathematics , physics , chemistry , history , music;  // Lessons
        
        
        
        Scanner getExamGrade = new Scanner(System.in); // Scanner
        
        // Getting Exam Grades from Users
        
        System.out.print("Enter Your Math Score : ");
        
        mathematics = getExamGrade.nextInt();
        
        System.out.print("Enter Your Psysics Score : ");
        
        physics = getExamGrade.nextInt();
        
        System.out.print("Enter Your Chemistry Score : ");
        
        chemistry = getExamGrade.nextInt();
        
        System.out.print("Enter Your History Score : ");
        
        history = getExamGrade.nextInt();
        
        System.out.print("Enter Your Music Score : ");
        
        music = getExamGrade.nextInt();
        
        // Checking Overall Score 60 or 60+ passes , 60- Fails
        
        int sum = (mathematics + physics + chemistry + history + music );
        
        double overallAverage = sum / 6 ;
        
        System.out.println("Your Overall Score is : " + overallAverage);
        
        String passOrfail = (overallAverage >= 60) ? "Congratulations You Passed to the Class !!" : "You Failed the Class... ";
        
        System.out.println(passOrfail);
        
        
        
        
        
        
        
       
        
        
    }
    
}
