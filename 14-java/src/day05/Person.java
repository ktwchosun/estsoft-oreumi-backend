package day05;

public class Person {
    // 필드
    private static String name;
    private int age;

    // 메서드

    // 설정자
    public void setName(String str) {
        name = str;
    }
    public void setAge(int n) {
        //if(n >=0) age = n;
        age = Math.max(n, 0);
    }

    // 접근자
    public String getName() { return name; }
    public int getAge() { return age; }

    // 출력
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

}
