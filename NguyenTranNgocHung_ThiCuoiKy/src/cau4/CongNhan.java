package cau4;

public class CongNhan {
	
	private int maCN;
	private String tenCN;
	private String gioiTinh;
	private int soNgayLam;
	private double tienLuong1Ngay;
	private double phuCap;
	private double Thuong;
	private double luongThucLanh;
	
	public int getMaCN() {
		return maCN;
	}
	public void setMaCN(int maCN) {
		this.maCN = maCN;
	}
	public String getTenCN() {
		return tenCN;
	}
	public void setTenCN(String tenCN) {
		this.tenCN = tenCN;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getSoNgayLam() {
		return soNgayLam;
	}
	public void setSoNgayLam(int soNgayLam) {
		this.soNgayLam = soNgayLam;
	}
	public double getTienLuong1Ngay() {
		return tienLuong1Ngay;
	}
	public void setTienLuong1Ngay(double tienLuong1Ngay) {
		this.tienLuong1Ngay = tienLuong1Ngay;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	public double getThuong() {
		return Thuong;
	}
	public void setThuong(double thuong) {
		Thuong = thuong;
	}
	public double getLuongThucLanh() {
		luongThucLanh = (tienLuong1Ngay * soNgayLam) + phuCap + Thuong;
		return luongThucLanh;
	}
	public void setLuongThucLanh(double luongThucLanh) {
		this.luongThucLanh = luongThucLanh;
	}
	
	
}
