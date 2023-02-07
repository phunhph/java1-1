package Bai1;

public class SinhVienIT extends SinhVienPoly{
    double diemJava,diemCss,diemHtml;

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String name) {
        super(name);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    
    @Override
    public double getDiem() {
        return (2*diemJava+diemHtml+diemCss)/4;
    }
    
}
