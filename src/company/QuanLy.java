package company;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    //1. Attribute
    private List<NhanSu> dsNhanSu;
    private List<CongViec> dsCongViec;
    
    //2. Set, get
    public List<NhanSu> getDsNhanSu(){
        return dsNhanSu;
    }

    public List<CongViec> getDsCongViec() {
        return dsCongViec;
    }
    
    //3. Contructor
    
    public QuanLy() {
        dsNhanSu = new ArrayList<>();
        dsCongViec = new ArrayList<>();
    }
    public QuanLy(List<NhanSu> dsNhanSu, List<CongViec> dsCongViec) {
        this.dsNhanSu = dsNhanSu;
        this.dsCongViec = dsCongViec;
    }
    
    //4. Input, Output
    public void themNhanSu(NhanSu nhanSu) {
        dsNhanSu.add(nhanSu);
    }
    
    public void themCongViec(CongViec congViec){
        dsCongViec.add(congViec);
    }
}
