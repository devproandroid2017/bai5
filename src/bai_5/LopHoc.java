package bai_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class LopHoc {
	private String tenlop;
	private int dientich;//m2
	
//	private Nguoi[] people;//danh sach nguoi trong lop
	private List<Nguoi> people;
	
//	private MayTinh[] computers;//danh sach may tinh trong lop
	private List<MayTinh> computers;
	
	public LopHoc() {
		tenlop = "";
		dientich = 50;
		people = new ArrayList<Nguoi>();
		computers = new ArrayList<MayTinh>();
	}
	public LopHoc(String ten, int dientich) {
		this.tenlop = ten;
		this.dientich = dientich;
		people = new ArrayList<Nguoi>();
		computers = new ArrayList<MayTinh>();
	}
	
	public String getTenlop() {
		return tenlop;
	}
	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}
	public int getDientich() {
		return dientich;
	}
	public void setDientich(int dientich) {
		this.dientich = dientich;
	}
	
	public boolean botNguoi(Nguoi person){
		return people.remove(person);
	}
	
	public Nguoi botNguoi(int index){
		return people.remove(index);
	}
	
	public boolean themNguoi(Nguoi person){
		return people.add(person);
	}
	
	public int soNguoiTrongLop(){
		return people.size();
	}
	
	public int soHocSinhTrongLop(){
		int sohocsinh = 0;
		Iterator<Nguoi> e = people.iterator();
		while(e.hasNext()){
			Nguoi p = e.next();
			if(p.getNghenghiep() == HocSinh.NGHE_HOC_SINH){
				sohocsinh = sohocsinh + 1;
			}
		};
		return sohocsinh;
	}
	
	public int soGiaoVienTrongLop(){
		int sogiaovien = 0;
		Iterator<Nguoi> e = people.iterator();
		while(e.hasNext()){
			Nguoi p = e.next();
			if(p.getNghenghiep() == GiaoVien.NGHE_GIAO_VIEN){
				sogiaovien = sogiaovien + 1;
			}
		};
		return sogiaovien;
	}
}
