/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

/**
 *
 * @author Jmach
 */
public class LinkedSymbolTable<Key, Value>
{

    private Node first; //first Node in the linked list

    private class Node
    {

        private Key key;
        private Integer value;
        private Node next;

        public Node(Key key, Integer value, Node next)
        {
            //contructor til node
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString()
        {
            return "Node{" + "key=" + key + ", value=" + value + '}';
        }

    }

    public void put(Key key)
    {
        //for loop gennem lister, hvis key findes overskriv med ny val, 
        //ellers lav ny node som den første i listen

        for (Node x = first; x != null; x = x.next)
        {

            if (key.equals(x.key))
            {
                x.value++;
                return;

            }
        }
        first = new Node(key, 1, first);

    }

    public Integer get(Key key)
    {
        //retunere key value hvis der er et match og ellers null
        for (Node x = first; x != null; x = x.next)
        {
            if (key.equals(x.key))
            {
                return x.value;
            }

        }
        return null;
    }

    public void print()
    {

        for (Node x = first; x != null; x = x.next)
        {
            System.out.println(x.toString());
        }
    }

}
