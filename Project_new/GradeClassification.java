import java.util.Scanner;

public class GradeClassification {

    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if(marks<35){
            System.out.println("F");
        }
        if(marks>100){
            System.out.println("Enter valid input for marks");
        }
        if(marks>=90){
            System.out.println("A");
        }
        if(marks<90){
            if(marks>=75){
                System.out.println("B");
            }
        }
        if(marks<75){
            if(marks>=60){
                System.out.println("C");
            }
        }
        if(marks<60){
            if(marks>=50){
                System.out.println("D");
            }
        }
        if(marks<50){
            if(marks>=35){
                System.out.println("E");
            }
        }
    }
}