package Iter;

public class DoWhile {

	public static void main(String[] args) {
		// 프로그램에서 자기 자신의 데이터와 연산해서 다시 대입하기

		//int n = 20;
		//n= n + 20;
		// n의 데이터와 20을 더해서 n에 대입

		/*
		 * //연습)1부터 10까지의 합계
		 * 
		 * int idx = 1; int sum = 0; 
		 * do {
		 * 
		 * sum = sum + idx; 
		 * idx = idx + 1 ;
		 * 
		 * }while(idx < 11 );
		 * 
		 * System.out.println("합계:" + sum);
		 */

		// 연습2)배열의 데이터 합계를 구해서 출력하고 평균을 소수 2번째 자리에서 반올림 해서 소수 1번째 자리까지 출력
		/*
		int[] ar = { 30, 40, 20, 17, 76, 65 };
		// 30 -> ar[0] 40->ar[1] 20->ar[2] 17->ar[3] 76->ar[4] 65->ar[5]

		int idx = 0;
		int sum = 0;
		do {
			sum = sum + ar[idx];
			idx = idx + 1;

		} while (idx < 6);

		System.out.println("합계:" + sum);
		
		//평균 구하기 - 소수까지 나오도록 계산
		//나누는 수를 실수로 해서 소수가 나오도록 계산
		double avg = sum / 6.0; //6.0으로 안해주면 평균이 41.0으로 나오게 됨 double을 해도 
		System.out.println("평균:" + avg);
		
		//직접 반올림을 구하고자 할 때는 
		//반올림 할 자리를 소수 첫째 자리로 보내고 0.5를 더합니다.
		avg = avg * 10 + 0.5;
		//위 숫자를 정수로 변환해서 소수를 버립니다.
		avg = (int)avg;
		//원래 숫자 형태로 변환하기 위해서 소수 첫째 자리로 보내는 연산의 반대를 수행
		//반대 작업 수행
		avg = avg / 10;
		System.out.println("평균:" + avg);*/
		
		
		
		//idx [] ar = {700,600,500,430};
		//평균: 십의자리 반올림하기
		//답은 600 - 합계2230,평균 557
		
		/* 내가 한거
		int [] ar = {700,600,500,430};
		
		int idx = 0;
		int sum = 0;
		do {
			sum = sum + ar[idx];
			idx = idx + 1;
					
			
		}while(idx<4);
		
		System.out.println("합계:" + sum );
		
		double avg = sum / 4.0;
		
		avg = avg*100+0.5;
		avg = (int)avg;
		avg = avg /100 +0.5;
		
		System.out.println("평균:" + avg);*/
		
		
		
		
		//선생님
		//1.합계구하기
		int [] ar = {700,600,500,430};
		int sum = 0;
		
		//반복문에 사용할 인덱스 변수
		int idx = 0;
		
		//반복문 만들기 : 0~3까지 진행
		do {
			
			//ar의 데이터를 순서대로 sum에 추가
			sum = sum + ar[idx];
			idx = idx +1;
		}while(idx <4);
		System.out.println("합계:" + sum);
		
		//2.평균 구하기 - 합계 나누기 개수
		int avg = sum / 4;
		System.out.println("평균:" + avg);
		
		//3. 10의 자리 반올림
		//1)반올림 할 위치를 소수 첫째 자리로 이동
		
		//5.57
		double imsi = avg / 100.0;
		
		//2)0.5를 더해서 소수를 버림
		//6.0
		
		imsi = (int)(imsi + 0.5);
		
		//3)원래 자리로 되돌리는 연산을 수행
		avg = (int)imsi * 100;
		System.out.println("평균:" + avg);
		
		

	}

}
