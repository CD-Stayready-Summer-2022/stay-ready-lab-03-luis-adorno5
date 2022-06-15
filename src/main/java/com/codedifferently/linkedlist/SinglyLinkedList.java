package com.codedifferently.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList<T> implements Iterable<T> {

    private int numberOfElements;
    private Node<T> head;

    public SinglyLinkedList(Node<T> head){
        this.head = head;
        numberOfElements = 1;
    }

    public T get(int index) {
        int i = 0;
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException(index);
        if(!head.hasNext()) return head.getData();
        Node<T> current = head;
        T targetData = null;
        while(current != null){
            if(i == index) targetData = current.getData();
            current = current.getNext();
            i++;
        }
        return targetData;
    }

    public void add(T e){
        if(e == null) throw new NullPointerException();
        Node<T> newNode = new Node<>(e);
        if(head == null) head = newNode;
        Node<T> currentNode = head;
        while(currentNode.hasNext()) currentNode = currentNode.getNext();
        currentNode.setNext(newNode);
        numberOfElements++;
    }

    public Boolean remove(T e){
        if(size() == 0)  return false;
        if(head.getData().equals(e)){
            Node<T> expired = head;
            head = head.getNext();
            expired.setData(null);
            expired.setNext(null);
            expired = null;
            numberOfElements--;
            return true;
        }
        Node<T> previous = head;
        Node<T> currentNode = head;
        while(currentNode != null){
            if(currentNode.getData().equals(e)) {
                previous.setNext(currentNode.getNext());
                currentNode.setData(null);
                currentNode.setNext(null);
                currentNode = null;
                numberOfElements--;
                return true;
            }
            previous = currentNode;
            currentNode = currentNode.getNext();
        }
        throw new NoSuchElementException();
    }

    public Integer size(){
        return numberOfElements;
    }

    @Override
    public Iterator<T> iterator() {
        return new SinglyLinkedListIterator<T>(head);
    }

    private class SinglyLinkedListIterator<T> implements Iterator<T> {
        private Node<T> currentNode;

        public SinglyLinkedListIterator(Node<T> head) {
            this.currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            T element;
            if(currentNode == head){
                element = currentNode.getData();
                currentNode = currentNode.getNext();
                return element;
            }
            else if(currentNode != null){
                element = currentNode.getData();
                currentNode = currentNode.getNext();
                return element;
            }
            throw new NoSuchElementException();
        }
    }
}
