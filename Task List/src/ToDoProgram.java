import java.util.ArrayList;
import java.util.Scanner;

public class ToDoProgram {

	Scanner sc = new Scanner(System.in);

	ArrayList<Task> list = new ArrayList<>();

	public void Start() {

		Menu.menuPrint();
		
		exit: while(true) {

		String input =sc.next();


		switch(input) {
		
		case "exit": {
			System.out.println("Exit to end");


			break exit;			
		}

		case "add": {
			System.out.println("Enter name of task to add");
			String name = sc.next();
			list.add(new Task(name));

			break;			
		}
		case "showTaskList": {
			System.out.println("Show Task List");


			break;			
		}

		default: {

			System.out.println("Unknown choice");
		}

		}

	
		}
		}	


}

	


	

