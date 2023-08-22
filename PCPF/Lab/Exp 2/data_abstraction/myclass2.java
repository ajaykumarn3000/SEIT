abstract class animal {
	public abstract void animalsound();
	public void sleep() {
		System.out.println("Hello");
	}
}

class dog extends animal {
	public void animalsound() {
	System.out.println("The dog says bow-bow");
	}
}

class myclass2 {
	public static void main(String[] arg) {
		dog d1 = new dog();
		d1.animalsound();
		d1.sleep();
	}
}