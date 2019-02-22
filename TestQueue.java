package suanfa;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * 两个队列实现栈
 * 思路：将元素压入一个非空队列中  如果都为空则压入队列2中
 * 出栈时：将非空队列的元素依次出队（出队尾元素）压入另外一个空队列中。然后取出出队队列队尾元素即为出栈元素
 * 入栈时：压入非空队列中
 * 
 * offer()方法往队列添加元素如果队列已满直接返回false,队列未满则直接插入并返回true;
 * poll()方法取出并删除队头的元素,当队列为空,返回null;
 * peek()方法直接取出队头的元素,并不删除.
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
	
	public static void push(int i)//入队
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
	public static int pop()//出队
	{
	     int j=-1;//保存队尾元素
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
