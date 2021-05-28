package QuanLyNhanSu.Modal;

import java.util.LinkedList;
import java.util.Scanner;

public class CongTy {
	private String tenCongTy;
	private String maSoThue;
	private double doanhThuThang;
	
	

	public void nhapThongTinCongTy(Scanner scan) {
		System.out.println("nhap ten cong ty");
		tenCongTy=scan.nextLine();
		System.out.println("nhap ma so thue");
		maSoThue=scan.nextLine();
		System.out.println("nhap doanh thu");
		doanhThuThang=Double.parseDouble(scan.nextLine());
		
		
		
		

	}
}
