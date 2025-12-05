package day06;

public class Ex01 {
    public static void main(String[] args) {
        // 객체 생성
        Sample sample1 = new Sample(10);
        Sample sample2 = new Sample(20);

        // 출력
        System.out.println("sample1.data = " + sample1.getData());
        System.out.println("sample2.data = " + sample2.getData());

        System.out.println("sample.numInstances = " + Sample.getNumInstances());
    }
}
