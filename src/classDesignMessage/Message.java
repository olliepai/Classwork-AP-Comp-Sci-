package classDesignMessage;

public class Message {
	private String msg;
	private String t;
	private String f;
	
	public Message(String msg) {
		this.msg = msg;
		t = "";
		f = "";
	}
	
	public Message(String msg, String t, String f) {
		this.msg = msg;
		this.t = t;
		this.f = f;
	}
	
	public String getMessage() {
		return msg;
	}
	
	public String getFrom() {
		return f;
	}
	
	public String getTo() {
		return t;
	}
	
	public void setMessage(String m) {
		msg = m;
	}
	
	public void setFrom(String f) {
		this.f = f;
	}
	
	public void setTo(String t) {
		this.t = t;
	}
	
	public String toString() {
		return "To: " + t + "\nFrom: " + f + "\nMessage: " + msg;
	}
}
