package functionalInterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        Supplier<String> getConnectionUrl = () -> "google.com";
        System.out.println(getConnectionUrl.get());
    }
}
