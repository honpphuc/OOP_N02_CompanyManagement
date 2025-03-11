
package company;

public class CongViec {
    private String maCV;
    private String tenCV;
    private float soGioLam;
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

    public float getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(float soGioLam) {
        this.soGioLam = soGioLam;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }


    public CongViec(String maCV, String tenCV, float soGioLam, String maNV) {
        this.maCV = maCV;
        this.tenCV = tenCV;
        this.soGioLam = soGioLam;
        this.maNV = maNV;
    }
    
    
}
