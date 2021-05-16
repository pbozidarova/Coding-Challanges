package hackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day24 {
    public static Node24 removeDuplicates(Node24 head) {
        if (head == null || head.next == null){
            return head;
        }
        if (head.data == head.next.data){
            head.next = head.next.next;
            removeDuplicates(head);
        }else{
            removeDuplicates(head.next);
        }
        return head;
    }

    public static  Node24 insert(Node24 head,int data)
    {
        Node24 p=new Node24(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node24 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node24 head)
    {
        Node24 start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node24 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }

}

class Node24{
    int data;
    Node24 next;
    Node24(int d){
        data=d;
        next=null;
    }

}