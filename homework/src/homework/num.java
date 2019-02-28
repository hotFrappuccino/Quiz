package homework;

public class num {

	public static void main(String[] args) {
		//정수 데이터 5개를 저장하는 배열을 생성하고 배열의 데이터를 한줄로 전부 출력
		//위 정수 데이터의 합계를 구해서 출력
		int[]ar= {3,5,6,8,2};
		for(int temp : ar) {
			System.out.printf("%d", temp);
		}
		System.out.printf("\n");

		int sum = 0;
		int length = ar.length;
		for(int i=0; i<length;i=i+1) {
			sum=sum+ar[i];
		}
		System.out.printf("%d", sum);
	}

}
