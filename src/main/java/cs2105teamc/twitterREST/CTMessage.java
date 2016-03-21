package cs2105teamc.twitterREST;

public class CTMessage {

	private final long msgid;
	private final String content;

	public CTMessage(long msgid, String content) {
		this.content = content;
		this.msgid = msgid;
	}
	
	public String getContent() {
		return content;
	}

	public long getMsgid() {
		return msgid;
	}
	
	
	
}
