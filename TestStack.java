package suanfa;

import java.util.Stack;
/*
 * ����ջʵ�ֶ��� 
 * ˼·�����ʱ��������ѹ��stack1��
 *   ����ʱ ���ж�stack2�Ƿ�Ϊ��  Ϊ����stack1�����ݳ�ջѹ��stack2�� Ȼ��stack2ջ��Ԫ�س�ջ��
 * */
public class TestStack {
	  /*
	 * boolean empty()  ����������ջ�ǿյġ� 
E peek()  ���������ջ�Ķ����Ķ���û�дӶ�ջ��ɾ������ 
E pop()  ɾ�������ջ�Ķ����Ķ���,�����ظö����ֵ������ 
E push(E item)  ��һ����Ŀ����ջ�Ķ�����  
	 * */
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //��� 	
		    Pu(1);
	     	Pu(2);
	     	Pu(3);
	     	Pu(4);
	     	//����
	     	System.out.println(p());
	     	System.out.println(p());
	     	System.out.println(p());
	     	System.out.println(p());
		     
		     
		     
	}
	public static int p()//������
	{
		if(stack2.empty())//stack2Ϊ��  ��stack1 ��Ԫ��ѹ��stack2��
		{
			while(!stack1.empty())
			{
			stack2.push(stack1.pop());
		}
			return stack2.pop();
			}else
				return stack2.pop(); //stack2��Ϊ�� ֱ�ӳ�ջ
		
	}
	public static void Pu(int s)//�����
	{
		stack1.push(s);
	}


}
