package UnionFindSet;

import java.util.ArrayList;
import java.util.List;

public class UnionFind {

    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        Node node1 = new Node("A");
        nodes.add(node1);
        Node node2 =  new Node("B");
        nodes.add(node2);
        Node node3 = new Node("C");
        nodes.add(node3);
        Node node4 = new Node("D");
        nodes.add(node4);
        Node node5 = new Node("E");
        nodes.add(node5);
        Node node6 = new Node("F");
        nodes.add(node6);
        union(node1, node2);
        union(node2, node3);
        union(node4, node5);
        union(node5, node6);
        union(node6,node2);
        if (findRoot(node1) == findRoot(node6)) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        for (int i = 0; i < nodes.size(); i++) {
            System.out.println(nodes.get(i));
        }

    }

    public static  void union(Node a, Node b) {
        Node x = findRoot(a);
        Node y = findRoot(b);
//        x.parent = y;
        if (x.high > y.high) {
            y.parent = x;
        } else if (x.high < y.high) {
            x.parent = y;
        } else {
            y.parent = x;
            x.high ++;
        }
    }

    public static Node findRoot(Node node) {
        if (node.parent == node) {
            return node;
        } else {
            return findRoot(node.parent);
        }
    }

    static class Node{
        Node parent;
        String name;
        int high;

        public Node(String name) {
            this.parent = this;
            this.name = name;
            this.high = 1;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append(this.name+"("+this.high+")");
            if (this.parent != this) {
                result.append("->");
                result.append(this.parent.toString());
            }
            return result.toString();
        }
    }
}
