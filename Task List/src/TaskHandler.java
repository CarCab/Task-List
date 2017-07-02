import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TaskHandler {
		
	Scanner sc = new Scanner(System.in);
	
	LinkedList<Task> taskList = new LinkedList<>();
	
	public void add() {
	
		System.out.println("Enter name of task to add");
		String name = sc.next();
		Task task = new Task(name);
		taskList.add(task);	
		System.out.println("Task added");		
	}
	
	public void showList() {
	
		System.out.println("Show alla tasks");
		Iterator<Task> it = taskList.iterator();
		
		while(it.hasNext()) {
			Task task = it.next();
			System.out.println(task);
		}
	}
	
	public void edit() {
		
		System.out.println("Enter name of task to edit");
		String name = sc.next();
		System.out.println("Enter ONGOING or DONE to change");
		String status = sc.next();

		//Loopa igenom listan, kontrollera om ett item har name.equals(itemName) is så fall ändra status till ny status;
		switch(status) {		
		case "ONGOING": {
				
		Iterator<Task> it = taskList.iterator();
				
		while(it.hasNext()) {
			Task task = it.next();
			if(task.getName().equalsIgnoreCase(name));
			task.ongoing();				
		}			
		}
		case "DONE": {
			
		Iterator<Task> it = taskList.iterator();
				
		while(it.hasNext()) {
			Task task = it.next();
			if(task.getName().equalsIgnoreCase(name));
			task.done();				
		}			
		}
		}
	}
	
	public void delete() {
        System.out.println("'Enter the task to delete it");
        System.out.println("Task deleted");		
	}
	
	public void exit() {
		System.out.println("Goodbye!");
		System.out.println("Exit to end");			
	}
}
