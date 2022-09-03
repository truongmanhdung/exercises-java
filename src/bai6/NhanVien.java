package bai6;

import java.util.Date;

public class NhanVien {
    private int id;
    private String fullName;
    private Date birthDay;
    private int phone;
    private String email;
    private byte employee_type;
    private byte employee_count;

    public NhanVien(int id, String fullName, Date birthDay, int phone, String email, byte employee_type, byte employee_count) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employee_type = employee_type;
        this.employee_count = employee_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getEmployee_type() {
        return employee_type;
    }

    public void setEmployee_type(byte employee_type) {
        this.employee_type = employee_type;
    }

    public byte getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(byte employee_count) {
        this.employee_count = employee_count;
    }

    public void showInfo() {
        System.out.println("Thông tin nhân viên là: " + this.fullName + "-" +
                this.birthDay + "-" + this.phone + "-" + this.email);
    }
}
