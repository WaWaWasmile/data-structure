package com.structure.design;

public class BinaryTree {

    private TreeNode root = null;

    public BinaryTree(){
        root = new TreeNode(1,"A");
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public class TreeNode{
        private int key = 0;
        private String data = null;
        private TreeNode leftChile = null;
        private TreeNode rightChile = null;

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public TreeNode getLeftChile() {
            return leftChile;
        }

        public void setLeftChile(TreeNode leftChile) {
            this.leftChile = leftChile;
        }

        public TreeNode getRightChile() {
            return rightChile;
        }

        public void setRightChile(TreeNode rightChile) {
            this.rightChile = rightChile;
        }

        public TreeNode(int key, String data){
            this.key = key;
            this.data = data;
            this.leftChile = null;
            this.rightChile = null;
        }
    }

    public void createTreeNode(){
        TreeNode nodeB = new TreeNode(2,"B");
        TreeNode nodeC = new TreeNode(3,"C");
        TreeNode nodeD = new TreeNode(4,"D");
        TreeNode nodeE = new TreeNode(5,"E");
        TreeNode nodeF = new TreeNode(6,"F");
        root.leftChile = nodeB;
        root.rightChile = nodeC;
        nodeB.leftChile = nodeD;
        nodeB.rightChile = nodeE;
        nodeC.leftChile = nodeF;
    }

    public void proOrder(TreeNode node,String d){
        if(node==null){
            return ;
        }else if(node.data == d){
            System.out.println(node.getKey()+":"+node.getData());
            return ;
        }else {
            proOrder(node.leftChile,d);
            proOrder(node.rightChile,d);
        }
    }
}

