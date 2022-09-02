package baitap1;

public class TheMuon extends SinhVien {
    private String maPhieuMuon;
    private int ngayMuon;
    private int hanTra;

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getHanTra() {
        return hanTra;
    }

    public void setHanTra(int hanTra) {
        this.hanTra = hanTra;
    }

    public int getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(int soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    private int soHieuSach;

    public TheMuon(String hoTen, int tuoi, String lop, String maPhieuMuon, int ngayMuon, int hanTra, int soHieuSach) {
        super(hoTen, tuoi, lop);
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    @Override
    public void inThongTinSinhVien() {
        super.inThongTinSinhVien();
        System.out.println("Mã phiếu mượn là :" + this.maPhieuMuon + " Ngày mượn: " +
                this.ngayMuon + " Ngày trả :" + this.hanTra + " Số hiệu sách là: " + this.soHieuSach);
    }
}
