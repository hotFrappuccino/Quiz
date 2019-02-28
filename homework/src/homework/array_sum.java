package homework;

public class array_sum {

	public static void main(String[] args) {

		/*
		다음 배열의 가로 합과 세로 합을 출력하시오.
		int [][]ar={{10,20,30},{40,50,60},{70,80,90}}
		*/
		
		int[][]ar={{10,20,30},{40,50,60},{70,80,90}};

		for(int i=0;i<ar.length;i=i+1) {
			int rowSum=0;
			int colSum=0;
			for(int j=0;j<ar[0].length;j=j+1) {
				rowSum=rowSum+ar[i][j];
				colSum=colSum+ar[j][i];
			}
			System.out.printf("%d번 행의 합계 : %d\n",i,rowSum);
			System.out.printf("%d번 열의 합계 : %d\n",i,colSum);
		}

	}

}
