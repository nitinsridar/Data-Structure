package com.interview.programs.Trees;

//    More tree terminology:
//
//        The depth of a node is the number of edges from the root to the node.
//        The height of a node is the number of edges from the node to the deepest leaf.
//        The height of a tree is a height of the root.
//        A full binary tree.is a binary tree in which each node has exactly zero or two children.
//        A complete binary tree is a binary tree, which is completely filled, with the possible exception of the bottom level, which is filled from left to right.


//This is a Binary Tree ONLY

public class BinaryTree {

/* Class containing left and right child of current
node and key value*/
static class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}


    // Root of Binary Tree
    Node root;

    // Constructors
    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree(){
        root = null;
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();

        /*create root*/
        tree.root = new Node(1);

		/* following is the tree after above statement

			1
			/ \
		null null	 */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

		/* 2 and 3 become left and right children of 1
			1
			/ \
			2	 3
		/ \ / \
		null null null null */


        tree.root.left.left = new Node(4);
		/* 4 becomes left child of 2
					1
				/	 \
			2		 3
			/ \	 / \
			4 null null null
		/ \
		null null
		*/
    }
}

