import java.util.Scanner;

public class GenderBias {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String applicants = scan.nextLine();
            int mApplicants = Integer.parseInt(applicants.split(" ")[0]);
            int fApplicants = Integer.parseInt(applicants.split(" ")[1]);

            String offers = scan.nextLine();
            int mOffers = Integer.parseInt(offers.split(" ")[0]);
            int fOffers = Integer.parseInt(offers.split(" ")[1]);

            int fRate = (mOffers * fApplicants/ mApplicants) - fOffers;

            if (fRate == 0) {
                System.out.println("no bias");
            } else if (fRate > 0) {
                if (fRate <= 2){
                    System.out.println("no bias");
                } else if (fRate <= 5){
                    System.out.println("some bias against women");
                } else if (fRate > 5){
                    System.out.println("heavily biased against women");
                }
            } else if (fRate < 0) {
                fRate = Math.abs(fRate);
                if (fRate <= 2){
                    System.out.println("no bias");
                } else if (fRate <= 5){
                    System.out.println("some bias against men");
                } else if (fRate > 5){
                    System.out.println("heavily biased against men");
                }
            }

        }
    }
}
