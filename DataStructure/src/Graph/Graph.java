package Graph;

import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class Graph {
	int v;
	LinkedList<Integer> adjListArray[];
	
	public Graph(int v) {
		this.v  =v;
		this.adjListArray = new LinkedList[v];
		
		for(int i = 0 ; i< v; i ++)
		{
			adjListArray[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination)
	{
		adjListArray[source].addFirst(destination);
		adjListArray[destination].addFirst(source);
	}
	
	public void printGraph()
	{
		for(int i = 0 ; i < adjListArray.length; i ++)
		{
			if(adjListArray[i].size() > 0)
			{
				System.out.println("Vertex " + i + " is connected to: ");
				
				for(int j = 0; j < adjListArray[i].size(); j ++)
				{
					System.out.print(adjListArray[i].get(j) + " ");
				}
				
				System.out.println();
			}
		}
	}
}
