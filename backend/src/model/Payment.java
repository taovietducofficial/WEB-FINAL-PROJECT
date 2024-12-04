package model;

public class Payment {
    private int maGiaoDich;
    private String ngayGiaoDich;
    private int maDonHang;
    private String hinhThucThanhToan;
    private double soTienThanhToan;

    public Payment() {
    }

    public Payment(int maGiaoDich, String ngayGiaoDich, int maDonHang, String hinhThucThanhToan, double soTienThanhToan) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.maDonHang = maDonHang;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.soTienThanhToan = soTienThanhToan;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public int getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public double getSoTienThanhToan() {
        return soTienThanhToan;
    }

    public void setSoTienThanhToan(double soTienThanhToan) {
        this.soTienThanhToan = soTienThanhToan;
    }
}
