package main;

import java.io.IOException;
import java.util.Arrays;
import dataStructure.*;
import sort.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jmach
 */
public class Main
{

    public static void main(String[] args) throws IOException
    {
        InsertionSort insertion = new InsertionSort();
        SelectionSort selection = new SelectionSort();
        MergeSort merge = new MergeSort();
        StopWatch timer = new StopWatch();
        
        String[] shortWordArr = Reader.toStringArray("shakespearetext.txt", "[^A-Za-z]");
        String[] shortWordArr2 = Reader.toStringArray("shakespearetext.txt", "[^A-Za-z]");
        String[] longWordArr = Reader.toStringArray("shakespearetext 2.txt", "[^A-Za-z]");
//        System.out.println(Arrays.toString(longWordArr));
//        
//        timer.stopWatch();
//        System.out.println("selection"+Arrays.toString(selection.selection(shortWordArr)));
//        System.out.println("Elapsed time: " + timer.elapsedTime());
//        
//        timer.stopWatch();
//        System.out.println("insertion"+Arrays.toString(insertion.insertion(shortWordArr2)));
//        System.out.println("Elapsed time: " + timer.elapsedTime());
//        
//        timer.stopWatch();
//        System.out.println("merge"+Arrays.toString(merge.mergeSorting(longWordArr)));
//        System.out.println("Elapsed time: " + timer.elapsedTime());
        
//        LinkedSymbolTable<String, Integer> st = new LinkedSymbolTable<>();
//        for (int i = 0; i < shortWordArr.length; i++)
//        {
//            st.put(shortWordArr[i]);
//        }
//             
//        
//        
//        st.print();
        String[] arr = {"the", "bow", "the"};
        ArraySymbolTable<String, Integer> ast = new ArraySymbolTable<>();
        
        for (int i = 0; i < shortWordArr.length; i++) {
            ast.put(shortWordArr[i]);
        }
        
        System.out.println(ast.print());
        System.out.println("size " + ast.size());
        
    }
}
