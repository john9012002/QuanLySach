public class Bao extends TaiLieu {
    private String ngayPhatHanh;


    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHang, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHang);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

}