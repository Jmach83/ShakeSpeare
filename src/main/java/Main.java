
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
        
        String[] wordArr = Reader.toStringArray("shakespearetext.txt", "[^A-Za-z]");
        System.out.println(Arrays.toString(wordArr));    
        //System.out.println(Arrays.toString(sort.insertionSort(wordArr)));
        System.out.println(Arrays.toString(sort.mergeSort(wordArr)));
    }
}
