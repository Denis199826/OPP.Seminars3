package gb_collections.lists;

import gb_collections.GbList;
import gb_collections.lists.utill.ArrayIterator;

import java.util.Iterator;
import java.util.LinkedList;

public class GbLinkedList<E> implements GbList<E> {
    private int size;
    private Node<E> head;

    public GbLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void add(E value) {
        if (head == null)
            this.head = new Node<>(value);
        else {
            Node<E> current = head;
            while (current.next!= null){
                current = current.next;
            }
            current.next = new Node<>(value);
        }
        size++;
    }

    @Override
    public void addd(int index, E value) {
        if(head==null && index == 0){
            this.head = new Node<>(value);
        } else {
            int count = 0;
            Node<E> current = head;
            while (count != index) {
                count++;
                current = current.next;
            }
            current.value = value;
        }
        size++;
    }

    @Override
    public E get(int index) {
        int count = 0;
        Node<E> current = head;
        while (count!=index){
            current=current.next;
            count++;
        }
        return current.value;
    }

    @Override
    public void remove(E value) {
        if(head==null){
            return;
        }
        while (head!= null && head.value == value){
            head = head.next;
        }
        Node<E> current = head;
        Node<E> prev = null;
        while (current!=null){
            if(current.value == value){
                if(prev!=null){
                    prev.next=current.next;
                }
                current=current.next;
            }
            else {
                prev = current;
                current=current.next;
            }
        }

    }

    @Override
    public void removeByIndex(int index) {
        if (index==0){
            head = head.next;
            size--;
            return;
        }
        int count = 0;
        Node<E> prev = null;
        Node<E> current = head;
        while (count!=index){
            prev = current;
            current=current.next;
            count++;
        }
        prev.next=current.next;
        size--;


    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(toArray());
    }
    public E[] toArray(){
        int size = size();
        E[] result = null;
        try{
            result = (E[]) new Object[size];
        } catch (ClassCastException e){
            e.printStackTrace();
        }
        for (int i = 0; i<size; i++){
            result[i]=get(i);
        }
        return result;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            builder.append(current.value).append("    ");
            current = current.next;
        }
// builder.deleteCharAt(builder.length() - 2).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }

    private static class Node<E> {
        private E value;
        private Node<E> next;
        private Node<E> prev;

        public Node(E value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        public String toString() {
            return value.toString();
        }
    }
}

