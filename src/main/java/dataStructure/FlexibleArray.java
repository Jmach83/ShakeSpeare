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
public class FlexibleArray<T> {
    //Hvornår bruger man set(index, element)? 
    
    private T[] less;
    private T[] more;
    private int split;

    public void add(T element) {
        if (more == null) {
            more = (T[]) new Object[]{element};
        } else if (less == null) {
            less = more;
            more = (T[]) new Object[2];
            more[0] = less[0];
            more[1] = element;
            split = 1;
        } else if (split == less.length) {
            less = more;
            more = (T[]) new Object[2 * less.length];
            more[0] = less[0];
            more[less.length] = element;
            split = 1;
        } else {
            more[split] = less[split];
            more[split + less.length] = element;
            split++;
        }
    }

    public T get(int index) {
        if (less != null && split <= index && index < less.length) {
            return less[index];
        }
        if (index < less.length + split) {
            return more[index];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void set(int index, T element) {
        if (less != null && split <= index && index < less.length) {
            less[index] = element;
        } else if (index < less.length + split) {
            more[index] = element;
        } else {
            add(element);
        }
    }

    public int size() {
        if (more == null) {
            return 0;
        }
        if (less == null) {
            return 1;
        }
        return less.length + split;
    }

}
