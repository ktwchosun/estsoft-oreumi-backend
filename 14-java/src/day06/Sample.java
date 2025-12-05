package day06;

public class Sample {
    // 필드
    private int data;

    // 정적 변수
    private static int numInstances = 0;

    public static final int MAX = 255;

    public Sample(int data) {
        this.data = Math.min(data, MAX);

        numInstances++;
    }

    // 메서드
    public Sample() {this(0);}

    public void setData(int data) {this.data = data;}
    public int getData() {return data;}

    public static int getNumInstances() {return numInstances;}

    public void print(){
        System.out.println("data = " + data);
    }
}
