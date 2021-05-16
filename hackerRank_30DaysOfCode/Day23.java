package hackerRank_30DaysOfCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23 {

    static void levelOrder(Node23 root){
        Queue<Node23> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            Node23 current = queue.remove();
            System.out.print(current.data+" ");
            if (current.left!=null) queue.add(current.left);
            if (current.right!=null) queue.add(current.right);
        }
    }
    public static Node23 insert(Node23 root,int data){
        if(root==null){
            return new Node23(data);
        }
        else{
            Node23 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node23 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}

class Node23{
    Node23 left,right;
    int data;
    Node23(int data){
        this.data=data;
        left=right=null;
    }
}

