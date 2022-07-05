package cau4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuanLyLuong extends CongNhan {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<CongNhan> array = new ArrayList<CongNhan>();
		boolean flag = true;
		while (flag == true) {
			System.out.print("\n1. Thêm thông tin công nhân\n"
					+ "2. Hiển thị thông tin danh sách công nhân\n"
					+ "3. Tìm kiếm và hiển thị thông tin theo tên\n"
					+ "4. Tìm công nhân có lương thực lãnh thấp nhất\n"
					+ "0. Thoát\n"
					+ "==> Nhập số để chọn trong bảng Menu: ");
			int n = sc.nextInt();
			
			
			switch (n) {
			case 1: array.add(themThongTin()); break;
			case 2: hienThiAll(array); break;
			case 3: hienThiTheoTen(array); break;
			case 4: cnLuongThapNhat(array); break;
			case 0: System.out.println("Tạm biệt!"); flag = false; break;
			}
		}
		
		sc.close();
	}
	
	private static CongNhan themThongTin() {
		CongNhan cn = new CongNhan();
		
		System.out.print("Nhập mã công nhân: ");
		cn.setMaCN(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Nhập tên công nhân: ");
		cn.setTenCN(sc.nextLine());

		boolean flag = true;
		while (flag != false) {
			HashMap<Integer, String> gt = new HashMap<Integer, String>();
			gt.put(1, "Nam");
			gt.put(0, "Nữ");
			System.out.print("Nhập giới tính công nhân (1: Nam / 0: Nữ): ");
			int temp = sc.nextInt();
			if (temp == 1) {
				cn.setGioiTinh((String) gt.get(1));
				flag = false;
			} else if (temp == 0) {
				cn.setGioiTinh((String) gt.get(0));
				flag = false;
			}
		}
		sc.nextLine();
		
		System.out.print("Nhập số ngày làm việc: ");
		cn.setSoNgayLam(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Nhập số tiền lương 1 ngày làm: ");
		cn.setTienLuong1Ngay(sc.nextDouble());
		sc.nextLine();
		
		System.out.print("Nhập số tiền phụ cấp: ");
		cn.setPhuCap(sc.nextDouble());
		sc.nextLine();
		
		System.out.print("Nhập số tiền thưởng: ");
		cn.setThuong(sc.nextDouble());
		sc.nextLine();

		System.out.println("\n\nThêm thông tin công nhân thành công!");
		System.out.println("Mã số: " + cn.getMaCN()
						+ "\nTên công nhân: " + cn.getTenCN()
						+ "\nGiới tính: " + cn.getGioiTinh()
						+ "\nSố ngày làm việc: " + cn.getSoNgayLam()
						+ "\nSố lương 1 ngày làm: " + cn.getTienLuong1Ngay()
						+ "\nSố tiền phụ cấp: " + cn.getPhuCap()
						+ "\nSố tiền thưởng: " + cn.getThuong()
						+ "\nSố lương thực lãnh: " + cn.getLuongThucLanh());
		return cn;
	}
	
	private static void hienThiAll(ArrayList<CongNhan> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println("Mã số: " + array.get(i).getMaCN()
							+ "\nTên công nhân: " + array.get(i).getTenCN()
							+ "\nGiới tính: " + array.get(i).getGioiTinh()
							+ "\nSố ngày làm việc: " + array.get(i).getSoNgayLam()
							+ "\nSố lương 1 ngày làm: " + array.get(i).getTienLuong1Ngay()
							+ "\nSố tiền phụ cấp: " + array.get(i).getPhuCap()
							+ "\nSố tiền thưởng: " + array.get(i).getThuong()
							+ "\nSố lương thực lãnh: " + array.get(i).getLuongThucLanh()
							+ "\n====================================");
		}
	}
	
	private static void hienThiTheoTen(ArrayList<CongNhan> array) {
		System.out.print("Nhập tên sinh viên bạn cần tìm: ");
		String name = sc.next();
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getTenCN().contains(name)) {
				System.out.println("Mã số: " + array.get(i).getMaCN()
						+ "\nTên công nhân: " + array.get(i).getTenCN()
						+ "\nGiới tính: " + array.get(i).getGioiTinh()
						+ "\nSố ngày làm việc: " + array.get(i).getSoNgayLam()
						+ "\nSố lương 1 ngày làm: " + array.get(i).getTienLuong1Ngay()
						+ "\nSố tiền phụ cấp: " + array.get(i).getPhuCap()
						+ "\nSố tiền thưởng: " + array.get(i).getThuong()
						+ "\nSố lương thực lãnh: " + array.get(i).getLuongThucLanh()
						+ "\n====================================");
			}
		}
	}
	
	private static void cnLuongThapNhat(ArrayList<CongNhan> array) {
		double min = array.get(0).getLuongThucLanh();
		int index = 0;
		for (int i = 0; i < array.size(); i++) {
			if (min > array.get(i).getLuongThucLanh()) {
				min = array.get(i).getLuongThucLanh();
				index = i;
			}
		}
		
		System.out.println("Công nhân có lương thực lãnh thấp nhất là: ");
		System.out.println("Mã số: " + array.get(index).getMaCN()
				+ "\nTên công nhân: " + array.get(index).getTenCN()
				+ "\nGiới tính: " + array.get(index).getGioiTinh()
				+ "\nSố ngày làm việc: " + array.get(index).getSoNgayLam()
				+ "\nSố lương 1 ngày làm: " + array.get(index).getTienLuong1Ngay()
				+ "\nSố tiền phụ cấp: " + array.get(index).getPhuCap()
				+ "\nSố tiền thưởng: " + array.get(index).getThuong()
				+ "\nSố lương thực lãnh: " + array.get(index).getLuongThucLanh()
				+ "\n====================================");
	}
}
