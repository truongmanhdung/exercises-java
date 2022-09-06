package bai7;

import java.util.Date;

public class SinhVien {
    private String hoTen;
    private Date sinhNhat ;
    private int gioiTinh;
    private int soDienThoai;
    private String tenTruong;
    private String xepLoai;

    public SinhVien(String hoTen, Date sinhNhat, int gioiTinh, int soDienThoai, String tenTruong, String xepLoai) {
        try {
            if(hoTen.length() < 50 && hoTen.length() > 10){
                this.hoTen = hoTen;
            }
        } catch (Exception e) {
            System.out.println("Input files have unknow errors !!!");
        }


        this.sinhNhat = sinhNhat;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.tenTruong = tenTruong;
        this.xepLoai = xepLoai;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getSinhNhat() {
        return sinhNhat;
    }

    public void setSinhNhat(Date sinhNhat) {
        this.sinhNhat = sinhNhat;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }


    public void showInfoSinhVien() {
        String gioiTinh = this.gioiTinh == 1 ? "Nam" : this.gioiTinh == 3 ? "Giới tính thứ 3" : "Nữ";
        System.out.println("Thông tin sinh viên là: ");
        System.out.println("Họ và tên: " + this.hoTen + " Ngày tháng năm sinh là: " + this.sinhNhat + " Giới tính: "
                + gioiTinh + " Số điện thoại: " + this.soDienThoai + " Tên trường đã học: " + this.tenTruong + " Xếp loại cùa sinh viên: " + this.xepLoai);
    }
}
