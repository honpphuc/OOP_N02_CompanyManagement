
package company;

public class CongViec {
    private String maCV;
    private String tenCV;
    private String soGioLam;
    String maNV;

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public String getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(String soGioLam) {
        this.soGioLam = soGioLam;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public CongViec() {
        this.maNV = "0";
    }

    public CongViec(String maCV, String tenCV, String soGioLam, String maNV) {
        this.maCV = maCV;
        this.tenCV = tenCV;
        this.soGioLam = soGioLam;
        this.maNV = maNV;
    }
    
    
}
