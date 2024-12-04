package model;

public class Order_detail {
    private int maDonHang;
    private int maSP;
    private int soLuong;
    private double giaSanPham;
    private double tongTienSanPham;

    public Order_detail() {
    }

    public Order_detail(int maDonHang, int maSP, int soLuong, double giaSanPham, double tongTienSanPham) {
        this.maDonHang = maDonHang;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.giaSanPham = giaSanPham;
        this.tongTienSanPham = tongTienSanPham;
    }

    public int getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public double getTongTienSanPham() {
        return tongTienSanPham;
    }

    public void setTongTienSanPham(double tongTienSanPham) {
        this.tongTienSanPham = tongTienSanPham;
    }
}
