package day06;

public class DeskLamp {
    // 필드
    private boolean isOn;

    // 메서드
    public DeskLamp(boolean isOn) {this.isOn = isOn;}
    public DeskLamp() {this(false);}

    public DeskLamp turnOn() {
        this.isOn = true;
        return this;
    }
    public DeskLamp turnOff() {
        this.isOn = false;
        return this;
    }

    public void printStatus() {
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
    }






}
