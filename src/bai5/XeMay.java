package bai5;

public class XeMay extends PhuongTien {
    private int congXuat;

    public XeMay(int id, String hangSX, int namSX, int giaBan, String mauXe, int congXuat) {
        super(id, hangSX, namSX, giaBan, mauXe);
        this.congXuat = congXuat;
    }

    @Override
    public void inThongTinPhuongTien() {
        super.inThongTinPhuongTien();
        System.out.println("Công xuất của xe máy là: " + this.congXuat );
    }
}
