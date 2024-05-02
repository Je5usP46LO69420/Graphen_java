import java.util.ArrayList;
import java.util.List;

public class Node {

    List<Edge> _edges = new ArrayList<Edge>();
    private int _id;

    public Node(int id){
        _id = id;
    }
    public int getid(){
        return _id;
    }
    public void addedge(Edge edge){
        _edges.add(edge);
    }
    /*public Edge getedge(){

    }*/
}
