class FibonacciGenerator {
    int fibonacciAt(int i) {
        if (i < 2) {
            1
        } else {
            fibonacciAt(i - 2) + fibonacciAt(i - 1)
        }
    }
}
