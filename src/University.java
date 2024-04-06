public class University {
    String name;
    void batch() {
        System.out.println("Batch 06");
    }
}
class College extends University {
    int grade;
    @Override
    void batch() {
        System.out.println("Grade 13 Batch");
    }
}
class Test {
    public static void main(String[] args) {
        University u = new College(); //Up-casting
        u.name = "UOC";
        College c = (College) u; //Down-casting
        c.grade = 13;
        System.out.println(c.name);
        System.out.println(c.grade);
        c.batch();
    }
}

