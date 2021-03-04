import java.util.Scanner;

class Main {
  public static void main(String[] args) {


	
  
  Scanner stdIn = new Scanner(System.in);
	
	System.out.println("시험 평균을 구합니다.");
	
	System.out.print("x의 값 : ");
	int x = stdIn.nextInt();
	
	System.out.print("y의 값 : ");
	int y = stdIn.nextInt();

  System.out.print("z의 값 : ");
	int z = stdIn.nextInt();
	
	System.out.println("평균은" +  (x+y+z) /3 + "입니다" );
	


  }
}
