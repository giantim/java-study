package techcourse.fp.mission;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    @Test
    public void sumAll() {
        int sum = Calculator.sumAll(numbers, (number) -> true);
        assertThat(sum).isEqualTo(21);
    }

    @Test
    public void sumAllEven() {
        int sum = Calculator.sumAllEven(numbers, (number) -> number % 2 == 0);
        assertThat(sum).isEqualTo(12);
    }

    @Test
    public void sumAllOverThree() {
        int sum = Calculator.sumAllOverThree(numbers, (number) -> number > 3);
        assertThat(sum).isEqualTo(15);
    }

    @Test
    public void sumByConditional() {
        int sumAll = Calculator.sumByConditional(numbers, (number) -> true);
        int sumAllEven = Calculator.sumByConditional(numbers, (number) -> number % 2 ==0);
        int sumAllOverThree = Calculator.sumByConditional(numbers, (number) -> number > 3);

        assertThat(sumAll).isEqualTo(21);
        assertThat(sumAllEven).isEqualTo(12);
        assertThat(sumAllOverThree).isEqualTo(15);
    }
}