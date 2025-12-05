package day06;

public class SampleSub extends SampleSuper {
    // 필드
    private int dataSub;

    // 메서드
    public SampleSub(int dataSuper, int dataSub) {
        super(dataSuper);
        this.dataSub = dataSub;
    }
    public SampleSub() {
        //this(0, 0);
        super(0);
        dataSub = 0;
    }

    public void setDataSub(int dataSub) {this.dataSub = dataSub;}
    public int getDataSub() {return dataSub;}

    @Override
    public void print() {
        super.print();
        System.out.println("datasub: " + dataSub);
    }
}
