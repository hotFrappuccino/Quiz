package homework;

public class fibonacci {

	public static void main(String[] args) {
		
		/*
		i = 1; j=1;
		System.out.printf("�Ǻ���ġ ���� ���° �� :\n");
		int number=sc.nextInt();
		for (k=2;k<number;k=k+1) {
			if(k%2==1) {
				i=i+j;
			} else {
				j=j+i;
			}
		}
		if(k%2==0) {
			System.out.printf("�Ǻ���ġ���� %d��° ���� %d�Դϴ�.\n", number,i);
		} else {
			System.out.printf("�Ǻ���ġ���� %d��° ���� %d�Դϴ�.\n", number,j);
		}
		
		*/
		
		// 		n1�� n2�� 1�� �ΰ�, result�� n1+n2 �׸��� n1���� n2�� �ο�, result����n2�� �ο�. �װ� �ݺ�.
		
		int result=0;
		int n1 =1; int n2=1;
		for(int n=3;n<=11;n=n+1) {
			result = n1+n2;
			n1=n2;
			n2=result;
		}

		System.out.printf("�Ǻ���ġ ���� �� 11��° �� : %d\n", result);
	}

}
