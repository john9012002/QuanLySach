import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> dsTaiLieu;

    public QuanLySach() {
        this.dsTaiLieu = new ArrayList<>();
    }

    public void themTaiLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai tai lieu (1 - Sach, 2 - Tap chi, 3 - Bao): ");
        int loaiTaiLieu = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ma tai lieu: ");
        String maTaiLieu = sc.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        String tenNhaXuatBan = sc.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        int soBanPhatHanh = sc.nextInt();
        sc.nextLine();
        switch (loaiTaiLieu) {
            case 1:
                System.out.print("Nhap ten tac gia: ");
                String tenTacGia = sc.nextLine();
                System.out.print("Nhap so trang: ");
                int soTrang = sc.nextInt();
                dsTaiLieu.add(new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang));
                break;
            case 2:
                System.out.print("Nhap so phat hanh: ");
                int soPhatHanh = sc.nextInt();
                System.out.print("Nhap thang phat hanh: ");
                int thangPhatHanh = sc.nextInt();
                dsTaiLieu.add(new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh));
                break;
            case 3:
                System.out.print("Nhap ngay phat hanh: ");
                String ngayPhatHanh = sc.nextLine();
                dsTaiLieu.add(new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh));
                break;
            default:
                System.out.println("Loai tai lieu khong hop le!");
        }
    }

    public void xoaTaiLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma tai lieu: ");
        String maTaiLieu = sc.nextLine();
        for (TaiLieu tl : dsTaiLieu) {
            if (tl.getMaTaiLieu().equals(maTaiLieu)) {
                dsTaiLieu.remove(tl);
                System.out.println("Da xoa tai lieu co ma " + maTaiLieu);
                return;
            }
        }
        System.out.println("Khong tim thay tai lieu co ma " + maTaiLieu);
    }

    public void hienThiThongTin() {
        for (TaiLieu tl : dsTaiLieu) {
            System.out.println(tl.toString());
        }
    }

    public void timKiemTaiLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai tai lieu can tim kiem (1 - Sach, 2 - Tap chi, 3 - Bao): ");
        int loaiTaiLieu = sc.nextInt();
        sc.nextLine();
        switch (loaiTaiLieu) {
            case 1:
                for (TaiLieu tl : dsTaiLieu) {
                    if (tl instanceof Sach) {
                        System.out.println(tl.toString());
                    }
                }
                break;
            case 2:
                for (TaiLieu tl : dsTaiLieu) {
                    if (tl instanceof TapChi) {
                        System.out.println(tl.toString());
                    }
                }
                break;
            case 3:
                for (TaiLieu tl : dsTaiLieu) {
                    if (tl instanceof Bao) {
                        System.out.println(tl.toString());
                    }
                }
                break;
            default:
                System.out.println("Loai tai lieu khong hop le!");
        }
    }
}