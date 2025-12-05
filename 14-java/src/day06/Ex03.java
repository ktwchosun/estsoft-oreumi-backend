package day06;

public class Ex03 {
    public static void main(String[] args) {
        // 객체 생성
        DeskLamp myLamp = new DeskLamp();

        myLamp.turnOn();
        myLamp.printStatus();

        myLamp.turnOn().printStatus();

        myLamp.turnOff();
        myLamp.printStatus();
    }
}
