package QuanLyNhanSu.Modal;

public class GiamDoc extends NhanSu {
	double  coPhan;
		
	public double tinhLuong() {
		luongMotNgay=300;
		return luongMotNgay*soNgayLam;
	}

	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		super.xuatThongTin();
		System.out.printf("so co phan",coPhan);
	}
	
	}
	