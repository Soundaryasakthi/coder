#import java.util.*;
class Linkedlist{
static Node head;
int data;
Node next;
Node(int d){
data=d;
next=null;
}
}
Node reverse (Node node){
Node prev=null;
Node current=node;
Node next=null;
while(current!=null){
next=current.next;
current.next=prev;
prev=current;
current=next;
}
node=prev;
return node;
}
void printList(Node node){
while(node!=null){
System.out.print(node.data+" ");
node=node.next;
}
}
public static void main(String[] args){
LinkedList list=new LinkedList();
List.head=new Node(60
list.head.next=new Nodes(10);
list.head.next.next=new Node(20);
list.head.next.next.next=new Node(100;
System.out.println("list");
list.printlist(head);
head=list.reverse(head);
System.out.println("");
System.out.println(:Reverse list");
list.printList(head);
}
}
