import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	 Scanner in=new Scanner(System.in);
      int option=in.nextInt();
      switch(option)
      {
        case 1:
          System.out.println("One");
          break;
        case 2:
          System.out.println("Two");
          break;
        case 3:
          System.out.println("Three");
          break;
        case 4:
          System.out.println("Four");
          break;
        case 5:
          System.out.println("Five");
          break;
        default:
          System.out.println("Invalid");
          break;
      }
                             
                             
	}
}