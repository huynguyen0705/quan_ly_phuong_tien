public class XeTai extends PhuongTien{
    private int TrongTai;

    public int getTrongTai() {
        return TrongTai;
    }

    public void setTrongTai(int trongTai) {
        TrongTai = trongTai;
    }
    public XeTai(String hangSx, int namSx, double giaBan, String mauXe, int trongTai){
        setHangSanXuat(hangSx);
        setNamSanXuat(namSx);
        setGiaBan(giaBan);
        setMauXe(mauXe);
        setTrongTai(trongTai);
    }
    public void HienThiXeTai(){
        System.out.println("Hãng sản xuất:"+getHangSanXuat());
        System.out.println("Năm sản xuất: "+getNamSanXuat());
        System.out.println("Giá bán: "+getGiaBan());
        System.out.println("Màu xe: "+getMauXe());
        System.out.println("Trọng tải (tấn): "+getTrongTai());
    }
}
