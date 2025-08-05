package exam01;

class Apple{}

public class BoxEx {
	
	public void main(String[] args) {
		
		Box box = new Box();
		box.set("홍길동"); 	// 자동 타입 변환
		String name = (String) box.get();	// 강제 타입 변환
		System.out.println(name);
		
		Box box2 = new Box();
		box2.set("홍길동"); 	// 자동 타입 변환
		Apple apple = (Apple) box2.get();	// 강제 타입 변환
	}

}
