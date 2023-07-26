package graphs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 1-3 
  /  | \
 0   |  5-6
  \  | /
   2-4
 * 
 * */
 
public class BasicGraphCreation {

	public static class Edge{
		int src;
		int dest;
		
		public Edge(int s, int d) {
			this.src = s;
			this.dest = d;	
		}
	}
	
	public void CreateGraph(ArrayList<Edge> graph[]) {
		
		for(int i=0;i< graph.length;i++)
			graph[i] = new ArrayList<Edge>();
		
	}
	public void CreateAdjacencyList(ArrayList<Edge> graph[], ArrayList<Edge> input) {
		for(int i=0;i< input.size();i++) {
			graph[input.get(i).src].add(input.get(i));
			graph[input.get(i).dest].add(new Edge(input.get(i).dest, input.get(i).src));
			
		}
	}
	
	public int ConvertInputToEdgeList(ArrayList<Edge> input, String inputFile) throws IOException{ 
		BufferedReader br = null;
		br = new BufferedReader(new FileReader(inputFile));
		String line= br.readLine();
		int vertices=0;
		if(line !=null)
			vertices = Integer.parseInt(line);
		
		while((line = br.readLine())!=null) {
			
			int src = Integer.parseInt(line.split(",")[0]);
			int dest = Integer.parseInt(line.split(",")[1]);
			input.add(new Edge(src, dest));
		}
	    try {
            if (br != null)
                br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return vertices;
	}

	public void PrintAdjacencyList(ArrayList<Edge> graph[], Integer node) {
		if(node==null) {
			for(int i=0;i< graph.length;i++)
			{
				System.out.print("Node " + i + ":");
				for(int j=0;j<graph[i].size();j++) {
					System.out.print("(" + graph[i].get(j).src + "," + graph[i].get(j).dest + ")");			
				}
				System.out.println();
			}
		}else {
			for(int i=0;i< graph[node].size();i++)
			{
				System.out.print("Node " + node + ":");
				System.out.println(graph[node].get(i).dest);				
			}
		}
	}

	
	public static void main(String args[]) throws IOException {
		ArrayList<Edge> graph[];
		BasicGraphCreation bgcObj = new BasicGraphCreation();
		ArrayList<Edge> input = new ArrayList<>();
		int vertices= bgcObj.ConvertInputToEdgeList(input, "D:/workplace/eclipse/InterviewProgramsHard/src/graphs/graphEdges.txt");
		graph = new ArrayList[vertices];
		bgcObj.CreateGraph(graph);
		bgcObj.CreateAdjacencyList(graph, input);
		Integer node =null;
		bgcObj.PrintAdjacencyList(graph, node);
		
	}
	
}
