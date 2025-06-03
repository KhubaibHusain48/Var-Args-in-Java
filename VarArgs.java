package Concepts.VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(3, 4, 5, 6));
    }

    public static int sum(int first, int second, int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
