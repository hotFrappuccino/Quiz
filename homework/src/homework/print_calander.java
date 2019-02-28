package homework;

import java.util.Scanner;

public class print_calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 년도와 월을 입력받아서 달력을 출력
		 ex) 년도 : 2019 / 월 : 2 를 입력하면 달력 모양이 나오도록
		 */
		//입력한 년도 이전까지의 날짜의 합 / 입력한 월 이전까지의 날짜의합 을 구하고 %7을 이용해서 1일의 요일을 구해야 함.
		//윤년의 조건 : 4의 배수&&100의 배수는 X  || 400의 배수
		Scanner sc = new Scanner(System.in);
		System.out.printf("년도를 입력하세요 \n");
		int year=sc.nextInt();
		System.out.printf("월을 입력하세요 \n");
		int month=sc.nextInt();
		
		int ydays=0;
		for(int i=1;i<year;i=i+1) {
			if(i%4==0&&i%100!=0 || i%40==0) {
				ydays=ydays+366;
			}else {
				ydays=ydays+365;
			}
		}
		System.out.printf("%d\n", ydays);
		int mdays=0;
		for(int i=1;i<month;i=i+1) {
			if(i==2) {
				mdays=mdays+28;
			}else if(i==4||i==6||i==9||i==11) {
				mdays=mdays+30;
			}else {
				mdays=mdays+31;				
			}
		}
		System.out.printf("%d\n", mdays);
		
		int days = ydays+mdays;
		System.out.printf("%d\n", days);
		
		System.out.printf("%d\n", days%7);
		
	}

}
