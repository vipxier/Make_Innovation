package CrackInterview;

import utils.ArrayUtils;

public class RotateArrayNinetyDegree
{
    public static void rotateNinetyDegree(int[][] array)
    {
        int layer = array.length / 2;
        for (int i = 0; i < layer; i++)
        {
            rotateArray(array, i);
        }
    }

    private static void rotateArray(int[][] array, int layer)
    {
        System.out.println("Layer: " + layer);
        int temp = array[layer][layer];
        array[layer][layer] = array[layer][array.length - 1 - layer];
        array[layer][array.length - 1 - layer] = array[array.length - 1 - layer][array.length - 1
                - layer];
        array[array.length - 1 - layer][array.length - 1
                - layer] = array[array.length - 1 - layer][layer];
        array[array.length - 1 - layer][layer] = array[layer][layer];

        int[] tempArray = new int[array.length - 2 * layer];

        for (int i = layer + 1; i < array.length - 1 - layer; i++)
        {
            tempArray[i - layer - 1] = array[layer][i];
            array[layer][i] = array[i][array.length - 1 - layer];
        }
        // ArrayUtils.printDoubleDimentionArray(array);

        for (int i = layer + 1; i < array.length - 1 - layer; i++)
        {
            array[i][array.length - 1 - layer] = array[array.length - 1 - layer][array.length - 1
                    - i];
        }
        // ArrayUtils.printDoubleDimentionArray(array);

        for (int i = layer + 1; i < array.length - 1 - layer; i++)
        {
            array[array.length - 1 - layer][i] = array[i][layer];
        }
        // ArrayUtils.printDoubleDimentionArray(array);

        for (int i = layer + 1; i < array.length - 1 - layer; i++)
        {
            array[i][layer] = tempArray[i - layer - 1];
        }
        // ArrayUtils.printDoubleDimentionArray(array);
    }

    public static void main(String[] args)
    {
        int[][] array = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
        // ArrayUtils.printDoubleDimentionArray(array);
        // rotateNitttnetyDegree(array);
        // ArrayUtils.printDoubleDimentionArray(array);

        int[][] array1 = { { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3 },
                { 4, 4, 4, 4, 4 }, { 5, 5, 5, 5, 5 } };
        // ArrayUtils.printDoubleDimentionArray(array1);
        // rotateNinetyDegree(array1);
        // ArrayUtils.printDoubleDimentionArray(array1);

        int[][] array2 = { { 1, 1 }, { 2, 2 } };
        ArrayUtils.printDoubleDimentionArray(array2);
        rotateNinetyDegree(array2);
        ArrayUtils.printDoubleDimentionArray(array2);
    }
}
