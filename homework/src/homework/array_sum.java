package homework;

public class array_sum {

	public static void main(String[] args) {

		/*
		���� �迭�� ���� �հ� ���� ���� ����Ͻÿ�.
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
			System.out.printf("%d�� ���� �հ� : %d\n",i,rowSum);
			System.out.printf("%d�� ���� �հ� : %d\n",i,colSum);
		}

	}

}
