// Написать класс, который умеет считать количество созданных объектов этого класса.

public class Counter {
    private static int counter = 0;
    private int ownCounter;

    public Counter() {
        ownCounter++;
        counter++;
    }

    public int getOwnCounter() {
        return ownCounter;
    }

    public void setOwnCounter(int ownCounter) {
        this.ownCounter = ownCounter;
    }

    public static int getCounter(){
        return counter;
    }


}
