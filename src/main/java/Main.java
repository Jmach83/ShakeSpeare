
import java.io.IOException;
import java.util.Arrays;

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
        Sort sort = new Sort();
        
        String[] shortWordArr = Reader.toStringArray("shakespearetext.txt", "[^A-Za-z]");
        String[] longWordArr = Reader.toStringArray("shakespearetext 2.txt", "[^A-Za-z]");
        System.out.println(Arrays.toString(longWordArr));    
        System.out.println(Arrays.toString(sort.insertionSort(shortWordArr)));
        System.out.println(Arrays.toString(sort.mergeSort(longWordArr)));
    }
}
