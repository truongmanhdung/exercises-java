package bai6;

import java.util.Date;

public class Intern extends NhanVien {
    private String majors;
    private String semester;
    private String universityName;

    public Intern(int id, String fullName, Date birthDay, int phone, String email, byte employee_type, byte employee_count, String majors, String semester, String universityName) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Chuyên ngành học là: " + this.majors);
        System.out.println("Kỳ học là: " + this.semester);
        System.out.println("Tên trường đang học là: " + this.universityName);
    }
}
