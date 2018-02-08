package hello;

import java.util.Date;

public class Greeting {

    private final long id;
    private final String content;
    private final Date fecha;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.fecha = new Date();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	public Date getFecha() {
		return fecha;
	}
    
    
}
