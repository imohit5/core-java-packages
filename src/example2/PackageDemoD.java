package example2;


public class PackageDemoD {

	public static void main(String[] args) {

		example1.PackageDemoA.DemoA1();
		PackageDemoA.DemoA1();

		example1.PackageDemoA obj1 = new example1.PackageDemoA();		
		PackageDemoA obj2 = new PackageDemoA();
		obj1.DemoA2();
		obj2.DemoA2();
	}
	
}
