package homework;

import java.util.PriorityQueue;
import java.util.Queue;

public class anagram {

	public static void main(String[] args) {
		/*
		 ���ڿ����� ������ ������ �����ؼ� ����� ���ڿ�
		 String anagram = "EROS";
		 String Ŭ������ charAt�� length���� �̿��ؼ� 1�ʸ���
		 EROS => ROSE => OSER => SERO => EROS �̷��� ��µǵ��� �غ���.
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
