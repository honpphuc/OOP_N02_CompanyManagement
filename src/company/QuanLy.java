package company;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    //1. Attribute

    private List<CongViec> dsCongViec;
    private List<NhanSu> dsNhanVien;
    
    //2. Set, get
    public List<NhanSu> getDsNhanSu(){
        return dsNhanVien;
    }

    public List<CongViec> getDsCongViec() {
        return dsCongViec;
    }
    
    //3. Contructor
    
    public QuanLy() {
        dsNhanVien = new ArrayList<>();
        dsCongViec = new ArrayList<>();
    }
    public QuanLy(List<NhanSu> dsNhanSu, List<CongViec> dsCongViec) {
        this.dsNhanVien = dsNhanVien;
        this.dsCongViec = dsCongViec;
    }
    
    //4. Input, Output
    public void themNhanSu(NhanSu nhanSu) {
        dsNhanVien.add(nhanSu);
    }
    
    public void themCongViec(CongViec congViec){
        dsCongViec.add(congViec);
    }

    public NhanSu timNhanSu(String maNV){
        for(NhanSu nv : dsNhanVien) {
            if(nv.getIdNhanVien().equals(maNV)) {
                return nv;
            }
        }
        return null;
    }
    
    public CongViec timCongViec(String maCV) {
        for(CongViec cv : dsCongViec) {
            if(cv.getMaCV().equals(maCV)) {
                return cv;
            }
        }
        return null;
    }
}
