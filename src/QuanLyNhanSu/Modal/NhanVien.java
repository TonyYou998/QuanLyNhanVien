package QuanLyNhanSu.Modal;

import java.util.Scanner;

public class NhanVien extends NhanSu {
	private String truongPhongQuanLy=null;
		
	public double tinhLuong() {
		luongMotNgay=100;
		return luongMotNgay*soNgayLam;
	}
	public void nhapThongTinNhanVien(Scanner scan) {
		setThongTinNhanSu(scan);
		
		
		
	}
	public void setTruongPhong(String tenTruongPhong) {
		truongPhongQuanLy=tenTruongPhong;
		
	}
	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		super.xuatThongTin();
		System.out.printf("ma truong phong quan ly:%s\n",truongPhongQuanLy);
		System.out.println("------------------------------------------------------------------------");
	}
	
	
}
