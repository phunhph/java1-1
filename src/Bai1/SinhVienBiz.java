package Bai1;

public class SinhVienBiz extends SinhVienPoly{
    
    double diemMarketing,diemSales;

    public SinhVienBiz(double diemMarketing, double diemSales, String name) {
        super(name);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    
    
    @Override
    public double getDiem() {
        return (diemMarketing*2+diemSales)/3;
    }
    
}
