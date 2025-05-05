import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //scanner start
        //start of code
        System.out.print("Enter what month you were born in= ");
        double mon = in.nextDouble();//you don't need to write the vaiable at the top
        //keep mon as double int doesn't work for some reason
        if (mon >= 1 && mon <= 12)//start of if mon=months 1-12
            System.out.println("You were born in " + mon);
        else
        {
        System.out.println("you inputted a month that does not exist " + mon);
        }//end of if an else
        in.close();//don't forget to close it doesn't work if not closed.

    }
}