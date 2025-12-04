package day05;

public class Ex07 {
    public static void main(String[] args) {
        Person jackson = new Person();
        Person carey = new Person();
        Person dean = new Person();

        //설정자로 객체에 값을 설정
        jackson.setName("Michael Jackson");
        jackson.setAge(24);

        carey.setName("Mariah Carey");
        carey.setAge(21);

        dean.setName("James Dean");
        dean.setAge(36);

        // 각 개체의 print 메서드로 출력
        jackson.print();
        carey.print();
        dean.print();
    }
}
