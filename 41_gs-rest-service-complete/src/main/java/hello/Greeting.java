package hello;

import java.util.Date;

public class Greeting {

    private final long id;
    private final String content;
    private final Date currentDate;
    private final NestedGreeting nestedGreeting;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.currentDate = new Date();
        this.nestedGreeting = new NestedGreeting("Hello, Nested!!!");
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	public Date getCurrentDate() {
		return currentDate;
	}

	public NestedGreeting getNestedGreeting() {
		return nestedGreeting;
	}
	
	
    
    
}
