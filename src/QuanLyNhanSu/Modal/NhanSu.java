package QuanLyNhanSu.Modal;

import java.util.LinkedList;
import java.util.Scanner;

public class NhanSu {
	private String maSo;
	private String hoTen;
	private String sdt;
	int soNgayLam;
	 double luongMotNgay;
	  double tienLuong=0;
	private String chucVu;
	public LinkedList<NhanVien> listNhanVien=new LinkedList<NhanVien>();
	public LinkedList<TruongPhong> listTruongPhong=new LinkedList<TruongPhong>();
	public LinkedList<GiamDoc> listGiamDoc=new LinkedList<GiamDoc>();
	
	
	
	
	
	public void xoaNhanSu(Scanner scan,LinkedList<TruongPhong> listTruongPhong) {
		// TODO Auto-generated method stub
		System.out.println("---------danh sach Truong Phong----------------");
		for(TruongPhong tp:listTruongPhong) {
			tp.xuatThongTin();
			System.out.println("-------------------------------------------------");
		}
		
		
		System.out.println("nhap ma truong phong  muon xoa");
		String maNhanVien=scan.nextLine();
		for (TruongPhong tp:listTruongPhong) {
			if(maNhanVien.equals(tp.getMaSo())) {
			int index=listTruongPhong.indexOf(tp);
			tp.resetNhanVienDuoiQuyen();
				listTruongPhong.remove(index);
			
			System.out.printf("da xoa:%s\n",tp.getTenNhanSu());
			}
		}
	}
	public void xoaNhanSu(LinkedList<NhanVien> listNhanVien,Scanner scan) {
		System.out.println("---------danh sach nhan vien hien co----------------");
		for(NhanVien nv:listNhanVien) {
			nv.xuatThongTin();
			System.out.println("-------------------------------------------------");
		}
		
		
		System.out.println("nhap ma nhan vien muon xoa");
		String maNhanVien=scan.nextLine();
		for (NhanVien nv:listNhanVien) {
			if(maNhanVien.equals(nv.getMaSo())) {
			int index=listNhanVien.indexOf(nv);
				listNhanVien.remove(index);
				nv.setTruongPhong(null);
			System.out.printf("da xoa:%s\n",nv.getTenNhanSu());
			}
		}
		
	}
	public void xoaNhanSu(LinkedList<GiamDoc> listGiamDoc) {
		Scanner scan=new Scanner(System.in);
		System.out.println("---------danh sach giam doc hien co----------------");
		for(GiamDoc gd:listGiamDoc) {
			gd.xuatThongTin();;
			System.out.println("-------------------------------------------------");
		}
		
		
		System.out.println("nhap ma nhan vien muon xoa");
		String maNhanVien=scan.nextLine();
		for (GiamDoc gd:listGiamDoc) {
			if(maNhanVien.equals(gd.getMaSo())) {
			int index=listGiamDoc.indexOf(gd);
				listGiamDoc.remove(index);
				
			System.out.printf("da xoa:%s\n",gd.getTenNhanSu());
			}
		}
		
	}
	public void nhapThongTinNhanSu(Scanner scan) {
		
		System.out.println("nhap thong tin nhan su");
		
		boolean loop=true;
		
		
		while(loop) {
			System.out.println("nhap chuc vu");
			System.out.println("1.nhan vien thuong, 2.truong phong, 3.giam doc 4.ket thuc");
			int chucVu=Integer.parseInt(scan.nextLine());
			switch (chucVu) {
			case 1:
				NhanVien nv =new NhanVien();
			
				nv.setThongTinNhanSu(scan);;
				nv.setChucVu(chucVu);
				listNhanVien.add(nv);
				break;
			case 2:
				TruongPhong tp=new TruongPhong();
				
				tp.setThongTinNhanSu(scan);
				tp.setChucVu(chucVu);
				listTruongPhong.add(tp);
				break;
			case 3:
				GiamDoc gd=new GiamDoc();
				
				gd.setThongTinNhanSu(scan);
				gd.setChucVu(chucVu);
				listGiamDoc.add(gd);
				break;
			case 4:
				
				System.out.println("da dung nhap");
				System.out.println("-------------------------------------------------------------------");
				loop=false;
				break;
			default:
				System.out.println("nhap sai");
			
			}
			
		}
	}
	public void xuatThongTin() {
		System.out.println("-------------------------------------------------");
		System.out.printf("ten:%s\n",hoTen);
		System.out.printf("ma so:%s\n",maSo);
		System.out.printf("sdt:%s\n",sdt);
		System.out.printf("so ngay lam:%d\n",soNgayLam);
		System.out.printf("chuc vu:%s\n",chucVu);
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	
	public void setChucVu(int chucVu) {
		switch(chucVu) {
			case 1:
				this.chucVu="nhan vien";
				break;
			case 2:
				this.chucVu="truong phong";
				break;
			case 3:
				this.chucVu="giam doc";
				break;
			default:
				break;
		}
		
	}
	public String getChucVu() {
		return chucVu;
	}
	public String getTenNhanSu() {
		return hoTen;
	}
	
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public void setThongTinNhanSu(Scanner scan) {
		System.out.println("nhap ten nhan su");
		hoTen=scan.nextLine();
		System.out.println("nhap ma so");
		maSo=scan.nextLine();
		System.out.println("nhap sdt");
		sdt=scan.nextLine();
		System.out.println("nhap so ngay lam");
		soNgayLam=Integer.parseInt(scan.nextLine());
	}
	
}
