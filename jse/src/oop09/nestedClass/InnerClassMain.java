package oop09.nestedClass;
public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
		//m.getInnerClassInstance();
		//m.getInnerClassLocal();
		//m.getInnerClassStatic();
		m.getInnerClassAnonyServiceImpl();
	}
	public void getInnerClassAnonyServiceImpl() {
		InnerClassAnonyServiceImpl inn = new InnerClassAnonyServiceImpl();
		inn.Print();
	}
	public void getInnerClassStatic() {
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner();
		inn.printData();
	}
	public void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}
	// CTRL +Shift + m 메소드 독립 단축키
	// 리팩토링
	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn= new InnerClassInstance().new Inner();
		inn.printData();
	}
}
