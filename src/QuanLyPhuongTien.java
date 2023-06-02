import java.util.ArrayList;

public class QuanLyPhuongTien {
    ArrayList<Oto> DsOto;
    ArrayList<XeMay> DsXeMay;
    ArrayList<XeTai> DsXeTai;
    public QuanLyPhuongTien(){
        DsOto = new ArrayList<>();
        DsXeMay = new ArrayList<>();
        DsXeTai = new ArrayList<>();
    }
    public void NhapDangKyOto(String hangSx, int namSx, double giaBan, String mauXe, int soChoNgoi, String kieuDongCo){
        Oto oto = new Oto(hangSx, namSx, giaBan, mauXe, soChoNgoi, kieuDongCo);
        DsOto.add(oto);
        System.out.println("Nhập thành công");
    }
    public void NhapDangKyXeMay(String hangSx, int namSx, double giaBan, String mauXe, int congSuat){
        XeMay xeMay = new XeMay(hangSx, namSx, giaBan, mauXe, congSuat);
        DsXeMay.add(xeMay);
        System.out.println("Nhập thành công");
    }
    public void NhapDangKyXeTai(String hangSx, int namSx, double giaBan, String mauXe, int trongTai){
        XeTai xeTai = new XeTai(hangSx, namSx, giaBan, mauXe, trongTai);
        DsXeTai.add(xeTai);
        System.out.println("Nhập thành công");
    }
    public void HienThiOto(){
        System.out.println("DANH SÁCH Ô TÔ");
        for (int i = 0; i < DsOto.size(); i++){
            DsOto.get(i).HienThiOto();
        }
    }
    public void HienThiXeMay(){
        System.out.println("DANH SÁCH XE MÁY");
        for (int i = 0; i < DsXeMay.size(); i++){
            DsXeMay.get(i).HienThiXeMay();
        }
    }
    public void HienThiXeTai(){
        System.out.println("DANH SÁCH XE TẢI");
        for (int i = 0; i < DsXeTai.size(); i++){
            DsXeTai.get(i).HienThiXeTai();
        }
    }
    public void TimPhuongTienTheoMau(String mauXe){
        System.out.println("CÁC PHƯƠNG TIỆN CÓ MÀU: "+mauXe);
        System.out.println("Ô TÔ");
        for (int i = 0; i < DsOto.size(); i++){
            if (DsOto.get(i).getMauXe().equals(mauXe)){
                DsOto.get(i).HienThiOto();
            }
        }
        System.out.println("XE MÁY");
        for (int i = 0; i < DsXeMay.size(); i++){
            if (DsXeMay.get(i).getMauXe().equals(mauXe)){
                DsXeMay.get(i).HienThiXeMay();
            }
        }
        System.out.println("XE TẢI");
        for (int i = 0; i < DsXeTai.size(); i++){
            if (DsXeTai.get(i).getMauXe().equals(mauXe)){
                DsXeTai.get(i).HienThiXeTai();
            }
        }
    }
}
