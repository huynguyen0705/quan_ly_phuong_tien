import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        QuanLyPhuongTien quanLyPhuongTien = new QuanLyPhuongTien();
        while (isRunning){
            try {
                System.out.println("QUẢN LÝ PHƯƠNG TIỆN");
                System.out.println("1. Nhập đăng ký phương tiện");
                System.out.println("2. Tìm phương tiện theo màu");
                System.out.println("3. Thoát");
                System.out.println("Mời nhập: ");
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();
                if (input < 1 || input > 3){
                    System.out.println("Nhập sai");
                }
                switch (input){
                    case 1:
                        System.out.println("Nhập đăng ký cho phương tiện nào");
                        System.out.println("1. Ô tô");
                        System.out.println("2. Xe máy");
                        System.out.println("3. Xe tải");
                        System.out.println("Mời nhập: ");
                        int input1 = scanner.nextInt();
                        if (input1 <1 || input1 > 3){
                            System.out.println("Nhập sai");
                        }
                        switch (input1){
                            case 1:
                                System.out.println("NHẬP ĐĂNG KÝ CHO Ô TÔ");
                                System.out.println("Nhập hãng sản xuất: ");
                                Scanner scanner1 = new Scanner(System.in);
                                String hangSx = scanner1.next();
                                System.out.println("Nhập năm sản xuất: ");
                                Scanner scanner2 = new Scanner(System.in);
                                int namSx = scanner2.nextInt();
                                System.out.println("Nhập giá bán: ");
                                Scanner scanner3 = new Scanner(System.in);
                                double gia = scanner3.nextDouble();
                                System.out.println("Nhâập màu xe: ");
                                Scanner scanner4 = new Scanner(System.in);
                                String mauXe = scanner4.next();
                                System.out.println("Nhập số chỗ ngồi: ");
                                Scanner scanner5 = new Scanner(System.in);
                                int soChoNgoi = scanner5.nextInt();
                                System.out.println("Nhập kiểu động cơ: ");
                                Scanner scanner6 = new Scanner(System.in);
                                String kieuDongCo = scanner6.next();
                                quanLyPhuongTien.NhapDangKyOto(hangSx,namSx,gia,mauXe,soChoNgoi,kieuDongCo);
                                break;
                            case 2:
                                System.out.println("NHẬP ĐĂNG KÝ CHO XE MÁY");
                                System.out.println("Nhập hãng sản xuất: ");
                                Scanner scanner7 = new Scanner(System.in);
                                String hangSxXm = scanner7.next();
                                System.out.println("Nhập năm sản xuất: ");
                                Scanner scanner8 = new Scanner(System.in);
                                int namSxXm = scanner8.nextInt();
                                System.out.println("Nhập giá bán: ");
                                Scanner scanner9 = new Scanner(System.in);
                                double giaXm = scanner9.nextDouble();
                                System.out.println("Nhâập màu xe: ");
                                Scanner scanner10 = new Scanner(System.in);
                                String mauXeXm = scanner10.next();
                                System.out.println("Nhập công suất xe (cc): ");
                                Scanner scanner11 = new Scanner(System.in);
                                int congSuat = scanner11.nextInt();
                                quanLyPhuongTien.NhapDangKyXeMay(hangSxXm,namSxXm,giaXm,mauXeXm,congSuat);
                                break;
                            case 3:
                                System.out.println("NHẬP ĐĂNG KÝ CHO XE TẢI");
                                System.out.println("Nhập hãng sản xuất: ");
                                Scanner scanner12 = new Scanner(System.in);
                                String hangSxXt = scanner12.next();
                                System.out.println("Nhập năm sản xuất: ");
                                Scanner scanner13 = new Scanner(System.in);
                                int namSxXt = scanner13.nextInt();
                                System.out.println("Nhập giá bán: ");
                                Scanner scanner14 = new Scanner(System.in);
                                double giaXt = scanner14.nextDouble();
                                System.out.println("Nhâập màu xe: ");
                                Scanner scanner15 = new Scanner(System.in);
                                String mauXt = scanner15.next();
                                System.out.println("Nhập trọng tải xe (tấn): ");
                                Scanner scanner16 = new Scanner(System.in);
                                int trongTai = scanner16.nextInt();
                                quanLyPhuongTien.NhapDangKyXeTai(hangSxXt,namSxXt,giaXt,mauXt,trongTai);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("TÌM PHƯƠNG TIỆN THEO MÀU");
                        System.out.println("Nhập màu xe (không dấu): ");
                        Scanner scanner17 = new Scanner(System.in);
                        String mauXe = scanner17.next();
                        quanLyPhuongTien.TimPhuongTienTheoMau(mauXe);
                        break;
                    case 3:
                        isRunning = false;
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println("nhập sai tham số đầu vào");
            }
        }
    }
}