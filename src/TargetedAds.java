import java.text.DecimalFormat;
import java.util.Scanner;

public class TargetedAds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String requirements = scan.nextLine();

        int perfectReq = Integer.parseInt(requirements.split(" ")[0]);
        int decentReq = Integer.parseInt(requirements.split(" ")[1]);

        int numPlace = Integer.parseInt(scan.nextLine());
        String[] placeNames = new String[numPlace];

        for (int i = 0; i < numPlace; i++) {
            int perfectCnt = 0;
            int decentCnt = 0;

            placeNames[i] = scan.nextLine();
            int numPeople = Integer.parseInt(scan.nextLine());

            for (int j = 0; j < numPeople; j++) {
                String[] tempInput = scan.nextLine().split(" ");
                String situation = CaseChecker(Integer.parseInt(tempInput[0]), Integer.parseInt(tempInput[1]), tempInput[2]);

                if (situation.equals("perfect")) {
                    perfectCnt++;
                    decentCnt++;
                } else if (situation.equals("close")){
                    decentCnt++;
                }
            }

            if ((perfectCnt>=perfectReq) && (decentCnt>=decentReq)){
                System.out.print("Good: ");
            }else{
                System.out.print("Not good: ");
            }

            System.out.println(placeNames[i] + " " + perfectCnt + " " + decentCnt);

        }
    }

    public static String CaseChecker(int age, int hour, String car) {
        String situation = " ";
        if (car.equals("no")){
            situation = "nah";
        } else if ((age<40)&&(age>=30)){
            if((hour<=10)&&(hour>=6)){
                situation="perfect";
            } else if (((hour>=3)&&(hour<=5))||((hour>=11)&&(hour<=15))){
                situation="close";
            }
        } else if((hour<=10)&&(hour>=6)){
            if(((age<30)&&(age>=20))||((age<50)&&(age>=40))){
                situation="close";
            }
        }
        return situation;
    }
}
