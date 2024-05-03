import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Node {

    LinkedList<Edge> _edges;
    private int _id;

    public Node(int id){
        _id = id;
        _edges = new LinkedList<>();
    }
    public Integer getid(){
        return _id;
    }
    public void addedge(Node n,int weight){
        _edges.add(new Edge(n,weight));
    }
    public List<Edge> getedges(){
        return _edges;
    }
}
