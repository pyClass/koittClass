package day14;

import java.util.*;

/*
	����]
		�÷����� �Լ��� �Ű������� ����
		E, V, K ��� ǥ���� �͵��� ���̴µ�
		�̰͵��� ���Ŀ� ��� ���ʸ����� �����̴�.
		�̷��͵��� Object�� �ǹ��ϰ� 
		Object��� �����ϸ� �ǰڴ�.
------------------------------------------------------------------------------------------

	ArrayList
		==> Vector �� �Ź���
			���� �迭�� ���·� �����͸� �����ϱ� ������
			Vector�� Ư¡�� �״�� ������ �ִ�.
			�ٸ�, �����忡�� ����ȭ ó���� �ڵ����� ���ش�.( ==> ����ȭ ó���� ������ ) 
			v 1.2 ���ʹ� ���ͺ��ٴ� ArrayList�� ��ȣ�ϴ� ������ �ִ�.
			
			����� ���� ���Ϳ� �����ϴ�.
			
		����]
			List �迭�� �ּ�(����)�� ����ϸ� 
			��ġ �����͸� ������ �������µ�
			�̰��� toString() �Լ��� �������̵� �� ���Ƽ� 
			toString()�Լ��� ����� ����� ������ ���� ���̴�.
			(������ ���븸 Ȯ���ϴ� �뵵�� ���̴�.)
			����� �����͸� ����ϴ� ������ �ƴϴ�.
		
 */

import java.util.*;

public class Test01 {

	public Test01() {
		ArrayList list = new ArrayList();
		list.add("�Ѹ�");
		list.add("�����");
		list.add("����");
		list.add("���浿");
		list.add("�Ѹ�");
		System.out.println(list);
	}

	public static void main(String[] args) {
		new Test01();
	}

}