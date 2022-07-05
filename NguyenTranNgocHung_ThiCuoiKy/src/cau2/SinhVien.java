package cau2;

public class SinhVien {
	
	private int maSV;
	private String tenSV;
	private String gioiTinh;
	private double diemTinHoc;
	private double diemLTCB;
	private double diemCSDL;
	private double diemTrungBinh;

	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public double getDiemTinHoc() {
		return diemTinHoc;
	}
	public void setDiemTinHoc(double diemTinHoc) {
		this.diemTinHoc = diemTinHoc;
	}
	public double getDiemLTCB() {
		return diemLTCB;
	}
	public void setDiemLTCB(double diemLTCB) {
		this.diemLTCB = diemLTCB;
	}
	public double getDiemCSDL() {
		return diemCSDL;
	}
	public void setDiemCSDL(double diemCSDL) {
		this.diemCSDL = diemCSDL;
	}
	public double getDiemTrungBinh() {
		diemTrungBinh = (diemTinHoc + diemLTCB + diemCSDL) / 3;
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}	
}
