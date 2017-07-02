
public class Task {
	
	private String name;
	private Status status;
	

	
	public Task(String name) {
		this.name = name;
		this.status = Status.UNITIATED;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatus() {
		return status;
	}

	public void ongoing() {
		status = Status.ONGIONG;
	}
	
	public void done() {
		status = Status.DONE;
	}
	
	@Override
	public String toString() {
		return name + " " + status;
	}
	
	
}
