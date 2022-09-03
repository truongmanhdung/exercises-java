package bai5;

public class XeTai extends PhuongTien{
    private int trongTai;

    public XeTai(int id, String hangSX, int namSX, int giaBan, String mauXe, int trongTai) {
        super(id, hangSX, namSX, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    @Override
    public void inThongTinPhuongTien() {
        super.inThongTinPhuongTien();
        System.out.println("Trọng tải của xe tải là: " + this.trongTai);
    }
}
