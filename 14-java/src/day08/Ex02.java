package day08;

public class Ex02 {
    public static void main(String[] args) {
        // 제네릭 클래스의 참조변수를 선언하고 인스턴스를 생성
        Box<String> box1 = new Box<>();

        box1.setData("Hello World");

        System.out.println("box1: " + box1);

        Box<Integer> box2 = new Box<>();

        box2.setData(10);
        // Interger data = 10;
        // Interger data = new Interger(10);    //오토 박싱
        System.out.println("box2: " + box2);

    }
}
