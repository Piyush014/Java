class Subject {
    private String name;
    private int maxMarks;
    public Subject(String name, int maxMarks) {
        this.name = name;
        this.maxMarks = maxMarks;
    }
    public String toString() {
        return "\nName: " + name + "\nMax Marks: " + maxMarks;
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("Cpp", 100);
        subs[1] = new Subject("Java", 100);
        subs[2] = new Subject(".NET", 50);

        for(Subject sub : subs) {
            System.out.println(sub);
        }
        
    }    


}
