//Класс Деньги для работы с денежными суммами.
// Число должно быть представлено двумя полями: типа long для гривен и типа byte - для копеек.
// Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
// Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число, умножение на дробное число
// и операции сравнения.
// В функции main проверить эти методы.

public class Money {
    private long banknote;
    private byte coin;
    private static final int MAX_COINS = 100;

    public Money(long banknote, byte coin) {
        this.banknote = banknote;
        this.coin = coin;
    }

    public void add(Money money) {
        long resultBanknote = this.banknote + money.banknote;
        int resultCoin = this.coin + money.coin;

        if (resultCoin >= MAX_COINS) {
            resultBanknote++;
            resultCoin -= MAX_COINS;
        }
        this.banknote = resultBanknote;
        this.coin = (byte) resultCoin;
    }

    public void subtraction(Money money) {
        if (this.compare(money) >= 0) {
            long resultBanknote = this.banknote - money.banknote;
            int resultCoin = this.coin - money.coin;

            if (resultCoin < 0) {
                resultBanknote--;
                resultCoin += MAX_COINS;
            }
            this.banknote = resultBanknote;
            this.coin = (byte) resultCoin;
        }

    }

    public int compare(Money money) {
        if (this.banknote > money.banknote) {
            return 1;
        }

        if (this.banknote == money.banknote) {
            return Long.compare(this.coin, money.coin);
        }

        return -1;
    }

    public void multiply(double time) {
        double result = this.convertToDouble() * time;
        this.convertToMoney(result);
    }

    public void divide(double time) {
        double result = this.convertToDouble() / time;
        this.convertToMoney(result);
    }

    private double convertToDouble() {
        return this.banknote + (double)this.coin / MAX_COINS;
    }

    private void convertToMoney(double number) {
        this.banknote = (long) number;
        this.coin = (byte) Math.round(number % 1 * MAX_COINS);
    }

    @Override
    public String toString() {
        return "Money[" + banknote + "," + coin + "]";
    }
}
