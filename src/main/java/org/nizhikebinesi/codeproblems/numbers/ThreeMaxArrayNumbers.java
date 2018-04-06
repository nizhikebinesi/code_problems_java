package org.nizhikebinesi.codeproblems.numbers;

import java.lang.Number;
import java.util.Objects;

public final class ThreeMaxArrayNumbers {
    private ThreeMaxArrayNumbers(){

    }

    public static class Triple {
        private Number first;
        private Number second;
        private Number third;

        public Triple(Number first, Number second, Number third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        public final Number getFirst() {
            return first;
        }

        public final Number getSecond() {
            return second;
        }

        public final Number getThird() {
            return third;
        }

        @Override
        public String toString() {
            return "Triple{" +
                    "first=" + first +
                    ", second=" + second +
                    ", third=" + third +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Triple triple = (Triple) o;
            return Objects.equals(getFirst(), triple.getFirst()) &&
                    Objects.equals(getSecond(), triple.getSecond()) &&
                    Objects.equals(getThird(), triple.getThird());
        }

        @Override
        public int hashCode() {

            return Objects.hash(getFirst(), getSecond(), getThird());
        }
    }

    private static <T extends Number & Comparable<T>> boolean isMore(T a, T b) {
        return a.compareTo(b) > 0;
    }

    private static <T extends Number & Comparable<T>> boolean isMoreInArray(T[] arr, int i, int j) {
        return isMore(arr[i], arr[j]);
    }

    public static <T extends Number & Comparable<T>> Triple findThreeMaxArrayNumbers(T[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Invalid size = " + arr.length + " of array");
        }

        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 1; i < arr.length; i++) {
            if (isMoreInArray(arr, i, first)) {
                third = second;
                second = first;
                first = i;
            } else if (isMoreInArray(arr, i, second)) {
                third = second;
                second = i;
            } else if (isMoreInArray(arr, i, third)) {
                third = i;
            }
        }

        return new Triple(arr[first], arr[second], arr[third]);
    }

}
