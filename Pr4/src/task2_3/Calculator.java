package task2_3;

class Calculator implements Mathematicae {
    
    @Override
    public int logicalAnd(int a, int b) {
        return a & b;
    }

    @Override
    public int logicalOr(int a, int b) {
        return a | b;
    }
    
    public int add(int a, int b) {
        while (b != 0) {
            int carry = logicalAnd(a, b);
            a = logicalOr(a, b) - carry;
            b = carry << 1;
        }
        return a;
    }
    
    public int subtract(int a, int b) {
        return add(a, add(~b, 1));
    }
    
    public int multiply(int a, int b) {
        int result = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                result = add(result, a);
            }
            a <<= 1;
            b >>>= 1; 
        }
        return result;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        int result = 0;
        int sign = ((a < 0) ^ (b < 0)) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);

        while (a >= b) {
            a = subtract(a, b);
            result = add(result, 1);
        }
        return sign == -1 ? add(~result, 1) : result;
    }
    
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }

        int quotient = divide(a, b);
        return subtract(a, multiply(quotient, b));
    }
}
