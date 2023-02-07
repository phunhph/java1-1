package Bai1;

public abstract class SinhVienPoly {
    private String name;
    private String nganh;
    
    public abstract double getDiem();
    
    public  String getHocLuc(){
        if(getDiem()>=9){
            return "Xuat sac.";
        } else if(getDiem()>=8){
            return "Gioi.";
        } else if(getDiem()>=6.5){
            return "Kha.";
        } else if(getDiem()>=5){
            return "Trung Binh.";
        } else{
            return "Yeu.";
        }
    }

    public SinhVienPoly() {
    }

    public SinhVienPoly(String name) {
        this.name = name;
    }

    public SinhVienPoly(String name, String nganh) {
        this.name = name;
        this.nganh = nganh;
    }

    public void xuat(){
        System.out.println("Ten sinh vien: "+ name+" Điểm: "+getDiem()+" Học lực: "+getHocLuc());
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    
}
 