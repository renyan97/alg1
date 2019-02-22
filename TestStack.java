package suanfa;

import java.util.Stack;
/*
 * 两个栈实现队列 
 * 思路：入队时，将数据压入stack1。
 *   出队时 先判断stack2是否为空  为空则将stack1的数据出栈压入stack2中 然后将stack2栈顶元素出栈。
 * */
public class TestStack {
	  /*
	 * boolean empty()  测试如果这个栈是空的。 
E peek()  看着这个堆栈的顶部的对象没有从堆栈中删除它。 
E pop()  删除这个堆栈的顶部的对象,并返回该对象的值函数。 
E push(E item)  把一个项目到堆栈的顶部。  
	 * */
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //入队 	
		    Pu(1);
	     	Pu(2);
	     	Pu(3);
	     	Pu(4);
	     	//出队
	     	System.out.println(p());
	     	System.out.println(p());
	     	System.out.println(p());
	     	System.out.println(p());
		     
		     
		     
	}
	public static int p()//出队列
	{
		if(stack2.empty())//stack2为空  将stack1 的元素压入stack2中
		{
			while(!stack1.empty())
			{
			stack2.push(stack1.pop());
		}
			return stack2.pop();
			}else
				return stack2.pop(); //stack2不为空 直接出栈
		
	}
	public static void Pu(int s)//入队列
	{
		stack1.push(s);
	}


}
