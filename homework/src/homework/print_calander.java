package homework;

import java.util.Scanner;

public class print_calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 �⵵�� ���� �Է¹޾Ƽ� �޷��� ���
		 ex) �⵵ : 2019 / �� : 2 �� �Է��ϸ� �޷� ����� ��������
		 */
		//�Է��� �⵵ ���������� ��¥�� �� / �Է��� �� ���������� ��¥���� �� ���ϰ� %7�� �̿��ؼ� 1���� ������ ���ؾ� ��.
		//������ ���� : 4�� ���&&100�� ����� X  || 400�� ���
		Scanner sc = new Scanner(System.in);
		System.out.printf("�⵵�� �Է��ϼ��� \n");
		int year=sc.nextInt();
		System.out.printf("���� �Է��ϼ��� \n");
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
