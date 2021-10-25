import java.util.ArrayList;

public class BasicJava {
public static void print1To255() {
    for (int i = 1; i <= 255; i++) {
    System.out.println(i);
    }
}

public static void printOdd1To255() {
    for (int i = 1; i <= 255; i++) {
    if (i % 2 == 1) System.out.println(i);
    }
}

public static void printSum1To255() {
    int sum = 0;
    for (int i = 1; i <= 255; i++) {
    sum += i;
    System.out.println("New number: " + i + " Sum: " + sum);
    }
}

public static void iteratingThroughArray(int[] x) {
    for (int i = 0; i < x.length; i++) {
    System.out.println(x[i]);
    }
}

public static void findMaxInArray(int[] x) {
    int max = x[0];
    for (int i = 1; i < x.length; i++) {
    if (max < x[i]) max = x[i];
    }
    System.out.println(max);
}

public static void getAverageOfArray(int[] x) {
    int sum = 0;
    for (int i = 0; i < x.length; i++) {
    sum += x[i];
    }
    System.out.println(sum / x.length);
}

public static void arrayWithOddNumbers() {
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int i = 1; i <= 255; i++) {
    if (i % 2 == 1) y.add(i);
    }
    for (int j : y) {
    System.out.println(j);
    }
}

public static void greaterThanY(int[] x, int y) {
    int count = 0;
    for (int i = 0; i < x.length; i++) {
    if (x[i] > y) count++;
    }
    System.out.println(count);
}

public static void squareTheValues(int[] x) {
    for (int i = 0; i < x.length; i++) {
      x[i] *= x[i];
    }
    iteratingThroughArray(x);
}

public static void eliminateNegativeNumbers(int[] x) {
    for (int i = 0; i < x.length; i++) {
    if (x[i] < 0) x[i] = 0;
    }
    iteratingThroughArray(x);
}

public static void maxMinAvg(int[] x) {
    int max, min, sum;
    max = min = sum = x[0];
    int[] newArr = new int[3];
    for (int i = 1; i < x.length; i++) {
    if (x[i] < min) min = x[i];
    if (x[i] > max) max = x[i];
    sum += x[i];
    }
    int avg = sum / x.length;
    newArr[0] = max;
    newArr[1] = min;
    newArr[2] = avg;
    iteratingThroughArray(newArr);
}

public static void shiftingValuesInArray(int[] x) {
    for (int i = 0; i < x.length-1; i++) {
    x[i] = x[i+1];
    }
    x[x.length-1] = 0;
    iteratingThroughArray(x);
}

public static void main(String[] args) {
    print1To255();

    printOdd1To255();

    printSum1To255();

    int[] arr1 = {1, 3, 5, 7, 9, 13};
    iteratingThroughArray(arr1);

    int[] arr2 = {1, 3, -5, 7, 49, 13, -75, 0, 22};
    findMaxInArray(arr2);

    int[] arr3 = {2, 10, 3};
    getAverageOfArray(arr3);
    arrayWithOddNumbers();

    int[] arr4 = {1, 3, 5, 7};
    greaterThanY(arr4, 3);

    int[] arr5 = {1, 5, 10, -2};
    squareTheValues(arr5);
    eliminateNegativeNumbers(arr5);
    maxMinAvg(arr5);
    
    int[] arr6 = {1, 5, 10, 7, -2};
    shiftingValuesInArray(arr6);
}
}