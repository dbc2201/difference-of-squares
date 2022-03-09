class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        // create a variable to store the sum of natural numbers
        int sum = 0;
        for (int index = 1; index <= input; index++) {
            // add the number to the sum
            sum = sum + index;
        }
        return sum * sum; // calculate the square of the total sum of natural numbers
    }

    int computeSumOfSquaresTo(int input) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int computeDifferenceOfSquares(int input) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
