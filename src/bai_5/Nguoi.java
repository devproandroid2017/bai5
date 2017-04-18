package bai_5;

public class Nguoi {
	private String ten;
	private String nghenghiep;
	
	public Nguoi() {
		ten = "";
		nghenghiep = "that nghiep";
	}
	
	public void noi(){
		System.out.println(ten + " dang noi");
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNghenghiep() {
		return nghenghiep;
	}
	public void setNghenghiep(String nghenghiep) {
		this.nghenghiep = nghenghiep;
	}
}
