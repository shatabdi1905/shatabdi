package graphs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import graphs.BasicGraphCreation.Edge;

public class DepthFirstSearch {

	public static void DFS(ArrayList<Edge> graph[], int current, boolean visited[]) {
		System.out.print(current + " ");
		
		visited[current] = true;
		for( int i=0; i<graph[current].size();i++) {
			int nextNode = graph[current].get(i).dest;
			if(visited[nextNode]==false)
				DFS(graph, nextNode, visited);
		}
	}
	public static void main(String[] args) throws IOException{
		ArrayList<Edge> graph[];
		ArrayList<Edge> input = new ArrayList<>();
		BasicGraphCreation bcgObj = new BasicGraphCreation();
		int vertices = bcgObj.ConvertInputToEdgeList(input, "D:/workplace/eclipse/InterviewProgramsHard/src/graphs/graphEdges.txt");
		graph = new ArrayList[vertices];
		
		bcgObj.CreateGraph(graph);
		bcgObj.CreateAdjacencyList(graph, input);
		Integer node =null;
		bcgObj.PrintAdjacencyList(graph, node);
		boolean[] visited= new boolean[graph.length];
		Arrays.fill(visited, false);
		for(int i=0;i< vertices;i++) {	
			if(visited[i]==false)
				DFS(graph, i, visited);			
		}		
	}
}
