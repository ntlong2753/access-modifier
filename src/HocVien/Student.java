package HocVien;

public class Student {
    private int maSo;
    private String hoTen;
    private static String coSoDaoTao = "Đường làng";

    public Student() {

    }
    public Student(int maSo, String hoTen) {
        this.maSo = maSo;
        this.hoTen = hoTen;
    }
    static void thayDoi(){
        coSoDaoTao = "Tracen Academy";
    }
    void display(){
        System.out.println( "Mã số học viên: " + maSo +
                            "\nHọ tên: " + hoTen +
                            "\nCơ sở huấn luyện: " + coSoDaoTao);
    }

}
