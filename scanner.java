import java.util.Scanner;

public class scanner {
    
    //function to print a string

    public static void printResult(String message){
        if(message == null){
            System.out.println("No message to display!");
        }
        System.out.println("Result: "+ message);
    }
    
    public static void main(String[] args) {
        //scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your name: ");
        //reads the entire next line
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        //reads the next integer
        int age = sc.nextInt();

        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

        sc.close();

        printResult(name);
    }


}
