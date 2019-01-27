package project04;

public class Text {
	
   public static void main(String[] args) {
	  LoopNode node1=new LoopNode(1);
	  LoopNode node2=new LoopNode(2);
	  LoopNode node3=new LoopNode(3);
	  LoopNode node4=new LoopNode(4);
	   
	  node1.append(node2);
	  node2.append(node3);
	  node3.append(node1);
	  
	  System.out.print(node1.next().getData());
	  System.out.print(node2.next().getData());
	  System.out.print(node3.next().getData());
	  
	  System.out.println();
	  
	  node1.insert(node4);
	  
	  System.out.print(node1.next().getData());
	  System.out.print(node4.next().getData());
	  System.out.print(node2.next().getData());
	  System.out.print(node3.next().getData());
	 
}
   
}
