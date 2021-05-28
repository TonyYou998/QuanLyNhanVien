package QuanLyNhanVien.Main;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
import java.util.Scanner;

import QuanLyNhanSu.Modal.CongTy;
import QuanLyNhanSu.Modal.GiamDoc;
//import QuanLyNhanSu.Modal.GiamDoc;
import QuanLyNhanSu.Modal.NhanSu;
import QuanLyNhanSu.Modal.NhanVien;
//import QuanLyNhanSu.Modal.NhanVien;
import QuanLyNhanSu.Modal.TruongPhong;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		CongTy ct=new CongTy();
		NhanSu ns=new NhanSu();
//		boolean loop=true;
		while(true) {
			menu(scan,ct,ns);
//			System.out.println("ban co muon chay nua ko?");
//			System.out.println("1.co 2.ko");
//			int option=Integer.parseInt(scan.nextLine());
//			switch (option) {
//				case 2:
//					loop=false;
//					break;
//				default :
//					break;
//			}
			
		}
		
		// TODO Auto-generated method stub
		
		
	}
	
	
	
	public static void cau1(Scanner scan,CongTy ct,NhanSu ns) {
		
		ct.nhapThongTinCongTy(scan);
		ns.nhapThongTinNhanSu(scan);
			
	}
	public static void cau2(Scanner scan,CongTy ct,NhanSu ns) {
			
			for (TruongPhong tp: ns.listTruongPhong) {
				tp.xuatThongTin();
					
			}
			System.out.println("nhap ma truong phong muon them nhan su");
			String maTruongPhong= scan.nextLine();
			for (TruongPhong tp:ns.listTruongPhong) {
				
				if(maTruongPhong.equals(tp.getMaSo())) {
					tp.nhapNhanVienDuoiQuyen(scan, ns.listNhanVien);
					System.out.println("da them");
					tp.xuatListNhanVienDuoiQuyen();
				}
			}
			
		
		
	}
	public static void Cau3(Scanner scan,NhanSu ns) {
		System.out.println("ban muon xoa loai nhan su nao");
		System.out.println("1. nhan vien 2.truong phong 3. giam doc");
		int option=Integer.parseInt(scan.nextLine());
		switch (option) {
		case 1: 
			System.out.println("ban chon xoa nhan vien");
			ns.xoaNhanSu(ns.listNhanVien, scan);
			break;
		case 2:
			System.out.println("ban chon xoa truong phong");
			ns.xoaNhanSu(scan, ns.listTruongPhong);
			break;
		case 3:
			System.out.println("ban chon xoa giam doc");
			ns.xoaNhanSu(ns.listGiamDoc);
			break;
		default:
			System.out.println("nhap sai");
			
		}
		
		
	}
	public static void cau4(NhanSu ns) {
		System.out.println("-------------------------------------------------thong tin giam doc------------------------------");
		for (GiamDoc gd:ns.listGiamDoc) {
			gd.xuatThongTin();
		}
		System.out.println("-------------------------------------------------thong tin truong phong------------------------------");

		for (TruongPhong tp:ns.listTruongPhong) {
			tp.xuatThongTin();
		}
		System.out.println("-------------------------------------------------thong tin nhan vien------------------------------");

		for (NhanVien nv:ns.listNhanVien) {
			nv.xuatThongTin();
			
		}
	}
	public static void menu(Scanner scan,CongTy ct,NhanSu ns) {
		System.out.println("-------------------welcome to quan ly nhan su--------------------------");
		System.out.println("1.nhap thong tin cong ty");
		System.out.println("2.phan bo nhan vien vao truong phong");
		System.out.println("3.Thêm, xóa thông tin một nhân sự (có thể là Nhân viên, trưởng phòng hoặc giám đốc). ");
		System.out.println("4. Xuất ra thông tin toàn bộ người trong công ty");
		System.out.println("5. Tính và xuất tổng lương cho toàn công ty");
		System.out.println("6. Tìm Nhân viên thường có lương cao nhất");
		System.out.println("7. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất");
		System.out.println("8. Sắp xếp nhân viên toàn công ty theo thứ tự abc");
		System.out.println("9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
		System.out.println("10. Tìm Giám Đốc có số lượng cổ phần nhiều nhất");
		System.out.println("11. Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
		System.out.println("12.stop");
		System.out.println("---------------------ban chon option nao-----------------------------------");
		int option;
		option=Integer.parseInt(scan.nextLine());
		
		switch (option) {
		
		case 1:
			System.out.println("------------ban chon nhap thong tin cong ty-------------");
			cau1(scan,ct,ns);
			break;
		case 2:
			System.out.println("-------------ban chon them nv vao truong phong---------------------------");
			
			cau2(scan, ct,ns);
			break;
		case 3:
			System.out.println("--------------ban chon xoa thong tin nhan su------------------------------");
			Cau3(scan, ns);
			break;
		case 4:
			System.out.println("--------------ban chon show thong tin nhan su------------------------------");
			cau4(ns);
			break;

		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("chuong trinh da dung");
			System.exit(0); ;
		default:
			
			break;
		}
	}

}
