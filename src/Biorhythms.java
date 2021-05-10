import java.util.Scanner;

public class Biorhythms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = scan.nextInt();
        scan.close();

/*      Physical: high peak at remainder = 6, low peak at remainder = 17
        Emotional: high peak at remainder = 7, low peak at remainder = 21
        Intellectual: high peak at remainder = 8, low peak at remainder = 25*/

        int physRemain = days % 23;
        int emotRemain = days % 28;
        int intellRemain = days % 33;

        PeakCalc(physRemain,6, 23);
        PeakCalc(physRemain, 17, 23);

        PeakCalc(emotRemain,7, 28);
        PeakCalc(emotRemain, 21, 28);

        PeakCalc(intellRemain,8, 33);
        PeakCalc(intellRemain, 25, 33);

    }

    public static void PeakCalc(int remainder, int peak, int cycle){
        if (remainder <= peak){
            System.out.println(peak - remainder);
        } else if (remainder == peak){
            System.out.println(0);
        } else if (remainder > peak) {
            System.out.println(cycle - remainder + peak);
        }
    }
}
