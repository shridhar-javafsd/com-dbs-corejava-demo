package com.dbs.corejava.demo.fun;

@FunctionalInterface
interface SomeInterface {

	public abstract void someMethod();

//	public abstract void someOtherMethod();

}

//// 1. by implementing the interface 

//public class FunIntDemo implements SomeInterface {
//
//	public static void main(String[] args) {
//
//		FunIntDemo obj = new FunIntDemo();
//		obj.someMethod();
//	}
//
//	@Override
//	public void someMethod() {
//		System.out.println("someMethod overridden and implemented");
//
//	}
//}

////2. by using anonymous inner class 

//public class FunIntDemo {
//
//	public static void main(String[] args) {
//
//		SomeInterface obj = new SomeInterface() {
//			@Override
//			public void someMethod() {
//				System.out.println("someMethod overridden and implemented");
//
//			}
//		};
//		obj.someMethod();
//	}
//}

////3. by using lambda expression 

public class FunIntDemo {

	public static void main(String[] args) {

		SomeInterface obj = () -> {
			System.out.println("someMethod overridden and implemented");
		};
		obj.someMethod();

	}
}
