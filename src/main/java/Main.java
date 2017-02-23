
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
        StopWatch timer = new StopWatch();
        
        String[] shortWordArr = Reader.toStringArray("shakespearetext.txt", "[^A-Za-z]");
        String[] shortWordArr2 = Reader.toStringArray("shakespearetext.txt", "[^A-Za-z]");
        String[] longWordArr = Reader.toStringArray("shakespearetext 2.txt", "[^A-Za-z]");
        System.out.println(Arrays.toString(longWordArr));
        
        timer.stopWatch();
        System.out.println("selection"+Arrays.toString(sort.selectionSort(shortWordArr)));
        System.out.println("Elapsed time: " + timer.elapsedTime());
        
        timer.stopWatch();
        System.out.println("insertion"+Arrays.toString(sort.insertionSort(shortWordArr2)));
        System.out.println("Elapsed time: " + timer.elapsedTime());
        
        timer.stopWatch();
        System.out.println("merge"+Arrays.toString(sort.mergeSort(longWordArr)));
        System.out.println("Elapsed time: " + timer.elapsedTime());
    }
}
