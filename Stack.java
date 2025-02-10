import java.util.Scanner;

class Stack {
     int Size; 
     int[] stackArray;
   //  String[] stringArray;
     int top; 
    // int top1;
     Scanner in=new Scanner(System.in);
    public Stack(int size) {
        Size = size; //waleed zahid
        stackArray = new int[Size];
     //   stringArray = new String[Size];
       top = -1; 
      //  top1=-1;
    }
    public boolean isFull() {
        return (top == Size - 1); 
    } 
    public boolean isEmpty() {
        return (top == -1); 
    }
//    public boolean isEmpty1() {
//        return (top1 == -1); 
//    }
    public void push() {
    	System.out.println("Enter Element!");
    	int temp=in.nextInt();
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + temp);
        } else {
            stackArray[++top] = temp;          
            System.out.println("Pushed " + temp + " to stack");
        }
    }
//    public void push(String item) {
//        if (top1==Size-1) {
//            System.out.println("Stack Overflow! Cannot push " + item);
//        } else {
//            stringArray[++top1] = item;       
//            System.out.println("Pushed " + item + " to stack");
//        }
//    }
    public int pop() {
    	int item=0;
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1; 
        } else {
            item = stackArray[top];
            top--;
            System.out.println("Popped " + item + " from stack");     
        }
        return item;
    } 
//    public String pop() {
//    	System.out.println("Enter the candy you want!");
//    	String candy1=in.next();
//        if (isEmpty1()) {
//            System.out.println("Stack Underflow! Cannot pop");
//        } else {
//        	
//        	boolean check=false;
//        	int counter=0;
//           
//        	for (int i=0;i<top1;i++) {
//        		if(stringArray[i].equals(candy1)) {
//        			check=true;
//        			System.out.println("found "+stringArray[i]);
//                  break;
//        		}
//        		counter++;	
//        	}
//        	if (check) {
//        	System.out.println("position of "+candy1+" is "+(counter+1));
//        	for (int i=counter;i<top1;i++) {
//        		stringArray[i]=stringArray[i+1];
//        	}
//        	stringArray[top1]=null;
//        	top1--;
//        	} else {
//        		System.out.println("Could not found!");
//        	}
//        	
//        }
//		return candy1;
//    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }  
}
//    public void displayString() {
//        if (isEmpty1()) {
//            System.out.println("Stack is empty");
//        } else {
//            System.out.print("Stack elements: ");
//            for (int i = 0; i <= top1; i++) {
//                System.out.print(stringArray[i] + " ");
//            }
//            System.out.println();
//        }
//    }
//}


