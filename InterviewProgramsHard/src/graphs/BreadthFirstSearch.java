package graphs;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

import graphs.BasicGraphCreation.Edge;

public class BreadthFirstSearch {
	
	public static void BFS(ArrayList<Edge> graph[], boolean visited[], int start) {
		Queue<Integer> queue = null;
		queue = new ArrayDeque<>();
			
		queue.offer(start);
		visited[0] = true;
		while(!queue.isEmpty()) {
			//get adjacency list for first element of the queue
			int node = queue.poll();
			System.out.print(node + " ");
			
			for( int i=0; i<graph[node].size();i++) {
				int nextNode = graph[node].get(i).dest;
				if(visited[nextNode])
					continue;
				else
				{
					queue.offer(nextNode);
					visited[nextNode] = true;
				}
			}
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
				BFS(graph, visited, i);			
		}		
	}

}
