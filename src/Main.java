import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int MAX = 9;
        final int MIN = 4;

        //Password indlaeses
        System.out.print("Skriv et password: ");
        String password = scan.nextLine();
        //Password checkes og resultat udskrives
        int plength = password.length();
        while (plength < MIN || plength > MAX)
        {
            System.out.println("Passwordets længde er ukorrekt, prøv igen: ");
            password = scan.nextLine();
            plength = password.length();
        }
        System.out.println("Passwordets længde er korrekt");

        scan.close();
//Tester git
    }


    }

