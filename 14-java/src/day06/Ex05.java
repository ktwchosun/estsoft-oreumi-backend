package day06;

public class Ex05 {
    public static void main(String[] args) {
        SampleSuper sampleSuper = new SampleSuper(10);

        sampleSuper.print();    //  SampleSuper#print();

        System.out.println("--------------------------------------------");

        SampleSub sampleSub = new SampleSub(20,30);

        sampleSub.print();      // SsmpldSub#print();
    }
}
