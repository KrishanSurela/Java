import java.util.*;

public class AngleBetweenMinuteandHourHands {
    public static double findAngle(int hour, int minute) {
        if (hour < 0 || hour > 12 || minute < 0 || minute > 59) {
            System.out.println("Invalid Input");
            return -1;
        }
        if (hour == 12) {
            hour = 0;
        }

        double hourAngle = 0.5 * (hour * 60 + minute);
        // 30 * (hour + minute / 60)
        double minuteAngle = 6 * minute;

        double angle = Math.abs(hourAngle - minuteAngle);

        // angle 180 degree se jyada hoga to angle ko anti clock wise dekh rhe hai
        angle = Math.min(360 - angle, angle);
        return angle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hour Between 0 to 12");
        int hour = sc.nextInt();
        System.out.println("Enter Minutes Between 0 to 59");
        int minute = sc.nextInt();

        double angle = findAngle(hour, minute);
        System.out.println("Angle between hour and minute hands: " + angle + " degrees");
        sc.close();
    }
}