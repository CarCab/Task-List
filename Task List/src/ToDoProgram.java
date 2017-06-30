import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ToDoProgram {

	Scanner sc = new Scanner(System.in);

	ArrayList<Task> taskList = new ArrayList<>();

	public void Start() {

		Menu.menuPrint();
		
		exit: while(true) {

		String input =sc.next();
		input.toLowerCase();


		switch(input) {
		
	
			case "add": {
				System.out.println("Enter name of task to add");
				String name = sc.next();
				
				taskList.add(new Task(name));
				//Samma som
				//Task task = new Task(name);
				//taskList.add(task);	
				
				
				System.out.println("Task added");
				
				break;			
			}
			case "showList": {
				System.out.println("Show alla tasks");
				
				Iterator<Task> it = taskList.iterator();
				
				while(it.hasNext()) {
					Task task = it.next();
					System.out.println(task);
					
				}
				break;			
			}
			case "edit": {
				System.out.println("Enter name of task to edit");
				String name = sc.next();
				
				System.out.println("Enter Unitiated, Ongoing or Done");
				String status = sc.next();
				
				//	Switch case
				
								
				//	Loopa igenom listan, kontrollet om ett item har name.equals(itemName) is så fall ändra status till ny status;
				
				
				
				
				break;			
			}
			case "delete": {
				
		        System.out.println("'Enter the task to delete it");
		        System.out.println("Task deleted");
		        break;
			}
			
			case "exit": {
				System.out.println("Goodbye!");
				System.out.println("Exit to end");
				
				
				break exit;			
			}
	
			default: {
	
				System.out.println("Unknown choice");
			}
	
		}

	
	}
	}	


}

	


	

