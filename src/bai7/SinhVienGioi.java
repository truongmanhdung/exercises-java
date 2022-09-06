package bai7;

import java.util.Date;

public class SinhVienGioi extends SinhVien{
    private double diemTrungBinh;
    private String tenHocBongCaoNhat;

    public SinhVienGioi(String hoTen, Date sinhNhat, int gioiTinh, int soDienThoai, String tenTruong, String xepLoai, double diemTrungBinh, String tenHocBongCaoNhat) {
        super(hoTen, sinhNhat, gioiTinh, soDienThoai, tenTruong, xepLoai);
        this.diemTrungBinh = diemTrungBinh;
        this.tenHocBongCaoNhat = tenHocBongCaoNhat;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTenHocBongCaoNhat() {
        return tenHocBongCaoNhat;
    }

    public void setTenHocBongCaoNhat(String tenHocBongCaoNhat) {
        this.tenHocBongCaoNhat = tenHocBongCaoNhat;
    }

    @Override
    public void showInfoSinhVien() {
        super.showInfoSinhVien();
        System.out.println("Sinh viên loại khá giỏi ");
        System.out.println("Điểm trung bình của sinh viên là: " + this.diemTrungBinh);
        System.out.println("Học bổng ( giải thưởng ) cao nhất từng đạt được là: " + this.tenHocBongCaoNhat);
    }
}
