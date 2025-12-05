package day06;

public class SampleSuper {
    // 필드
    private int dataSuper;

    // 메서드
    public SampleSuper(int dataSuper) {
        this.dataSuper = dataSuper;

        System.out.println(" >>> SampleSuper#SampleSuper(int);");
    }

    public SampleSuper() {
        //this(0);
        dataSuper = 0;

        System.out.println(" >>> SampleSub#SampleSub()");
    }

    public void setDataSuper(int dataSuper) {this.dataSuper = dataSuper;}
    public int getDataSuper() {return dataSuper;}

    public void print() {
        System.out.println("datasuper: " + dataSuper);
    }
}
