public class J09999 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(solve(10));
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - start) / 1000.0 + "s");
       
        start = System.currentTimeMillis();
        System.out.println(solve(2000000));
        end = System.currentTimeMillis();
        System.out.println("time:" + (end - start) / 1000.0 + "s");
    }

    /**
     * Project Euler #10を解く
     * !Attention! このコードは遅い上、バグを含んでいます。提出には使えないので注意してください。
     *
     * @param n
     * @return 引数n以下の素数の和
     */
    public static int solve(int n) {
        n = n + 1;

        boolean[] list = new boolean[n];
        for (int i = 2; i < n; i++) {
            boolean flg = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flg = false;
                    break;
                }
            }
            if (flg) {
                list[i] = true;
            }
        }
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (list[i]) {
                sum += i;
            }
        }
        return sum;
    }
}
