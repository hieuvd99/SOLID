package interface_segregation_principle;

/*
 * Thay vì dùng 1 interface lớn, ta nên tách thành nhiều interface nhỏ, với nhiều mục đích cụ thể
 */

interface Print {
	void print();
}

interface Calculator {
	int add(int a, int b);
}

class ISP implements Print, Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public void print() {
		System.out.println("Hello....");
	}
}

public class InterfaceSegregation {
	
	public static void main(String[] args) {
		ISP isp = new ISP();
		int a = isp.add(1, 2);
		System.out.println(a);
		isp.print();
	}
}