package bai2;

public class BienLai extends KhachHang {
    private int chiSoDienCu;
    private int chiSoDienMoi;
    private int soTien;

    public BienLai(String tenChuHo, int soNha, String maSoCTD, int chiSoDienCu, int chiSoDienMoi, int soTien) {
        super(tenChuHo, soNha, maSoCTD);
        this.chiSoDienCu = chiSoDienCu;
        this.chiSoDienMoi = chiSoDienMoi;
        this.soTien = soTien;
    }


    @Override
    public void showThongTinKhachHang() {
        super.showThongTinKhachHang();
        System.out.println("Số điện cũ là: " + this.chiSoDienCu + " Số điện mới là: " + this.chiSoDienMoi + " Số tiền là: " + this.soTien );
    }
}
