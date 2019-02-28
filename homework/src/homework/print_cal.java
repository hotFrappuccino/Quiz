package homework;

import java.util.Scanner;

public class print_cal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("�⵵ : ");
		int year = sc.nextInt();
		System.out.printf("�� : ");
		int month = sc.nextInt();
		
		//�Է��� �⵵���� ������ ��¥ ���� �� ���ϱ�
		
		int cnt = 0;
		for(int i =1;i<year;i=i+1) {
			if(i%4==0 && i%100!=0 || i%400 ==0) {
				cnt=cnt+366;
			}else {
				cnt=cnt+365;
			}
		}
		//System.out.printf("%d\n", cnt%7);
		
		//�Է��� ������ ������ �� ���� �߰�
		//�� ���� �� ���� �迭�� �����صθ� �ݺ��� ��� ����// �̰� ����̳�. ���� ��������. ��¥ �� �����صα�. ����غ���.
		//�迭�� ���� �� ó������ �����͸� �����ϸ� �ݺ��� ����ϴ� ���� ������ ��찡 ����.
		//�׷��� ù��° �����ʹ� ������ �ι�°���� �����͸� �����ϴ� ���� ��.
		int [] nalsu = {0,31,28,31,30,31,30,31,31,30,31,30,31}; //_ar[n]�� n���� ������ ���� �°� �Ǿ� �˰��� © �� �ξ� ����.
		//�����̸� 2���� ������ 29���� ��.
		if(year%4==0 && year%100!=0 || year%400 ==0) {
			nalsu[2]=29;
		}
		
		for(int i=1;i<month;i=i+1) {
			cnt=cnt+nalsu[i];
		}
		//System.out.printf("%d\n", (cnt%7+1));
		//�迭�� ���� �߰�
		int k= cnt%7+1;
		int[]calendar = new int[42];
		for(int i=0;i<nalsu[month]; i=i+1) {
			calendar [k+i] = i+1;
		}
		
		System.out.printf("   ��    ��    ȭ    ��    ��    ��    �� \n");
		for(int i=0;i<calendar.length;i=i+1) {
			if(calendar[i]==0) {
				System.out.printf("   ");	//0�� ���� ���� ���
			}else {
				System.out.printf("%3d", calendar[i]);//0�϶��� �� ���
			}
			if(i%7==6) {
				System.out.printf("\n");
			}
		}
		
		sc.close();

	}

}
