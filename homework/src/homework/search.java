package homework;

public class search {

	public static void main(String[] args) {
		/*
		 AOPSOAOAJSHDKSAOAOAAJSKS
		     문자열에서 AOA가 있는 곳의 시작위치를 전부 출력
		
		 단, 겹치는 부분은 처음부분 하나만 출력
		 java에서 하는 경우 length()와 charAt(int)만 사용
		 */
		
		String A = "AOPSOAOAJSHDKSAOAOAAJSKS";
		int leng = A.length();
		for(int i=1;i<leng;i=i+1) {
			if(A.charAt(i-1)=='A' && A.charAt(i)=='O'&&A.charAt(i+1)=='A') {
				System.out.printf("%d\n",i);
				i=i+2;
			}
		}
	
		//하나의 패턴에서 부분패턴을 찾아내는 것을 염기서열분석이라고 합니다.
		
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
				
				if(flag==false) {	//모든 글자가 같은 경우
					System.out.printf("%d\n",i);
					//현재 패턴을 다음으로 넘기기 위해
					i=i+2;
				}
			}
		}
	}
}
