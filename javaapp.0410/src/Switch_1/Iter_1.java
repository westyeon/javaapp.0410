package Switch_1;

public class Iter_1 {

	public static void main(String[] args) {
		/*System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");*/
		
		
		
		
		/*
		//출발점
		int idx = 0;
		while(idx < 3) {
			System.out.println("Java");
			//중간에 수행할 내용 
			idx = idx + 1;
		}//while
		System.out.println(idx);*/
		
		
		int img = 0;
		/*
		while(img <5) {
			
			System.out.println("image" + (img) +".png");
			img = img + 1;
		}*/
		
		
		//image1.png, image2.png, image3.png, image4.png,image1.png, image2.png, image3.png, image4.png를 순서대로 출력하도록 작성
		/*while(img <8) {
			System.out.println("image" + (img%4+1) +".png");
			img = img +1;
			
		}*/
		
		/*
		//image1.png, image2.png, image3.png
		//를 번갈아 가면서 3번씩 출력
		int idx = 0;
		while(idx<9) {
			System.out.println("image" + (idx%3+1) +".png");//우선순위때문에 원하는 대로 안될 수도 있으니까 먼저 하려는게 있으면 꼭 ()해주기
			idx = idx + 1;
		}*/
		
		
		//3.image1.png , image3.png, image5.png를 번갈아 가면서 4번출력
		/*
		int idx = 0;
		while(idx<12) {
			System.out.println("image" + (idx%3*2+1) + ".png");
			idx = idx + 1;
		}*/
		
		
		//4.image3.png , image2.png, image1.png를 번갈아 가면서 4번출력
		int idx = 0;
		
		while(idx<12) {
			System.out.println("image" + (4-(idx%3*+1)) + ".png");
			idx = idx + 1;
		}
		
		
		
		
		
		
		
	}

}
