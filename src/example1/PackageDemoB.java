package example1;

import example1.example3.PackageDemoE;

public class PackageDemoB {

	public static void main(String[] args) {
		PackageDemoA.DemoA1();
		
		PackageDemoA objA = new PackageDemoA();
		objA.DemoA2();
		
		PackageDemoE objE = new PackageDemoE();
		objE.DemoA2();
		
	}
	
}
