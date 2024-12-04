package model;

public class Stock {
    private int maSP;
    private int soLuongTon;
    private String khoLuuTru;

    public Stock() {
    }

    public Stock(int maSP, int soLuongTon, String khoLuuTru) {
        this.maSP = maSP;
        this.soLuongTon = soLuongTon;
        this.khoLuuTru = khoLuuTru;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getKhoLuuTru() {
        return khoLuuTru;
    }

    public void setKhoLuuTru(String khoLuuTru) {
        this.khoLuuTru = khoLuuTru;
    }
}
