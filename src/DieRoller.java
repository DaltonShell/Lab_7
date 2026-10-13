import java.util.Random;

public class DieRoller
{
    static void main()
    {
        Random rnd = new Random();
        int tries = 0;
        int die1 = 1;
        int die2 = 2;
        int die3 = 3;
        int sum = 0;

        System.out.printf("%8s\t%5s\t%5s\t%5s\t%5s\n", "ATTEMPTS", "DIE 1", "DIE 2", "DIE 3", "SUM");

        while(die1 != die2 || die2 != die3)
        {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            tries++;
            sum = die1 + die2 + die3;

            System.out.printf("%5d\t%6d\t%6d\t%6d\t%8d\n", tries, die1, die2, die3, sum);

        }

    }
}
