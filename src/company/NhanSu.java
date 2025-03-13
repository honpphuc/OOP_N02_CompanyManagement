
package company;

import java.util.ArrayList;

public class NhanSu {
    
    private String idNhanVien;
    private String tenNhanVien;
    private int NamSinh;
    private String gioiTinh;
    private String phongBan;
    private float luong;
    private ArrayList <CongViec> dsCongViec;

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public ArrayList<CongViec> getDsCongViec() {
        return dsCongViec;
    }

    public void setDsCongViec(ArrayList<CongViec> dsCongViec) {
        this.dsCongViec = dsCongViec;
    }

    public void setLuong(float luong){
        this.luong = luong;
    }
    
    public NhanSu() {
        dsCongViec = new ArrayList<>();
    }
    

    public NhanSu(String idNhanVien, String tenNhanVien, int NamSinh, String gioiTinh, String phongBan) {
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.NamSinh = NamSinh;
        this.gioiTinh = gioiTinh;
        this.phongBan = phongBan;
        this.dsCongViec = new ArrayList<>();
    }

    public NhanSu(String idNhanVien, String tenNhanVien, int NamSinh, String gioiTinh, String phongBan, float Luong, ArrayList<CongViec> dsCongViec) {
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.NamSinh = NamSinh;
        this.gioiTinh = gioiTinh;
        this.phongBan = phongBan;
        this.luong = luong;
        this.dsCongViec = dsCongViec != null ? dsCongViec : new ArrayList<>();
    }
    
    public float tinhLuong() {
        float luongCoBan = 5000000; //5 Triệu
        float  tongSoGioLam = 0;
        
        for(CongViec cv : dsCongViec) {
            tongSoGioLam += cv.getSoGioLam();
        }
        return luongCoBan + 100000 * tongSoGioLam;
    }

}
