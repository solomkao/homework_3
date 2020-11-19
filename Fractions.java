//Класс Дробное число со знаком (Fractions).
// Число должно быть представлено двумя полями: целая часть - длинное целое, дробная часть - короткое целое.
// Реализовать арифметические операции сложения, вычитания, умножения и операции сравнения.
// В функции main проверить эти методы.

public class Fractions {
    private long integerPart;
    private short fractionalPart;
    private static final int MAX_FRACTIONAL = 100;

    public Fractions(double number) {
        this.integerPart = (long) number;
        this.fractionalPart = (short) Math.round(number % 1 * MAX_FRACTIONAL);
    }

    private double convertToDouble() {
        return (double) this.integerPart + (double) this.fractionalPart / MAX_FRACTIONAL;
    }

    private double convertToDouble(long a, short b) {
        return a + (double) b / MAX_FRACTIONAL;
    }

    public void add(Fractions number) {
        long resultIntegerPart = this.integerPart + number.integerPart;
        short resultFractionalPart = (short) (this.fractionalPart + number.fractionalPart);

        if (resultFractionalPart >= MAX_FRACTIONAL) {
            resultIntegerPart++;
            resultFractionalPart -= MAX_FRACTIONAL;
        }

        this.integerPart = resultIntegerPart;
        this.fractionalPart = resultFractionalPart;
    }

    public void subtraction(Fractions number) {
        long resultIntegerPart = this.integerPart - number.integerPart;
        short resultFractionalPart = (short) (this.fractionalPart - number.fractionalPart);

        if (resultFractionalPart < 0) {
            resultIntegerPart--;
            resultFractionalPart += MAX_FRACTIONAL;
        }
        this.integerPart = resultIntegerPart;
        this.fractionalPart = resultFractionalPart;
    }

    public void multiply(Fractions number) {
        double d = convertToDouble(number.integerPart, number.fractionalPart);
        long resultIntegerPart = (long) (this.integerPart * d);

        double fractionalResultIntegerPart = (this.integerPart * d) - resultIntegerPart;
        fractionalResultIntegerPart = Math.round(fractionalResultIntegerPart * MAX_FRACTIONAL);

        short resultFractionalPart = (short) ((short) (this.fractionalPart * d) +
                (short) (fractionalResultIntegerPart));

        if (resultFractionalPart >= MAX_FRACTIONAL) {
            int i = resultFractionalPart / MAX_FRACTIONAL;
            resultIntegerPart += i;
            resultFractionalPart -= (MAX_FRACTIONAL * i);
        }

        this.integerPart = resultIntegerPart;
        this.fractionalPart = resultFractionalPart;
    }

    public int compare(Fractions number) {
        if (this.integerPart > number.integerPart) {
            return 1;
        }

        if (this.integerPart == number.integerPart) {
            return Integer.compare(this.fractionalPart, number.fractionalPart);
        }

        return -1;
    }

    @Override
    public String toString() {
        return "Fractions[" + integerPart + ", " + fractionalPart +
                "] -> " + convertToDouble();
    }
}
