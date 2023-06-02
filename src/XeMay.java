public class XeMay extends PhuongTien{
    private int CongSuat;

    public int getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(int congSuat) {
        CongSuat = congSuat;
    }
    public XeMay(String hangSx, int namSx, double giaBan, String mauXe, int congSuat){
        setHangSanXuat(hangSx);
        setNamSanXuat(namSx);
        setGiaBan(giaBan);
        setMauXe(mauXe);
        setCongSuat(congSuat);
    }
    public void HienThiXeMay(){
        System.out.println("Hãng sản xuất:"+getHangSanXuat());
        System.out.println("Năm sản xuất: "+getNamSanXuat());
        System.out.println("Giá bán: "+getGiaBan());
        System.out.println("Màu xe: "+getMauXe());
        System.out.println("Công suất (cc): "+getCongSuat());
    }
}
