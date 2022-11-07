package functionalInterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        System.out.println(increment(0));
        System.out.println(inc.apply(3));
    }

    static Function<Integer, Integer> inc = num -> num + 1;
    static int increment(int a) {

        return a+1;
    }
}
