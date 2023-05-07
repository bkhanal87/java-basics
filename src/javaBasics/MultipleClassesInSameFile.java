package javaBasics;

public class MultipleClassesInSameFile {
	public static void main(String[] args) {
		System.out.println(FirstMessage.firstMessage());
		System.out.println(SecondMessage.secondMessage());
	}
}


class FirstMessage {
	static String firstMessage() {
		return "Message One";
	}
}

class SecondMessage {
	static String secondMessage() {
		return "Message Two";
	}
}