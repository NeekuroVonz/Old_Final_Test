package cau6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuanLyTo extends HoGiaDinh {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<HoGiaDinh> array = new ArrayList<HoGiaDinh>();
		boolean flag = true;
		while (flag == true) {
			System.out.print("\n1. Thêm thông tin hộ gia đình\n"
					+ "2. Hiển thị thông tin danh sách các hộ gia đình\n"
					+ "3. Tìm kiếm và hiển thị thông tin hộ gia đình theo tên chủ hộ\n"
					+ "4. Tìm hộ gia đình có số thành viên cao nhất\n"
					+ "0. Thoát\n"
					+ "==> Nhập số để chọn trong bảng Menu: ");
			int n = sc.nextInt();
			
			
			switch (n) {
			case 1: array.add(themThongTin()); break;
			case 2: hienThiAll(array); break;
			case 3: hienThiTheoTen(array); break;
			case 4: soThanhVienCaoNhat(array); break;
			case 0: System.out.println("Tạm biệt!"); flag = false; break;
			}
		}
		
		sc.close();
	}
	
	private static HoGiaDinh themThongTin() {
		HoGiaDinh hgd = new HoGiaDinh();
		
		System.out.print("Nhập số nhà: ");
		hgd.setSoNha(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Nhập tên chủ hộ: ");
		hgd.setTenChuHo(sc.nextLine());

		boolean flag = true;
		while (flag != false) {
			HashMap<Integer, String> gt = new HashMap<Integer, String>();
			gt.put(1, "Nam");
			gt.put(0, "Nữ");
			System.out.print("Nhập giới tính chủ hộ (1: Nam / 0: Nữ): ");
			int temp = sc.nextInt();
			if (temp == 1) {
				hgd.setGioiTinh((String) gt.get(1));
				flag = false;
			} else if (temp == 0) {
				hgd.setGioiTinh((String) gt.get(0));
				flag = false;
			}
		}
		sc.nextLine();
		
		System.out.print("Nhập năm sinh chủ hộ: ");
		hgd.setNamSinh(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Nhập học vấn chủ hộ: ");
		hgd.setHocVan(sc.nextLine());
		
		System.out.print("Nhập nghề nghiệp chủ hộ: ");
		hgd.setNgheNghiep(sc.next());
		sc.nextLine();
		
		System.out.print("Nhập số thành viên: ");
		hgd.setSoThanhVien(sc.nextInt());
		sc.nextLine();

		System.out.println("\n\nThêm thông tin hộ gia đình thành công!");
		System.out.println("Số nhà: " + hgd.getSoNha()
						+ "\nTên chủ hộ: " + hgd.getTenChuHo()
						+ "\nGiới tính: " + hgd.getGioiTinh()
						+ "\nNăm sinh: " + hgd.getNamSinh()
						+ "\nHọc vấn: " + hgd.getHocVan()
						+ "\nNghề nghiệp: " + hgd.getNgheNghiep()
						+ "\nSố thành viên: " + hgd.getSoThanhVien());
		return hgd;
	}
	
	private static void hienThiAll(ArrayList<HoGiaDinh> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println("Số nhà: " + array.get(i).getSoNha()
							+ "\nTên chủ hộ: " + array.get(i).getTenChuHo()
							+ "\nGiới tính: " + array.get(i).getGioiTinh()
							+ "\nNăm sinh: " + array.get(i).getNamSinh()
							+ "\nHọc vấn: " + array.get(i).getHocVan()
							+ "\nNghề nghiệp: " + array.get(i).getNgheNghiep()
							+ "\nSố thành viên: " + array.get(i).getSoThanhVien()
							+ "\n====================================");
		}
	}
	
	private static void hienThiTheoTen(ArrayList<HoGiaDinh> array) {
		System.out.print("Nhập tên chủ hộ bạn cần tìm: ");
		String name = sc.next();
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getTenChuHo().contains(name)) {
				System.out.println("Số nhà: " + array.get(i).getSoNha()
						+ "\nTên chủ hộ: " + array.get(i).getTenChuHo()
						+ "\nGiới tính: " + array.get(i).getGioiTinh()
						+ "\nNăm sinh: " + array.get(i).getNamSinh()
						+ "\nHọc vấn: " + array.get(i).getHocVan()
						+ "\nNghề nghiệp: " + array.get(i).getNgheNghiep()
						+ "\nSố thành viên: " + array.get(i).getSoThanhVien()
						+ "\n====================================");
			}
		}
	}
	
	private static void soThanhVienCaoNhat(ArrayList<HoGiaDinh> array) {
		double max = array.get(0).getSoThanhVien();
		int index = 0;
		for (int i = 0; i < array.size(); i++) {
			if (max < array.get(i).getSoThanhVien()) {
				max = array.get(i).getSoThanhVien();
				index = i;
			}
		}
		
		System.out.println("Hộ gia đình có số thành viên cao nhất là: ");
		System.out.println("Số nhà: " + array.get(index).getSoNha()
				+ "\nTên chủ hộ: " + array.get(index).getTenChuHo()
				+ "\nGiới tính: " + array.get(index).getGioiTinh()
				+ "\nNăm sinh: " + array.get(index).getNamSinh()
				+ "\nHọc vấn: " + array.get(index).getHocVan()
				+ "\nNghề nghiệp: " + array.get(index).getNgheNghiep()
				+ "\nSố thành viên: " + array.get(index).getSoThanhVien()
				+ "\n====================================");
	}
}
