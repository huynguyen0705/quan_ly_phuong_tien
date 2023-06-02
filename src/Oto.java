public class Oto extends PhuongTien{
    private int SoChoNgoi;
    private String KieuDongCo;

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        SoChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return KieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        KieuDongCo = kieuDongCo;
    }
    public Oto(String hangSx, int namSx, double giaBan, String mauXe, int soChoNgoi, String kieuDongCo){
        setHangSanXuat(hangSx);
        setNamSanXuat(namSx);
        setGiaBan(giaBan);
        setMauXe(mauXe);
        setSoChoNgoi(soChoNgoi);
        setKieuDongCo(kieuDongCo);
    }
    public void HienThiOto(){
        System.out.println("Hãng sản xuất:"+getHangSanXuat());
        System.out.println("Năm sản xuất: "+getNamSanXuat());
        System.out.println("Giá bán: "+getGiaBan());
        System.out.println("Màu xe: "+getMauXe());
        System.out.println("Số chỗ ngồi: "+getSoChoNgoi());
        System.out.println("Kiểu động cơ: "+getKieuDongCo());
    }
}
