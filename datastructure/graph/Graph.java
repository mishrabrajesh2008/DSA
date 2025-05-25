package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

	private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

	public void printGraph() {
		System.out.println(adjList);
	}

	public boolean addVertex(String vertex) {

		if (adjList.get(vertex) == null) {
			adjList.put(vertex, new ArrayList<String>());
			return true;
		}
		return false;
	}

	public boolean addEdge(String vertex1, String vertex2) {

		if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
			adjList.get(vertex2).add(vertex1);
			adjList.get(vertex1).add(vertex2);
			return true;
		}
		return false;
	}

	public boolean removeEdge(String edge1, String edge2) {
		if (adjList.containsKey(edge2) && adjList.containsKey(edge1)) {
			adjList.get(edge1).remove(edge2);
			adjList.get(edge2).remove(edge1);
			return true;
		}
		return false;
	}

	public boolean removeVertex(String vertex) {
		if (adjList.get(vertex) == null)
			return false;
		for (String otherList : adjList.get(vertex)) {
			adjList.get(otherList).remove(vertex);
		}
		adjList.remove(vertex);
		return true;
	}
}
