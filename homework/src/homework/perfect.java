package homework;

public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1���� 1000���� �������� ������ ���ؼ� ���
		������ : �ڱ� �ڽ��� ������ ���(������ �������¼�)�� ���� �ڱ� �ڽŰ� ���� ��
		*/
		int count = 0; // �������� ������ ������ ����
		int i; int j;
		for(i=1; i<=10000;i=i+1) {
			int sum =0;
			for(j=1;j<=i/2;j=j+1) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(sum==i) {
				System.out.printf("%d\n", i);
				count=count+1;
			}
		}
		System.out.printf("�������� ������ %d��\n", count);
	}
}
