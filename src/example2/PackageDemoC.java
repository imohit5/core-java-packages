package example2;

import example1.PackageDemoA;
//import example1.*; //to import all in the package
import example1.example3.PackageDemoE;

public class PackageDemoC {

	public static void main(String[] args) {

//If import is not mentioned on top, then we need to mention it all the places
//		example1.PackageDemoA.DemoA1();
		PackageDemoA.DemoA1();

//		example1.PackageDemoA objA = new example1.PackageDemoA();		
		PackageDemoA objA = new PackageDemoA();
		objA.DemoA2();
		
		PackageDemoE objE = new PackageDemoE();
		objE.DemoA2();
	}
	
}
