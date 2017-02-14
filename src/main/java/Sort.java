
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
public class Sort
{

    public String[] selectionSort(String[] arr)
    {

        for (int i = 0; i < arr.length - 1; i++)
        {
            int min = i;

            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j].compareTo(arr[min]) < 0)
                {
                    min = j;
                }
            }
            if (min != i)
            {
                String temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;
    }

    public String[] insertionSort(String[] arr)
    {
        int holePosition;
        String valueToInsert;

        for (int i = 1; i < arr.length; i++)
        {
            valueToInsert = arr[i];
            holePosition = i;

            while (holePosition > 0 && arr[holePosition - 1].compareTo(valueToInsert) > 0)
            {
                arr[holePosition] = arr[holePosition - 1];
                holePosition = holePosition - 1;
            }

            arr[holePosition] = valueToInsert;
        }

        return arr;

    }

    public String[] quickSort(String[] arr)
    {
        return arr;
    }

    public String[] mergeSort(String[] arr)
    {

        if (arr.length >= 2)
        {
            String[] left = new String[arr.length / 2];
            String[] right = new String[arr.length - arr.length / 2];

            for (int i = 0; i < left.length; i++)
            {
                left[i] = arr[i];
            }
            for (int i = 0; i < right.length; i++)
            {
                right[i] = arr[i + arr.length / 2];
            }

            mergeSort(left);
            mergeSort(right);

            merge(arr, left, right);
        }
        return arr;
    }

    private static void merge(String[] result, String[] left, String[] right)
    {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++)
        {
            if (i2 >= right.length || (i1 < left.length
                    && left[i1].compareToIgnoreCase(right[i2]) < 0))
            {
                result[i] = left[i1];
                i1++;
            } else
            {
                result[i] = right[i2];
                i2++;
            }
        }
    }

}
