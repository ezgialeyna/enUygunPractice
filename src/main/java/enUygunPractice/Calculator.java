package enUygunPractice;

public class Calculator {
    public int toplama(int a, int b) {
        return a + b;
    }

    public int cikarma(int a, int b) {
        return a - b;
    }

    public int carpma(int a, int b) {
        return a * b;
    }

    public double bolme(int a, int b) {
        if (b == 0) {
            System.out.println("Sıfıra bölünemez");
            return Double.NaN;
        }
        return (double) a / b;
    }
}
