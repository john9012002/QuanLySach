import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("MENU:");
            System.out.println("1. Them moi tai lieu");
            System.out.println("2. Xoa tai lieu theo ma tai lieu");
            System.out.println("3. Hien thi thong tin ve tai lieu");
            System.out.println("4. Tim kiem tai lieu theo loai");
            System.out.println("5. Thoat khoi chuong trinh");
            System.out.print("Nhap lua chon cua ban (1-5): ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    qls.themTaiLieu();
                    break;
                case 2:
                    qls.xoaTaiLieu();
                    break;
                case 3:
                    qls.hienThiThongTin();
                    break;
                case 4:
                    qls.timKiemTaiLieu();
                    break;
                case 5:
                    System.out.println("Da thoat khoi chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 5);
    }
}
