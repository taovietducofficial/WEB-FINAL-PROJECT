package model;
import java.util.Date;

public class Offline_order {
    private int maDonHang;
    private Date ngayDatHang;
    private double tongTien;
    private String hinhThucThanhToan;
    private String trangThaiDonHang;
    private int maKH;

    // Constructor
    public Offline_order(int maDonHang, java.sql.Date ngayDatHang, double tongTien, 
                        String hinhThucThanhToan, String trangThaiDonHang, int maKH) {
        this.maDonHang = maDonHang;
        this.ngayDatHang = ngayDatHang;
        this.tongTien = tongTien;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.trangThaiDonHang = trangThaiDonHang;
        this.maKH = maKH;
    }

    // Getter and Setter methods
    public int getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }

    public java.sql.Date getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(Date ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public String getTrangThaiDonHang() {
        return trangThaiDonHang;
    }

    public void setTrangThaiDonHang(String trangThaiDonHang) {
        this.trangThaiDonHang = trangThaiDonHang;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    @Override
    public String toString() {
        return "OfflineOrder{" +
                "maDonHang=" + maDonHang +
                ", ngayDatHang=" + ngayDatHang +
                ", tongTien=" + tongTien +
                ", hinhThucThanhToan='" + hinhThucThanhToan + '\'' +
                ", trangThaiDonHang='" + trangThaiDonHang + '\'' +
                ", maKH=" + maKH +
                '}';
    }
}
