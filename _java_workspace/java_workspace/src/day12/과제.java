package day12;

public class 과제 {

	public static void main(String[] args) {
		/* tv의 채널은 0~10번까지 있음.
		 * tv채널은 순환
		 * Vol 0~20까지 있음. 0이되면 음소거라고 출력
		 * vol 0이하로 내려가지 않음. 20이상 올라가지 않음.
		 * 채널과 볼륨은 power가 on일때만 작동.
		 * */
		
		Tv t = new Tv();
		t.channelDown();
		t.powerOn();
		t.channelUp();
		t.ch = 20;
		t.channelUp();
		t.channelUp();
		t.channelUp();
		t.volDown();
		t.volDown();
		t.volUp();
		t.volUp();
		t.powerOff();
		t.volDown();
		t.volDown();
		t.volDown();
		t.powerOn();
		t.vol = 20;
		t.volUp();
		t.vol = 0;
		t.volDown();
		
	}
	
	

}


interface remocon{
	void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volUp();
	void volDown();
}

class Tv implements remocon{
	
	int ch;
	int vol;
	boolean power;
	@Override
	public void powerOn() {
		power = true;
		System.out.println("Tv가 켜졌습니다.");
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("Tv가 꺼졌습니다.");
	}

	@Override
	public void channelUp() {
		if(power) {
			if(ch<10) {
				ch++;
				}else {
				ch = 0;
				}
			System.out.println("현재채널 : " + ch);
		}else {
			System.out.println("Tv를 먼저 켜주세요.");
		}
	}

	@Override
	public void channelDown() {
		if(power) {
			if(ch > 0) {
				ch--;
			}else {
				ch = 20;
			}
			System.out.println("현재채널 : " +ch);
		}else {
			System.out.println("Tv를 먼저 켜주세요.");
		}
			
		}

	@Override
	public void volUp() {
		if(power) {
			if(vol<20) {
				vol++;	
				System.out.println("볼륨 : "+vol);

			}else {
				System.out.println("최대 볼륨 입니다.");
			}
		
		}else {
		System.out.println("Tv를 먼저 켜주세요.");
		}
	}

	@Override
	public void volDown() {
		if(power) {
			if(vol>0) {
				vol--;	
				System.out.println("볼륨 : "+vol);

			}else {
				System.out.println("음소거 상태입니다.");
			}
		}else {
			System.out.println("Tv를 먼저 켜주세요.");
		}
	
	}
	
	
}
