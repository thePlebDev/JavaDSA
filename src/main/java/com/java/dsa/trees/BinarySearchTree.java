package com.java.dsa.trees;

public class BinarySearchTree<E> {

    //implement the NODE
    private static class Node<E>{
        private E element;
        private int key;
        private Node<E> leftChild;
        private Node<E> rightChild;
        public Node(int key,E element,Node<E> leftChild, Node<E> rightChild){
            this.element = element;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.key = key;
        }

        //GETTERS
        public E getElement(){
            return this.element;
        }
        public Node<E> getLeftChild(){
            return this.leftChild;
        }
        public Node<E> getRightChild(){
            return this.rightChild;
        }
        public int getKey(){
            return this.key;
        }

        //SETTERS
        public void setElement(E element){
            this.element = element;
        }
        public void setLeftChild(Node<E> leftChild){
            this.leftChild = leftChild;
        }
        public void setRightChild(Node<E> rightChild) {
            this.rightChild = rightChild;
        }
        public void setKey(int key){
            this.key = key;
        }
    }
/**################################ END OF NODE CLASS ##############################*/

    private Node<E> root = null;


    public void insert(int key,E element){
        Node<E> newNode = new Node<>(key,element,null,null);
        if(root == null){
            this.root = newNode;
        }else{
            insertNode(root,newNode);
        }
    }
    //to do add the comparators
    private void insertNode(Node<E> node, Node<E> newNode){
        if(newNode.getKey() < node.getKey()){
            if(node.getLeftChild() == null){
                node.setLeftChild(newNode);
            }else{
                insertNode(node.getLeftChild(),newNode);
            }
        }else{
            if(node.getRightChild() == null){
                node.setRightChild(newNode);
            }else{
                insertNode(node.getRightChild(),newNode);
            }
        }
    }


}
