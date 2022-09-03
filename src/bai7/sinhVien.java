package bai7;

import java.util.Date;

public class sinhVien {
    private String hoTen;
    private Date sinhNhat;
    private int gioiTinh;
    private int soDienThoai;
    private String tenTruong;
    private String xepLoai;

    public sinhVien(String hoTen, Date sinhNhat, int gioiTinh, int soDienThoai, String tenTruong, String xepLoai) {
        this.hoTen = hoTen;
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
}
