package org.nizhikebinesi.codeproblems.numbers;

public final class SumIntegerNumberDigits {
    private SumIntegerNumberDigits() {

    }

    public static int getSumIntegerNumberDigits(int num) {
        int sum = 0;

        num = Math.abs(num);

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

}
