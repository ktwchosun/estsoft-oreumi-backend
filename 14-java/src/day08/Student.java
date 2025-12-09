package day08;

public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {this(null, null);}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    @Override
    public String toString() {
    }
}
