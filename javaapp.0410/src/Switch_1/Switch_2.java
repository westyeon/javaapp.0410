package Switch_1;

public class Switch_2 {

	public static void main(String[] args) {
		
		/*
		//1이면 한식 2이면 중식
		//1
		//switch 이용해서 
		
		//프로그램을 읽기 좋게 하기 위해서 상수 선언
		final int KOREA = 1;
		final int CHINA = 2;
		final int JAPAN = 3;
		
		//키보드 입력 객체 만들기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("메뉴입력(1.한식2.중식3.일식):");
		int menu = sc.nextInt();
		
		//Switch를 이용한 처리
		switch(menu) {
		
		case KOREA :
			System.out.println("한식");
			break;
			
		case CHINA :
			System.out.println("중식");
			break;
		
			
		case JAPAN :
			System.out.println("일식");
			break;
		
		default :
			System.out.println("잘못된 메뉴");
			break;
		
		}//switch*/
		
		
		final String COFFEE = "1";
		final String ADE = "2";
		final String SMOOTHIE = "3";
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("category(1.커피 2.에이드 3.스무디):");
		String category = sc.nextLine();
		
		switch(category) {
		
		case COFFEE :
			System.out.println("아이스 아메리카노");
			System.out.println("바닐라 라떼");
			break;
			
		case ADE :
			System.out.println("레몬 에이드");
			System.out.println("체리 에이드");
			break;
			
		case SMOOTHIE :
			System.out.println("딸기 스무디");
			System.out.println("블루베리 스무디");
			break;
		
		default :
			System.out.println("없는 category입니다.");
			break;
		
		}//switch
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
