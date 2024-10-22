package ch07.sec02;

public class SmartPhone extends Phone{ //extend 상속 받아야지 밑의 내용을 쓸 수 있음

    public boolean wifi = true;
    public SmartPhone(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
