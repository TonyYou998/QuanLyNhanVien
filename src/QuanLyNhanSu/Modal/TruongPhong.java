package QuanLyNhanSu.Modal;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TruongPhong extends NhanSu {
	
	private int soLuongNhanVienDuoiQuyen=0;
	private LinkedList <NhanVien> listNhanVienDuoiQuyen=new LinkedList<NhanVien>();
	public double tinhLuong() {
		this.luongMotNgay=200;
		return this.luongMotNgay*this.soNgayLam;
	}
	
	

	


		public LinkedList <NhanVien> getListNhanVienDuoiQuyen(){
			return listNhanVienDuoiQuyen;
		}
	public void resetNhanVienDuoiQuyen() {
	 	for (NhanVien nv:this.listNhanVienDuoiQuyen) {
	 		nv.setTruongPhong(null);
	 	}
	 
 }
	public void xuatListNhanVienDuoiQuyen() {
		System.out.println("danh sach nhan vien:");
		for(NhanVien nv:listNhanVienDuoiQuyen) {
			
			System.out.println(nv.getTenNhanSu());
			System.out.println("-------------------------------------------------");
		}
	}
	
	public void nhapNhanVienDuoiQuyen(Scanner scan,LinkedList<NhanVien> listNhanVien) {
		System.out.println("-------Danh Sach nhan vien----------------------------------------------------");
		
		for (NhanVien nv:listNhanVien) {
			
				nv.xuatThongTin();
			
		}
		

		System.out.println("nhap  ma so nhan vien muon them");
		String maNhanVien=scan.nextLine();
		for (NhanVien nv:listNhanVien) {
			if((nv.getMaSo()).equals(maNhanVien)&& (nv.getChucVu()).equals("nhan vien") ) {
				listNhanVienDuoiQuyen.add(nv);
				soLuongNhanVienDuoiQuyen++;
				nv.setTruongPhong(getMaSo());
			
			}
				
			
				
		}
		
		
	}
}
