package model;

public class Product {
    private int maSP;
    private String tenSP;
    private String moTa;
    private String hinhAnh;
    private String danhMuc;

    public Product() {
    }

    public Product(int maSP, String tenSP, String moTa, String hinhAnh, String danhMuc) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
        this.danhMuc = danhMuc;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
}
