package com.structure.design;


import org.junit.jupiter.api.Test;

public class BinaryTreeSearch {

    @Test
    public void binaryTree(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createTreeNode();
        binaryTree.proOrder(binaryTree.getRoot(),"F");
    }

}
