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
public class RedBlackBST<Key extends Comparable<Key>, Value> {

    private static boolean RED = true;
    private static boolean BLACK = false;

    private Node root;

    private class Node {

        Key key;
        Integer value;
        Node left, right;
        int numbOfN;
        boolean color;

        Node(Key key, Integer val, int numbOfN, boolean color) {
            this.key = key;
            this.value = val;
            this.numbOfN = numbOfN;
            this.color = color;
        }

    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.numbOfN;
        }
    }

    private boolean isRed(Node x) {
        if (x == null) {
            return false;
        } else {
            return x.color == RED;
        }
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        x.numbOfN = h.numbOfN;
        h.numbOfN = 1 + size(h.left) + size(h.right);

        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        x.numbOfN = h.numbOfN;
        h.numbOfN = 1 + size(h.left) + size(h.right);

        return x;
    }

    private void flipColors(Node h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    public void put(Key key) {

    }

    private Node put(Node h, Key key, Integer val) {
        if (h == null) // Do standard insert, with red link to parent.
        {
            return new Node(key, val, 1, RED);
        }
        int cmp = key.compareTo(h.key);
        if (cmp < 0) {
            h.left = put(h.left, key, val);
        } else if (cmp > 0) {
            h.right = put(h.right, key, val);
        } else {
            h.value = val;
        }
        if (isRed(h.right) && !isRed(h.left)) {
            h = rotateLeft(h);
        }
        if (isRed(h.left) && isRed(h.left.left)) {
            h = rotateRight(h);
        }
        if (isRed(h.left) && isRed(h.right)) {
            flipColors(h);
        }
        h.numbOfN = size(h.left) + size(h.right) + 1;
        return h;
    }

}
