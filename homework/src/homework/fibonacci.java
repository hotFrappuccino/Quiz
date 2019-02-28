package homework;

public class fibonacci {

	public static void main(String[] args) {
		
		/*
		i = 1; j=1;
		System.out.printf("피보나치 수열 몇번째 항 :\n");
		int number=sc.nextInt();
		for (k=2;k<number;k=k+1) {
			if(k%2==1) {
				i=i+j;
			} else {
				j=j+i;
			}
		}
		if(k%2==0) {
			System.out.printf("피보나치수열 %d번째 항은 %d입니다.\n", number,i);
		} else {
			System.out.printf("피보나치수열 %d번째 항은 %d입니다.\n", number,j);
		}
		
		*/
		
		// 		n1과 n2를 1로 두고, result는 n1+n2 그리고 n1에게 n2값 부여, result값을n2에 부여. 그걸 반복.
		
		int result=0;
		int n1 =1; int n2=1;
		for(int n=3;n<=11;n=n+1) {
			result = n1+n2;
			n1=n2;
			n2=result;
		}

		System.out.printf("피보나치 수열 의 11번째 항 : %d\n", result);
	}

}
