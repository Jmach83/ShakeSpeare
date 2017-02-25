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
public class InsertionSort
{
       public String[] insertion(String[] arr)
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
}
