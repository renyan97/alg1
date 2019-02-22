package suanfa;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * ��������ʵ��ջ
 * ˼·����Ԫ��ѹ��һ���ǿն�����  �����Ϊ����ѹ�����2��
 * ��ջʱ�����ǿն��е�Ԫ�����γ��ӣ�����βԪ�أ�ѹ������һ���ն����С�Ȼ��ȡ�����Ӷ��ж�βԪ�ؼ�Ϊ��ջԪ��
 * ��ջʱ��ѹ��ǿն�����
 * 
 * offer()�������������Ԫ�������������ֱ�ӷ���false,����δ����ֱ�Ӳ��벢����true;
 * poll()����ȡ����ɾ����ͷ��Ԫ��,������Ϊ��,����null;
 * peek()����ֱ��ȡ����ͷ��Ԫ��,����ɾ��.
 * boolean empty()
 * 
 * BlockingQueue
 *   --ArrayBlockingQueue
 *   --LinkedBlockingQueue
 * */
public class TestQueue {
	static BlockingQueue<Integer> q1=new LinkedBlockingQueue();
	static BlockingQueue<Integer> q2=new LinkedBlockingQueue();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   TestQueue stack=new TestQueue();
	   stack.push(1);
	   stack.push(2);
	   stack.push(3);
	   System.out.println(stack.pop());
	   System.out.println(stack.pop());
	   System.out.println(stack.pop());
		
	}
	
	public static void push(int i)//���
	{
		if(q1.isEmpty())
		{
			q2.offer(i);
		}
		else
		{
			q1.offer(i);
		}
	}
	public static int pop()//����
	{
	     int j=-1;//�����βԪ��
		 if(q1.isEmpty())
		 {
			 while(true)
			 {
				 j=q2.poll(); 
				 if(q2.isEmpty())
				 {
					 break;
				 }
				 else
				 {
					 q1.offer(j);
				 } 
			 }
		 }
		 else
		 {
			 while(true)
			 {
	             j=q1.poll();
				 
				 if(q1.isEmpty())
				 {
					 break;
				 }
				 else
				 {
					 q2.offer(j);
				 } 
			 }
		 }
		 return j;
		
	}

}
