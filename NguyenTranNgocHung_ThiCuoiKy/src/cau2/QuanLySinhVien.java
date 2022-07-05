package cau2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuanLySinhVien extends SinhVien {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<SinhVien> array = new ArrayList<SinhVien>();
		boolean flag = true;
		while (flag == true) {
			System.out.print("\n1. Thêm thông tin sinh viên\n"
					+ "2. Hiển thị thông tin danh sách sinh viên\n"
					+ "3. Tìm kiếm và hiển thị thông tin theo tên\n"
					+ "4. Tìm sinh viên có điểm trung bình cao nhất\n"
					+ "0. Thoát\n"
					+ "==> Nhập số để chọn trong bảng Menu: ");
			int n = sc.nextInt();
			
			
			switch (n) {
			case 1: array.add(themThongTin()); break;
			case 2: hienThiAll(array); break;
			case 3: hienThiTheoTen(array); break;
			case 4: svDiemTBCaoNhat(array); break;
			case 0: System.out.println("Tạm biệt!"); flag = false; break;
			}
		}
		
		sc.close();
	}
	
	private static SinhVien themThongTin() {
		SinhVien sv = new SinhVien();
		double n;
		
		
		System.out.print("Nhập mã số sinh viên: ");
		sv.setMaSV(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Nhập tên sinh viên: ");
		sv.setTenSV(sc.nextLine());

		boolean flag = true;
		while (flag != false) {
			HashMap<Integer, String> gt = new HashMap<Integer, String>();
			gt.put(1, "Nam");
			gt.put(0, "Nữ");
			System.out.print("Nhập giới tính sinh viên (1: Nam / 0: Nữ): ");
			int temp = sc.nextInt();
			if (temp == 1) {
				sv.setGioiTinh((String) gt.get(1));
				flag = false;
			} else if (temp == 0) {
				sv.setGioiTinh((String) gt.get(0));
				flag = false;
			}
		}
		sc.nextLine();
		
		flag = true;
		while (flag != false) {
			System.out.print("Nhập điểm môn Tin học: ");
			n = sc.nextDouble();
			if ( n >= 0 && n <= 10) {	
				sv.setDiemTinHoc(n);
				flag = false;
			}
		}
		sc.nextLine();
		
		flag = true;
		while (flag != false) {
			System.out.print("Nhập điểm môn Lập trình cơ bản: ");
			n = sc.nextDouble();
			if ( n >= 0 && n <= 10) {	
				sv.setDiemLTCB(n);
				flag = false;
			}
		}
		sc.nextLine();
		
		flag = true;
		while (flag != false) {
			System.out.print("Nhập điểm môn Cơ sở dữ liệu: ");
			n = sc.nextDouble();
			if ( n >= 0 && n <= 10) {	
				sv.setDiemCSDL(n);
				flag = false;
			}
		}	
		System.out.println("\n\nThêm thông tin sinh viên thành công!");
		System.out.println("Mã số: " + sv.getMaSV()
						+ "\nTên sinh viên: " + sv.getTenSV()
						+ "\nGiới tính: " + sv.getGioiTinh()
						+ "\nĐiểm Tin học: " + sv.getDiemTinHoc()
						+ "\nĐiểm Lập trình cơ bản: " + sv.getDiemLTCB()
						+ "\nĐiểm Cơ sở dữ liệu: " + sv.getDiemCSDL()
						+ "\nĐiểm Trung bình: " + sv.getDiemTrungBinh());
		return sv;
	}
	
	private static void hienThiAll(ArrayList<SinhVien> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println("Mã số: " + array.get(i).getMaSV()
							+ "\nTên sinh viên: " + array.get(i).getTenSV()
							+ "\nGiới tính: " + array.get(i).getGioiTinh()
							+ "\nĐiểm Tin học: " + array.get(i).getDiemTinHoc()
							+ "\nĐiểm Lập trình cơ bản: " + array.get(i).getDiemLTCB()
							+ "\nĐiểm Cơ sở dữ liệu: " + array.get(i).getDiemCSDL()
							+ "\nĐiểm Trung bình: " + array.get(i).getDiemTrungBinh()
							+ "\n====================================");
		}
	}
	
	private static void hienThiTheoTen(ArrayList<SinhVien> array) {
		System.out.print("Nhập tên sinh viên bạn cần tìm: ");
		String name = sc.next();
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getTenSV().contains(name)) {
				System.out.println("Mã số: " + array.get(i).getMaSV()
						+ "\nTên sinh viên: " + array.get(i).getTenSV()
						+ "\nGiới tính: " + array.get(i).getGioiTinh()
						+ "\nĐiểm Tin học: " + array.get(i).getDiemTinHoc()
						+ "\nĐiểm Lập trình cơ bản: " + array.get(i).getDiemLTCB()
						+ "\nĐiểm Cơ sở dữ liệu: " + array.get(i).getDiemCSDL()
						+ "\nĐiểm Trung bình: " + array.get(i).getDiemTrungBinh()
						+ "\n====================================");
			}
		}
	}
	
	private static void svDiemTBCaoNhat(ArrayList<SinhVien> array) {
		double max = array.get(0).getDiemTrungBinh();
		int index = 0;
		for (int i = 0; i < array.size(); i++) {
			if (max < array.get(i).getDiemTrungBinh()) {
				max = array.get(i).getDiemTrungBinh();
				index = i;
			}
		}
		
		System.out.println("Sinh viên có số điểm trung bình cao nhất là: ");
		System.out.println("Mã số: " + array.get(index).getMaSV()
				+ "\nTên sinh viên: " + array.get(index).getTenSV()
				+ "\nGiới tính: " + array.get(index).getGioiTinh()
				+ "\nĐiểm Tin học: " + array.get(index).getDiemTinHoc()
				+ "\nĐiểm Lập trình cơ bản: " + array.get(index).getDiemLTCB()
				+ "\nĐiểm Cơ sở dữ liệu: " + array.get(index).getDiemCSDL()
				+ "\nĐiểm Trung bình: " + array.get(index).getDiemTrungBinh()
				+ "\n====================================");
	}
}
