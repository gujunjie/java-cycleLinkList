package project04;



public class LoopNode {
	//循环链表
	
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
	
	
	//返回下一个节点
	public LoopNode next()
	{
		return this.nextNode;
	}
	
	
	
	
	public int getData()
	{
		return data;
	}
	
	
	
	//删除当前节点的下一个节点
	public void removeNextNode()
	{
		this.nextNode=this.next().next();
	}
	
	//插入节点(仅限中间情况)
	public void insert(LoopNode node)
	{
		node.nextNode=this.next();
		this.nextNode=node;
	
	}

}
