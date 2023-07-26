package graphs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import graphs.BasicGraphCreation.Edge;
/*
 * 1-3 
  /  | \
 0   |  5-6
  \  | /
   2-4
 * 
 * */



public class AllPathsBetweenNodes {

	
	public static void modifiedDFS(ArrayList<Edge> graph[], String path, int current, boolean visited[], int target) {
		if(current==target) {
			System.out.println(path);
			return;
		}
		for( int i=0; i<graph[current].size();i++) {
			int nextNode = graph[current].get(i).dest;
			if(visited[nextNode]==false) {
				visited[current]=true;
				modifiedDFS(graph, path + " " + nextNode, nextNode, visited, target);
				visited[current] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
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
		modifiedDFS(graph, "0", 0, visited, 5);			
	}

}
