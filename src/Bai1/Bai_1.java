package Bai1;

public class Bai_1 {
    public static void main(String[] args) {
        SinhVienBiz sv1= new SinhVienBiz(9,9, "Phú");
        SinhVienIT sv2 = new SinhVienIT(9, 9, 9, "Phú");
        sv1.xuat();
        sv2.xuat();
        DanhSachSinhVien ds = new DanhSachSinhVien();
        ds.nhap();
        ds.xuat();
    }
}
