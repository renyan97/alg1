package suanfa;
/*
 * ��������
 * 
 * ˼·�����������ڵ�p1 p2 p3 ÿ�ΰ�p2��next��Ϊp1 Ȼ��ͳһ�����  ֱ��p2Ϊ��  �����׽ڵ��next�ÿ�
 * 
 * */
class Node
{
	int val;
	Node next=null;
	Node(int val)
	{
		this.val=val;
	}
}
public class Linke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=null;//�ÿ�����ͷ
        head=init();    //��ʼ��һ��˳���������
        nixu(head);  //�������
        
	}
	public static void nixu(Node head)
	{
		Node p1=head;
		Node p2=p1.next;
		Node p3=p2.next;
		
		while(p2.next!=null)
		{
			p2.next=p1;
			p1=p2;
			p2=p3; 
			p3=p3.next;
		}
		p2.next=p1;
		p1=p2;
		head.next=null;
		head=p1;
		
		while(head!=null)
		{
			System.out.println(head.val);
			head=head.next;
		}
		
		
	}
	
	
	
	public static Node init()
	{
		Node head=new Node(0);
		Node t0=head;
		for(int i=1;i<10;i++)
		{
			Node t1=new Node(i);
			t0.next=t1;
			t0=t1;
		}
		t0=head;
		while(t0!=null)
		{
			System.out.println(t0.val);
			t0=t0.next;
		}
		return head;
	}
}
