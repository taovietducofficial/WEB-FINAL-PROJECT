package model;

public class Employee {
    private int maNV;
    private String hoTen;
    private String chucVu;
    private String sdt;
    private String email;

    public Employee(int maNV, String hoTen, String chucVu, String sdt, String email) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.sdt = sdt;
        this.email = email;
    }

    // Getters and Setters
    public int getMaNV() { return maNV; }
    public void setMaNV(int maNV) { this.maNV = maNV; }
    
    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    
    public String getChucVu() { return chucVu; }
    public void setChucVu(String chucVu) { this.chucVu = chucVu; }
    
    public String getSdt() { return sdt; }
    public void setSdt(String sdt) { this.sdt = sdt; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
