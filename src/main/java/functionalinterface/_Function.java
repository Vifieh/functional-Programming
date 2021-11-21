package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);

        System.out.println(increment);
        // function(It takes 1 argument and produces 1 result)
    int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        //BiFunction(It takes 2 argument and produces 1 result)
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
    static int increment(int number) {
        return number + 1;
    }
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
