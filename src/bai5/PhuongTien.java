package bai5;

public class PhuongTien {
    private int id;
    private String hangSX;
    private int namSX;
    private int giaBan;
    private String mauXe;

    public PhuongTien(int id, String hangSX, int namSX, int giaBan, String mauXe) {
        this.id = id;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public void inThongTinPhuongTien() {
        System.out.println("Mã xe: " + this.id + " Hãng sản xuất: " + this.hangSX + " giá bán: " + this.giaBan + " màu xe: " + this.mauXe);
    }
}
