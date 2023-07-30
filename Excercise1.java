import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int alto = 10;
        int inicio = 1;
        boolean salir = false;

        while(inicio < alto) {
            
            System.out.println("numero de inicio: " + inicio); 

            inicio+= 3;          
        }


       /*  while(!salir) {
            System.out.println("numero inicio: " + inicio);
            if(inicio == 5){
                salir = true;
            }
            inicio ++;
        } */

        //porgrama que salude  hata que el usuario diga cuantos saludos quiere

    }
}