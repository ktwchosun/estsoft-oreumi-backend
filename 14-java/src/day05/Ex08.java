package day05;

public class Ex08 {
    public static void main(String[] args) {
        // Sample 클래스의 인스턴스 생성
        Sample sample = new Sample(10);     // Sample#Sample(int);

        // sample 객체의 print 메서드로 출력
        sample.print();

        // Sample 클래스의 기존 인스턴스로 새로운 객체를 초기화
        Sample sample2 = new Sample(sample);    // Sample#Sample(Sample);

        // sample 객체의 print 메서드로 출력
        System.out.println("sample2.data = " + sample2.getData());
    }
}