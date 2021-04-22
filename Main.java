import java.util.Scanner;

class Main {
  public static void main(String[] args) {


	
  
  Scanner stdIn = new Scanner(System.in);
	
	System.out.println("시험 평균을 구합니다.");
	
	System.out.print("총합점수 : ");
	int x = stdIn.nextInt();
	
	System.out.print("시험본 과목 개수 : ");
	int y = stdIn.nextInt();

	System.out.println("평균은" +  (x) /(y) + "입니다" );
	


  }
}
