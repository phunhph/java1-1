package Bai1;

import java.util.ArrayList;
import java.util.Scanner;


public class DanhSachSinhVien {
    ArrayList<SinhVienPoly> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public  void nhap(){
        do{
            System.out.print("Nhap tien sinh vien: ");
            String name=sc.nextLine();
            if(name==null||name.equals("")){
                System.out.println("Đã nhập xong danh sách.");
                break;
            }
            System.out.print("Nhap nganh hoc: ");
            String nganh = sc.nextLine();
            list.add(new SinhVienPoly(name, nganh) {
                @Override
                public double getDiem() {
                    return 0;
                }
            });
        }while(true);
    }
    
    public void xuat(){
        System.out.println("Danh sach sinh vien");
        for(SinhVienPoly sv:list){
            System.out.println("Ten sinh vien: "+sv.getName()+" Nganh hoc: "+sv.getNganh()+" Diem: "+" Hoc luc: "+sv.getHocLuc());
        }
    }
}
