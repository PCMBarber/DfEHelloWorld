package main;

public class Conditional {

	public void ifStatement(int anInt) {
		if (!(anInt == 10)) {
			System.out.println("Number 10 or more");
		} else {
			System.out.println("Less than 10");
		}
	}
	
	public void ifStatement2(int anInt) {
		if (anInt == 1) {
			System.out.println("Number 1");
		} else if (anInt == 2) {
			System.out.println("Number 2");
		} else if (anInt == 3) {
			System.out.println("Number 3");
		} else if (anInt == 4) {
			System.out.println("Number 4");
		}
	}
	
	public void switchCase(int anInt) {
		switch (anInt) {
		case 1:
			System.out.println("Number 1");
			break;
		case 2:
			System.out.println("Number 2");
			break;
		case 3:
			System.out.println("Number 3");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Number bigger than 4");
			break;
		}
	}
}
