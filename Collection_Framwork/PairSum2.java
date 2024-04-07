package Collection_Framwork;

import java.util.*;

// two Pointer approach in sorted and rotated arraylist
public class PairSum2 {
    public static boolean pairsum(ArrayList list, int target) {
        // find breaking point
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) > (int) list.get(i + 1)) {// breaking point
                bp = i;
                break;
            }
        }

        int lp = bp + 1; // smallest
        int rp = bp; // largest

        while (lp != rp) {
            if ((int) list.get(rp) + (int) list.get(lp) == target) {
                return true;
            }

            else if ((int) list.get(rp) + (int) list.get(lp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(10);
        int target = 36;

        Boolean b = pairsum(list, target);

        if (b) {
            System.out.println("Existed");
        } else {
            System.out.println("Not Existed");
        }
    }
}
