package hackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day22 {
    private static int getHeight(NodeDay22 root) {
        int heightLeft = 0;
        int heightRight = 0;

        if (root.left != null) {
            heightLeft = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            heightRight = getHeight(root.right) + 1;
        }

        return (Math.max(heightLeft, heightRight));
    }

    public static NodeDay22 insert(NodeDay22 root, int data) {
        if (root == null) {
            return new NodeDay22(data);
        } else {
            NodeDay22 cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        NodeDay22 root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);

    }
}

class NodeDay22{
    NodeDay22 left,right;
    int data;
    NodeDay22(int data){
        this.data=data;
        left=right=null;
    }
}