import java.util.Scanner;
class average_finder
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter=1;
        while (counter < 5)
        {
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }
        average = total/10;
        System.out.println("Your total is "+ total);
        System.out.println("Your average is "+ average);
    }
}