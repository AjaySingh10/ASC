import java.util.*;

public class Ford_Fulkerson {
    static final int vertexCount = 6; 	//Number of vertices in graph is hardcoded
    //maps array index 0 to "s", & successive indexes to a string equivalent
    private String[] arrayIndexStringEquivalents;	//arrayIndexStringEquivalents[0]="S" & arrayIndexStringEquivalents[vertexCount-1]="T"

    public Ford_Fulkerson(String[] arrayIndexStringEquivalents){
        this.arrayIndexStringEquivalents=arrayIndexStringEquivalents;	//pass by reference, but don't care since main doesn't modify this
    }

    // Returns max flow from S to T in a graph
    public int maxFlow(int graph[][], int vertexS, int vertexT) {
        int maxFlow = 0;
        int parent[] = new int[vertexCount];	//holds parent of a vertex when a path if found (filled by BFS)
        int vertexU=0;	//iterator vertices to loop over the matrix
        int vertexV =0;

        int residualGraph[][] = new int[vertexCount][vertexCount];	//residualGraph[i][j] tells you if there's an edge between vertex i & j. 0=no edge, positive number=capacity of that edge
        for (vertexU = 0; vertexU < vertexCount; vertexU++){		//copy over every edge from the original graph into residual
            for (vertexV = 0; vertexV < vertexCount; vertexV++){
                residualGraph[vertexU][vertexV] = graph[vertexU][vertexV];
            }
        }

        while (bfs(residualGraph, vertexS, vertexT, parent)) {		//if a path exists from S to T
            String pathString = "";		//Shows the augmented path taken

            //find bottleneck by looping over path from BFS using parent[] array
            int bottleneckFlow = Integer.MAX_VALUE;		//we want the bottleneck (minimum), so initially set it to the largest number possible. Loop updates value if it's smaller
            for (vertexV=vertexT; vertexV != vertexS; vertexV=parent[vertexV]) {		//loop backward through the path using parent[] array
                vertexU = parent[vertexV];		//get the previous vertex in the path
                bottleneckFlow = Math.min(bottleneckFlow, residualGraph[vertexU][vertexV]);		//minimum of previous bottleneck & the capacity of the new edge

                pathString = " --> "+arrayIndexStringEquivalents[vertexV]+ pathString;	//prepend vertex to path
            }
            pathString= "S"+pathString;		//loop stops before it gets to S, so add S to the beginning
            System.out.println("Augmentation path \n"+pathString);
            System.out.println("bottleneck (min flow on path added to max flow) = "+bottleneckFlow +"\n");

            //Update residual graph capacities & reverse edges along the path
            for (vertexV=vertexT; vertexV != vertexS; vertexV=parent[vertexV]) {	//loop backwards over path (same loop as above)
                vertexU = parent[vertexV];
                residualGraph[vertexU][vertexV] -= bottleneckFlow;		//back edge
                residualGraph[vertexV][vertexU] += bottleneckFlow;		//forward edge
            }

            maxFlow += bottleneckFlow;		//add the smallest flow found in the augmentation path to the overall flow
        }

        return maxFlow;
    }

    //Returns true if it finds a path from S to T
    //saves the vertices in the path in parent[] array
    public boolean bfs(int residualGraph[][], int vertexS, int vertexT, int parent[]) {
        boolean visited[] = new boolean[vertexCount];	//has a vertex been visited when finding a path. Boolean so all values start as false

        LinkedList<Integer> vertexQueue = new LinkedList<Integer>();		//queue of vertices to explore (BFS to FIFO queue)
        vertexQueue.add(vertexS);	//add source vertex
        visited[vertexS] = true;	//visit it
        parent[vertexS]=-1;			//"S" has no parent

        while (!vertexQueue.isEmpty()) {
            int vertexU = vertexQueue.remove();		//get a vertex from the queue

            for (int vertexV=0; vertexV<vertexCount; vertexV++) {	//Check all edges to vertexV by checking all values in the row of the matrix
                if (visited[vertexV]==false && residualGraph[vertexU][vertexV] > 0) {	//residualGraph[u][v] > 0 means there actually is an edge
                    vertexQueue.add(vertexV);
                    parent[vertexV] = vertexU;		//used to calculate path later
                    visited[vertexV] = true;
                }
            }
        }
        return visited[vertexT];	//return true/false if we found a path to T
    }


    public static void main (String[] args) {

        String[] arrayIndexStringEquivalents = {"S", "2", "3", "4", "5", "T"};
        int graphMatrix[][] =new int[][] {
                {0, 100, 0, 50, 0, 0},
                {0, 0, 55, 25, 0, 0},
                {0, 0, 0, 0, 25, 65},
                {0, 0, 20, 0, 35, 0},
                {0, 0, 0, 0, 0, 50},
                {0, 0, 0, 0, 0, 0}
        };

        Ford_Fulkerson maxFlowFinder = new Ford_Fulkerson(arrayIndexStringEquivalents);

        int vertexS = 0;
        int vertexT = vertexCount-1;
        System.out.println("\nBasic Ford Fulkerson Max Flow: " + maxFlowFinder.maxFlow(graphMatrix, vertexS, vertexT));
    }

}