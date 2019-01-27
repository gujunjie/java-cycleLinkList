package project04;



public class LoopNode {
	//ѭ������
	
	private int data;
	private LoopNode nextNode=this;
	
	public LoopNode(int data)
	{
		this.data=data;
	}
	
	public void append(LoopNode node)
	{
		this.nextNode=node;
	}
	
	
	//������һ���ڵ�
	public LoopNode next()
	{
		return this.nextNode;
	}
	
	
	
	
	public int getData()
	{
		return data;
	}
	
	
	
	//ɾ����ǰ�ڵ����һ���ڵ�
	public void removeNextNode()
	{
		this.nextNode=this.next().next();
	}
	
	//����ڵ�(�����м����)
	public void insert(LoopNode node)
	{
		node.nextNode=this.next();
		this.nextNode=node;
	
	}

}
