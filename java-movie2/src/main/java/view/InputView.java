package main.java.view;

import java.util.Scanner;

import main.java.utils.InputUtil;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputMovieId() {
        System.out.println("## ������ ��ȭ�� �����ϼ���.");
        return scanner.nextInt();
    }
    
    public static int inputTimeSchedule() {
    	System.out.println("## ������ �ð�ǥ�� �����ϼ���. (ù��° �󿵽ð��� 1��)");
    	return InputUtil.getInt();
    }
    
    public static int inputCustomerNumber() {
    	System.out.println("## ������ �ο��� �Է��ϼ���.");
    	return InputUtil.getInt();
    }
    
    public static boolean checkExit() {
    	System.out.println("## ������ �����ϰ� ������ �Ϸ��� 1��, �߰� ������ �Ͻ÷��� 2���� �Է��ϼ���.");
    	return (InputUtil.getInt() != 1); 
    }
    
    public static int intputPoint() {
    	System.out.println("## ������ �����մϴ�.");
    	System.out.println("## ����Ʈ ���ݾ��� �Է��ϼ���.");
    	return InputUtil.getInt();
    }
    
    public static int getCreditOrCash() {
        System.out.println("�ſ�ī��� 1�� ������ 2��");
        return InputUtil.getInt();
    }
}