package homework;

import java.util.Scanner;

public class print_cal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("년도 : ");
		int year = sc.nextInt();
		System.out.printf("월 : ");
		int month = sc.nextInt();
		
		//입력한 년도까지 지나온 날짜 수를 다 더하기
		
		int cnt = 0;
		for(int i =1;i<year;i=i+1) {
			if(i%4==0 && i%100!=0 || i%400 ==0) {
				cnt=cnt+366;
			}else {
				cnt=cnt+365;
			}
		}
		//System.out.printf("%d\n", cnt%7);
		
		//입력한 월까지 지나온 날 수를 추가
		//각 월의 날 수를 배열에 저장해두면 반복문 사용 가능// 이거 대박이네. 전혀 생각못함. 진짜 꼭 생각해두기. 기억해보기.
		//배열을 만들 때 처음부터 데이터를 저장하면 반복문 사용하는 것이 불편한 경우가 있음.
		//그래서 첫번째 데이터는 버리고 두번째부터 데이터를 저장하는 것이 편리.
		int [] nalsu = {0,31,28,31,30,31,30,31,31,30,31,30,31}; //_ar[n]이 n월의 날수로 딱딱 맞게 되어 알고리즘 짤 때 훨씬 편리함.
		//윤년이면 2월의 날수가 29여야 함.
		if(year%4==0 && year%100!=0 || year%400 ==0) {
			nalsu[2]=29;
		}
		
		for(int i=1;i<month;i=i+1) {
			cnt=cnt+nalsu[i];
		}
		//System.out.printf("%d\n", (cnt%7+1));
		//배열에 일을 추가
		int k= cnt%7+1;
		int[]calendar = new int[42];
		for(int i=0;i<nalsu[month]; i=i+1) {
			calendar [k+i] = i+1;
		}
		
		System.out.printf("   일    월    화    수    목    금    토 \n");
		for(int i=0;i<calendar.length;i=i+1) {
			if(calendar[i]==0) {
				System.out.printf("   ");	//0일 때는 공백 출력
			}else {
				System.out.printf("%3d", calendar[i]);//0일때는 값 출력
			}
			if(i%7==6) {
				System.out.printf("\n");
			}
		}
		
		sc.close();

	}

}
