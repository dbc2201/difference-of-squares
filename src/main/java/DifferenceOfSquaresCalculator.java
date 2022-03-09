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
        // create a variable to store the sum of squares
        int sum = 0;
        for (int index = 1; index <= input; index++) {
            sum += index * index; // calculate the square of each natural number and store it to the sum
        }
        return sum; // return the total sum of squares of natural numbers
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input); // return the difference
    }

}
