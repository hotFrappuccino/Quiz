package homework;

public class num_triangle {

	public static void main(String[] args) {
		/*
		 6.
		 	0	   1		0
		 	1	  2 3		1
		 	2	 4   5		3
		 	3	6789012
		 */
		int i; int j; int k;
		j=1;
		int line=4;
		for(i=0;i<line;i=i+1) {
			if (i<line-1) {
				for(k=0;k<line*2-1;k=k+1) {
					if(line-1-k==i||k-line+1==i) {
						System.out.printf("%d",j++%10);
					} else {
						System.out.printf(" ");
					}
				}
			}else {
				for(k=0;k<line*2-1;k=k+1) {
					System.out.printf("%d",j++%10);
				}
			}
			System.out.printf("\n");
		}	
	
	}

}
//���� �޺κ� ������� ������ ������ ����. �տ� ����, �׸��� �۾�. �̷��Ը� �����ص� ��. ��������?
