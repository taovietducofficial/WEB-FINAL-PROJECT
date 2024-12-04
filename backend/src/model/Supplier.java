package model;

public class Supplier {
    private int maNCC;
    private String tenCongTy;
    private String thongTinLienHe;

    public Supplier() {
    }

    public Supplier(int maNCC, String tenCongTy, String thongTinLienHe) {
        this.maNCC = maNCC;
        this.tenCongTy = tenCongTy;
        this.thongTinLienHe = thongTinLienHe;
    }

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getThongTinLienHe() {
        return thongTinLienHe;
    }

    public void setThongTinLienHe(String thongTinLienHe) {
        this.thongTinLienHe = thongTinLienHe;
    }
}
