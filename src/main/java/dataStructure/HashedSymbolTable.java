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
public class HashedSymbolTable<Key, Value> {

    private int kvPairs;
    private int tSize;
    private LinkedSymbolTable<Key, Value>[] st;
    
    public HashedSymbolTable() {
        this(997);
    }

    public HashedSymbolTable(int tSize) {
        this.tSize = tSize;
        st = (LinkedSymbolTable<Key, Value>[]) new LinkedSymbolTable[tSize];
        for (int i = 0; i < tSize; i++) {
            st[i] = new LinkedSymbolTable();
        }
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % tSize;
    }

    public Integer get(Key key) {
        return st[hash(key)].get(key);
    }

    public void put(Key key) {
        st[hash(key)].put(key);
    }
    
    public void print() {
        for (int i = 0; i < st.length; i++) {
           st[i].print();
        }
        
    }
    
}
