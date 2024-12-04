package model;

public class Promotion {
    private int maKM;
    private String tenChuongTrinh;
    private String moTa;
    private String thoiGianBatDau;
    private String thoiGianKetThuc;
    private String dieuKienThamGia;

    public Promotion() {
    }

    public Promotion(int maKM, String tenChuongTrinh, String moTa, String thoiGianBatDau, String thoiGianKetThuc, String dieuKienThamGia) {
        this.maKM = maKM;
        this.tenChuongTrinh = tenChuongTrinh;
        this.moTa = moTa;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.dieuKienThamGia = dieuKienThamGia;
    }

    public int getMaKM() {
        return maKM;
    }

    public void setMaKM(int maKM) {
        this.maKM = maKM;
    }

    public String getTenChuongTrinh() {
        return tenChuongTrinh;
    }

    public void setTenChuongTrinh(String tenChuongTrinh) {
        this.tenChuongTrinh = tenChuongTrinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getDieuKienThamGia() {
        return dieuKienThamGia;
    }

    public void setDieuKienThamGia(String dieuKienThamGia) {
        this.dieuKienThamGia = dieuKienThamGia;
    }
}
