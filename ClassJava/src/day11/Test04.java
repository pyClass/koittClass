package day11;

public class Test04 {
/*
	finally ����
		==>	���� �߻� ���ο� ������� �ݵ�� ����Ǿ�� �� 
			������ ������ ��� 
			�׷� ���๮���� ����ϴ� ����
			
		����]
			
			(1)
			try {
				(2)
				...
				(3)
			} catch(Exception e){
				(4)
			} finally {
				(5)
			}
			
				(6)
				
		�������]
			
			���ܹ߻��ϴ� ��� ]
				(1) -> (2) -> (4) -> (5) -> (6)
				
			���ܰ� �߻����� �ʴ� ���]
				(1) -> (2) -> (3) -> (5) -> (6)
				
		����]
			
			���� finally������ �����Ѵٸ� catch() ������ ���� ���� ���� �ִ�.
			
			
------------------------------------------------------------------------------------
	
	�������� ����ϱ�
		
		1. ��������Ŭ���� ������ ����ϸ� �ȴ�.
			���]
				System.out.println(����Ŭ��������);
				==> ������ ������ �ľ��� �� �� �ְ� �ȴ�.
				<== Throwable Ŭ������ toString()�� �ڵ� ȣ���Ѵ�.
				
		2. ����.printStactTrace()�� �̿��ϴ� ���
			==> ������ ���� + ���ܰ� �߻��ϰ� �� ��ġ�� 
				�� ��θ� �����ؼ� ������ش�.
	
	***
		����ó���� ���α׷��� �������� ���Ḧ ���ؼ� �Ѵٰ� ������
		
		������ ���忡���� ����ó����
		������ ������ �˾Ƴ���
		�� ���α׷��� �������� ��ġ�� �˷��༭ 
		�������� ���α׷��� ���������� �۵��� ��Ű�� 
		���� ����� �� �ִ� ����� ã�ƾ߰ڴ�.
 */
	public Test04() {
		try {
			int no = Integer.parseInt("�����ٶ�");
		} catch(Exception e) {
//			System.out.println(e);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}