package random;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BitSet {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> op = (x, y) -> System.out.println(x + y);

        op.accept(1, 1);
    }
}
