package techcourse.fp.mission;

import java.util.List;

public class Calculator {
    public static int sumAll(List<Integer> numbers, Conditional conditional) {
        int total = 0;
        for (int number : numbers) {
            if (conditional.test(number)) {
                total += number;
            }
        }
        return total;
    }

    public static int sumAllEven(List<Integer> numbers, Conditional conditional) {
        int total = 0;
        for (int number : numbers) {
            if (conditional.test(number)) {
                total += number;
            }
        }
        return total;
    }

    public static int sumAllOverThree(List<Integer> numbers, Conditional conditional) {
        int total = 0;

        //TODO: List에 담긴 값 중 3보다 큰 수만을 더해야 한다.
        for (int number : numbers) {
            if (conditional.test(number)) {
                total = total + number;
            }
        }
        return total;
    }

    public static int sumByConditional(List<Integer> numbers, Conditional conditional) {
        return numbers.stream()
                .filter(conditional::test)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
