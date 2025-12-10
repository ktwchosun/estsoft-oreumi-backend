package day08;

public class Student implements Comparable<Student> {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() { this(null, null); }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public String getName() { return name; }

    // toString 메서드 재정의
    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s", id, name);
    }

    // compareTo 메서드 재정의
    @Override
    public int compareTo(Student obj) {
        // return Integer.parseInt(id) - Integer.parseInt(obj.id);
        return id.compareTo(obj.id);
    }
}