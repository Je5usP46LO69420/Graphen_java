import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<Node> _knoten = new ArrayList<Node>();
    List<Edge> _edges = new ArrayList<Edge>();


    public Graph(){}


    public void addnode(int data){
        _knoten.add(new Node(data));
    }
    public void addedge(int source,int weight ,int destination){
        System.out.println(_knoten.get(source));
    }

    public void printgraph(){
        for(Edge edge : _edges){
            System.out.println(edge.getsource()+"\n|\n"+edge.getweight()+"\n|\n"+edge.getdestination());
        }


    }
}
