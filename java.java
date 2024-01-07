import java.util.*;

public class java {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter days of working: ");
        int days = scan.nextInt();
        days(scan, days);

        System.out.print("----------");
        System.out.println("\nSinger\nDance\nGuitarist");
        System.out.print("Enter job position: ");
        int position = scan.nextInt();
        position(scan, position);
        calculationProcess(days, position);

    }
    
    public static int days(Scanner scan, int days)
    {
        while(days > 30 || days < 1){
            System.out.println("No above 30 or below 1");
            days = scan.nextInt();
        }

        return days;
    }

    public static int position(Scanner scan, int position)
    {
        while(position > 3 || position < 1){
            System.out.print("Please 1 to 3 only: ");
            position = scan.nextInt();
        }
        return position;
    }

    public static void calculationProcess(int days, int position)
    {
        double totalSalary = 0;
        double grossSalary = 0;
        double medicare = 0.0275;
        double tax = 0.1;

        int philHealth = 200;
        int pagIbig = 200;
        int AssociationFund = 200;

        int singer = 1000;
        int dancer = 500;
        int guitarist = 250;

                switch (position) {
                    case 1:
                        totalSalary = singer * days;
                        break;
                    case 2: 
                        totalSalary = dancer * days;
                        break;
                    case 3:
                        totalSalary = guitarist * days;
                        break;
                }

        if (totalSalary > 20000){
            tax *= totalSalary;
            System.out.println("Tax: " + tax + "\nPhilhealth: ");
        } else {
            System.out.println("No tax.");
        } if (totalSalary > 15000){
            medicare *= totalSalary;
            System.out.println("Medicare: " + medicare);
        } 
            grossSalary = totalSalary;
            double totalDeduct = tax + medicare + philHealth + pagIbig + AssociationFund;
            totalSalary -= totalDeduct;

        System.out.println("----------");
        System.out.println("Gross: " + grossSalary);
        System.out.println("Pag-ibig: " +  pagIbig + "\nAssociation Fund: " + AssociationFund);
        System.out.println("----------");
        System.err.println("Total Salary: " + totalSalary);
        System.out.println();
    }

}