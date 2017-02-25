/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Jmach
 */
public class MergeSort
{
    public String[] mergeSorting(String[] arr)
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

            mergeSorting(left);
            mergeSorting(right);

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
