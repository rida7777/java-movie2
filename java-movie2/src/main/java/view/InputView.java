package main.java.view;

import java.util.Scanner;

import main.java.utils.InputUtil;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputMovieId() {
        System.out.println("## 예약할 영화를 선택하세요.");
        return scanner.nextInt();
    }
    
    public static int inputTimeSchedule() {
    	System.out.println("## 예약할 시간표를 선택하세요. (첫번째 상영시간이 1번)");
    	return InputUtil.getInt();
    }
    
    public static int inputCustomerNumber() {
    	System.out.println("## 예약할 인원을 입력하세요.");
    	return InputUtil.getInt();
    }
    
    public static boolean checkExit() {
    	System.out.println("## 예약을 종료하고 결제를 하려면 1번, 추가 예약을 하시려면 2번을 입력하세요.");
    	return (InputUtil.getInt() != 1); 
    }
    
    public static int intputPoint() {
    	System.out.println("## 결제를 진행합니다.");
    	System.out.println("## 포인트 사용금액을 입력하세요.");
    	return InputUtil.getInt();
    }
    
    public static int getCreditOrCash() {
        System.out.println("신용카드는 1번 현금은 2번");
        return InputUtil.getInt();
    }
}