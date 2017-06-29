
public class Task {
	
	private String name;
	private Status status;
	

	
	public Task(String name) {
		this.name = name;
		
		status = Status.Unitiated;
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



	public void taskOngoingStatus() {
		status = Status.Ongoing;
	}
	
	public void taskDoneStatus() {
		status = Status.Done;
	}
	
	
	
	
}
