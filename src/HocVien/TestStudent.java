package HocVien;

public class TestStudent {
    Student student = new Student();
    public static void main(String[] args) {
        Student.thayDoi();

        Student hocVien1 = new Student(001, "Tokai Teio");
        hocVien1.display();

        Student hocVien2 = new Student(002, "Gold Ship");
        hocVien2.display();

        Student hocVien3 = new Student(003, "Mejiro McQueen");
        hocVien3.display();

    }
}
