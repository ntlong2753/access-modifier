package ThucHanh4;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Nhập tên: ");
        student.setName(input.nextLine());
        System.out.print("Nhập lớp học: ");
        student.setClasses(input.nextLine());
        System.out.println(student);
    }
}
