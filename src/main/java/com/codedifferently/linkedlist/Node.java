package com.codedifferently.linkedlist;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext(){
        return next;
    }

    public Node<T> setNext(Node<T> node){
        return this.next = node;
    }

    public Boolean hasNext(){
        return (next != null);
    }

}
