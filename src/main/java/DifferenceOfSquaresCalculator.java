import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return Double.valueOf(Math.pow(IntStream.range(1, input + 1).sum(), 2.0)).intValue();
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.range(1, input + 1).map(number -> number * number).sum();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input); // return the difference
    }

}
