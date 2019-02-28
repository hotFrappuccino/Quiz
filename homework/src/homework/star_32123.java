package homework;

public class star_32123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 i				j		º¯È­
		 0		***		0-2 	3-i
		 1		**		0-1	
		 2		*		0-0
		 3		**		0-1 	i-1
		 4		***		0-2 
		 		 
		*/
		int i; int j;
		for(i=0;i<5;i=i+1) {
			if(i<=2) {
				for(j=0;j<3-i;j=j+1) {
					System.out.printf("*");
				}
			} else {
				for(j=0;j<i-1;j=j+1) {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}
		
	}

}
