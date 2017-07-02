import java.util.ArrayList;
import java.util.Scanner;

public class ToDoProgram {

	TaskHandler tHandler = new TaskHandler();
	Scanner sc = new Scanner(System.in);

	ArrayList<Task> taskList = new ArrayList<>();

	public void Start() {

		Menu.menuPrint();
		
	exit: while(true) {

		String input =sc.next();
		input.toLowerCase();

		switch(input) {
		case "add": {
				tHandler.add();
				break;			
			}
			case "showList": {
				tHandler.showList();
				break;	
			}
			case "edit": {
				tHandler.edit();
				break;			
			}
			case "delete": {
				tHandler.delete();
				break;
			}
			case "exit": {
				tHandler.exit();
				break exit;			
			}
			default: {
				System.out.println("Unknown choice");
			}
		}
	}
	}	
}

	


	

