import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TowSums
{
    public static boolean checkSum(int[] array, int sum)
    {
        if(array == null || array.length == 0)
        {
            System.out.println("Array Issue");
            return false;
        }
        Set<Integer> map = new HashSet<Integer>();
        
        for(int i = 0; i < array.length; i ++)
        {
            if(!map.contains(sum - array[i]))
            {
                map.add(sum- array[i]);
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args)
    {
        int[] array = {1,3,4,5,6,7,8,9};
        System.out.println(checkSum(array, 9));
    }
}
