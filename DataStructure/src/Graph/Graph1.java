package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Graph1 {
	private Map<Vertex, List<Vertex>> adjVertices;
	
	public void addVertex(String label)
	{
		adjVertices.putIfAbsent(new Vertex(label), new ArrayList<Vertex>());
	}
	
	public void removeVertex(String label)
	{
		Vertex v = new Vertex(label);
		adjVertices.values().stream().forEach(e -> e.remove(v));
		adjVertices.remove(new Vertex(label));
	}
	
	public void removeEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		adjVertices.get(v1).remove(v2);
		adjVertices.get(v2).remove(v1);
	}
}
