package Graph;

import java.util.LinkedList;

public class Graph
{
    int v;
    LinkedList<Integer> listArray[];
    
    @SuppressWarnings("unchecked")
    public Graph(int v)
    {
        this.v = v;
        listArray = new LinkedList[v];
        
        for(int i  =0; i < v; i ++)
        {
            listArray[i] = new LinkedList<>();
        }
    }
}
