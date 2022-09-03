package bai5;

public class Oto extends PhuongTien{
    private int soChoNgoi;
    private String kieuDongCo;

    public Oto(int id, String hangSX, int namSX, int giaBan, String mauXe, int soChoNgoi, String kieuDongCo) {
        super(id, hangSX, namSX, giaBan, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public void inThongTinPhuongTien() {
        super.inThongTinPhuongTien();
        System.out.println("Số chỗ ngồi của ô to: " + this.soChoNgoi + "Và " + "Kiểu động cơ là: " + this.kieuDongCo);
    }
}
