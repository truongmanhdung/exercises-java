package bai6;

import java.util.Date;

public class Fresher extends NhanVien {
    private Date graduationDate;
    private String graduationRank;
    private String education;

    public Fresher(int id, String fullName, Date birthDay, int phone, String email, byte employee_type, byte employee_count, Date graduationDate, String graduationRank, String education) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Thời gian tốt nghiệp của nhân viên là: " + this.graduationDate);
        System.out.println("Xếp loại tốt nghiệp của nhân viên là: " + this.graduationRank);
        System.out.println("Trường tốt nghiệp của nhân viên là: " + this.education);
    }
}
