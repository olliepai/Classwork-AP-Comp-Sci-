package classDesignMessage;

public class MessageTester {
	public static void main(String[] args) {
		Message someMessage = new Message("This is the message…it is powerful!");
		someMessage.setTo("JJ");
		someMessage.setFrom("MM");
		System.out.println(someMessage);

		Message anuddaMessage = new Message("Hey There", "JJ", "MM");
		System.out.println(anuddaMessage);
	}
}
