package common;

//Stack using link list.
public class StackImp<TT> {
	
	/*public static void main(String[] args){
		
	}*/
	private class Node<T>{
		T data;
		Node<T> next;
		public Node(T data,Node<T> next){
			this.data= data;
			this.next= next;
		}
	}
	private Node<TT> Head;
	
	public boolean setHead(Node<TT> node){
		Head = node;	
		return true;
	}
	public Node<TT> getHead(){
		return this.Head;
	}
	
	public boolean push(TT data)  {
		
		if(Head == null){
			Node<TT> newhead = new Node<>(data,null); 
			this.Head = newhead;
			return true;
		}
		else{
			Node<TT> newNode = new Node<>(data,this.getHead());
			this.Head = newNode;
			return true;
		}
	}
	public boolean pop(){
		return false;
	}
}
