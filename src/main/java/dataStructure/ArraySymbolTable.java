/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

/**
 *
 * @author emmablomsterberg
 */
public class ArraySymbolTable<Key, Value> {

    private Key[] keys;
    private Integer[] values;
    private int n = 0;

    private int startSize = 2;

    public ArraySymbolTable() {
        keys = (Key[]) new Object[startSize];
        values = new Integer[startSize];
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private void resize(int size) {
        Key[] tempkey = (Key[]) new Object[size];
        Integer[] tempval = new Integer[size];

        for (int i = 0; i < n; i++) {
            tempkey[i] = keys[i];
        }

        for (int i = 0; i < n; i++) {
            tempval[i] = values[i];
        }

        keys = tempkey;
        values = tempval;
    }

    public void put(Key key) {

        for (int i = 0; i <= n; i++) {
            // System.out.println("i if");
            if (key.equals(keys[i])) {
                //    System.out.println("key " + key);
                values[i]++;
                return;
            }
        }
        if (n >= values.length) {

            resize(2 * n);
        }
        values[n] = 1;
        //  System.out.println("valu " + values[n]);
        keys[n] = key;
        //  System.out.println("keysn " + keys[n]);
        n++;
    }

    public String print() {
        String result = "";
        for (int i = 0; i < n; i++) {

            result += "Key: " + keys[i] + " Value: " + values[i] + " \n";
        }
        return result;
    }

}
