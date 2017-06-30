
public class Task {
	
	private String name;
	private Status status;
	

	
	public Task(String name) {
		this.name = name;
		this.status = Status.Unitiated;
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



	public void taskStatusOngoing() {
		status = Status.Ongoing;
	}
	
	public void taskStatusDone() {
		status = Status.Done;
	}
	
	@Override
	public String toString() {
		return name + " " + status;
	}
	
	
}
