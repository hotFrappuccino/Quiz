package homework;

public class search {

	public static void main(String[] args) {
		/*
		 AOPSOAOAJSHDKSAOAOAAJSKS
		     ���ڿ����� AOA�� �ִ� ���� ������ġ�� ���� ���
		
		 ��, ��ġ�� �κ��� ó���κ� �ϳ��� ���
		 java���� �ϴ� ��� length()�� charAt(int)�� ���
		 */
		
		String A = "AOPSOAOAJSHDKSAOAOAAJSKS";
		int leng = A.length();
		for(int i=1;i<leng;i=i+1) {
			if(A.charAt(i-1)=='A' && A.charAt(i)=='O'&&A.charAt(i+1)=='A') {
				System.out.printf("%d\n",i);
				i=i+2;
			}
		}
	
		//�ϳ��� ���Ͽ��� �κ������� ã�Ƴ��� ���� ���⼭���м��̶�� �մϴ�.
		
		String str = "AOPSOAOAJSHDKSAOAOAAJSKS";
		String msg = "AOA";
		int size = str.length();
		for(int i=1;i<size-2;i=i+1) {
			char start = str.charAt(i);
			if(start==msg.charAt(0)) {
				boolean flag = false;
				for(int j=1;j<3;j=j+1) {
					if(str.charAt(i+j)!=msg.charAt(j)) {
						flag=true;
						break;
					}
				}
				
				if(flag==false) {	//��� ���ڰ� ���� ���
					System.out.printf("%d\n",i);
					//���� ������ �������� �ѱ�� ����
					i=i+2;
				}
			}
		}
	}
}
