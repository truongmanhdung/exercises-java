package bai7;

import java.util.Date;

public class SinhVienTrungBinh extends SinhVien {
    private int diemToeic;
    private int diemThiDauVao;

    public SinhVienTrungBinh(String hoTen, Date sinhNhat, int gioiTinh, int soDienThoai, String tenTruong, String xepLoai, int diemToeic, int diemThiDauVao) {
        super(hoTen, sinhNhat, gioiTinh, soDienThoai, tenTruong, xepLoai);
        this.diemToeic = diemToeic;
        this.diemThiDauVao = diemThiDauVao;
    }

    public int getDiemToeic() {
        return diemToeic;
    }

    public void setDiemToeic(int diemToeic) {
        this.diemToeic = diemToeic;
    }

    public int getDiemThiDauVao() {
        return diemThiDauVao;
    }

    public void setDiemThiDauVao(int diemThiDauVao) {
        this.diemThiDauVao = diemThiDauVao;
    }

    @Override
    public void showInfoSinhVien() {
        super.showInfoSinhVien();
        System.out.println("Sinh viên loại trung bình");
        System.out.println("Điểm toeic của sinh viên là: " + this.diemToeic);
        System.out.println("Điểm thi đầu vào chuyên môn do công ty tổ chức thi là: " + this.diemThiDauVao);
    }
}
