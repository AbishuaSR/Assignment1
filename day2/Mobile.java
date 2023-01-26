package week1.day2;

public class Mobile {
	public void sendMessage() {
		System.out.println("Send Message");
	}
	public void sendDocument() {
		System.out.println("Send Document");
	}
	public void call() {
		System.out.println("Make a call");
	}
	public static void main(String[] args) {
		Mobile b= new Mobile();
		b.sendMessage();
		b.sendDocument();
		b.call();
	}

}
