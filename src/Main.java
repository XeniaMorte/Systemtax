import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите доход");
        double cash = scanner.nextDouble();
        System.out.println(" Введите расход");
        double waste = scanner.nextDouble();
        double usn = usn(cash);
        double usn2 = usn2(cash,waste);
        boolean usnBetter= usn < usn2;

        if (usnBetter) {
            System.out.println(" первая система выгодней "+ (usn2 - usn)+ " - экономия" );
        } else {
            System.out.println(" вторая система выгодней "+ (usn-usn2)+ " - экономия");
        }
    }

    public static double usn(double cash ){
        double usnretern = 0.06 * cash;
        return usnretern;
    }
    public static double usn2(double cash ,double waste  ) {
        double usnretern2 = (cash-waste) * 0.15;
        return usnretern2;
    }

}