package homework;

public class num {

	public static void main(String[] args) {
		//���� ������ 5���� �����ϴ� �迭�� �����ϰ� �迭�� �����͸� ���ٷ� ���� ���
		//�� ���� �������� �հ踦 ���ؼ� ���
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
