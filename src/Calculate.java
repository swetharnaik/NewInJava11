public interface Calculate {

    default int doCalculation(int n, int error) {
        return randomCalculations(n, error);
    }

    private int randomCalculations(int someNo, int error) {
        return someNo*someNo-error*error;
    }

}
