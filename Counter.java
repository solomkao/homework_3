// Написать класс, который умеет считать количество созданных объектов этого класса.

public class Counter {
    private static int counter = 0;

    public Counter() {
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

}
