package bai2;

public class KhachHang {
    private String tenChuHo;
    private int soNha;
    private String maSoCTD;

    public KhachHang(String tenChuHo, int soNha, String maSoCTD) {
        this.tenChuHo = tenChuHo;
        this.soNha = soNha;
        this.maSoCTD = maSoCTD;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCTD() {
        return maSoCTD;
    }

    public void setMaSoCTD(String maSoCTD) {
        this.maSoCTD = maSoCTD;
    }

    public void showThongTinKhachHang(){
        System.out.println("Tên khách hàng là: " + this.tenChuHo + " Số nhà: " + this.soNha + " Mã số công tơ điện: " + this.maSoCTD);
    }
}
