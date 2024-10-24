package task2;

class Calculator implements Mathematicae {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    public double substract(double a, double b) {
        return add(a , negate(b));
    }

    @Override
    public double negate(double a) {
        return -a;
    }

    public double multiply(double a, double b) {
        double result = 0;
        double absB = Math.abs(b);

        for (int i = 0; i < (int) absB; i++) {
            result = add(result, a);
        }

        if (b < 0) {
            result = negate(result);
        }

        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        double result = 0;
        double absA = Math.abs(a);
        double absB = Math.abs(b);

        while (absA >= absB) {
            absA = add(absA, negate(absB));
            result = add(result, 1);
        }

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            result = negate(result);
        }

        return result;
    }

    public double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }

        double absA = Math.abs(a);
        double absB = Math.abs(b);

        while (absA >= absB) {
            absA = add(absA, negate(absB));
        }

        if (a < 0) {
            absA = negate(absA);
        }
        return absA;
    }
}

