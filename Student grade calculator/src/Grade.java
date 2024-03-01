import java.util.Scanner;

public class Grade {
    private int [] SubjectMark;
    public Grade(int numofsubject) {
        SubjectMark = new int[numofsubject];
    }

    public void input (Scanner scan){
        for (int i=0; i<SubjectMark.length; i++){
            System.out.println(" Please enter your mark for each subject out of 100 :" +
                    " " +( i + 1 ) + " " );
            int mark = scan.nextInt();
            if (mark < 0 || mark > 100){
                throw new IllegalArgumentException(" Invalid input marks must " +
                        "be between 0-100 ");
            }
            SubjectMark[i] = mark;

        }

    }
    public int TotalMark(){
        int totalmark =0;
        for (int Tmark : SubjectMark){
            totalmark += Tmark;
        }
        return totalmark;
    }
    public double Average(){
        return TotalMark()/SubjectMark.length;
    }
    public char Calculate_Grade(){
        double averagePercentage = Average();
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void   Display (){
        System.out.println(" your AVERAGE  is : " +Average());
        System.out.println(" your GRADE is : " + Calculate_Grade());
    }

}
