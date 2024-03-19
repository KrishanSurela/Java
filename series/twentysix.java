public class twentysix {
    // 2 4 7 12 21
    public static void main(String[] args) {
        int pre = 2;
        System.out.print(pre + " ");
        for (int i = 0; i <= 5; i++) {
            pre = pre * 2 - i;
            System.out.print(pre + " ");
        }
    }
}
