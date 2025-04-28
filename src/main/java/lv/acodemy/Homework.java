package lv.acodemy;

public class Homework {

    public static void main(String[] args) {

        PezDispenser dispenser = new PezDispenser("Spider-man", "Red", "Marvel", 12);


        dispenser.addOneCandy();
        dispenser.addMultipleCandies(5);
        dispenser.dispenseOne();
        dispenser.dispenseMultiple(3);
        dispenser.addMultipleCandies(10); // Проверка переполнения
        dispenser.refillToMax();           // Дозагрузка до максимума
        dispenser.dispenseMultiple(12);
    }


}
