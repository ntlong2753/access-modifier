package HocVien;

public class Student {
    private int maSo;
    private String hoTen;
    private static String coSoDaoTao = "BBDIT";

    public Student() {

    }
    public Student(int maSo, String hoTen) {
        this.maSo = maSo;
        this.hoTen = hoTen;
    }
    static void thayDoi(){
        coSoDaoTao = "CodeGym";
    }
    void display(){
        System.out.println( "Mã số học viên: " + maSo +
                            "\nHọ tên: " + hoTen +
                            "\nCơ sở đào tạo: " + coSoDaoTao);
    }

}
