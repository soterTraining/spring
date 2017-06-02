package teach.hello;

public class Message {

    private String message;
	private String name;
    
    public Message(final String msg, final String name) {
    	this.message = msg;
    	this.name = name;
    }
    
    public int getMessageLength() {
    	return this.message.length();
    }
/*
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
*/
    @Override
    public String toString() {
        return message + " | " + name;
    }
}
