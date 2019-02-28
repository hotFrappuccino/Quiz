package homework;

public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1부터 1000까지 완전수의 개수를 구해서 출력
		완전수 : 자기 자신을 제외한 약수(나누어 떨어지는수)의 합이 자기 자신과 같은 수
		*/
		int count = 0; // 완전수의 개수를 저장할 변수
		int i; int j;
		for(i=1; i<=10000;i=i+1) {
			int sum =0;
			for(j=1;j<=i/2;j=j+1) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(sum==i) {
				System.out.printf("%d\n", i);
				count=count+1;
			}
		}
		System.out.printf("완전수의 개수는 %d개\n", count);
	}
}
