package bai_5;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyApp {

	public static void main(String[] args) {
		//tao 1 lop hoc
		LopHoc lophoc = new LopHoc("Android_Java",100);
		
		//them 5 hoc sinh
		HocSinh hs1 =  new HocSinh();
		hs1.setTen("Hoc sinh 1");
		HocSinh hs2 =  new HocSinh();
		hs2.setTen("Hoc sinh 2");
		HocSinh hs3 =  new HocSinh();
		HocSinh hs4 =  new HocSinh();
		HocSinh hs5 =  new HocSinh();
		
		lophoc.themNguoi(hs1);
		lophoc.themNguoi(hs2);
		lophoc.themNguoi(hs3);
		lophoc.themNguoi(hs4);
		lophoc.themNguoi(hs5);
		
		//them 1 giao vien
		GiaoVien gv1 = new GiaoVien();
		gv1.setTen("Giao Vien 1");
		lophoc.themNguoi(gv1);
		//in so nguoi trong lop
		System.out.println("So nguoi trong lop:" + lophoc.soNguoiTrongLop());
		//in so hoc sinh trong lop
		System.out.println("So hoc sinh trong lop:" + lophoc.soHocSinhTrongLop());
		//in so giao vien trong lop
		System.out.println("So giao vien trong lop:" + lophoc.soGiaoVienTrongLop());
		
		Dictionary<String, Nguoi> adictionary = new Hashtable<>(2);
		adictionary.put("nguoi1", hs1);
		adictionary.put("nguoi2", hs2);
		adictionary.put("nguoi1", gv1);//
		Nguoi person = adictionary.get("nguoi1");
		System.out.println(person.getTen());
		
		Stack<Nguoi> st = new Stack<>();
		st.push(hs1);
		st.push(hs2);
		st.push(gv1);
		
		Nguoi aperson = st.pop();
		System.out.println(aperson.getTen());
		
		Queue<Nguoi> qu = new LinkedList<Nguoi>();
		qu.add(hs1);
		qu.add(hs2);
		qu.add(gv1);
		
		Nguoi person2 = qu.poll();
		System.out.println(person2.getTen());
	}

}
