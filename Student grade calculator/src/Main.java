import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        do {

            System.out.println("Please enter your grade out of 100 :");
             G = scan.nextInt();
            if (G < 0 || G > 100){
                System.out.println("error invalid input grade must be 0-100");
            }
        }while (G < 0 || G > 100);

         */
        System.out.println(" ************************************* ");
        System.out.println(" Student Grade Managment system java   ");
        System.out.println(" ************************************* ");
        System.out.println(" Enter the number of subjects you take  :");
        int Numofsubject = scan.nextInt();
        Grade GD = new Grade(Numofsubject);
        GD.input(scan);
       // System.out.println(" Total mark : " + GD.TotalMark());
      //  System.out.println(" Average : " + GD.Average());
      //  System.out.println(" your grade : " +GD.Calculate_Grade());
        GD.Display();
        System.out.println(" ************************************* ");
        System.out.println(" Thank you !!  ");
        System.out.println(" ************************************* ");

        scan.close();

    }
}