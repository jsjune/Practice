package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        String string;
        System.out.print("숫자 입력 : ");
        number = scanner.nextInt();

        System.out.println("문자열 입력 : ");
        string = scanner.next();
        scanner.close();

        System.out.println("숫자입력 결과 : " + number);
        System.out.println("문자열입력 결과 : " + string);
    }
}