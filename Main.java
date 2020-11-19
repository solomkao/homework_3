public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task #1");
        Circle circle = new Circle(15.7);
        System.out.format("Square is %.2f \n", circle.measureSquare());
        Circle circle2 = new Circle();
        circle2.setRadius(-15.7);
        System.out.format("Square is %.2f \n", circle2.measureSquare());

        //Task 2
        System.out.println("\nTask #2");
        System.out.println("We've created " + Counter.getCounter() + " class instance('s)");
        Counter[] arrayCounters = new Counter[5];
        for (int i = 0; i < arrayCounters.length; i++) {
            arrayCounters[i] = new Counter();
        }
        System.out.println("We've created " + Counter.getCounter() + " class instance('s)");

        //Task 3
        System.out.println("\nTask #3");
        Car myCar = new Car("Fiat", 5, 160.0);
        myCar.start();
        myCar.accelerate(20);
        myCar.accelerate(180);
        myCar.accelerate(40.5);
        myCar.stop();
        myCar.start();
        myCar.accelerate(63.8);
        myCar.decelerate(10);
        myCar.stop();

        //Task 4
        System.out.println("\nTask #4");
        Fractions f1 = new Fractions(9.8802);
        Fractions f2 = new Fractions(1.12);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        f1.add(f2);
        System.out.println("Add = " + f1);
        Fractions f3 = new Fractions(10.03);
        Fractions f4 = new Fractions(1.04);
        f3.subtraction(f4);
        System.out.println("Subtraction = " + f3);
        Fractions f5 = new Fractions(10.0);
        Fractions f6 = new Fractions(10.08);
        f5.multiply(f6);
        System.out.println("Multiplication = " + f5);
        int compare = f5.compare(f6);
        switch (compare) {
            case 1:
                System.out.println(f5 + " is bigger than " + f6);
                break;
            case 0:
                System.out.println(f5 + " and " + f6 + " are equal");
                break;
            case -1:
                System.out.println(f5 + " is smaller than " + f6);
                break;
            default:
                System.out.println("Invalid data");
        }

//        //Task 5
        System.out.println("\nTask #5");
        Money money1 = new Money(227, (byte) 55);
        Money money2 = new Money(3, (byte) 61);
        money1.add(money2);
        System.out.println("Add = " + money1);
        money1 = new Money(10, (byte) 50);
        money2 = new Money(3, (byte) 40);
        money1.subtraction(money2);
        System.out.println("Subtraction = " + money1);
        Money money3 = new Money(10, (byte) 5);
        money3.multiply(3.8);
        System.out.println("Multiply = " + money3);
        money3.divide(3.8);
        System.out.println("Divide = " + money3);
        Money money4 = new Money(3, (byte) 1);
        Money money5 = new Money(13, (byte) 61);
        if (money4.compare(money5) >= 0) {
            System.out.println(money4 + " is greater than " + money5 + " or equal");
        } else {
            System.out.println(money5 + " is greater than " + money4);
        }
    }
}
