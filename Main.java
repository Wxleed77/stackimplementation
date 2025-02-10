import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		  Scanner scanner = new Scanner(System.in);	        
//	        System.out.print("Enter the size of the stack: ");
//	        int size = scanner.nextInt();
//	        Stack stack = new Stack(size); //waleed zahid
//	        boolean exit = false;
//	        while (!exit) {
//	            System.out.println("Choose  operation:");
//	            System.out.println("1. Push element");
//	            System.out.println("2. Pop element");
//	            System.out.println("3. Display stack");
//	            System.out.println("4. Exit");
//	            System.out.print("Enter your choice: ");
//	            int choice = scanner.nextInt();
//	            switch (choice) {
//	                case 1:
//	                	for (int i=1;i<=5;i++) {
//	                    System.out.print("Enter the element to push: ");
//	                    int item = scanner.nextInt();
//	                    stack.push(item);
//	                	}
//	                    break;
//	                case 2:
//	                    stack.pop();
//	                    break;
//	                case 3:
//	                    stack.display();
//	                    break;
//	                case 4:
//	                    exit = true;
//	                    break;
//	                default:
//	                    System.out.println("Invalid choice! Please choose again.");
//	                    break;
//	            }
//	        }
		//Stack color=new Stack(4);
		Stack obj=new Stack(4);
//		color.push("yellow");
//		color.push("Green"); //waleed zahid
//		color.push("blue");
//		color.push("red");
//		color.displayString();
//		color.pop();
//		color.displayString();
		obj.push();
		obj.push();
		obj.push();
		obj.push(); //waleed zahid
		obj.display();
		obj.pop();
		obj.pop();
		obj.display();
		
	    }
}
