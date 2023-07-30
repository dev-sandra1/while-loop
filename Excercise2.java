import java.util.Scanner;

public class Excercise2{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int numSaludo;
        int greeting = 0;
        String hello = "hello chanchito happy";
    
       
        System.out.println("how many greetings do you want?:");
        numSaludo = entry.nextInt();


        while(greeting < numSaludo ){
            System.out.println(hello);

          greeting++;

            
 

        }
    }
}





































































