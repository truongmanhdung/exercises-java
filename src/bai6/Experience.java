package bai6;

import java.util.Date;

public class Experience extends NhanVien{
    private short expYear;
    private String proSkill;

    public Experience(int id, String fullName, Date birthDay, int phone, String email, byte employee_type, byte employee_count, short expYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count);
        this.expYear = expYear;
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Số năm kinh nghiệm của nhân viên là: " + this.expYear);
        System.out.println("Kỹ năng chuyên môn cùa nhân viên là: " + this.proSkill);
    }
}
