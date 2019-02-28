package homework;

import java.util.PriorityQueue;
import java.util.Queue;

public class anagram {

	public static void main(String[] args) {
		/*
		 문자열에서 문자의 순서를 변경해서 만드는 문자열
		 String anagram = "EROS";
		 String 클래스의 charAt과 length만을 이용해서 1초마다
		 EROS => ROSE => OSER => SERO => EROS 이렇게 출력되도록 해보자.
		 */

		String anagram = new String("EROS");

		int le = anagram.length();
		for(int i=0;i<30;i=i+1) {
			int k = i%4;
			char []ar = {anagram.charAt(k), anagram.charAt(k+1), anagram.charAt(k+2), anagram.charAt(k+3)};
			for(char temp : ar) {
				System.out.printf("%c", temp);
			}
			System.out.printf("\n");
		}
				
	}

}
